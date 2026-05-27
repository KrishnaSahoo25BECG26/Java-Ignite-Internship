import java.util.Scanner;
public class TravelExpenseEstimator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Distance (in  KM): ");
		double dist = sc.nextDouble();
		System.out.print("Enter the price of petrol per litre: ");
		double price = sc.nextDouble();
		System.out.print("Enter the mileage of vehicle: ");
		double avg = sc.nextDouble();
		System.out.println("Petrol Needed: "+ (dist/avg)+"litres");
		double total = (dist/avg)*price;
		System.out.println("Total Cost of petrol: "+total);
	}

}
