package java11.lambda;

public class Test {
    interface Changeable {
        void change(String s);
    }
 
    public static void main(String[] args) {
        Test t = new Test();
        Changeable c = (s) -> s = s + " World"; // Line 1
        String str = "Hello";
        t.changeIt(str, c);  // Line 2
        t.changeIt(str, (s) -> s = s + " Hello");  // Line 3
        System.out.println(str);
        
        String name = "Nikunj";
        System.out.println(name);
        
    }
 
    public void changeIt(String s, Changeable c) {
        c.change(s);
    }
    
    static String changeTest(String s) {
    	return s + " Sharda";
    	//return s1;
    }
}
