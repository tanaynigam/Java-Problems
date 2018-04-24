import java.util.*;

public class AlphabetRepresent{
	public static void AlphabetRepresent(int n) {

		char ch[] = new char[100];
		int len=0;

		while(n != 0){
			ch[len] = (char) (n % 26 + 64);
			len++;
			n = n / 26;
		}

		for(int i=len-1; i>=0; i--)
			System.out.print(ch[i]);
	}
}