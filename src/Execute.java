import java.util.Scanner;

public class Execute {
    public static void main(String[] args){
        System.out.println("Enter the Algorithm to Execute: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("AlphabetRepresent = 1");
        System.out.println("Array Pyramid = 2");
        System.out.println("Binary Substring = 3");
        System.out.println("Case Exchange = 4");
        System.out.println("Consecutive Zeros = 5");
        System.out.println("Exception Handle = 6");
        System.out.println("Factorial = 7");
        System.out.println("Duplicate = 8");
        System.out.println("Product Service = 9");
        System.out.println("QuickSort = 10");
        System.out.println("Read Paragraph = 11");
        System.out.println("Substring = 12");
        System.out.println("MergeSort = 13");

        System.out.println("Enter your Selection: ");
        int choice = sc.nextInt();

        switch (choice){
            case 1: Scanner reader = new Scanner(System.in);
                    System.out.println("Enter a Number: ");
                    int n = reader.nextInt();
                    AlphabetRepresent.AlphabetRepresent(n);
                    break;

            case 2: Array_pyramid.ArrayPyramid();
                    break;

            case 3: String data = "1111000011010101011100011101";
                    binarySubstring.binarySubstring(data);
                    break;

            case 4: String str = "HowAreYou?";
                    CaseExchange.CaseExchange(str);
                    break;

            case 5: data = "1111000011010101011100011101";
                    ConsecutiveZeros.ConsecutiveZeros(data);
                    break;

            case 6: ExceptionHandle.ExceptionHandle();
                    break;

            case 7: System.out.println("Enter number: ");
                    reader = new Scanner(System.in);
                    n = reader.nextInt();
                    Factorial.Factorial(n);
                    break;

            case 8: String message = "goodevening";
                    Duplicate.Duplicate(message);
                    break;

            case 9: ProductService.ProductService();
                    break;

            case 10: int[] array = {2, 4, 1, 8, 3, 9, 5, 0, 7};
                    QuickSort.Sort_Quick(array);
                    break;

            case 11: String para = "William Shakespeare was an English poet, playwright, and actor, widely regarded as the greatest writer in the English language and the world's pre-eminent dramatist.\nHe is often called England's national poet, and the Bard of Avon.His extant works, including collaborations, consist of approximately 38 plays, 154 sonnets, two long narrative poems, and a few other verses, some of uncertain authorship.\nHis plays have been translated into every major living language and are performed more often than those of any other playwright.";
                    ReadPara.ReadPara(para);

            case 12: str = "Hello World";
                    Substring.SubString(str);

            case 13: int[] arr = {2, 4, 1, 8, 3, 9, 5, 0, 7};
                    MergeSort.Sort_Merge(arr);
                    break;

        }
    }
}
