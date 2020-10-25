package com.cryptosha256hex;

import org.apache.commons.codec.digest.DigestUtils;

public class CryptoSha256Hex {

    public static void main(String[] args) {

        String userName = "username";
        String userLogin = "Roman";
        String password = "password";

        String sha256 = DigestUtils.sha256Hex(userName+userLogin+password);

        System.out.println(sha256);

    }
}
