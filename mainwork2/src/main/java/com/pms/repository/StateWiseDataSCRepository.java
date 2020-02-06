package com.pms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pms.modal.StateWiseDataSC;

/*@Repository("stateWiseDataSCRepository")
public interface StateWiseDataSCRepository extends CrudRepository<StateWiseDataSC, Integer> {	
	
	
}*/



@Repository("stateWiseDataSCRepository")
public interface StateWiseDataSCRepository extends JpaRepository<StateWiseDataSC, Long>{

	@Transactional(propagation = Propagation.REQUIRED,readOnly = true)
//	@Query("from StateWiseDataSC sw where sw.isActive =?1 order by stateName")	
//	public List<StateWiseDataSC> findAllStateData(Character isActive);
	@Query("from StateWiseDataSC order by stateName")	
	public List<StateWiseDataSC> findAllStateData();
}