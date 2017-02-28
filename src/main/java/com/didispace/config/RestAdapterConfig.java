package com.didispace.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by Administrator on 2017-02-28.
 */
@Configuration
public class RestAdapterConfig {

    public static  String baseUrl ="http://www.tngou.net/api/";

    @Bean
    public Retrofit getRetrofit(){
        Retrofit retrofit =new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        return  retrofit;
    }


}
