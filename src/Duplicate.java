import java.util.*;

public class Duplicate{
	public static void Duplicate(String message) {

		HashSet<String> h_set = new HashSet<String>();

		System.out.print("Duplicate Characters: ");

		for(int i=0; i<message.length(); i++){
			if(h_set.contains(message.substring(i,i+1)))
				System.out.print(message.substring(i,i+1));
			else
				h_set.add(message.substring(i,i+1));
		}


	}
}