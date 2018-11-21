package Chapter_16_Moderate;

import java.util.Arrays;
import java.util.Objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSwapperTest {

	@Test
	void testSwap() {
		int[] array = { 1, 2 };

		System.out.println("original:\t" + Arrays.toString(array));

		NumberSwapper.swap(array, 0, 1);

		System.out.println("swapped:\t" + Arrays.toString(array));

		assertTrue(Objects.deepEquals(new int[] { 2, 1 }, array));
	}

}
