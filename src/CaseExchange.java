import java.util.*;

public class CaseExchange{
	public static void CaseExchange(String str) {

		char ch[] = str.toCharArray();

		for (int i=0; i<str.length(); i++) {
			if((int) ch[i] >= 65 && (int) ch[i] <= 90)
				ch[i] = (char) (((int) ch[i]) + 32);
			else if((int) ch[i] >= 97 && (int) ch[i] <= 122)
				ch[i] = (char) (((int) ch[i]) - 32);
		}

		String str2 = new String(ch);

		System.out.print(str2);
	}
}