package com.didispace.tngouapi;

import com.didispace.tngouJsonBean.InfoRoot;
import com.didispace.tngouJsonBean.InfoclassRoot;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017-02-28.
 *  天狗api ，img字段返回的是不完整的图片路径src，需要在前面添加【http://tnfs.tngou.net/image】或者【http://tnfs.tngou.net/img】
    前者可以再图片后面添加宽度和高度，如：http://tnfs.tngou.net/image/top/default.jpg_180x120
 */
public interface TnGouApi {

    /**
     * 健康资讯类接口，取得健康资讯分类：企业要闻\医疗新闻\生活贴士\药品新闻\食品新闻\社会热点\疾病快讯
     * @return
     */
    @GET("info/classify")
    Call<InfoclassRoot>  getInfoclass();




    /**
     * 健康资讯列表，通过分类的ID，取得该分类下的健康新闻。
     * 这里可以简略使用：只用第三个方法“getInfoByIdAndRows”，没有参数传递null值即可！
     * @return
     */
    @GET("info/list")
    Call<InfoRoot> getInfoAll();

    @GET("info/list")
    Call<InfoRoot> getInfoById(@Query("id")int id);

    @GET("info/list")
    Call<InfoRoot> getInfoByIdAndRows(@Query("id") int id,@Query("rows") int rows);



}
