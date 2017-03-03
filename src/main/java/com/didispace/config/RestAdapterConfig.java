package com.didispace.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.fastjson.FastJsonConverterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017-02-28.
 */
@Configuration
public class RestAdapterConfig {

    public static  String baseUrl ="http://www.tngou.net/api/";

    @Bean
    public Retrofit getRetrofit(){
        OkHttpClient.Builder httpBuilder=new OkHttpClient.Builder();
        OkHttpClient client=httpBuilder.readTimeout(10, TimeUnit.MINUTES)
                .connectTimeout(3, TimeUnit.MINUTES).writeTimeout(3, TimeUnit.MINUTES) //设置超时
                .build();

        Retrofit retrofit =new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(FastJsonConverterFactory.create())
                .client(client)
                .build();
        return  retrofit;
    }


}
