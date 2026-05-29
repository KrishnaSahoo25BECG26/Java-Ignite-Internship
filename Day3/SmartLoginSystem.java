import java.util.Scanner;
public class SmartLoginSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Username: ");
		String uname = sc.nextLine();
		switch(uname) {
			case "admin":
				System.out.print("Enter Password: ");
				String pwd = sc.nextLine();
				switch(pwd) {
					case "Java@123":
						System.out.print("Enter OTP: ");
						int otp = sc.nextInt();
						if(otp >= 1000 && otp <= 9999) {
							System.out.println("Login Successful!");
						}
						else {
							System.out.println("Invalid OTP.");
						}
						break;
					case "Java@12":
					case "Java@1":
					case "Java@":
					case "Java123":
					case "Java@1233":
						System.out.println("Almost correct password.");
						break;
					default:
						System.out.println("Wrong Password.");
				}
				break;
			default:
				System.out.println("Invalid Username.");
		}
		sc.close();
	}
}