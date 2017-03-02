package com.didispace.repository;

import com.didispace.domain.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017-02-28.
 */
@Repository
public interface InfoRepository extends JpaRepository<Info,Integer> {
}
