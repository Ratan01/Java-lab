package Com.Java.Module1;

public class CurrentAccount extends Account{
	final double overDraftLimit =2000;
	boolean withdraw(double money) {
		System.out.println("the avalaible balance is ");
		System.out.println( getBalance()-money);
		setBalance(getBalance()-money);
		boolean flag=false;
		if(money>overDraftLimit) {
			System.out.println("sorry you reached ur overdraft limit");
			flag=false;
		}
		else {
			System.out.println("ur withdrawing ammount is "+ money);
			flag=true;
		}
		return flag;
	}
}
