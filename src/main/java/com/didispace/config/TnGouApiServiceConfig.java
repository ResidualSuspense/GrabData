package com.didispace.config;

import com.didispace.tngouapi.TnGouApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;

/**
 * Created by Administrator on 2017-02-28.
 */
@Configuration
public class TnGouApiServiceConfig {

    @Autowired
    public  Retrofit retrofit;

    @Bean
    public TnGouApi getTnGouApiService(){
        return retrofit.create(TnGouApi.class);
    }

}
