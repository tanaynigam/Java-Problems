import java.util.*;

public class Substring{
	public static void SubString(String str) {

		System.out.println(substr(str, 2, 5));
	}

	public static String substr(String str, int start, int end){
		char ch[] = str.toCharArray();
		int i, j;
		char temp[] = new char[str.length()];
		for(i = start, j = 0; i<end; i++, j++)
			temp[j] = ch[i];

		String new_str = new String(temp);

		return new_str;
	}
}