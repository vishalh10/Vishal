public class SwappingTwo {

    public static void main(String[] args) {

		int First=20;
		int Second=10;
			
        System.out.println("--Before swap--");
        System.out.println("First number = " + First);
        System.out.println("Second number = " + Second);
						
			First=First-Second;
			Second=First+Second;
			First=Second-First;
			
		System.out.println("--After swap--");
        System.out.println("First number = " + First);
        System.out.println("Second number = " + Second);
    }
}