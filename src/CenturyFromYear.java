
public class CenturyFromYear {
	static int centuryFromYear(int year) {
		int centuryCount = 0;
		while (year > 0) {
			year = year - 100;
			centuryCount = centuryCount + 1;
		}
		return centuryCount;
	}

	public static void main(String[] args) {

		System.out.print(centuryFromYear(2000));

	}

}
