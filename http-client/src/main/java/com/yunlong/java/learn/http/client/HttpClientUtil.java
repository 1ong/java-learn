package com.yunlong.java.learn.http.client;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Apache HttpClient
 * Created by yunlongpang on 2017/11/5.
 */
public class HttpClientUtil {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public HttpClient getHttpClient() {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        return httpClient;
    }
}
