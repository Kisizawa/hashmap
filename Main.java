package hashmap;

import java.util.HashMap;
import java.util.Scanner;


public class Main {
		static String accountName;
		static int money;
		static double accountNum;
		static String Name;
		static boolean ui=true;
		
	public static void main(String[] args) {
		while(ui=true) {
		Start();
		int a=new java.util.Scanner(System.in).nextInt();
		selectaNum(a);
		}
		

	}

	public static void Start() {
		System.out.println("what do?");
		System.out.println("1.アカウントの作成\n2.預金の確認\n3.預入\n4.引き出し");
		
	}
	
	public static void Set() {
		HashMap<String,Integer> account =new HashMap<String,Integer>();
		HashMap<Integer,Integer> accountmoney=new HashMap<Integer,Integer>();
		System.out.println("アカウントを作成します\n名前を教えてください");
		String accountName=new java.util.Scanner(System.in).nextLine();
		accountNum=Math.random()*9999;
		
		account.put(accountName,(int)accountNum);
		
		System.out.println("アカウントの番号は"+account.get(accountName));
		System.out.println("持っているお金を教えてください");
		money=new java.util.Scanner(System.in).nextInt();
		
		accountmoney.put((int)accountNum, money);
		
		System.out.println("アカウントの名前を教えてください");
		Name=new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたのアカウント番号は"+account.get(Name));
		System.out.println("あなたのアカウントの預金は"+accountmoney.get((int)accountNum));
		
		
	}
	
	public static int selectaNum(int a) {
		if(a==1) {
			
			Set();
		}else if(a==2) {
			System.out.println("預金の確認をします");
			
		}else if(a==3) {
			System.out.println("預金の預け入れをします");
		}else if(a==4) {
			System.out.println("預金の引き出しをします");
		}else {
			Start();
			
		}
		
		return a;
	}
	
	public static String getAccountName() {
		return accountName;
	}

	public static void setAccountName(String accountName) {
		Main.accountName = accountName;
	}

	public static int getMoney() {
		return money;
	}

	public static void setMoney(int money) {
		Main.money = money;
	}

	public static double getAccountNum() {
		return accountNum;
	}

	public static void setAccountNum(double accountNum) {
		Main.accountNum = accountNum;
	}

	public static String getName() {
		return Name;
	}

	public static void setName(String name) {
		Name = name;
	}

}
