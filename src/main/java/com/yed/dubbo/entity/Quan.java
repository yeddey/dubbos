package com.yed.dubbo.entity;

import java.io.Serializable;
/**
 * 
 * @ClassName: Quan 
 * @Description: 权限实体类
 * @author:yed
 * @date: 2019年9月3日 上午9:00:10
 */
public class Quan implements Serializable{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = -8168693766274682322L;
	
	
	/**
	 * 字段
	 */
	private Integer qid;
	private String qname;
	
	
	public Quan(Integer qid, String qname) {
		super();
		this.qid = qid;
		this.qname = qname;
	}
	public Quan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getQid() {
		return qid;
	}
	public void setQid(Integer qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	@Override
	public String toString() {
		return "Quan [qid=" + qid + ", qname=" + qname + "]";
	}
	
	
	
	
	

}
