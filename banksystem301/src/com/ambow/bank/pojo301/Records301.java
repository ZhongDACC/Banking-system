package com.ambow.bank.pojo301;

import java.io.Serializable;
import java.util.Hashtable;

/*
 * Copyright(C),2020-2021. Ambow.Co., Ltd.
 * 操作记录集合类：Record301.java
 * 操作记录类包含所有的操作记录与信息
 * @author Caohongtao
 * @Date 2021-1-6
 * @version 1.0.0.1
 * */
public class Records301 implements Serializable {
	private static final long serialVersionUID = 1L;
	Hashtable records = new Hashtable();

	// 重写 toString hashCode and equals
	@Override
	public String toString() {
		return "Records301 [records=" + records + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((records == null) ? 0 : records.hashCode());
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
		Records301 other = (Records301) obj;
		if (records == null) {
			if (other.records != null)
				return false;
		} else if (!records.equals(other.records))
			return false;
		return true;
	}

	// 生成有参无参
	public Records301(Hashtable records) {
		super();
		this.records = records;
	}

	public Records301() {
		super();
	}

	// setter and getter
	public Hashtable getRecords() {
		return records;
	}

	public void setRecords(Hashtable records) {
		this.records = records;
	}

	public Hashtable getRecords301() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setRecords301(Hashtable records2) {
		// TODO Auto-generated method stub
		
	}

}
