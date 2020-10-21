
public class CheckPalindrome {
	static boolean checkPalindrome(String inputString) {
		String a;
		String b = "";
		a = inputString;
		int n = a.length();
		for (int i = n - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}

		if (a.equalsIgnoreCase(b))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		System.out.print(checkPalindrome("aabbaa"));

	}

}
