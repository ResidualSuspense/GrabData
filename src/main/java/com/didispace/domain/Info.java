package com.didispace.domain;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2017-03-01.
 */
public class Info {
    private Long id;        //ID编码
    private String title;//资讯标题
    private int infoclass;//分类
    private String img;//图片
    private String description;//描述
    private String keywords;//关键字
    private String message;//资讯内容
    private int count;//访问次数
    private int fcount;//收藏数
    private int rcount;//评论读数
    private Timestamp time;
}
