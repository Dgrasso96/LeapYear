import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int val = 0;

		System.out.println("Inserisci l'anno:");
		val = in.nextInt();

		if (Bisestile.LeapYear(val)) {
			System.out.println(val + " è un anno bisestile");
		} else {
			System.out.println(val + " non è un anno bisestile");
		}
		
		in.close();
	}
}

public class Bisestile {
	public static boolean LeapYear(int year) {

		if (year > 1 && year < 9999) {
			if (((year % 4) == 0 && (year % 100) != 0) || ((year % 400) == 0)) {
				return true;
			}
		}
		return false;
	}
}
