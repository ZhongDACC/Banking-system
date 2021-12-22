package com.ambow.bank.pojo301;
import java.io.Serializable;
/*
 * Copyright(C),2020-2021. Ambow.Co., Ltd.
 * 操作记录类：Record301.java
 * 操作记录类包含索引、账号、操作类型、操作金额、旧密码、新密码和操作时间等信息。
 * @author Caohongtao
 * @Date 2021-1-6
 * @version 1.0.0.1
 * */
import java.util.Hashtable;


public class Record301 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String index301;// 索引
	private String account301;// 账号
	private String type301;// 操作类型
	private String amount301;// 操作金额
	private String oldpwd301;// 旧密码
	private String newpwd301;// 新密码
	private String nowtime301;// 操作时间
	// 重写 toString hashCode and equals

	@Override
	public String toString() {
		return "Record301 [index301=" + index301 + ", account301=" + account301 + ", type301=" + type301
				+ ", amount301=" + amount301 + ", oldpwd301=" + oldpwd301 + ", newpwd301=" + newpwd301 + ", nowtime301="
				+ nowtime301 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account301 == null) ? 0 : account301.hashCode());
		result = prime * result + ((amount301 == null) ? 0 : amount301.hashCode());
		result = prime * result + ((index301 == null) ? 0 : index301.hashCode());
		result = prime * result + ((newpwd301 == null) ? 0 : newpwd301.hashCode());
		result = prime * result + ((nowtime301 == null) ? 0 : nowtime301.hashCode());
		result = prime * result + ((oldpwd301 == null) ? 0 : oldpwd301.hashCode());
		result = prime * result + ((type301 == null) ? 0 : type301.hashCode());
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
		Record301 other = (Record301) obj;
		if (account301 == null) {
			if (other.account301 != null)
				return false;
		} else if (!account301.equals(other.account301))
			return false;
		if (amount301 == null) {
			if (other.amount301 != null)
				return false;
		} else if (!amount301.equals(other.amount301))
			return false;
		if (index301 == null) {
			if (other.index301 != null)
				return false;
		} else if (!index301.equals(other.index301))
			return false;
		if (newpwd301 == null) {
			if (other.newpwd301 != null)
				return false;
		} else if (!newpwd301.equals(other.newpwd301))
			return false;
		if (nowtime301 == null) {
			if (other.nowtime301 != null)
				return false;
		} else if (!nowtime301.equals(other.nowtime301))
			return false;
		if (oldpwd301 == null) {
			if (other.oldpwd301 != null)
				return false;
		} else if (!oldpwd301.equals(other.oldpwd301))
			return false;
		if (type301 == null) {
			if (other.type301 != null)
				return false;
		} else if (!type301.equals(other.type301))
			return false;
		return true;
	}

	// 生成有参无参
	public Record301(String index301, String account301, String type301, String amount301, String oldpwd301,
			String newpwd301, String nowtime301) {
		super();
		this.index301 = index301;
		this.account301 = account301;
		this.type301 = type301;
		this.amount301 = amount301;
		this.oldpwd301 = oldpwd301;
		this.newpwd301 = newpwd301;
		this.nowtime301 = nowtime301;
	}

	public Record301() {
		super();
	}

	// set get
	public String getIndex301() {
		return index301;
	}

	public void setIndex301(String index301) {
		this.index301 = index301;
	}

	public String getAccount301() {
		return account301;
	}

	public void setAccount301(String account301) {
		this.account301 = account301;
	}

	public String getType301() {
		return type301;
	}

	public void setType301(String type301) {
		this.type301 = type301;
	}

	public String getAmount301() {
		return amount301;
	}

	public void setAmount301(String amount301) {
		this.amount301 = amount301;
	}

	public String getOldpwd301() {
		return oldpwd301;
	}

	public void setOldpwd301(String oldpwd301) {
		this.oldpwd301 = oldpwd301;
	}

	public String getNewpwd301() {
		return newpwd301;
	}

	public void setNewpwd301(String newpwd301) {
		this.newpwd301 = newpwd301;
	}

	public String getNowtime301() {
		return nowtime301;
	}

	public void setNowtime301(String nowtime301) {
		this.nowtime301 = nowtime301;
	}

	public void setRecords301(Hashtable hashtable301) {
		// TODO Auto-generated method stub
		
	}


}
