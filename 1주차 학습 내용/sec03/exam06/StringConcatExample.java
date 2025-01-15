package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("srt3: " + str3);
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4: " + str4);

	}

}
