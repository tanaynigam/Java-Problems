import java.util.*;

public class Factorial{
	public static void Factorial(int n) {
		System.out.println("Factorial is: " + fact(n));
	}

	public static int fact(int n){
		if(n == 0)
			return 1;
		else
			return (n * fact(n-1));
	}
}