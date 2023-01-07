package java11.basic.method;

class ATest {
}
 
// Create a sub class
class BTest extends ATest {
    private String name;
 
    // Constructor has one parameter
    BTest(String name) {
        this.name = name;
    }
 
    public String getName() {
        return this.name;
    }
 
}
 
public class ConstructorExample {
    public static void main(String[] args) {
 
        // Instantiate the object with the one parameter constructor
        BTest btest = new BTest("Jeff");
        System.out.println(btest.getName());
    }
}