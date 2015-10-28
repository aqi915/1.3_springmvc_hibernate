/**
 * 
 */
package com.phn.dao;

import com.phn.model.UserEntity;

/**
 * @author phn
 */
public interface IUserDao {
	public boolean isExist(UserEntity user);
	public boolean addUser(UserEntity user);
}
