import java.util.Scanner;

public class Runner extends FirstPerson {
	public static void main(String[] args) {

		System.out.println("WELCOME HOME BANK ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account holder name");
		String name = sc.next();

		System.out.println("Enter the account number");
		long accountn = sc.nextLong();
		System.out.println("Enter the amount for your friend tranf");
		int amount = sc.nextInt();
		System.out.println("Amount Credite your account is");
		int total = sc.nextInt();
		FirstPerson f1 = new FirstPerson();
		if (name != null) {
			String name1 = name;
			f1.setAccoundholdername(name1);
		} else {
			System.out.println("sorry name is null");
		}
		if (accountn != 0) {
			long acc = accountn;
			f1.setAccountnumber(acc);
		} else {
			System.out.println("Sorry account number is null ");
		}

		if (total != 0) {
			int total1 = total;
			f1.setAmount(total1);
		} else {
			System.out.println("sorry  total is 0");
		}
		BankTransfer b1 = new BankTransfer(amount);
		Thread t1 = new Thread(b1);
		t1.start();

	}

}
