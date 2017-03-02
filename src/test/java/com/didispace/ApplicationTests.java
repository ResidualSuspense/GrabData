package com.didispace;

import com.didispace.service.BlogProperties;
import com.didispace.tngouJsonBean.InfoclassRoot;
import com.didispace.tngouapi.TnGouApi;
import com.didispace.tools.JacksonUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import retrofit2.Call;
import retrofit2.Response;


/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTests {

	private static final Log log = LogFactory.getLog(ApplicationTests.class);

	@Autowired
	private BlogProperties blogProperties;


	@Test
	public void test1() throws Exception {
		Assert.assertEquals("程序猿DD", blogProperties.getName());
		Assert.assertEquals("Spring Boot教程", blogProperties.getTitle());
		Assert.assertEquals("程序猿DD正在努力写《Spring Boot教程》", blogProperties.getDesc());

		log.info("随机数测试输出：");
		log.info("随机字符串 : " + blogProperties.getValue());
		log.info("随机int : " + blogProperties.getNumber());
		log.info("随机long : " + blogProperties.getBignumber());
		log.info("随机10以下 : " + blogProperties.getTest1());
		log.info("随机10-20 : " + blogProperties.getTest2());

	}

	@Autowired
	TnGouApi tnGouApi;

	@Test
	public void test2() throws Exception {
		Call call= tnGouApi.getInfoclass();
		Response<InfoclassRoot> repos  = call.execute();
		if(repos.isSuccessful()){
			log.info("root : " + JacksonUtil.obj2json(repos.body()));
		}else{
			log.info("失败");
		}
	}

}
