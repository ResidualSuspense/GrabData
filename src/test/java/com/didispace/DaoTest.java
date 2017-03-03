package com.didispace;

import com.didispace.domain.Info;
import com.didispace.domain.InfoClass;
import com.didispace.domain.NewsInfo;
import com.didispace.repository.InfoClassRepository;
import com.didispace.repository.InfoRepository;
import com.didispace.repository.NewsInfoRepository;
import com.didispace.tngouJsonBean.InfoRoot;
import com.didispace.tngouJsonBean.InfoclassRoot;
import com.didispace.tngouJsonBean.NewsInfoRoot;
import com.didispace.tngouapi.TnGouApi;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by Administrator on 2017-02-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DaoTest {
    Logger logger =Logger.getLogger(DaoTest.class);

    @Autowired
    TnGouApi tnGouApi;

//    private int id;
//    private String name;
//    private String title;
//    private String keywords;
//    private String description;
//    private int seq;//排序 从0。。。。10开始

    @Autowired
    InfoClassRepository infoClassRepository;


    @Test
    public void InfoClassTest() throws IOException {
        Call call = tnGouApi.getInfoclass();
        Response<InfoclassRoot> rootResponse = call.execute();
        if (rootResponse.isSuccessful()) {
            InfoclassRoot root = rootResponse.body();
            if (root.isStatus()) {
                List<InfoClass> infoClasses=root.getTngou();
                for(InfoClass infoClass : infoClasses){
                    if(!infoClassRepository.exists(infoClass.getId())){
                        infoClassRepository.insertInfoClass(infoClass.getId(),infoClass.getDescription(),infoClass.getKeywords(),infoClass.getName(),infoClass.getSeq(),infoClass.getTitle()) ;
                    }
                }
            }
        }
    }


    @Autowired
    InfoRepository infoRepository;
    @Test
    public void infoTest() throws IOException {
        Call call = tnGouApi.getInfoAll();
        Response<InfoRoot> rootResponse = call.execute();
        if (rootResponse.isSuccessful()) {
            InfoRoot infoRoot =rootResponse.body();
            if(infoRoot.isStatus()){
               // infoRepository.save(infoRoot.getTngou());
                List<Info> infos =infoRoot.getTngou();
                for (Info info : infos) {
                    if(!infoRepository.exists(info.getId())){
                        infoRepository.insertInfo(info.getId(),info.getTitle(),info.getInfoclass(),info.getImg(),info.getDescription(),info.getKeywords(),info.getCount(),
                                info.getFcount(),info.getRcount(),info.getTime());
                    }
                }

            }
        }
    }

    @Test
    public void infoTest2() throws IOException {
        for (int i = 0; i < 10; i++) {
            Call call = tnGouApi.getInfoById(i);
            Response<InfoRoot> rootResponse = call.execute();
            if (rootResponse.isSuccessful()) {
                InfoRoot infoRoot =rootResponse.body();
                if(infoRoot.isStatus()){
                    // infoRepository.save(infoRoot.getTngou());
                    List<Info> infos =infoRoot.getTngou();
                    for (Info info : infos) {
                        if(!infoRepository.exists(info.getId())){
                            infoRepository.insertInfo(info.getId(),info.getTitle(),info.getInfoclass(),info.getImg(),info.getDescription(),info.getKeywords(),info.getCount(),
                                    info.getFcount(),info.getRcount(),info.getTime());
                        }
                    }

                }
            }
        }


    }


    @Autowired
    NewsInfoRepository newsInfoRepository;

    @Test
    public void newsInfotest() throws IOException {
            Call call = tnGouApi.getInfoNews(5L,null,5);
            Response<NewsInfoRoot> rootResponse = call.execute();
            if (rootResponse.isSuccessful()) {
                NewsInfoRoot infoRoot =rootResponse.body();
                    List<NewsInfo> infos =infoRoot.getTngou();
                System.out.println("infos---------->"+infos.size());
                    for (NewsInfo info : infos) {
                        if(!newsInfoRepository.exists(info.getId())){
                            newsInfoRepository.insertNewsInfo(info.getId(),info.getCount(),info.getDescription(),info.getFcount(),info.getImg(),
                                    info.getInfoclass(),info.getKeywords(),info.getMessage(),info.getRcount(),info.getTime(),info.getTitle());
                        }
                    }

            }
    }



    @Test
    public void infoClassInsert(){
        InfoClass infoClass = new InfoClass(10,"xs","title","xx","xx",2);
        //    int insertInfoClass(int id, String description, String keywords, String name,  int seq,String title);
        infoClassRepository.insertInfoClass(infoClass.getId(),infoClass.getDescription(),infoClass.getKeywords(),infoClass.getName(),infoClass.getSeq(),infoClass.getTitle());
    }
    @Test
    public void findLastIDTest() throws IOException {
        Long lastID =newsInfoRepository.findLastID();
        logger.debug("---->"+ lastID);
        long startTime=System.currentTimeMillis();
        Call call = tnGouApi.getInfoNews(lastID,null,1);
        Response<NewsInfoRoot> rootResponse = call.execute();
        if (rootResponse.isSuccessful()) {
            NewsInfoRoot infoRoot =rootResponse.body();
            List<NewsInfo> infos =infoRoot.getTngou();
            System.out.println("infos---------->"+infos.size());
//            for (NewsInfo info : infos) {
//                if(!newsInfoRepository.exists(info.getId())){
//                    newsInfoRepository.insertNewsInfo(info.getId(),info.getCount(),info.getDescription(),info.getFcount(),info.getImg(),
//                            info.getInfoclass(),info.getKeywords(),info.getMessage(),info.getRcount(),info.getTime(),info.getTitle());
//                }
//            }
            long endTime=System.currentTimeMillis();
            float excTime=(float)(endTime-startTime)/1000;
            logger.debug("---->"+ excTime +"s");
        }

    }



}
