public class Array_pyramid{
	public static void ArrayPyramid() {
		int range = 4;
		int arr[][];
		int sum = 0;

		for(int i=0; i<4; i++){
			for(int j=0; j<=i; j++){
				sum += 10;
				System.out.print(sum+" ");
			}
			System.out.print("\n");
		}
	}
}