import java.util.*;

public class ExceptionHandle{
	public static void ExceptionHandle() {
		int a[] = new int[2];
		a[1] = 1;
		a[2] = 0;

		int b;
		int c;

		try{
			System.out.println(a[3]);
		
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error: Out of Range " + e);

			try{
				c = a[1] / a[2];
			}catch(ArithmeticException z){
				System.out.println("Error: Cannot Divide by Zero "+ z);
			}
			
		}
	}
}