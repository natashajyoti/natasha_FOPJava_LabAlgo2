package transaction.gl.com;

import java.util.Arrays;
import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of days transactional days");
		int nod = sc.nextInt();

		int earnings[] = new int[nod];
		System.out.println("Enter the earnings for " + nod + "days");
		for (int i = 0; i < earnings.length; i++) {
			earnings[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(earnings));
		System.out.println("Enter Number of targets");
		int targets = sc.nextInt();
		Targets tc = new Targets();
		tc.targetCheck(earnings, targets);

	}

}