import java.util.ArrayList;
import java.util.List;
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
            case 14: int x1 = 1, x2 = 2, x3 = 3;
                    int[] sol = MinimizeAbsoluteDifferenceDiv2.findtriple(x1, x2, x3);
                    System.out.println("{"+sol[0] + " " + sol [1] + " "+sol[2]+"}");
                    break;

            case 15: n = 4;
                    int[] value = {2,3,2,3};
                    String suit = "hcch";
                    String valid = DeckOfCards.IsValid(n,value,suit);
                    System.out.println(valid);
                    break;

            case 16: String s = "azzzabbb";
                    System.out.println(RingLex.getmin(s));
                    break;

            case 17: String[] board = {"BWBBB", "WWBBW", "BBBBW", "WBWBB"};
                    System.out.println(BrokenChessboard.minimumFixes(board));
                    break;

            case 18: int[] S = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
                    int T = 1;
                    System.out.println(HalvingEasy.count(S, T));
                    break;

            case 19: String s19 = "BOB";
                    System.out.println(MakeTwoConsecutive.solve(s19));
                    break;

            case 20: String[] board20 = {"##" , ".#", "#."};
                    String[] result = GravityPuzzleEasy.solve(board20);
                    for(int i=0; i<result.length; i++)
                        System.out.println(result[i]);
                    break;

            case 21: String[] publications = {"ERDOS A", "A B", "B AA C"};
                System.out.println(ErdosNumber.calculateNumbers(publications)[0]);
                break;

            case 22: int M = 5;
                    int[] t = {3, 2, 5, 4, 2, 8};
                    System.out.println(LongMansionDiv2.minimalTime(M, t));
                    break;

            case 23: int[] w1 = {1,100,-3, 2};
                    int[] w2 = {-2, 1, 4};
                    System.out.println(BiconnectedDiv2.minimize(w1,w2));
                    break;

            case 24:
                System.out.println(HandsShaking.countPerfect(12));
                break;

            case 25:
                System.out.println(MagicDiamonds.minimalTransfer(1000000000));
                break;

            case 26: System.out.println(DivFreed2.count(2, 3));
                    break;

            case 27:
                System.out.println(Fibonacci.CountFibonacci(6));
                break;

            case 28:
                System.out.println(EmoticonsDiv2.printSmiles(1000));
                break;

            case 29:
                ArrayList<String> res = StringCombination.FindPerm("abcd");
                for(int i=0; i<res.size(); i++)
                    System.out.println(res.get(i));
                break;

            case 30: int[] A = {171, 801, 153, 171, 759, 110, 153, 171, 927, 316, 165, 11, 88, 171, 61, 44, 88, 801, 228, 11, 927, 228, 171, 801, 11, 801, 801, 758, 758, 88, 61, 228, 153, 110, 316};
                    int[] B =  {165, 11, 801, 88, 110, 153, 165, 165, 165, 228, 88, 88, 153, 61, 927, 316, 228, 171, 110, 759, 316, 316, 171, 801, 11, 153, 61, 61, 577, 228, 153, 801, 577, 228, 801};
                    int[] F = {759, 228, 165, 228, 758, 44, 758, 759, 758, 171, 759, 758, 927, 758, 44, 88, 171, 88, 759, 758, 11, 44, 61, 577};
                System.out.println(Arrfix.mindiff(A, B, F));
                break;

            case 31: int[] arr31 = {5, 9, 1, -7, 24, 98};
                System.out.println(SmallestPositiveInteger.SmallestPosInt(arr31));
                break;

            case 32: String str32 = "aababccc";
                System.out.println(StringDuplicates.StrDup(str32));
                break;

            case 33:
                List<Integer> i = GrayCode.grayCode(5);
                break;

            case 34:
                List<Integer> i33 = GrayCode2.grayCode2(5);
                break;

            case 35:
                int[] nums = {3, 2, 4};
                int target = 6;
                sol = TwoSum.twoSum(nums, target);
                System.out.print(sol[0] + " " + sol[1]);
        }
    }
}
