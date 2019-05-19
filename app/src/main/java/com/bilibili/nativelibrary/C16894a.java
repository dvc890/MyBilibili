package com.bilibili.nativelibrary;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: BL */
/* renamed from: com.bilibili.nativelibrary.a */
final class C16894a {
    C16894a() {
    }

    /* renamed from: a */
    public static byte[] m66575a(SecretKey secretKey, IvParameterSpec ivParameterSpec, byte[] bArr) throws GeneralSecurityException {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKey, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public static byte[] m66576b(SecretKey secretKey, IvParameterSpec ivParameterSpec, byte[] bArr) throws GeneralSecurityException {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKey, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new AssertionError(e);
        }
    }
}
