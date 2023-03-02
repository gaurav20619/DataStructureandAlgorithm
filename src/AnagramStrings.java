import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {
    public static boolean isAnagram(String first, String second) {
		
		char[] firstArray = first.toCharArray();
		char[] secondArray = second.toCharArray();
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		return Arrays.equals(firstArray, secondArray);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the First String : ");
		String first = scan.next();
		System.out.print("Enter the Second String : ");
		String second = scan.next();
        scan.close();
		
		if(isAnagram(first, second)) 
			System.out.println("Two Strings are Anagrams");
		else
			System.out.println("Two Strings are Not Anagrams");
	}
}
