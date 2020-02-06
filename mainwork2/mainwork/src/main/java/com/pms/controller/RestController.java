package com.pms.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.pms.modal.User;
import com.pms.services.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private UserService userService;
	

	
	  @RequestMapping("/") 
	  public RedirectView pmsHomePage() { 
         return new RedirectView("/login");
	  }
	 
	
	/*
	 * @RequestMapping("/") void pmsHomePage(HttpServletResponse response) throws
	 * IOException { response.sendRedirect("/login"); }
	 */
	
	  
	@GetMapping("/save-user")
	public String saveUser(@RequestParam String username, @RequestParam String firstname, @RequestParam String lastname, @RequestParam int age, @RequestParam String password) {
		User user = new User(username, firstname, lastname, age, password);
		userService.saveMyUser(user);
		return "User Saved";
	}
	
//	@GetMapping("/report-state")
//	public String index(HttpServletRequest request) {
//			try {
//				request.setAttribute("stateWiseDataSCs",stateWiseDataSCService.findAll());
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
////		    request.setAttribute("mode", "ALL_STATEDATA");
//		return "stateWiseSC";
//	}

}





