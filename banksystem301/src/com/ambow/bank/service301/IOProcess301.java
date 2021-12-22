package com.ambow.bank.service301;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.ambow.bank.pojo301.Accounts301;
import com.ambow.bank.pojo301.Records301;

/*
* Copyright(C),2020-2021. Ambow.Co., Ltd.
* ��������ࣺIOProcess.java
*�����������Ҫ�Ƕ��û��˺Ų������������̼�¼�Ĵ���
* @author Caohongtao
* @Date 2021-1-7
* @version 1.0.0.1
* */
public class IOProcess301 {
	private Accounts301 accounts301 = new Accounts301();
	private Records301 records301 = new Records301();

	/*
	 * 1.��ȡ�˻���Ϣ���ϵķ��� �ӱ��ش����ļ���accounts301.dat�������ȡ�˻���Ϣ���϶���
	 *
	 * @return �˻���Ϣ���� account301
	 */
	public Accounts301 inputAccounts301() {
		ObjectInputStream ois301 = null;
		try {
			File file301 = new File("accounts301.dat");// ���ڴ��д���accounts301.dat�ļ�����
			if (!file301.exists()) {// ����ļ�������
				file301.createNewFile();
				return accounts301;// �ڱ��ش����ϴ���records301.dat
			}
			if (file301.length() == 0) {// �ļ�����Ϊ0����ʾ�ļ�����û������
				return accounts301;
			}
			FileInputStream fis301 = new FileInputStream(file301);// ����һ���ļ�������
			ois301 = new ObjectInputStream(fis301);// ��������������ȡ�ļ����������ݣ�������Ҫʵ�ֿ��򻯽ӿڣ�Accounts301�����implements��Serializable
			accounts301 = (Accounts301) ois301.readObject();// ��ȡ����ǿ��ת��ΪAccounta301��������
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois301 != null) {
					ois301.close();// �رն���������
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return accounts301;
	}

	/*
	 * 2.�����˻���Ϣ���ϵķ���
	 *
	 * @param accounts301 �� accounts301���浽���ش��̵�"accounts301.dat"
	 */
	public void outAccounts301(Accounts301 accounts301) {
		ObjectOutputStream oos301 = null;
		try {
			FileOutputStream fos301 = new FileOutputStream("accounts301");
			oos301 = new ObjectOutputStream(fos301);
			oos301.writeObject(accounts301);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos301 != null) {
					oos301.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * 3.��ȡ������¼��Ϣ���ϵķ��� �ӱ��ش����ļ�"records301.dat"�����ȡ������¼��Ϣ���϶���
	 */
	public Records301 inputRecords301() {
		ObjectInputStream ois301 = null;
		try {
			File file301 = new File("records301.dat");// ���ڴ��д���records301.dat�ļ�����
			if (!file301.exists()) {// ����ļ�������
				file301.createNewFile();
				return records301;// �ڱ��ش����ϴ���records301.dat
			}
			if (file301.length() == 0) { // �ļ�����Ϊ0����ʾ�ļ�����û������
				return records301;
			}
			FileInputStream fis301 = new FileInputStream(file301);// ����һ���ļ�������
			ois301 = new ObjectInputStream(fis301);// ��������������ȡ�ļ����������ݣ�������Ҫʵ�ֿ��򻯽ӿڣ�Records301�����implements��Serializable
			records301 = (Records301) ois301.readObject();// ��ȡ����ǿ��ת��ΪRecords301��������
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois301 != null) {
					ois301.close();// �رն���������
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return records301;
	}

	/*
	 * 4.���������¼��Ϣ���ϵķ���
	 *
	 * @param records301 �� records301���浽���ش��̵�"records301.dat"
	 */
	public void outRecords301(Records301 records301) {
		ObjectOutputStream oos301 = null;
		try {
			FileOutputStream fos301 = new FileOutputStream("records301");
			oos301 = new ObjectOutputStream(fos301);
			oos301.writeObject(records301);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos301 != null) {
					oos301.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void outputRecords301(Records301 records3012) {
		// TODO Auto-generated method stub
		
	}

	public void outputAccounts301(Accounts301 accounts3012) {
		// TODO Auto-generated method stub
		
	}

}