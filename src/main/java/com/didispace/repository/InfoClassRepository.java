package com.didispace.repository;

import com.didispace.domain.InfoClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017-02-28.
 */
@Repository
public interface InfoClassRepository extends JpaRepository<InfoClass,Integer> {
    InfoClass findInfoClassById(int id);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO info_class (id,description,keywords,name,seq,title) VALUES(?1,?2,?3,?4,?5,?6)",nativeQuery = true)
    int insertInfoClass(int id, String description, String keywords, String name,  int seq,String title);
}
