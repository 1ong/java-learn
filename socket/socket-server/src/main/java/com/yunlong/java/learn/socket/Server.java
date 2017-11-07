package com.yunlong.java.learn.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by yunlongpang on 2017/11/7.
 */
public class Server {
    private final Logger logger = LoggerFactory.getLogger(Server.class);

    public void start() {
        try {
            //创建一个监听端口的服务套接字
            ServerSocket serverSocket = new ServerSocket(9966);
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);
            char[] str = new char[1024];
            int len = 0;
            while ((len = reader.read(str)) != -1) {
                String result = new String(str, 0, len);
                logger.info("from client:{}", result);
            }
            reader.close();
            inputStream.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
