package Com.Java.Module1;

public class Person extends Account {
	private String name;
	private float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	void accHolder() {
		System.out.println("User name is "+""+getName());
		System.out.println("User age is "+""+getAge());
	}
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Kitha");
		p.setAge(24);
		p.accHolder();
		p.setAccNum(45674322);
		System.out.println("User account number is "+""+p.getAccNum());
		p.setBalance(1000.0);
		System.out.println("User initial balance is "+""+p.getBalance());
		p.deposite(2000);
		System.out.println("Update balance "+""+p.getBalance());
		SavingAccount sa=new SavingAccount();
		sa.withdraw(2000);
	}
}
