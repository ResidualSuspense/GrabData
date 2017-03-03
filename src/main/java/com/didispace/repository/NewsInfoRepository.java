package com.didispace.repository;

import com.didispace.domain.Info;
import com.didispace.domain.NewsInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2017-02-28.
 */
@Repository
public interface NewsInfoRepository extends JpaRepository<NewsInfo,Long> {

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO news_info ( id, count,  description,  fcount,  img,  infoclass,  keywords,  message,  rcount,  time,  title) " +
            "VALUES(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11)",nativeQuery = true)
    int insertNewsInfo(Long id,int count, String description, int fcount, String img, int infoclass, String keywords, String message, int rcount, long time, String title);

    @Query(value = "SELECT MAX(id) from news_info ORDER BY id",nativeQuery = true)
    Long  findLastID();
}
