package com.pms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.pms.modal.StateWiseDataSC;

@Repository
public interface StateWiseDataSCLimitedRepository extends  PagingAndSortingRepository<StateWiseDataSC, Long>  {

	


}
