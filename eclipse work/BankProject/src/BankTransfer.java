import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class BankTransfer implements Runnable {

	FirstPerson f1 = new FirstPerson();
	int avaliable = f1.getAmount();
	int wanted;

	public BankTransfer(int i) {
		this.wanted = i;

	}

	@Override
	public void run() {
		SecondPerson s1 = new SecondPerson();
		System.out.println(avaliable + " YOUR ACCOUNT TOTAL AMOUND ");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		if (avaliable >= wanted) {
			if (f1.getAccountnumber() == s1.accountnumbersecond && f1.getAccoundholdername().equals(s1.name)) {
				System.out.println("YOUR AMOUNT TRANSFER To TOUR FRIEND ACCOUNT DETAILS");
				System.out.println("ACCOUNT NUMBER:" + "   " + f1.getAccountnumber().toString());
				System.out.println("ACCOUNT HOLDER NAME:" + "  " + f1.getAccoundholdername().toString());
				System.out.println("TRANSFER AMOUNT:" + "  " + wanted);
				System.out.println("PLZ WAIT SOME SECONDS");
				try {
					Thread.sleep(7000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("YOUR AMOUND WAS TRANSFER CHECK DETAILS");

				try {
					Thread.sleep(3500);

					int avaliable2324 = avaliable - wanted;
					System.out.println(avaliable2324 + " Your Account TOTAL AMOUNT");
					f1.setAmount(avaliable2324);
					int total = s1.money + wanted;
					s1.money = total;
					System.out.println(total + " Your FRIEND TOTAL AMOUNT");
					int rand_int1 = ThreadLocalRandom.current().nextInt();
					System.out.println("YOUR BANK REFERNCE NUMBER IS:" + " " + rand_int1);
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
					LocalDateTime now = LocalDateTime.now();
					System.out.println("DATE OF TRANFER AMOUNT IS:" + " " + now);
					System.out.println("Thanking you");

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Sorry your account details worning");
			}
		} else {
			System.out.println("Amount not sufficient");
		}

	}

}
