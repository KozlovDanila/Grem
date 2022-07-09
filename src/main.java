public class main {

	public static void main(String[] args) {
		int a = 15;
		String sum = sout(a);
		System.out.println(sum);
	}

	static String sout(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("Привет");
		}
		return "ТОЛЯ";
	}


}
