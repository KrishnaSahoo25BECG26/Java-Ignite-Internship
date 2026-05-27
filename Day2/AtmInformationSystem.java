import java.util.Scanner;
public class AtmInformationSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Holder Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Account Balance: ");
		double balance = sc.nextDouble();
		System.out.print("Enter Withdrawal amount: ");
		double amount = sc.nextDouble();
		double r_amount = balance - amount;
		System.out.println("Account Holder Name: "+name);
		System.out.println("Remaining Amount: "+r_amount);
		System.out.println("Is balance greater than withdrawal? :- "+ (balance>amount));
	}

}
