package java11.innerclass;

public class Test {

	public static void main(String[] args) {
		
		Object obj = new Object() {
			@Override
			public String toString() {
				return "abc";
			}
		};
		
		System.out.println(obj.toString());
		
	}
	
	

}
