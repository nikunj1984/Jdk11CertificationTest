package java11.exceptions;

public class Test {
    public static void main(String[] args) {
        int i;
        try {
            i = 0;
            System.out.println("i =" + 10 / i++);
        } catch (RuntimeException e) {
 
        } finally {
        	i = 0; //commenting this will throe compilation error
            System.out.println("i = " + i);
        }
    }
}