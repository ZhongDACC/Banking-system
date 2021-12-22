package com.ambow.bank.service301;

import java.util.Enumeration;
import java.util.Hashtable;

import com.ambow.bank.pojo301.Account301;
import com.ambow.bank.pojo301.Record301;
import com.ambow.bank.pojo301.Account301;
import com.ambow.bank.pojo301.Accounts301;
import com.ambow.bank.pojo301.Record301;
import com.ambow.bank.pojo301.Records301;
import com.ambow.bank.tools301.Tools301;

/*
 * Copyright(C),2020-2021. Ambow.Co., Ltd.
 * 银行业务处理类：BankProcess301.java
 *银行业务处理类主要是来银行办理业务的处理
 * @author Caohongtao
 * @Date 2021-1-7
 * @version 1.0.0.1
 * */
public class BankProcess301 {
	int key301 = 1;
	String name301;
	String account301;
	String password301;
	String amount301;
	String nowtime301;
	String index301;
	Accounts301 accounts301 = new Accounts301();
	Records301 records301 = new Records301();
	Tools301 tools301 = new Tools301();
	Hashtable hashtableAccounts301 = accounts301.getAccounts301();
	Hashtable hashtableRecords301 = records301.getRecords301();
	IOProcess301 iOProcess301 = new IOProcess301();

	// 构造方法
	public BankProcess301(Accounts301 accounts301, Records301 records301) {
		super();
		this.accounts301 = accounts301;
		this.records301 = records301;
	}
	public BankProcess301() {
		super();
	}
	// 1、开户的方法
	public void openAccounts301() {
		System.out.println("Welcome to open account ,Pleace as the system prompt input !(欢迎您来开办新帐户！请根据系统提示输入！");

		System.out.println("");

		System.out.println("Input you name,please（请输入姓名）:");
		name301 = tools301.input301();
		System.out.println("Input you password,please（请输入密码）:");
		password301 = tools301.input301();
		System.out.println("Input you first amount,please（请输入初始余额）:");
		amount301 = tools301.input301();
		account301 = tools301.getID301();
		nowtime301 = tools301.getTime301();
		Account301 acc301 = new Account301(account301, name301, amount301, password301, nowtime301);
		hashtableAccounts301.put(account301, acc301);
		accounts301.setAccounts301(hashtableAccounts301);
		iOProcess301.outputAccounts301(accounts301);
		System.out.println("Just a minute please! It is opening account⋯⋯（请稍候，正在开户中⋯⋯）");
		System.out.println("-------------------------------");
		System.out.println("Congratulations open account successful（恭喜开户成功!）!");
		System.out.println("Yours account is（你的帐号为）:" + account301);
		System.out.println("Yours password is（你的密码为）:"+password301+ "   Remember it Please！（请牢记密码）");
		System.out.println("Open account date is（开户日期为）" + nowtime301);
		index301 = String.valueOf(key301);
		this.saveRecord301(hashtableAccounts301, index301, account301, amount301, acc301, "开户");
		key301++;
		System.out.println("-------------------------------");
		System.out.println("按回车键返回主菜单！");
		tools301.input301();
	}
	// 2、存款的方法
	public void saveMoney301() {
		System.out.println("Welcome to save money ,Pleace as the system prompt input !(欢迎您来办理存款业务！请根据提示输入）");
		System.out.println("Input you account,please（请输入帐号）:");
		account301 = tools301.input301();
		System.out.println("Input you amount,please（请输入存款的金额）:");
		amount301 = tools301.input301();
		try {
			Account301 acc301 = (Account301) hashtableAccounts301.get(account301);
			String balance301 = this.saveGet301(hashtableAccounts301, account301, amount301, true);
			nowtime301 = tools301.getTime301();
			System.out.println("Just a minute please! It is saving money!（请稍候，正在存款中⋯⋯）");
			System.out.println("-------------------------------");
			System.out.println("Congratulations save money successful ！（恭喜你存款成功）");
			System.out.println("Yours save amount is（您的存款金额是）："+amount301);
			System.out.println("Yours balance is（您的余额是）："+ balance301 );
			System.out.println("Save date is（您的存款日期）:" + nowtime301);
			index301 = String.valueOf(key301);
			this.saveRecord301(hashtableAccounts301, index301, account301, amount301, acc301, "存款");
			key301++;
		    }catch (Exception e) {
			System.out.println("------------------------------- ");
			System.out.println("account is notbeing ！！(帐号不存在)");}
			System.out.println("------------------------------- ");
			System.out.println("按回车键返回主菜单！");
			tools301.input301();
		}
	// 3、取款的方法
	public void getMoney301() {
			System.out.println("Welcome to withdrawal ,Please as the system prompt input !(欢迎您来办理取款业务！请根据提示输入！）");
			System.out.println("Input you account,please（请输入帐号）:");
			account301 = tools301.input301();
			try {
			Account301 acc301 = (Account301) hashtableAccounts301.get(account301);
			password301 = this.inputPassword301(acc301);
			if (password301.equals(acc301.getPassword301())) {
				System.out.println("Input you get out amount ,please(请输入取款金额)");
				amount301 = tools301.input301();
				if(Integer.parseInt(amount301)>Integer.parseInt(acc301.getBalance301())) {
					System.out.println("取款大于余额，取款失败！");
			} else {
                System.out.println("Just a minute please! It is withdrawal⋯⋯（请稍候，正在取款中⋯⋯）");

				System.out.println("-------------------------------");

				System.out.println("Congratulations withdrawal successful ！（恭喜你取款成功!）");

				String balance301 = this.saveGet300(hashtableAccounts301, account301, amount301, false);

				System.out.println("Yours balance is（您的余额是）：" + balance301);

				nowtime301 = tools301.getTime301();

				System.out.println("withdrawal date is （您的取款日期）:" + nowtime301);

				index301 = String.valueOf(key301);
				this.saveRecord301(hashtableAccounts301, index301, account301, amount301, acc301, "取款");
				key301++;
			}
		 }else{
			System.out.println("         取款不成功！ ");
          }
	}catch(Exception e){
		   System.out.println("------------------------------- ");
		   System.out.println("account is notbeing ！！（帐号不存在）");
		  System.out.println("------------------------------- ");
		  System.out.println("按回车键返回主菜单！");
		  tools301.input301();
		  }
		}



	// 4、查询的方法
	public void query301() {System.out.println("Welcome to query ,Please as the system prompt input !(欢迎您来查看帐户信息！请根据提示输入！）");
	System.out.println("Input you account,please（请输入帐号）:");
	account301 = tools301.input301();
	try {
		Account301 acc301 = (Account301) accounts301.getAccounts301().get(account301);
		password301 = this.inputPassword301(acc301);
		if (password301.equals(acc301.getPassword301())) {
			System.out.println("Just a minute please! It is querying⋯⋯（请稍候，正在查询中⋯⋯）");
			System.out.println("-------------------------------");
			System.out.println("Congratulations query successful ！(查询成功！)");
			System.out.println("Yours accounts message is(你的帐户信息是)：");
			System.out.println("帐号:" + acc301.getAccount301() + "  " + "姓名:" + acc301.getName301() + "  " + "余额:"
					+ acc301.getBalance301() + "  ");
			System.out.println("开户日期:" + acc301.getNowtime301());
			System.out.println("");
			System.out.println("Yours records message is(你的操作日志信息是)：");
			Enumeration en = records301.getRecords().elements();
			while (en.hasMoreElements()) {
				Record301 record301 = (Record301) en.nextElement();
				if (record301.getAccount301().equals(account301)) {
					System.out.print("操作类型: " + record301.getType301() + "  " + "流动金额: " + record301.getAmount301()
							+ "  " + "旧密码:" + record301.getOldpwd301() + "  " + "新密码:" + record301.getNewpwd301()
							+ "  ");
					System.out.println("时间:" + record301.getNowtime301());
				}
			}
		} else {
			System.out.println("        查询不成功！ ");
		}
	} catch (Exception e) {
		System.out.println("------------------------------- ");
		System.out.println("account is not being ！！（帐号不存在）");
	}
	System.out.println("------------------------------- ");
	System.out.println("按回车键返回主菜单！");
	tools301.input301();
	}

	// 5、修改密码的方法
	public void modifyPassword301() {
	System.out.println("Welcome to change password ,Please as the system prompt input !(欢迎您来修改密码！请根据提示输入！）");
	System.out.println("Input you account,please（请输入帐号）:");
	account301 = tools301.input301();
	try {
		Account301 acc301 = (Account301) accounts301.getAccounts301().get(account301);
		password301 = this.inputPassword301(acc301);
		if (password301.equals(acc301.getPassword301())) {
			System.out.println("Input you new password ,please(请输入新密码):");
			String newpassword1 = tools301.input301();
			System.out.println("Input you new password again,please (请再次输入新密码):");
			String newpassword = tools301.input301();
			if (newpassword1.equals(newpassword)) {
				acc301.setPassword301(newpassword1);
				accounts301.getAccounts301().put(acc301.getAccount301(), acc301);
				accounts301.setAccounts301(accounts301.getAccounts301());
				iOProcess301.outputAccounts301(accounts301);//把账户信息集合对象写入本地磁盘文件
				index301 = String.valueOf(key301);
				nowtime301 = tools301.getTime301();
				Record301 record301 = new Record301(index301, account301, "修改密码", "0", password301, newpassword,
						nowtime301);
				records301.getRecords301().put(index301, record301);
				records301.setRecords301(records301.getRecords());
				iOProcess301.outputRecords301(records301);//把操作记录集合对象写入本地磁盘文件
				key301++;
				System.out.println("Just a minute pleace! It is changing password⋯⋯（请稍候，正在修改中⋯⋯）");
				System.out.println("-------------------------------");
				System.out.println("Congratulations password change successful ！（恭喜你密码修改成功!（请牢记新密码!）");
				System.out.println("Yours new password is（你的新密码为）：" + newpassword + "（请牢记新密码!）");
				System.out.println("Change date is您的修改日期:" + nowtime301);

			} else {
				System.out.println("-------------------------------");
				System.out.println("  Sorry!，你两次密码输入不一致！ ");
				System.out.println("       密码修改不成功！ ");
			}
		} else {
			System.out.println("       密码修改不成功！ ");
		}
	} catch (Exception e) {
		System.out.println("------------------------------- ");
		System.out.println("account is notbeing ！！（帐号不存在）");
	}
	System.out.println("------------------------------- ");
	System.out.println("按回车键返回主菜单！");
	tools301.input301();
		
	}

	// 6、转账的方法
	public void transferMoney301() {
		System.out.println("Welcome to transfer ,Pleace as the system prompt input !(欢迎您来办理转帐业务！请根据提示输入！）");
		System.out.println("Input you account,please（请输入帐号）:");
		account301 = tools301.input301();
		try {
			Account301 acc301 = (Account301) accounts301.getAccounts301().get(account301);//根据账号account301获取账户信息acc301
			password301 = this.inputPassword301(acc301);//验证密码
			if (password301.equals(acc301.getPassword301())) {
				System.out.println("Input you account of rooll in ,please（请输入要转入的帐号）:");
				String inaccount = tools301.input301();//最好验证一下账号是否存在
				System.out.println("Input you transfer amount,please（请输入转帐金额）:");
				amount301 = tools301.input301();
				if (Integer.parseInt(amount301) < Integer.parseInt(acc301.getBalance301())) {
					String balance = this.saveGet300(accounts301.getAccounts301(), account301, amount301, false);
					this.saveGet300(accounts301.getAccounts301(), inaccount, amount301, true);
					nowtime301 = tools301.getTime301();
					System.out.println("Just a minute pleace! It is transfering⋯⋯（请稍候，正在转帐中⋯⋯）");
					System.out.println("-------------------------------");
					System.out.println("Congratulations transfer successful ！(恭喜你转帐成功!)");
					System.out.println("Yours balance is (您的余额是)：" + balance);
					System.out.println("Transfer date is (您的转帐日期):" + nowtime301);
					index301 = String.valueOf(key301);
					this.saveRecord301(records301.getRecords301(), index301, account301, amount301, acc301, "转账");
					key301++;
				} else {
					System.out.println("-------------------------------");
					System.out.println("你的帐户没有那么多钱了！转帐操作失败");
				}
			} else {
				System.out.println("       密码输入错误！ ");
			}
		} catch (Exception e) {
			System.out.println("------------------------------- ");
			System.out.println("account is notbeing ！！（帐号不存在）");
		}
		System.out.println("------------------------------- ");
		System.out.println("按回车键返回主菜单！");
		tools301.input301();
		
	}

	// 7、销户的方法
	public void deleteAccount301() {
		System.out.println("Welcome to delete account ,Pleace as the system prompt input !(欢迎您来办理销户业务！请根据提示输入！）");
		System.out.println("Input you account,please（请输入帐号）:");
		account301 = tools301.input301();
		try {
			Account301 acc301 = (Account301) accounts301.getAccounts301().get(account301);
			password301 = this.inputPassword301(acc301);//
			if (password301.equals(acc301.getPassword301())) {
				if (acc301.getBalance301() != null) {
					System.out.println("------------------------------- ");
					System.out.println("你的帐户还有余额，请全部取出后再销户！");
					System.out.println("你的帐户金额为:" + acc301.getBalance301());
					System.out.println("确认全部取出余额！按回车键销户！");
					tools301.input301();
				}
				accounts301.getAccounts301().remove(account301);//从这个账号信息集合中删除
				accounts301.setAccounts301(accounts301.getAccounts301());
				iOProcess301.outputAccounts301(accounts301);//写入本地磁盘文件
				Enumeration en = records301.getRecords301().elements();//获取这个账号的所有操作记录
				while (en.hasMoreElements()) {
					Record301 record301 = (Record301) en.nextElement();
					if (record301.getAccount301().equals(account301)) {
						records301.getRecords301().remove(record301.getIndex301());//从这个操作记录集合中删除
						records301.setRecords301(records301.getRecords301());
						iOProcess301.outputRecords301(records301);//写入本地磁盘文件
					}
				}
				System.out.println("Just a minute pleace! It is deleting account!（请稍候，正在销户中⋯⋯）");
				System.out.println("-------------------------------");
				System.out.println("         销户完成！");
				System.out.println("  欢迎您下次再次来办理业务！");
			} else {
				System.out.println("        销户不成功！ ");
			}
		} catch (Exception e) {
			System.out.println("------------------------------- ");
			System.out.println("account is notbeing ！！（帐号不存在）");
			System.out.println("   ");
		}
		System.out.println("------------------------------- ");
		System.out.println("按回车键返回主菜单！");
		tools301.input301();
		
	}

	// 8、输入密码的方法
	public String inputPassword301(Account301 account301) {
		String pwd301 = null;
		int i3 = 3;
		System.out.println("Input you password,please,you have three chance. （请输入密码,你有3次输入次机会）");
		while (i3 >= 0) {
			if (i3 == 0) {
				System.out.println("-------------------------------");
				System.out.println("  Sorry!你的输入次数已超过三次！ ");
				i3--;
			} else {
				pwd301 = tools301.input301();
				if (pwd301.equals(account301.getPassword301())) {
					return pwd301;
				} else {
					int j = i3 - 1;
					if (j > 0) {
						System.out.println("  Sorry!你的密码输入有误！ ");
						System.out.println("请重新输入,你还有" + j + "次机会！");
					}
					i3--;
				}
			}
		}
		return "输入密码出错！";
	}

	// 9、存取钱的方法
	public String saveGet300(Hashtable hashtable301, String account301, String amount301, boolean b301) {
		String balance301 = null;
		Account301 acc301 = (Account301) hashtable301.get(account301);
		try {
			String yu_e = acc301.getBalance301();
			if (b301) {
				int balance = Integer.parseInt(yu_e) + Integer.parseInt(amount301);
				balance301 = String.valueOf(balance);
				acc301.setBalance301(balance301);
			} else {
				int balance = Integer.parseInt(yu_e) - Integer.parseInt(amount301);
				balance301 = String.valueOf(balance);
				acc301.setBalance301(balance301);
			}
			hashtable301.put(acc301.getAccount301(), acc301);
			accounts301.setAccounts301(hashtable301);
			iOProcess301.outputAccounts301(accounts301);
			return balance301;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "存取钱出错";
	}

	// 10.保存操作记录日志信息的方法
	public void saveRecord301(Hashtable hashtable301, String index301, String acc301, String amount301,
			Account301 account301, String type301) {
		String nowtime301 = tools301.getTime301();// 获取当前操作的时间
		Record301 record301 = new Record301(index301, acc301, type301, amount301, account301.getPassword301(),
				account301.getPassword301(), nowtime301);// 创建操作记录对象，相当于一条操作记录信息
		// 放到Hashtable(相当于根据数组下标，把对象保存到数组里面， put (key, value))
		hashtable301.put(index301, record301);
		// 把hashtable放到操作记录信息集合
		record301.setRecords301(hashtable301);
		// 把操作记录信息集合对象写入到文件
		IOProcess301.outputRecords301(records301);
	}

}
