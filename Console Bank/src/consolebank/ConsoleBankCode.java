package consolebank;

import java.util.Scanner;

public class ConsoleBankCode {

	public static void main(String[] args) {
		System.out.println("Welcome to Console Bank");
		System.out.println("Made with ChelDev");
		Scanner id = new Scanner(System.in);
		System.out.print("ID: ");
		int id0 = id.nextInt();
		System.out.println("User ID: " + id0);
		Scanner login = new Scanner(System.in);
		System.out.print("Login: ");
		String  login0 = login.nextLine();
		System.out.println("Login: " + login0);
		System.out.println("Account found!   " + "ID: " + id0 + " Login: "+ login0);
		Scanner balance  = new Scanner(System.in);
		System.out.print("Balance: ");
		int balance0 =  balance.nextInt();
		System.out.println("Balance: " + balance0 + "RUB");
		System.out.println("!!WARNING!! !!This App is FAKE!!");
		

	}

}
