package com.pks.users;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
	
	@Autowired
	UserDaoImpl userDao;
	
	@RequestMapping("createUser")
	public ModelAndView createUser() {
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("user",new UserModel());
		mv.setViewName("userform.jsp");
		return mv;
	}
	
	@RequestMapping("saveUser")
	public ModelAndView saveUser(@ModelAttribute UserModel user) {
		
		String message=userDao.saveUser(user);
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("user",message);
		mv.setViewName("message.jsp");
		return mv;
	}
	@RequestMapping("displayUsers")
	public ModelAndView displayUsers() {
		
		ArrayList<UserModel> users=userDao.getAllUsers();
		ModelAndView mv=new ModelAndView();
		mv.addObject("allusers",users);
		mv.setViewName("displayuser.jsp");
		return mv;
	}
	
	
	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(@RequestParam int id) {
		
		String message=userDao.deleteUser(id);
		ModelAndView mv=new ModelAndView();
		mv.addObject("result",message);
		mv.setViewName("message.jsp");
		return mv;
	}

}
