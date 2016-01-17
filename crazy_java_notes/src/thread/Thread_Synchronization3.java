package thread;

// 使用synchronized同步方法
public class Thread_Synchronization3 {

	public static void main(String[] args) {
		// 创建一个账户
		Account3 account = new Account3("1001", 1000);
		new DrawMeoney3("甲", 800, account).start();
		new DrawMeoney3("乙", 800, account).start();
	}
}

class Account3 {
	private String accountNo;
	private double balance;

	public Account3(String no, double balance) {
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

		if ((obj != null) && (obj.getClass() == Account3.class)) {
			Account3 account = (Account3) obj;
			return account.getAccountNo().equals(accountNo);
		}
		return false;
	}

	// 使用synchronized同步方法
	public synchronized void drawMoney(double drawMoney) {
		if (drawMoney <= this.balance) {
			System.out.println("取钱成功了,【金额】=" + drawMoney);
			balance -= drawMoney;

			System.out.println("取钱成功了，余额=" + balance);
		} else {
			System.out.println("取钱失败：余额不足");
		}
	}

	public String getAccountNo() {
		return accountNo;
	}

	public double getBalance() {
		return balance;
	}

}

class DrawMeoney3 extends Thread {
	private String name;
	private double drawMoney;
	private Account3 account;

	public DrawMeoney3(String name, double money, Account3 account) {
		this.name = name;
		this.drawMoney = money;
		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		account.drawMoney(drawMoney);
	}
}
