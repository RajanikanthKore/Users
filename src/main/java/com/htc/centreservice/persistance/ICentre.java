package com.htc.centreservice.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.centreservices.entity.Centre;



@Repository
public interface ICentre  extends JpaRepository<Centre,Long>{

}
