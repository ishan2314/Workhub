package com.pms.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.pms.modal.DistrictWiseDataSC;
import com.pms.modal.StateWiseDataSC;
import com.pms.modal.User;
import com.pms.repository.DistrictWiseDataSCRepository;
import com.pms.repository.StateWiseDataSCLimitedRepository;
import com.pms.repository.StateWiseDataSCRepository;
import com.pms.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepository;
	
	@Autowired
	StateWiseDataSCRepository stateWiseDataSCRepository;
	@Autowired
	DistrictWiseDataSCRepository districtWiseDataSCRepository;
	@Autowired
	StateWiseDataSCLimitedRepository stateWiseDataSCLimitedRepository;
	
	public UserService(UserRepository userRepository) 
	
	{
		this.userRepository=userRepository;
	}
	
	public void saveMyUser(User user ) 
	
	{
		userRepository.save(user);
	}
	
	public List<User> showAllUsers()
	
	{
		List<User> users = new ArrayList<User>();
		
		for(User user : userRepository.findAll()) 
		{
			users.add(user);
		}
		
		return users;
	}
	
	
	  public void deleteMyUser(int id) 
	  
	  { 
		  userRepository.deleteById(id); 
	   }
	  
	 
	/*
	 * public Optional<User> editUser(int id)
	 * 
	 * { return userRepository.findById(id);
	 * 
	 * }
	 */
	 
	
	public User findByUsernameAndPassword(String username, String password) 
	
	{
		return userRepository.findByUsernameAndPassword(username, password);
	}
	
	
	public List<StateWiseDataSC> findAllState()
	{
	//	return stateWiseDataSCRepository.findAllStateData('1');
		return stateWiseDataSCRepository.findAllStateData();
	}
	
	
	
	public List<DistrictWiseDataSC> findAllDistrict(Long stateLgdCodeval)
	
	{
	
		return districtWiseDataSCRepository.findAllDistrictData(stateLgdCodeval);
	}
	


	
	public List<StateWiseDataSC> getAllTopState(Integer pageNo, Integer pageSize, String sortBy) //on basis of total record in pojo
    
	{
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by("totalRecord").descending());
 
        Page<StateWiseDataSC> pagedResult =  stateWiseDataSCLimitedRepository.findAll(paging);
         
        if(pagedResult.hasContent())
        
        {
            return pagedResult.getContent();
        } 
       
        else 
        
        {
            return new ArrayList<StateWiseDataSC>();
        }
    }
	
	
	
	
	  public List<StateWiseDataSC> getAllTopState1(Integer pageNo, Integer pageSize, String sortBy) //on basis of total male record in pojo
	  
	  { 
		  Pageable paging = PageRequest.of(pageNo, pageSize,Sort.by("totalRecordMale").descending());
	  
	  Page<StateWiseDataSC> pagedResult =stateWiseDataSCLimitedRepository.findAll(paging);
	  
	  if(pagedResult.hasContent())
	  
	  { 
		  return pagedResult.getContent(); 
	   }
	  
	  else
	  
	  { 
		  return new ArrayList<StateWiseDataSC>(); 
		  
	  } 

}
	 
	
	
	}

	