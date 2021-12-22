package com.ambow.bank.pojo301;

import java.io.Serializable;
import java.util.Hashtable;

/*
 * Copyright(C),2020-2021. Ambow.Co., Ltd.
 * 账户信息集合类：Accounts301.java
 * 账户信息集合类包含多个账户信息
 * @author Caohongtao
 * @Date 2021-1-6
 * @version 1.0.0.1
 * */
public class Accounts301 implements Serializable {
	private static final long serialVersionUID = 1L;
	Hashtable accounts301 = new Hashtable();

	// 重写 toString hashCode and equals
	@Override
	public String toString() {
		return "Accounts [accounts301=" + accounts301 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts301 == null) ? 0 : accounts301.hashCode());
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
		Accounts301 other = (Accounts301) obj;
		if (accounts301 == null) {
			if (other.accounts301 != null)
				return false;
		} else if (!accounts301.equals(other.accounts301))
			return false;
		return true;
	}

	// 生成有参无参
	public Accounts301(Hashtable accounts301) {
		super();
		this.accounts301 = accounts301;
	}

	public Accounts301() {
		super();
	}

	// setter and getter
	public Hashtable getAccounts301() {
		return accounts301;
	}

	public void setAccounts301(Hashtable accounts301) {
		this.accounts301 = accounts301;
	}

}
