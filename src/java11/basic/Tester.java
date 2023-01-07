package java11.basic;

public class Tester {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		sb.append("HOWDY");
		
		System.out.println(sb.length());
		
		sb.insert(0, " ");
		
		System.out.println(sb);
		
		sb.replace(3, 5, "LL");
		
		System.out.println(sb);
		
		sb.insert(6, "COW");
		System.out.println(sb);
		
		System.out.println(sb.charAt(7));
		
		System.out.println(sb.delete(2, 7));
		System.out.println(sb.length());
		
	}
}
