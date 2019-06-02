package com.dvc.mybilibili.danmaku.live;

import com.alibaba.fastjson.JSON;
import com.dvc.mybilibili.danmaku.live.entity.JoinEntity;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * Created by czp on 17-5-24.
 */
public class PackageRepository {
    public static final int PACKAGE_LENGTH_BYTES_LENGTH = 4;    //数据包长度标示占用字符数
    public static final int PACKAGE_PROTOCOL_BYTES_LENGTH = 12;
    public static final int PACKAGE_HEAD_BYTES_LENGTH = PACKAGE_LENGTH_BYTES_LENGTH + PACKAGE_PROTOCOL_BYTES_LENGTH;
    public static final byte[] ONLINE_COUNT_PACKAGE_PROTOCOL_BYTES = new byte[]{0x00, 0x10, 0x00, 0x01, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, 0x01};
    public static final byte[] DAN_MU_DATA_PACKAGE_PROTOCOL_BYTES = new byte[]{0x00, 0x10, 0x00, 0x00, 0x00, 0x00, 0x00, 0x05, 0x00, 0x00, 0x00, 0x00};
    public static final byte[] HEART_BEAT_PACKAGE_BYTES = new byte[]{0x00, 0x00, 0x00, 0x10, 0x00, 0x10, 0x00, 0x01, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x01};
    public static final byte[] JOIN_SUCCESS_PACKAGE_BYTES = new byte[]{0x00, 0x00, 0x00, 0x10, 0x00, 0x10, 0x00, 0x01, 0x00, 0x00, 0x00, 0x08, 0x00, 0x00, 0x00, 0x01};
    public static final byte[] JOIN_PACKAGE_PROTOCOL_BYTES = new byte[]{0x00, 0x10, 0x00, 0x01, 0x00, 0x00, 0x00, 0x07, 0x00, 0x00, 0x00, 0x01};

    private static byte[] readBytesFormInputStream(InputStream inputStream, int count) throws IOException {
        byte[] bytes = new byte[count];
        int readCount = 0;
        while (readCount < count) {
            readCount += inputStream.read(bytes, readCount, count - readCount);
        }
        return bytes;
    }

    //读取下一个数据包
    public static byte[] readNextPackage(InputStream inputStream) throws IOException {
        byte[] packageLengthBytes = readBytesFormInputStream(inputStream, PACKAGE_LENGTH_BYTES_LENGTH);
        int packageLength = new BigInteger(packageLengthBytes).intValue();
        if (packageLength < PACKAGE_HEAD_BYTES_LENGTH) {
            throw new IOException("Package length less than " + PACKAGE_HEAD_BYTES_LENGTH + " byte");
        }
        return ByteBuffer.allocate(packageLength).put(packageLengthBytes).put(readBytesFormInputStream(inputStream, packageLength - PACKAGE_LENGTH_BYTES_LENGTH)).array();
    }

    public static boolean readAndValidateJoinSuccessPackage(InputStream inputStream) throws IOException {
        return Arrays.equals(readNextPackage(inputStream), JOIN_SUCCESS_PACKAGE_BYTES);
    }

    public static byte[] getJoinPackage(long roomId) {
        byte[] jsonBytes = JSON.toJSONBytes(new JoinEntity(roomId));
        int packageLength = PACKAGE_HEAD_BYTES_LENGTH + jsonBytes.length;
        return ByteBuffer.allocate(packageLength).putInt(packageLength).put(JOIN_PACKAGE_PROTOCOL_BYTES).put(jsonBytes).array();
    }

    public static byte[] getHeartBeatPackageBytes() {
        return HEART_BEAT_PACKAGE_BYTES;
    }
}
