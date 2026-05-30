import java.util.Scanner;
public class TravelExpenseCalculator {
	static double calcTravelCost(double dist, double milge, double price) {
		double petNeeded = (dist/milge);
		return petNeeded * price;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Travel Distance (in KM): ");
		double dist = sc.nextDouble();
		System.out.print("Enter Mileage: ");
		double milge = sc.nextDouble();
		System.out.print("Enter petrol price per litre: ");
		double price = sc.nextDouble();
		double cost = calcTravelCost(dist,milge,price);
		System.out.println("Estimated Travel Cost is "+cost+"/-");
		sc.close();
	}

}
