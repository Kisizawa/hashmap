import java.util.HashMap;
import java.util.Scanner;

public class Main {
		static String accountName;
		static int money;
		static double accountNum;
		static String Name;
		static boolean ui=true;
		static //key名前 valueアカウント番号
				HashMap<String,Integer> account =new HashMap<String,Integer>();
		static		//keyアカウント番号　vlue預金金額
				HashMap<Integer,Integer> accountmoney=new HashMap<Integer,Integer>();
				
	public static void main(String[] args) {
		while(ui=true) {
		Start();
		int a=new java.util.Scanner(System.in).nextInt();
		Set(a);
		}
		

	}

	public static void Start() {
		System.out.println("what do?");
		System.out.println("1.アカウントの作成\n2.預金の確認\n3.預入\n4.引き出し");
		
	}
	
	public static int Set(int a) {
	//例外処理
	try {
		if(a==1) {
		System.out.println("アカウントを作成します\n名前を教えてください");
		String accountName=new java.util.Scanner(System.in).nextLine();
		accountNum=Math.random()*8999+1000;
		
		account.put(accountName,(int)accountNum);
		
		System.out.println("アカウントの番号は"+account.get(accountName));
		System.out.println("持っているお金を教えてください");
		money=new java.util.Scanner(System.in).nextInt();
		
		accountmoney.put((int)accountNum, money);
		}
		
		if(a==2) {
			System.out.println("預金の確認をします");
			System.out.println("まず名前を教えてください");
			Name=new java.util.Scanner(System.in).nextLine();
			//アカウント番号抽出
			System.out.println("あなたのアカウント番号を教えてください");
			int accountnum=new java.util.Scanner(System.in).nextInt();
			//アカウント番号を教えてもらう
			if((int)account.get(Name)==accountnum) {
				System.out.println("あなたのアカウントの預金は"+accountmoney.get((int)accountnum));
			}
		}
			
			
			
		if(a==3) {
			System.out.println("預金の預け入れをします");
			
			System.out.println("まず名前を教えてください");
			Name=new java.util.Scanner(System.in).nextLine();
			//アカウント番号抽出
			System.out.println("あなたのアカウント番号を教えてください");
			int accountnum2=new java.util.Scanner(System.in).nextInt();
			//アカウント番号を教えてもらう
			if((int)account.get(Name)==accountnum2) {
				System.out.println("いくら預け入れしますか？");
				int inMoney=new java.util.Scanner(System.in).nextInt();
				int getmoney=accountmoney.get(accountnum2);
				int sumMoney=inMoney+getmoney;
				accountmoney.remove(accountnum2);
				accountmoney.put(accountnum2, sumMoney);
				}
		}
		if(a==4) {
			System.out.println("預金の引き出しを行います");
			System.out.println("まず名前を教えてください");
			Name=new java.util.Scanner(System.in).nextLine();
			//アカウント番号抽出
			System.out.println("あなたのアカウント番号を教えてください");
			int accountnum3=new java.util.Scanner(System.in).nextInt();
			//アカウント番号を教えてもらう
			if((int)account.get(Name)==accountnum3) {
				System.out.println("いくら引き出しますか？");
				int outMoney=new java.util.Scanner(System.in).nextInt();
				int money=accountmoney.get(accountnum3);
				if(money>=outMoney) {
				int pullMoney=money-outMoney;
				accountmoney.remove(accountnum3);
				accountmoney.put(accountnum3, pullMoney);
				}else if(money<outMoney) {
					System.out.println("引き出し金額が限度を超えています");
				}
				System.out.println("あなたの預金金額は"+money+"です");
				
				
				}
			}
		}catch(Exception e) {
			System.out.println("何らかのエラーが発生");
		}finally {
		
		return a;}
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
