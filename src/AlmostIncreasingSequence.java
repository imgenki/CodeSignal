
public class AlmostIncreasingSequence {

	static boolean almostIncreasingSequence(int[] sequence) {

		int eliminado = 0;

		for (int i = 0; i < sequence.length - 2 && eliminado <= 2; i++) {
			int a = sequence[i];
			int b = sequence[i + 1];
			int c = sequence[i + 2];

			if (a >= b) {
				eliminado++;
				sequence[i] = b - 1;
			}

			if (b >= c) {
				eliminado++;

				if (a == c) {
					sequence[i + 2] = b + 1;
				} else {
					sequence[i + 1] = a;
				}
			}
		}

		return eliminado <= 1;
	}

	public static void main(String[] args) {
		int[] sequence = { 1, 3, 2, 1 };

		System.out.print(almostIncreasingSequence(sequence));

	}

}
