package java11.inheritance;

//Animal is our base class
class Animal1 {
 public void printAnimal() {
     System.out.println("I am an animal");
 }
}

//Dog is a subclass of Animal
class Dog1 extends Animal1 {
 public void printDog() {
     System.out.println("I am a dog");
 }
}

//Cat is also a subclass of Animal
class Cat extends Animal1 {
 public void printCat() {
     System.out.println("I am a cat");
 }
}

public class DowncastExamples {
 public static void main(String[] args) {
     DowncastExamples dex = new DowncastExamples();

     // We create instances of Dog and Cat but assign them to
     // variables of type Animal
     Animal1 genericDog = new Dog1();
     Animal1 genericCat = new Cat();

     // We cast now:
     dex.testDog((Dog1) genericDog);
     dex.testCat((Cat) genericCat);

     // Try the overloaded methods with
     // specifically typed variables.
     dex.testAnimal((Dog1) genericDog);
     dex.testAnimal((Cat) genericCat);

     // Try the overloaded methods with
     // generically typed variables.
     dex.testAnimal(genericDog);
     dex.testAnimal(genericCat);
 }

 //Three Overloaded methods
 public void testAnimal(Animal1 animal) {
     System.out.println("Executing testAnimal with Animal type");
     animal.printAnimal();
 }

 public void testAnimal(Cat cat) {
     System.out.println("Executing testAnimal with Cat type");
     cat.printAnimal();
 }

 public void testAnimal(Dog1 dog) {
     System.out.println("Executing testAnimal with Dog type");
     dog.printAnimal();
 }

 // Specifically Typed method calls
 public void testDog(Dog1 dog) {
     dog.printDog();
 }

 public void testCat(Cat cat) {
     cat.printCat();
 }
}