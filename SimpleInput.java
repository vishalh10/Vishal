import java.util.Scanner;

class SimpleInput{
	public static void main(String args[])
	{
		Scanner Scan= new Scanner(System.in);
		System.out.println("Enter the String to Print");
		String Input=Scan.nextLine();
		System.out.println("Your Enetred text is = "+Input);
	}
}