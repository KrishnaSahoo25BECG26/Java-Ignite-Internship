import java.util.Scanner;
public class EmployeeBonusEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Years of Experience: ");
		double years = sc.nextDouble();
		System.out.print("Enter attendance of Employee (in %): ");
		double attend = sc.nextDouble();
		System.out.print("Rating of Employee (1-5): ");
		int rate = sc.nextInt();
		if (attend < 60) {
			System.out.println("NOT Eligible for Bonus Attendance LOW.");
		}
		else if (years > 3 && attend > 85) {
			switch(rate) {
			case 3:
				System.out.println("Eligible for Bonus.");
				System.out.println("Bonus: 10000");
				break;
			case 4:
				System.out.println("Eligible for Bonus.");
				System.out.println("Bonus: 30000");
				break;
			case 5:
				System.out.println("Eligible for Bonus.");
				System.out.println("Bonus: 50000");
				break;
			default: System.out.println("No Bonus.");
			}
		}
		else {
			System.out.println("Not Eligible for Bonus");
		}
		sc.close();

	}

}
