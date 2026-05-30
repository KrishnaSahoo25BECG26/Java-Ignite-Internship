import java.util.Scanner;
public class ShoppingDiscountSystem {
	static double calcDiscount(double bill, double disc) {
		double dis = (disc/100)*bill;
		return bill - dis;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Bill amount: ");
		double bill = sc.nextDouble();
		System.out.print("Enter Discount: ");
		double disc = sc.nextDouble();
		double total = calcDiscount(bill,disc);
		System.out.println("Bill After Discount is "+total+"/-");
		sc.close();
	}

}
