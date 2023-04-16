import java.util.*;

public class PalindromDemo {

    public static void main(String[] args) {


		System.out.println("Checking given String is Palindrom or Not" );
		Scanner scann = new Scanner(System.in);
		String input=scann.nextLine();
		int strlngth=input.lenghth();
		
		for(int i=(strlngth-1);i>=0;i--){
			String rev+=CharAt(i);
		}
		if(toUpperCase(input).equalIgnoreCase(toUpperCase(rev))){
		System.out.println("Given String is Palindrome ");}
		
		else
		System.out.println("Given String is NOT Palindrome ");}
	}
}