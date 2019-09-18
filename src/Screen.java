import java.util.Scanner;

public class Screen {
	private int Pin;

	public Screen(int pin) {
		Pin = pin;
	}

	public Screen() {
	}

	public int getPin() {
		return Pin;
	}

	public void setPin(int pin) {
		Pin = pin;
	}

	public void chooseLanguage(int pin) {
		boolean v = true;
		while (v == true) {
			if (Pin != pin) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Wrong Pin code");
				pin = scan.nextInt();
				scan.close();
			} else if (Pin == pin) {
				System.out.println("You may proceed.");
				v = false;
			}
		}
	}
}
