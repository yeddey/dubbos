package com.yed.dubbo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.yed.dubbo.entity.Quan;
import com.yed.dubbo.entity.Role;

public interface RoleMapper {
	
	
	List<Map> getRoleList();
	
	List<Quan> getQuanList();

	void addR(Role r);

	void addRq(@Param("rid")Integer rid, @Param("qid")Integer qid);

	Map getRoleByRid(Integer rid);
}
