package com.yed.dubbo.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @ClassName: Role 
 * @Description: 角色实体类
 * @author:yed
 * @date: 2019年9月3日 上午9:00:21
 */
public class Role implements Serializable{
		
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = -6279492105448247666L;
	
	private Integer rid;
	private String rname;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date rdate;
	private Integer qid;
	
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(Integer rid, String rname, Date rdate, Integer qid) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.rdate = rdate;
		this.qid = qid;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public Date getRdate() {
		return rdate;
	}
	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}
	public Integer getQid() {
		return qid;
	}
	public void setQid(Integer qid) {
		this.qid = qid;
	}
	@Override
	public String toString() {
		return "Role [rid=" + rid + ", rname=" + rname + ", rdate=" + rdate + ", qid=" + qid + "]";
	}
	
	
	
	
	
	
}
