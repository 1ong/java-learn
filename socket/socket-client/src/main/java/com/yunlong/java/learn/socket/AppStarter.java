package com.yunlong.java.learn.socket;

/**
 * Created by yunlongpang on 2017/11/7.
 */
public class AppStarter {
    public static void main(String[] args) {
        Client client = new Client();
        client.connection("localhost", 9966);
    }
}
