package com.htrj.web.model.sys;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.htrj.core.model.Model;

/**
 * 用户 模型
 * 
 * @author he
 */
@Entity
@Table(name = "t_user")
public class User extends Model {
	@Column(length = 50)
	private String username;
	@Column(length = 100)
	private String password;
	private Date registertime;
	@Column(length = 50)
	private String status;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegistertime() {
		return registertime;
	}

	public void setRegistertime(Date registertime) {
		this.registertime = registertime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
