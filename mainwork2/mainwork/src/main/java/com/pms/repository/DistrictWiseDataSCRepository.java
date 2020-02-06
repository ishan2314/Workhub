package com.pms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pms.modal.DistrictWiseDataSC;
import com.pms.modal.StateWiseDataSC;

/*@Repository("stateWiseDataSCRepository")
public interface StateWiseDataSCRepository extends CrudRepository<StateWiseDataSC, Integer> {	
	
	
}*/



@Repository("districtWiseDataSCRepository")

public interface DistrictWiseDataSCRepository extends JpaRepository<DistrictWiseDataSC, Long>{

	@Transactional(propagation = Propagation.REQUIRED,readOnly = true)
//	@Query("from StateWiseDataSC sw where sw.isActive =?1 order by stateName")	
//	public List<StateWiseDataSC> findAllStateData(Character isActive);
	//@Query("from DistrictWiseDataSC stateLgdCode,StateWiseDataSC id where StateWiseDataSC.id= DistrictWiseDataSC.stateLgdCode")	
	@Query( "from DistrictWiseDataSC where stateLgdCode=?1  order by districtName")
//	public List<DistrictWiseDataSC> findAllDistrictData();
	public List<DistrictWiseDataSC> findAllDistrictData(Long stateLgdCodeval);
}