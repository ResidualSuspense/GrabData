package com.didispace.repository;

import com.didispace.domain.Device;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xs on 2017-05-22.
 */
public interface DeviceDao extends JpaRepository<Device,Long>{
}
