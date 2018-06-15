
import java.time.LocalDate;
import java.time.Month;

public class Account {
	private static long Accnum=10000001;
	protected double balance;
	private PersonAcc accHolder;
	public Account()
	{
		Accnum++;
	}
	public void deposit(double balance)
	{
		this.balance+=balance;
		
	}
	public void withdraw(double balance)
	{
		if((this.balance-balance)<=500)
			System.out.println("Cannot be withdrawn minimum balance is Rs.500.");
		else
		this.balance-=balance;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public long getAccnum() {
		return Accnum;
	}
		public PersonAcc getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(PersonAcc accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String toString()
	{
		return "Account Number is:"+Accnum+"\tName of Account Holder is:"+this.accHolder.getName()+"\t  Age of Account Holder:"+this.accHolder.getAge();
	}
	public static void main(String[] args) {
		Account acc1=new Account();
		PersonAcc p1=new PersonAcc();
		p1.setName("smith");
		p1.setAge(40);
		acc1.setAccHolder(p1);
		acc1.setBalance(2000);
		System.out.println(acc1);
		PersonAcc p2=new PersonAcc();
		p2.setName("Kathy");
		p2.setAge(25);
		Account acc2=new Account();
		acc2.setAccHolder(p2);
		acc2.setBalance(3000);
		acc1.deposit(2000);
		acc2.withdraw(2000);
		System.out.println("Balance of Smith is:"+acc1.getBalance());
		System.out.println("\n"+acc2);
		System.out.println("Balance of Kathy is:"+acc2.getBalance());
		String name=p1.getFullName("Smith","Allen");
		float age=p1.calculateAge(LocalDate.of(1997, Month.AUGUST, 23));
		System.out.println(name+"\tAge is:"+age);
		
		
	}
}
