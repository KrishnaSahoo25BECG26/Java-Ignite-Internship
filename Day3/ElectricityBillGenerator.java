import java.util.Scanner;
public class ElectricityBillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Connection type (Domestic/Commercial/Industrial): ");
        String type = sc.nextLine();
        System.out.print("Enter Units Consumed: ");
        int unit = sc.nextInt();
        sc.nextLine();

        int res, mid;

        switch(type) {
            case "Domestic":
                if(unit <= 100) {
                    System.out.println("Cost: 0/-");
                }
                else if(unit <= 300) {
                    res = unit - 100;
                    System.out.println("Cost: " + (res * 5) + "/-");
                }
                else {
                    mid = unit - 300; // fix
                    System.out.println("Cost: " + (1500 + (mid * 8)) + "/-");
                }
                break;

            case "Commercial":
                if(unit < 200) {
                    System.out.println("Cost: " + (unit * 10) + "/-");
                }
                else {
                    System.out.println("Cost: " + (unit * 15) + "/-"); 
                }
                break;

            case "Industrial":
                System.out.print("Enter Power Factor (good/bad): ");
                String pf = sc.nextLine();
                if(unit > 500 && pf.equals("good")) {
                    System.out.println("Cost: " + (int)(0.9 * (unit * 20)) + "/-");
                }
                else {
                    System.out.println("Cost: " + (unit * 20) + "/-");
                }
                break;

            default:
                System.out.println("Invalid Connection Type!");
        }

        sc.close();
    }
}