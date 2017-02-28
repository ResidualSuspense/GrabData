package com.didispace.tngouapi;

import com.didispace.tngouJsonBean.InfoclassRoot;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2017-02-28.
 */
public interface TnGouApi {

    /**
     * 健康资讯类接口，取得健康资讯分类：企业要闻\医疗新闻\生活贴士\药品新闻\食品新闻\社会热点\疾病快讯
     * @return
     */
    @GET("info/classify")
    Call<InfoclassRoot>  getInfoclass();


}
