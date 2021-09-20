package com.htc.centreservice.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htc.centreservices.entity.Centre;





@Repository
public interface ICentre extends  JpaRepository<Centre,Long> {
	
	@Query(value="SELECT centre_id,centre_address,pin_code FROM Centre_Service WHERE pin_code=?1",nativeQuery = true)
	public List<Centre> findByPin_code(Long pin_code);

}
