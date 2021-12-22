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
 * �����ࣺRecord301.java
 * ��������Ҫ���ڻ�ȡ�û��������ݡ���ȡϵͳ��ǰ���ں�ʱ�䡢��ȡ����ϵͳ�û��˺�
 * @author Caohongtao
 * @Date 2021-1-6
 * @version 1.0.0.1
 * */
public class Tools301 {
	/*
	 * 
	 * ��ȡϵͳ��ǰ���ں�ʱ��ķ���
	 * 
	 * @return ϵͳ��ǰ���ں�ʱ��
	 */
	public String getTime301() {
		Date date301 = new Date();
		SimpleDateFormat sdf301 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nowtime301 = sdf301.format(date301);
		return nowtime301;
	}

	/*
	 * ��ȡ�û��������ݵķ���
	 * 
	 * @return �û����������
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
	 * ��ȡ�˺ŵķ���
	 * 
	 * @return �˺�
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
		return "��ȡ�˺ų���";
	}

	public static void main(String[] args) {
		Tools301 tools301 = new Tools301();
		System.out.println(tools301.getTime301());
	}

}
