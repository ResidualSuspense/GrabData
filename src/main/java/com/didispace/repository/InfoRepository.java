package com.didispace.repository;

import com.didispace.domain.Info;
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
public interface InfoRepository extends JpaRepository<Info,Long> {

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO info ( id,  title,  infoclass,  img,  description,  keywords,  count,  fcount,  rcount,  time) " +
            "VALUES(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10)",nativeQuery = true)
    int insertInfo(Long id, String title, int infoclass, String img, String description, String keywords, int count, int fcount, int rcount, Timestamp time);
}
