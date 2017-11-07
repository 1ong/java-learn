package com.yunlong.java.learn.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * Created by yunlongpang on 2017/11/7.
 */
public class Client {
    private final Logger logger = LoggerFactory.getLogger(Client.class);

    public void connection(String host, int port) {
        try {
            //创建一个Socket套接字连接指定服务
            Socket socket = new Socket(host, port);
            //连接超时时间设置
            socket.setSoTimeout(5000);
            OutputStream outputStream = socket.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(outputStream);
            writer.write("请求开始数据传输!");
            //socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
