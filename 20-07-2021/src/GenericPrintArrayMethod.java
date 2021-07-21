import java.util.*;
public class GenericPrintArrayMethod {
	public static <E> void printArray(E[] elements) {
		for(E element:elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] intArray = {1, 5, 4, 8, 9};
		Double[] doubleArray = {100.00, 20.01, 300.38};
		Character[] charArray = {'c', 'd', 'f'};
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);

	}

}
