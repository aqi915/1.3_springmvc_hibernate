/**
 * 
 */
package com.phn.service;

import com.phn.model.UserEntity;

/**
 * @author phn
 */
public interface IUserService {
	public boolean isExist(UserEntity user);
	public boolean addUser(UserEntity user);
	
}
