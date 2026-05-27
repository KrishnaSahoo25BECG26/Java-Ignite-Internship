import java.util.Scanner;
public class OnlineShoppingBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer's name: ");
		String name = sc.nextLine(); 
		System.out.println("Enter Product's Name: ");
		String prodName = sc.nextLine();
		System.out.println("Enter Product's Price: ");
		double price = sc.nextDouble();
		System.out.println("Enter Quantity: ");
		int quantity = sc.nextInt();
		double total = price * quantity;
		System.out.println("---Bill---");
		System.out.println("Customer's Name: " + name);
		System.out.println("Product's Name: " + prodName);
		System.out.println("Product's Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Total Bill: " + total);

	}

}
