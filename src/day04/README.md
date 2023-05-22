### Day 4: Class and Methods

## Class

In Java, a class is a blueprint for creating objects (a particular data structure), providing initial values for state (member variables or attributes), and implementations of behavior (member functions or methods).

Here's a basic class in Java representing a `Student`:


```java
public class Student {
    // Attributes (also known as instance variables)
    String name;
    int age;
}
``` 

In the above example, `Student` is a class with two attributes: `name` and `age`. These attributes define the state of an object of the `Student` class.

Let's also look at a class with a `main` method:

```java
public class Main {
    // Class attribute
    String message = "Hello, Java!";

    // main method
    public static void main(String[] args) {
        // Create an object of the Main class
        Main obj = new Main();
        
        // Access the attribute and print the message
        System.out.println(obj.message);
    }
}
```

In the above example, `Main` is a class with a `main` method and a `message` attribute. The `main` method creates an object of the `Main` class and prints the `message` attribute.


## Methods


Methods in Java are blocks of code that are called by name, and only run when it has been called. They are used to perform an action and they can receive data, process it and return a result. They can also be used to perform certain actions repeatedly.

Here's an example of a method in Java:

```java
public class Main {
    public static void main(String[] args) {
        greet();  // Call the greet method
    }

    // Define the greet method
    public static void greet() {
        System.out.println("Hello, World!");
    }
}
``` 

In the above example, `greet` is a method that prints "Hello, World!". This method is called from within the `main` method.

Another example, this time with a method that takes an argument:


```java
public class Main {
    public static void main(String[] args) {
        int result = multiplyByTwo(5);
        System.out.println("The result is: " + result);
    }

    public static int multiplyByTwo(int num) {
        return num * 2;
    }
}
``` 

In the above example, `multiplyByTwo` is a method that takes an integer as an argument, multiplies it by two, and returns the result. The `main` method calls this method and prints the result.

Methods are a crucial aspect of object-oriented programming in Java. They allow you to reuse code and divide your program into smaller, more manageable pieces.