package com.pms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.pms.modal.StateWiseDataSC;
import com.pms.modal.User;

import com.pms.services.UserService;
import com.pms.modal.DistrictWiseDataSC;


@Controller
public class ApplicationController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/welcome")
	public String Welcome(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "welcomepage";
}

	@RequestMapping("/register")
	public String registration(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");
		return "welcomepage";
	}

	@PostMapping("/save-user")
	public String registerUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
		userService.saveMyUser(user);
		request.setAttribute("mode", "MODE_HOME");
		return "welcomepage";
	}

	@GetMapping("/show-users")
	public String showAllUsers(HttpServletRequest request) {
		request.setAttribute("users", userService.showAllUsers());
		request.setAttribute("mode", "ALL_USERS");
		return "welcomepage";
	}

	@RequestMapping("/delete-user")
	public String deleteUser(@RequestParam int id, HttpServletRequest request) {
		userService.deleteMyUser(id);
		request.setAttribute("users", userService.showAllUsers());
		request.setAttribute("mode", "ALL_USERS");
		return "welcomepage";
	}
	
	@RequestMapping("/edit-user")
	public String editUser(@RequestParam int id,HttpServletRequest request) {
		request.setAttribute("user", userService.editUser(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "welcomepage";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_LOGIN");
		return "welcomepage";
	}
	
	
	@RequestMapping("/logout-user")
	public RedirectView logout(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_LOGOUT");
		 return new RedirectView("/login");
	}
	
	@RequestMapping ("/login-user")
	public String loginUser(@ModelAttribute User user, HttpServletRequest request) {
		if(userService.findByUsernameAndPassword(user.getUsername(), user.getPassword())!=null) {
			return "homepage";
		}
		else {
			request.setAttribute("error", "Invalid Username or Password");
			request.setAttribute("mode", "MODE_LOGIN");
			return "welcomepage";
			
		}
	}
	
	 @GetMapping("/report-state") 
	  public ModelAndView StateWiseDataSC(ModelAndView modelAndView) {
		 List<StateWiseDataSC> stateWiseDataSCList  = userService.findAllState();
		 System.out.println("in StateWiseDataSC method of ApplicationController--stateWiseDataSCList size is =="+stateWiseDataSCList.size());
		  modelAndView.addObject("stateWiseDataSCs", stateWiseDataSCList);
	  modelAndView.setViewName("stateWiseSC");
	  return modelAndView;
	  
	  }
	
		 
/*@GetMapping("/report-state")
public String StateWiseDataSC(HttpServletRequest request) {
	List<StateWiseDataSC> stateWiseDataSCList = null;
		
		 * try { // stateWiseDataSCList =
		 * stateWiseDataSCRepository.findAllStateData('1');
		 * request.setAttribute("StateWiseDataSCs",
		 * stateWiseDataSCRepository.findAllStateData('1')); } catch (Exception e) {
		 * e.printStackTrace(); } 
		 	
	
	
	
	
	
	return "stateWiseSC";
}*/
	 
	 
	 
	 
//	 @GetMapping("/report-district/{stateLgdCode}")
//	  public ModelAndView DistrictWiseDataSC( ModelAndView modelAndView, @PathVariable("stateLgdCode") long stateLgdCodeVal){
//		 System.out.println("stateLgdCodeVal==="+stateLgdCodeVal);
//		 List<DistrictWiseDataSC> districtWiseDataSCList;
//		 districtWiseDataSCList = userService.findAllDistrict(stateLgdCodeVal);
//		 System.out.println("in StateWiseDataSC method of ApplicationController--stateWiseDataSCList size is =="+districtWiseDataSCList.size());
//		 modelAndView.addObject("districtWiseDataSCs", districtWiseDataSCList);
//	  modelAndView.setViewName("districtWiseSC");
//	  return modelAndView;
//	  
//	  }
	 
	 
	 @GetMapping("/report-district/{stateLgdCode}")
		public String  DistrictWiseDataSC(HttpServletRequest request ,  @PathVariable("stateLgdCode") long stateLgdCodeVal) {
		 System.out.println("stateLgdCodeVal==="+stateLgdCodeVal);
		 List<DistrictWiseDataSC> districtWiseDataSCList;
		 districtWiseDataSCList=	userService.findAllDistrict(stateLgdCodeVal);

			request.setAttribute("districtWiseDataSCs", districtWiseDataSCList);
			return "districtWiseSC";
		}

	 
	 
	
	 
	
}
