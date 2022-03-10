package primeAverage;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class PrimeAvargeTestOriginal {

	private ArrayList<Integer> inputArray1;
	private ArrayList<Integer> inputArray2;
	private boolean expected;
	private PrimeAverage arraysTest;

	@Parameters
	public static Collection<Object[]> testParam() {
		return Arrays.asList(new Object[][] {
				{ true, new ArrayList<Integer>(Arrays.asList(5, 5, 5)),
						new ArrayList<Integer>(Arrays.asList(6, 6, 6)) },

				{ false, new ArrayList<Integer>(Arrays.asList(8, 4, 2)),
						new ArrayList<Integer>(Arrays.asList(4, 10, 16)) } });
	}

	public PrimeAvargeTestOriginal(boolean expected, ArrayList<Integer> array1, ArrayList<Integer> array2) {
		this.expected = expected;
		this.inputArray1 = array1;
		this.inputArray2 = array2;
	}

	@Before
	public void crearClase() {
		arraysTest = new PrimeAverage(inputArray1, inputArray2);
	}

	@Test
	public void test() {
		boolean calculated = arraysTest.returnPrimeAV();
		assertEquals(expected, calculated);
	}

}
