public class FibonnaciSeries {

    public static void main(String[] args) {


		System.out.println("Fibonacci series program = " );
		int a=0,b=1,c=0;
		System.out.println(a);
		System.out.println(b);
		c=a+b;
		System.out.println(c);
		while(c<89){
			a=b;
			b=c;
			c=a+b;
      		System.out.println(c);
		}
    }
}