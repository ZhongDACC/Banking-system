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
* 输入输出类：IOProcess.java
*输入输出类主要是对用户账号操作、操作过程记录的处理
* @author Caohongtao
* @Date 2021-1-7
* @version 1.0.0.1
* */
public class IOProcess301 {
	private Accounts301 accounts301 = new Accounts301();
	private Records301 records301 = new Records301();

	/*
	 * 1.读取账户信息集合的方法 从本地磁盘文件“accounts301.dat”里面获取账户信息集合对象
	 *
	 * @return 账户信息集合 account301
	 */
	public Accounts301 inputAccounts301() {
		ObjectInputStream ois301 = null;
		try {
			File file301 = new File("accounts301.dat");// 在内存中创建accounts301.dat文件对象
			if (!file301.exists()) {// 如果文件不存在
				file301.createNewFile();
				return accounts301;// 在本地磁盘上创建records301.dat
			}
			if (file301.length() == 0) {// 文件长度为0，表示文件里面没有数据
				return accounts301;
			}
			FileInputStream fis301 = new FileInputStream(file301);// 创建一个文件输入流
			ois301 = new ObjectInputStream(fis301);// 对象输入流，读取文件输入流数据，数据需要实现可序化接口，Accounts301这个类implements，Serializable
			accounts301 = (Accounts301) ois301.readObject();// 读取对象并强制转换为Accounta301这种类型
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois301 != null) {
					ois301.close();// 关闭对象输入流
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return accounts301;
	}

	/*
	 * 2.保存账户信息集合的方法
	 *
	 * @param accounts301 把 accounts301保存到本地磁盘的"accounts301.dat"
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
	 * 3.读取操作记录信息集合的方法 从本地磁盘文件"records301.dat"里面获取操作记录信息集合对象
	 */
	public Records301 inputRecords301() {
		ObjectInputStream ois301 = null;
		try {
			File file301 = new File("records301.dat");// 在内存中创建records301.dat文件对象
			if (!file301.exists()) {// 如果文件不存在
				file301.createNewFile();
				return records301;// 在本地磁盘上创建records301.dat
			}
			if (file301.length() == 0) { // 文件长度为0，表示文件里面没有数据
				return records301;
			}
			FileInputStream fis301 = new FileInputStream(file301);// 创建一个文件输入流
			ois301 = new ObjectInputStream(fis301);// 对象输入流，读取文件输入流数据，数据需要实现可序化接口，Records301这个类implements，Serializable
			records301 = (Records301) ois301.readObject();// 读取对象并强制转换为Records301这种类型
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois301 != null) {
					ois301.close();// 关闭对象输入流
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return records301;
	}

	/*
	 * 4.保存操作记录信息集合的方法
	 *
	 * @param records301 把 records301保存到本地磁盘的"records301.dat"
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