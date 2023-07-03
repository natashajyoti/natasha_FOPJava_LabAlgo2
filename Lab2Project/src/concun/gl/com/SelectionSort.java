package concun.gl.com;

public class SelectionSort {

	public void mySort(int[] currency) {
		int temp;

		for (int i = 0; i < currency.length; i++) {
			for (int j = i + 1; j < currency.length; j++) {
				if (currency[i] < currency[j]) {
					temp = currency[i];
					currency[i] = currency[j];
					currency[j] = temp;
				}
			}
		}

	}

}