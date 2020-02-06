package com.pms.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.modal.DistrictWiseDataSC;
import com.pms.modal.StateWiseDataSC;
import com.pms.modal.User;
import com.pms.repository.DistrictWiseDataSCRepository;
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
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public void saveMyUser(User user ) {
		userRepository.save(user);
	}
	
	public List<User> showAllUsers(){
		List<User> users = new ArrayList<User>();
		for(User user : userRepository.findAll()) {
			users.add(user);
		}
		
		return users;
	}
	
	public void deleteMyUser(int id) {
		userRepository.delete(id);
	}
	
	public User editUser(int id) {
		return userRepository.findOne(id);
	}
	
	public User findByUsernameAndPassword(String username, String password) {
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
	


	
	
	
	
	
	}

	