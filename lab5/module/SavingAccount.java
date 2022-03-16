package Com.Java.Module1;

public class SavingAccount extends Account{
	final int minimumBalance=100;
	boolean withdraw(double money) {
		boolean flag=false;
		System.out.println ("Withdrawl from account " + getAccNum());
		System.out.println ("Amount: " + money);
		System.out.println(getBalance());
		if (minimumBalance > getBalance()) {
			System.out.println ("Insufficient funds.");
			flag=true;
		}
		else {
			setBalance(getBalance()- money);
			System.out.println ("New balance: " + getBalance());
			flag=false;
		}
		System.out.println();
		setBalance(getBalance()-money);
		return flag;
	}
	public static void main(String[] args) {
		SavingAccount a=new SavingAccount();
		a.setAccNum(123456789l);
		System.out.println(" user acc no. is "+" "+a.getAccNum()); a.setBalance(1000.0);
		System.out.println( " \" user initial balance is \"+\" \"+"+a.getBalance());
		a.deposite(10000);
		System.out.println(" updated balance"+" " +a.getBalance());
		a.withdraw(2000);
	}
}
