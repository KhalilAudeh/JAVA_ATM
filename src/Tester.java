import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Screen screen = new Screen();
		boolean e = true;
		while (e == true) {
			Scanner scan = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			
			KeyPad.Key();
			System.out.println();
			System.out.println("Please choose an option:");
			System.out.println("1- Screen");
			System.out.println("2- CardReader");
			System.out.println("3- CashDispenser");
			System.out.println("4- DepositSlot");
			System.out.println("5- BankServices");
			System.out.println("6- Person");
			System.out.println("7- Date");
			System.out.println("8- Account");
			System.out.println("9- ATM");
			System.out.println("10- Exit");
			int t = scan2.nextInt();
			if (t == 1) {
				System.out.println("Please create a pin code");
				screen.setPin(scan.nextInt());
				screen.chooseLanguage(scan.nextInt());
			}
			if (t == 2) {
				CardReader c = new CardReader(scan.next(), scan.nextInt());
				c.checkingSecurity(scan.next(), scan.nextInt());
			}
			if (t == 3) {
				CashDispenser r = new CashDispenser(scan.nextInt());
				r.withradaw(scan.nextInt());
			}
			if (t == 4) {
				DepositSlot d = new DepositSlot(scan.nextInt());
				d.depositMoney(scan.nextInt());
			}
			if (t == 5) {
				BankServices w = new BankServices();
				w.OurServices();

			}
			if (t == 6) {
				Person person = new Person(scan.next(), scan.next());
				person.toString();
			}
			if (t == 7) {
				Date date = new Date(scan.nextInt(), scan.next(), scan.nextInt());
				date.toString();
			}
			if (t == 8) {
				Date date1 = new Date(scan.nextInt(), scan.next(), scan.nextInt());
				Person person1 = new Person(scan.next(), scan.next());
				Account account = new Account(scan.nextInt(), date1, person1, scan.nextDouble());
				account.toString();
			}
			if (t == 10) {
				System.out.println("Thank you for using our services.");
				e = false;
			}
			if (t == 9) {
				screen.setPin(scan.nextInt());
				CardReader c = new CardReader(scan.next(), scan.nextInt());
				CashDispenser r = new CashDispenser(scan.nextInt());
				DepositSlot d = new DepositSlot(scan.nextInt());
				BankServices w = new BankServices();
				ATM A = new ATM(screen, c, r, d, w);
				A.deposit2(scan.nextInt());
				A.withradaw2(scan.nextInt());
			}
		}
	}
}
