package com.yed.dubbo.service;

import java.util.List;
import java.util.Map;

import com.yed.dubbo.entity.Quan;
import com.yed.dubbo.entity.Role;


public interface RoleService {
	
	List<Map> getRoleList();
	
	List<Quan> getQuanList();

	boolean addRole(Role r, Integer[] qids);

	Map getRoleByRid(Integer rid);
	
}
