package primeAverage;

import java.util.ArrayList;

public class PrimeAverageRefactored {
	private ArrayList<Integer> inputArray1;
	private ArrayList<Integer> inputArray2;

	PrimeAverageRefactored(ArrayList<Integer> myArray1, ArrayList<Integer> myArray2) {
		inputArray1 = myArray1;
		inputArray2 = myArray2;
	}

	public boolean returnPrimeAV() {
		double aux;
		double avg1 = 0, avg2 = 0;

		avg1 = calcAvgArray(this.inputArray1);

		avg2 = calcAvgArray(this.inputArray2);

		aux = avg1 + avg2;

		return isPrime(aux);
	}

	private boolean isPrime(double aux) {

		boolean prime = true;

		if (aux <= 0) {
			return false;
		}

		int p = 2;
		while (p <= Math.ceil(Math.sqrt(aux)) && prime == true) {
			if (aux % p == 0) {
				prime = false;
			}
			p++;
		}
		return prime;
	}

	private double calcAvgArray(ArrayList<Integer> inputArray) {
		double total = 0;
		for (Integer anInputArray1 : inputArray) {
			total += anInputArray1;
		}

		total = total / inputArray1.size();
		total = Math.round(total);
		return total;
	}
}