# Day 2: Structure of a Java Program

![Structure of Java Program](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5bc38932-8ff7-4c54-a04c-0da7ee3f3cf3/Untitled.png)

A typical Java program consists of the following components:

1. **Package declaration:** All Java classes can be part of a package. A package is a namespace that organizes a set of related classes and interfaces. It's generally the first non-comment line of the code.
    
    ```java
    // Package declaration
    package com.example;
    ```
    
2. **Class declaration:** The class declaration is the foundation of Java's object-oriented structure.
    
    ```java
    public class HelloWorld {  // Class declaration
    ```
    

1. **Main method:** This is the entry point for any Java program. The Java Virtual Machine (JVM) calls the main method when the program starts. The main method must always look like this:
    
    ```java
    public static void main(String[] args) {  // Main method
    ```
    
- `public`: It's a keyword in Java which represents visibility, meaning it is visible to all.
- `static`: A keyword in Java that means this method belongs to the class itself and not to any instance of the class.
- `void`: It's the return type of the method. Void defines the method which will not return any value.
- `main`: It's the name of the method which is searched by JVM as a starting point for an application with a particular signature only.
- `String[] args`: It's the parameter passed to the main method.

1. **Statements:** Inside the main method, you write statements or expressions which tell the computer to perform specific computations or actions.
    
    ```java
    System.out.println("Hello, World!");  // Statement
    ```
    

A complete Java program might look like this:

```java
// Package declaration
package hello_world;

public class HelloWorld   // Class declaration
{  // Opening bracket for class declaration

    public static void main(String[] args)   // Main method
		{  // Opening bracket for main method

        System.out.println("Hello, World!");  // Statement

    }  // Closing bracket for main method

}  // Closing bracket for class declaration
```

In the above example, the program is part of the `hello_world` package,  and includes a `HelloWorld` class with a `main` method that prints `"Hello, World!"` to the console.

This structure provides a basic template for a Java program. As you continue to learn Java, you'll add more components and create more complex structures within this basic framework.

## Try to Identify the mistakes in the below code examples

********************Example 1:********************

```java
public class HelloWorld {
    public static main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Example 2:**

```java
public HelloWorld {
    public static void Main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Example 3:**

```java
public class HelloWorld {
    public static void main(String[] args) 
        System.out.println("Hello, World!");
    }
}
```

**Example 4:**

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!")
    }
}
```