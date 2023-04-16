import java.util.*;

public class IntegerReverse {

    public static void main(String[] args) {

		int num=12345, rev=0;
		System.out.println("Reversing Interger" );
		while(num!=0)
			{
				int digit=num%10;
				rev=rev*10+digit;
				num=num/10;
			}
		System.out.println("Reverse no is = "+rev);
	}
}