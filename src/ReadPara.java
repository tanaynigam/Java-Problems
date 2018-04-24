import java.util.*;

public class ReadPara{
	public static void ReadPara(String para) {

		System.out.print(para + "\n\n");
		String[] lines = para.split("\n");
		String[] words = para.split(" |\\.");
		char ch[] = para.toCharArray();

		System.out.println("Number of lines: " + lines.length);
		System.out.println("Number of words: " + words.length);
		System.out.println("Number of characters: " + ch.length);

	}
}