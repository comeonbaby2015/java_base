package thread;

/**
 * 使用synchronized 同步资源对象
 * 
 * @author Administrator
 * 
 */
public class Thread_Synchronization2 {

	public static void main(String[] args) {
		// 创建一个账户
		Account2 account = new Account2("1001", 1000);
		new DrawMeoney2("甲", 800, account).start();
		new DrawMeoney2("乙", 800, account).start();
	}
}

class Account2 {
	private String accountNo;
	private double balance;

	public Account2(String no, double balance) {
		this.accountNo = no;
		this.balance = balance;
	}

	public int hashCode() {
		return accountNo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) {
			return true;
		}

		if ((obj != null) && (obj.getClass() == Account2.class)) {
			Account2 account = (Account2) obj;
			return account.getAccountNo().equals(accountNo);
		}
		return false;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String no) {
		this.accountNo = no;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}

class DrawMeoney2 extends Thread {
	private String name;
	private double drawMoney;
	private Account2 account;

	public DrawMeoney2(String name, double money, Account2 account) {
		this.name = name;
		this.drawMoney = money;
		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 使用synchronized 同步资源对象.同步监视器的就是account。
		synchronized (account) {
			if (drawMoney <= account.getBalance()) {
				System.out.println("name=" + name + "，取钱成功了,【金额】=" + drawMoney);
				account.setBalance(account.getBalance() - drawMoney);

				System.out.println("name=" + name + "，取钱成功了，余额=" + account.getBalance());
			} else {
				System.out.println("name=" + name + "取钱失败：余额不足");
			}
		}

	}
}
