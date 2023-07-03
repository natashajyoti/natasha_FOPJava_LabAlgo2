package concun.gl.com;


import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Notes in your country");
		int numberOfNotes = sc.nextInt();

		int currency[] = new int[numberOfNotes];

		System.out.println("Enter the " + numberOfNotes + " denomination values in any order");
		for (int i = 0; i < currency.length; i++) {
			currency[i] = sc.nextInt();
		}

		System.out.println("Before Sorting" + Arrays.toString(currency));

		SelectionSort ms=new SelectionSort();
		ms.mySort(currency);

		System.out.println("After Sorting" + Arrays.toString(currency));

		System.out.println("Please enter amount to exchange");
		int amount = sc.nextInt();

		NoteCount nc = new NoteCount();
		nc.counting(currency, amount);
	}
}
