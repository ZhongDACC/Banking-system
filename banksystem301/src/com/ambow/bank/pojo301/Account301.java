package com.ambow.bank.pojo301;

import java.io.Serializable;
/*
 * Copyright(C),2020-2021. Ambow.Co., Ltd.
 * 账户信息类：Account301.java
 * 账户信息类包含账户、用户名、金额、密码和操作时间等信息。
 * @author Caohongtao
 * @Date 2021-1-5
 * @version 1.0.0.1
 * */
public class Account301 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String account301;//账户
	private String name301;//用户名
	private String balance301;//金额
	private String password301;//密码
	private String nowtime301;//操作时间
	
	//重写 toString hashCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account301 == null) ? 0 : account301.hashCode());
		result = prime * result + ((balance301 == null) ? 0 : balance301.hashCode());
		result = prime * result + ((name301 == null) ? 0 : name301.hashCode());
		result = prime * result + ((nowtime301 == null) ? 0 : nowtime301.hashCode());
		result = prime * result + ((password301 == null) ? 0 : password301.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account301 other = (Account301) obj;
		if (account301 == null) {
			if (other.account301 != null)
				return false;
		} else if (!account301.equals(other.account301))
			return false;
		if (balance301 == null) {
			if (other.balance301 != null)
				return false;
		} else if (!balance301.equals(other.balance301))
			return false;
		if (name301 == null) {
			if (other.name301 != null)
				return false;
		} else if (!name301.equals(other.name301))
			return false;
		if (nowtime301 == null) {
			if (other.nowtime301 != null)
				return false;
		} else if (!nowtime301.equals(other.nowtime301))
			return false;
		if (password301 == null) {
			if (other.password301 != null)
				return false;
		} else if (!password301.equals(other.password301))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account301 [account301=" + account301 + ", name301=" + name301 + ", balance301=" + balance301
				+ ", password301=" + password301 + ", nowtime301=" + nowtime301 + "]";
	}
	//生成有参无参
	public Account301(String account301, String name301, String balance301, String password301, String nowtime301) {
		super();
		this.account301 = account301;
		this.name301 = name301;
		this.balance301 = balance301;
		this.password301 = password301;
		this.nowtime301 = nowtime301;
	}
	public Account301() {
		super();
	}
	public String getAccount301() {
		return account301;
	}
	public void setAccount301(String account301) {
		this.account301 = account301;
	}
	public String getName301() {
		return name301;
	}
	public void setName301(String name301) {
		this.name301 = name301;
	}
	public String getBalance301() {
		return balance301;
	}
	public void setBalance301(String balance301) {
		this.balance301 = balance301;
	}
	public String getPassword301() {
		return password301;
	}
	public void setPassword301(String password301) {
		this.password301 = password301;
	}
	public String getNowtime301() {
		return nowtime301;
	}
	public void setNowtime301(String nowtime301) {
		this.nowtime301 = nowtime301;
	}

	
	
}
