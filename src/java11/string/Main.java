package java11.string;

public class Main {
	
	
	
	{
		System.out.println("Hi");
		this.testVariable = 1;
	}
	
	static {
		System.out.println("static");
	}
	
	Main(){
		this.testVariable = 5;
		System.out.println("hhhh");
	}
	
	static int testVariable;
	 
    public static void main(String[] args) {
		/*
		 * byte i, j; for (i = 100, j = 0; i <= 300; i += 90, j++) { // Line 1
		 * testVariable = i % 50; // Line 2 System.out.print(testVariable + " "); //
		 * Line 3 } System.out.println(j);
		 * 
		 * int[] a,b = new int[10]; a = new int[1];
		 */
        System.out.println("11");
        Main m = new Main();
        
        System.out.println(testVariable);
    }

}
