
public class AdjacentElementsProduct {
	static int adjacentElementsProduct(int[] inputArray) {
		int[] arr = inputArray;
		int x = 0;
		int y = 0;
		int p = -9999;
		for (int i = 0; i < arr.length - 1; i++) {
			x = arr[i];
			y = arr[i + 1];
			if (x * y > p) {
				p = x * y;
			}
		}
		return p;
	}

	public static void main(String[] args) {
		int inputArray[] = { 3, 6, -2, -5, 7, 3 };

		System.out.print(adjacentElementsProduct(inputArray));
	}
}
