/**
 * 
 */
package com.phn.controller;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phn.model.UserEntity;
import com.phn.service.IUserService;

/**
 * @author phn
 */
@Controller
@RequestMapping("user")
public class UserController{
	@Resource
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public Map<String,Object> login( UserEntity user){
		Map<String,Object> map = new HashMap<String,Object>();
		System.out.println("UserController:login=================="+user.toString());
		boolean loginResult = userService.isExist(user);
		map.put("loginResult", loginResult);
		return map;
	}
	@RequestMapping(value="/reg", method = RequestMethod.POST)
	public Map<String,Object> reg( UserEntity user){
		Map<String,Object> map = new HashMap<String,Object>();
		System.out.println("UserController:reg=================="+user.toString());
		boolean regResult = userService.addUser(user);
		map.put("regResult", regResult);
		return map;
	}
}
