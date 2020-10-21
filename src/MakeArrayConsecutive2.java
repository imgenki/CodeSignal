
public class MakeArrayConsecutive2 {
	static int makeArrayConsecutive2(int[] statues) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < statues.length; i++) {
			max = Math.max(max, statues[i]);
			min = Math.min(min, statues[i]);
		}
		return (max - min) + 1 - statues.length;
	}

	public static void main(String[] args) {
		int[] statues = { 6, 2, 3, 8 };

		System.out.print(makeArrayConsecutive2(statues));

	}

}
