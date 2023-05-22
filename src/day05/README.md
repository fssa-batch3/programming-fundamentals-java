### Day 5: Objects

Objects are an encapsulation of variables and functions into a single entity. Objects get their variables and functions from classes. Classes are essentially a blueprint to create objects.

When you create an object, you are creating an ***instance*** of a class, therefore ***instantiating*** a class. The new operator is used to create an object.

Here is a simple class with two fields, and a method:

```java
public class Student {
    String name;  // Field 1
    int age;  // Field 2

    void sayHello() {  // Method
        System.out.println("Hello, my name is " + name + ", and I am " + age + " years old.");
    }
}
``` 

Now we can create an object of the `Student` class in our `main` method:

```java
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();  // Creating a new Student object
        student1.name = "John";
        student1.age = 20;
        student1.sayHello();  // Outputs: Hello, my name is John, and I am 20 years old.
    }
}
``` 

In this example, `student1` is an object of the `Student` class. The `new` keyword is used to create new objects in Java.

When creating an object, Java first allocates memory for the new object and then calls the constructor method. The constructor method is a special method that's called when an object is instantiated, and it's used to initialize the object's attributes