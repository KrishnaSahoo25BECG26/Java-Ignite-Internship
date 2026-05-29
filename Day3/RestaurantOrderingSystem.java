import java.util.Scanner;
public class RestaurantOrderingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Membership (Gold/Silver/Normal): ");
		String membr = sc.nextLine();
		double bill = 0;
		
		System.out.println("-----Veg Menu-----\n1.Fried Rice (200)\n2.Noodles (100)");
		int vegFood = sc.nextInt();
		switch(vegFood) {
			case 1:
				System.out.print("Enter qty: ");
				int qty1 = sc.nextInt();
				bill += qty1*200;
				break;
			case 2:
				System.out.print("Enter qty: ");
				int qty2 = sc.nextInt();
				bill += qty2*100;
				break;
			case 3:
				break;
			default: System.out.println("Invalid Selection!");
		}
		
		System.out.println("-----Non-Veg Menu-----\n1.Chicken Biriyani (250)\n2.Grill Chicken (400)G");
		int nonVegFood = sc.nextInt();
		switch(nonVegFood) {
			case 1:
				System.out.print("Enter qty: ");
				int qty3 = sc.nextInt();
				bill += qty3*250;
				break;
			case 2:
				System.out.print("Enter qty: ");
				int qty4 = sc.nextInt();
				bill += qty4*400;
				break;
			case 3:
				break;
			default: System.out.println("Invalid Selection!");
		}
		
		System.out.println("Total before discount: "+bill);
		switch(membr) {
			case "Gold":
				double gbill = 0.8*bill;
				System.out.println("20% discount applied.");
				System.out.println("Total Bill: "+gbill);
				if(gbill > 2000) {
					System.out.println("You get a Free Dessert!");
				}
				break;
			case "Silver":
				System.out.println("10% discount applied.");
				System.out.println("Total Bill: "+(0.9*bill));
				break;
			case "Normal":
				System.out.println("No discount.");
				System.out.println("Total Bill: "+bill);
				break;
			default:
				System.out.println("Invalid Membership!");
		}
		sc.close();
	}
}