package com.didispace;

import com.didispace.domain.InfoClass;
import com.didispace.repository.InfoClassRepository;
import com.didispace.repository.InfoRepository;
import com.didispace.tngouJsonBean.InfoRoot;
import com.didispace.tngouJsonBean.InfoclassRoot;
import com.didispace.tngouapi.TnGouApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017-02-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DaoTest {

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
             //   infoClassRepository.save(infoClasses);
                infoClassRepository.save(infoClasses.get(0));
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
                infoRepository.save(infoRoot.getTngou());
            }
        }
    }


}
