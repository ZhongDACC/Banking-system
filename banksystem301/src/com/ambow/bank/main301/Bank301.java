package com.ambow.bank.main301;

import java.io.IOException;
import com.ambow.bank.pojo301.Accounts301;
import com.ambow.bank.pojo301.Records301;
import com.ambow.bank.service301.BankProcess301;
import com.ambow.bank.service301.IOProcess301;

/*
 * Copyright(C),2020-2021. Ambow.Co., Ltd.
 * �������ࣺBank301.java
 *����������Ҫ���ṩ���г���ҵ��ӿڲ���
 * @author Caohongtao
 * @Date 2021-1-8
 * @version 1.0.0.1
 * */
public class Bank301 {
	public static void main(String[] args) {
		IOProcess301 iOProcess301 = new IOProcess301();
		Accounts301 accounts301 = new Accounts301();
		accounts301 = iOProcess301.inputAccounts301();
		Records301 records301 = new Records301();
		records301 = iOProcess301.inputRecords301();
		BankProcess301 bankProcess = new BankProcess301(accounts301, records301);
		int x = 0;
		while (x != 1) {
			System.out.println("*********************************");
			System.out.println("        ���й���ϵͳ");
			System.out.println("*********************************");
			System.out.println(" 1������");
			System.out.println(" 2�����");
			System.out.println(" 3��ȡ��");
			System.out.println(" 4����ѯ");
			System.out.println(" 5���޸�����");
			System.out.println(" 6��ת��");
			System.out.println(" 7������");
			System.out.println(" 8���˳�ϵͳ");
			System.out.println("-------------------------------");
			System.out.println("��ѡ��������ࣺ");
			byte[] ch = new byte[100];
			try {
				System.in.read(ch);
			} catch (IOException e) {
				e.printStackTrace();
			}
			int n = ch[0];
			switch (n) {
			case 49:
				bankProcess.openAccounts301();
				break;
			case 50:
				bankProcess.saveMoney301();
				break;
			case 51:
				bankProcess.getMoney301();
				break;
			case 52:
				bankProcess.query301();
				break;
			case 53:
				bankProcess.modifyPassword301();
				break;
			case 54:
				bankProcess.transferMoney301();
				break;
			case 55:
				bankProcess.deleteAccount301();
				break;
			case 56:
				System.out.println("���Ѿ��ɹ��˳�ϵͳ��");
				x = 1;
				break;
			default:
				System.out.println("������1��8֮�������");
				break;
			}

		}
	}
}