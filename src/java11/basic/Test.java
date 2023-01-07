package java11.basic;

class Plant {}
class Flower extends Plant {}
public class Test {
 
    public static void main(String[] args ) {
 
    // Primitive Casting
    float f1 = (float) 10.0;  // Line 1
    float f2 = (float) 10.0f;  // Line 2
    float f3 = (float) (f1/2.0);  // Line 3 //if bracket is removed compilation error will come
    float f4 = (float) f1/2.0f;  // Line 4
 
    // Object Casting
    Object o = new Plant();
    Plant plantA = new Flower();
    Plant plantB = (Plant) o;  // Line 5
    Plant plantC = (Flower) o;  // Line 6
    Flower flower = (Flower) o;  // Line 7
   }
}