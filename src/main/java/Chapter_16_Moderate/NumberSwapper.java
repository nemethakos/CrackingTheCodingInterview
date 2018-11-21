package Chapter_16_Moderate;

/**
 * <b>Number Swapper:</b> Write a function to swap a number in place (that is,
 * without temporary variables).
 */
public class NumberSwapper {
	
	public static void swap(int[] array, int index1, int index2) {
		array[index1] = array[index1] ^ array[index2]; // number1 = number1 XOR number2
		array[index2] = array[index1] ^ array[index2]; // number2 = (number1 XOR number2) XOR number2 -> number1
		array[index1] = array[index1] ^ array[index2]; // number1 = (number1 XOR number2) XOR number1 -> number2
	}

}
