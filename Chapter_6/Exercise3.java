package Chapter_6;

public class Exercise3 {

	public static void isTriangle(int a, int b, int c) {
		if (a + b < c && a + c < b && b + c < a){
			System.out.println("false");
		}
		else{
			System.out.println("true");
		}

	}

}
