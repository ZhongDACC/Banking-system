package com.ambow.bank.tools301;

import java.util.Date;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

/*
 * Copyright(C),2020-2021. Ambow.Co., Ltd.
 * 工具类：Record301.java
 * 工具类主要用于获取用户输入内容、获取系统当前日期和时间、获取银行系统用户账号
 * @author Caohongtao
 * @Date 2021-1-6
 * @version 1.0.0.1
 * */
public class Tools301 {
	/*
	 * 
	 * 获取系统当前日期和时间的方法
	 * 
	 * @return 系统当前日期和时间
	 */
	public String getTime301() {
		Date date301 = new Date();
		SimpleDateFormat sdf301 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nowtime301 = sdf301.format(date301);
		return nowtime301;
	}

	/*
	 * 获取用户输入内容的方法
	 * 
	 * @return 用户输入的内容
	 */
	public String input301() {
		String info301 = null;
		try {
			InputStreamReader isr301 = new InputStreamReader(System.in);
			BufferedReader br301 = new BufferedReader(isr301);
			info301 = br301.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return info301;
	}

	/*
	 * 获取账号的方法
	 * 
	 * @return 账号
	 */
	public String getID301() {
		String accountID301;
		try {
			FileReader fr301 = new FileReader("zhanghao.txt");
			BufferedReader br301 = new BufferedReader(fr301);
			accountID301 = br301.readLine();
			br301.close();
			int w = Integer.parseInt(accountID301);
			w = w + 1;
			String zhanghao = String.valueOf(w);
			BufferedWriter bw301 = new BufferedWriter(new FileWriter("zhanghao.txt"));
			bw301.write(zhanghao);
			bw301.close();
			return accountID301;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "获取账号出错！";
	}

	public static void main(String[] args) {
		Tools301 tools301 = new Tools301();
		System.out.println(tools301.getTime301());
	}

}
