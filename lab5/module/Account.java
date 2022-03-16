package Com.Java.Module1;
public class Account {
	private long accNum;
	private double balance;
	public void deposite(double money) {
		balance=balance-money;
	}
	boolean withdraw(double money) {
		balance=balance-money;
		return true;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	void display() {
		System.out.println(accNum);
		System.out.println(balance);
	}
	public static void main(String[] args) {
		
	}
}