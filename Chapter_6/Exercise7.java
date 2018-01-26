package Chapter_6;

public class Exercise7 {

	public static void main(String[] args) {
		checkEven(51);
	}
	public static void checkEven(int x) {
		if(x % 2 == 0) {
			System.out.println("You must use an odd variable!");
		}else {
			oddSum(x);
		}
}
	public static void oddSum(int n) {
		if(n == 1) {
			System.out.println(n);
		}else {
			oddSum(n - 2);
			System.out.println(n);
		}
}

	

}
