package thread;

public class Thread_Synchronization {

	public static void main(String[] args) {
		// 创建一个账户
		Account account = new Account("1001", 1000);
		new DrawMeoney("甲", 800, account).start();
		new DrawMeoney("乙", 800, account).start();
	}
}

class Account {
	private String accountNo;
	private double balance;

	public Account(String no, double balance) {
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

		if ((obj != null) && (obj.getClass() == Account.class)) {
			Account account = (Account) obj;
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

class DrawMeoney extends Thread {
	private String name;
	private double drawMoney;
	private Account account;

	public DrawMeoney(String name, double money, Account account) {
		this.name = name;
		this.drawMoney = money;
		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		if (drawMoney <= account.getBalance()) {
			System.out.println("name=" + name + "，取钱成功了,【金额】=" + drawMoney);
			account.setBalance(account.getBalance() - drawMoney);

			System.out.println("name=" + name + "，取钱成功了，余额=" + account.getBalance());
		} else {
			System.out.println("name=" + name + "取钱失败：余额不足");
		}

	}
}
