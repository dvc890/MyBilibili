package com.bilibili.nativelibrary;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
final class a {
    a() {
    }

    public static byte[] encrypt(SecretKey secretKey, IvParameterSpec ivParameterSpec, byte[] bArr) throws GeneralSecurityException {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] decrypt(SecretKey secretKey, IvParameterSpec ivParameterSpec, byte[] bArr) throws GeneralSecurityException {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new AssertionError(e);
        }
    }
}
