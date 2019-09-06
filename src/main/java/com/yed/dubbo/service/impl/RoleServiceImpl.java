package com.yed.dubbo.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.yed.dubbo.dao.RoleMapper;
import com.yed.dubbo.entity.Quan;
import com.yed.dubbo.entity.Role;
import com.yed.dubbo.service.RoleService;



@Service(interfaceClass=RoleService.class)
public class RoleServiceImpl implements RoleService {
	
	@Resource
	private RoleMapper rm;
	
	
	@Override
	public List<Map> getRoleList() {
		// TODO Auto-generated method stub
		return rm.getRoleList();
	}


	@Override
	public List<Quan> getQuanList() {
		// TODO Auto-generated method stub
		return rm.getQuanList();
	}


	@Override
	public boolean addRole(Role r, Integer[] qids) {
		// TODO Auto-generated method stub
		try {
			rm.addR(r);
			if(qids!=null) {
				for (Integer qid : qids) {
					rm.addRq(r.getRid(),qid);
				}
			}
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}


	@Override
	public Map getRoleByRid(Integer rid) {
		// TODO Auto-generated method stub
		return rm.getRoleByRid(rid);
	}

}
