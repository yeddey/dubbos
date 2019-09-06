package com.yed.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yed.dubbo.service.MathService;

@Service
public class MathServiceImpl implements MathService {

	@Override
	public Integer jia(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public Integer jian(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public Integer cheng(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public Integer chu(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
