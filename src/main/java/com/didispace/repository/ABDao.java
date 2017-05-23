package com.didispace.repository;

import com.didispace.domain.AB;
import com.didispace.domain.ABPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xs on 2017-05-23.
 */
public interface ABDao extends JpaRepository<AB,ABPK>{
    AB findByAge(int age);
}
