# Array-program
# 1) What is Java?
Java is the high-level, object-oriented, robust, secure programming language, platform-independent, high performance, Multithreaded, and portable programming language. It was developed by James Gosling in June 1991. It can also be known as the platform as it provides its own JRE and API.
# 2) What are the differences between C++ and Java?
     C++                                Java

C++ is platform-dependent.              Java is platform-independent.
C++ supports multiple inheritance.      Java doesn't support multiple inheritance.
C++ supports structures and unions.     Java doesn't support structures and unions.
C++ supports both call by value and 
call by reference.                       Java supports call by value only. There is no call by reference in java.
# 3) List the features of Java Programming language.
1) Simple: Java is easy to learn. The syntax of Java is based on C++ which makes easier to write the program in it.

2)Object-Oriented: Java follows the object-oriented paradigm which allows us to maintain our code as the combination of different type of objects that incorporates both data and behavior.

3)Portable: Java supports read-once-write-anywhere approach. We can execute the Java program on every machine. Java program (.java) is converted to bytecode (.class) which can be easily run on every machine.

4)Platform Independent: Java is a platform independent programming language. It is different from other programming languages like C and C++ which needs a platform to be executed. Java comes with its platform on which its code is executed. Java doesn't depend upon the operating system to be executed.

5)Secured: Java is secured because it doesn't use explicit pointers. Java also provides the concept of ByteCode and Exception handling which makes it more secured.

6)Robust: Java is a strong programming language as it uses strong memory management. The concepts like Automatic garbage collection, Exception handling, etc. make it more robust.
# 4) What do you understand by Java virtual machine?
Java Virtual Machine is a virtual machine that enables the computer to run the Java program. JVM acts like a run-time engine which calls the main method present in the Java code.Java interpete the Byte code into machine language.Byte code is independent of any machine or computer.
# 5)What gives Java its 'write once and run anywhere' nature?
The bytecode. Java compiler converts the Java programs into the class file (Byte Code) which is the intermediate language between source code and machine code. This bytecode is not platform specific and can be executed on any computer.
# 6)Is Empty .java file name a valid source file name?
Yes, Java allows to save our java file by .java only, we need to compile it by javac .java and run by java classname Let's take a simple example:

//save by .java only  
class A{  
public static void main(String args[]){  
System.out.println("Hello java");  
}  
}  
//compile by javac .java  
//run by     java A  
# 7)If I don't provide any arguments on the command line, then what will the value stored in the String array passed into the main() method, empty or NULL?
It is empty, but not null.
# 8)What if I write static public void instead of public static void?
The program compiles and runs correctly because the order of specifiers doesn't matter in Java.
# 9)What is the default value of the local variables?
The local variables are not initialized to any default value, neither primitives nor object references.
# 10)What are the various access specifiers in Java?
In Java, access specifiers are the keywords which are used to define the access scope of the method, class, or a variable. In Java, there are four access specifiers given below.

Public -The classes, methods, or variables which are defined as public, can be accessed by any class or method.
Protected -Protected can be accessed by the class of the same package, or by the sub-class of this class, or within the same class.
Default- Default are accessible within the package only. By default, all the classes, methods, and variables are of default scope.
Private -The private class, methods, or variables defined as private can be accessed within the class only.
# Accesbility
public -protescted-default-private
# 11)What is the purpose of static methods and variables?
The methods or variables defined as static are shared among all the objects of the class. The static is the part of the class and not of the object. The static variables are stored in the class area, and we do not need to create the object to access such variables. Therefore, static is used in the case, where we need to define variables or methods which are common to all the objects of the class.
For example, In the class simulating the collection of the students in a college, the name of the college is the common attribute to all the students. Therefore, the college name will be defined as static.
# 12)What are the advantages of Packages in Java?
There are various advantages of defining packages in Java.

1)Packages avoid the name clashes.
2)The Package provides easier access control.
3)We can also have the hidden classes that are not visible outside and used by the package.
4)It is easier to locate the related classes.
# What is an object?
The Object is the real-time entity having some state and behavior. In Java, Object is an instance of the class having the instance variables as the state of the object and the methods as the behavior of the object. The object of a class can be created by using the new keyword.
# What is the difference between an object-oriented programming language and object-based programming language?
There are the following basic differences between the object-oriented language and object-based language.

Object-oriented languages follow all the concepts of OOPs whereas, the object-based language doesn't follow all the concepts of OOPs like inheritance and polymorphism.
Object-oriented languages do not have the inbuilt objects whereas Object-based languages have the inbuilt objects, for example, JavaScript has window object.
Examples of object-oriented programming are Java, C#, Smalltalk, etc. whereas the examples of object-based languages are JavaScript, VBScript, etc.
# What will be the initial value of an object reference which is defined as an instance variable?
All object references are initialized to null in Java.
# What is the constructor?
The constructor can be defined as the special type of method that is used to initialize the state of an object. It is invoked when the class is instantiated, and the memory is allocated for the object. Every time, an object is created using the new keyword, the default constructor of the class is called. The name of the constructor must be similar to the class name. The constructor must not have an explicit return type.
# Is constructor inherited?
No, The constructor is not inherited.
# Can you make a constructor final?
No, the constructor can't be final.
# What are the differences between the constructors and methods?
Java Constructor	                                                    Java Method
A constructor is used to initialize the state of an object.  	A method is used to expose the behavior of an object.
A constructor must not have a return type.	                     A method must have a return type.
The constructor is invoked implicitly.	                        The method is invoked explicitly.
The Java compiler provides a default constructor if you don't have any constructor in a class.	The method is not provided by the compiler in any case.
The constructor name must be same as the class name.	          The method name may or may not be same as class name.
# What is the difference between static (class) method and instance method?
       static or class method	                                                 instance method
1)A method that is declared as static is known as the static method.	A method that is not declared as static is known as the instance method.
2)We don't need to create the objects to call the static methods.	The object is required to call the instance methods.
3)Non-static (instance) members cannot be accessed in the static context (static method, static block, and static nested class) directly.	Static and non-static variables both can be accessed in instance methods.
4)For example: public static int cube(int n){ return n*n*n;}	For example: public void msg(){...}.
# Can we override the static methods?
No, we can't override static methods.
 # What is the static block?
Static block is used to initialize the static data member. It is executed before the main method, at the time of classloading.

class A2{  
  static{System.out.println("static block is invoked");}  
  public static void main(String args[]){  
   System.out.println("Hello main");  
  }  
} 
# Can we execute a program without main() method?
Ans) Yes, one of the ways to execute the program without the main method is using static block. More Details.
# Can we make constructors static?(No)
# Can we make the abstract methods static in Java?
In Java, if we make the abstract methods static, It will become the part of the class, and we can directly call it which is unnecessary. Calling an undefined method is completely useless therefore it is not allowed.
# Can we declare the static variables and methods in an abstract class?
Yes, we can declare static variables and methods in an abstract method. As we know that there is no requirement to make the object to access the static context, therefore, we can access the static context declared inside the abstract class by using the name of the abstract class. Consider the following example.

abstract class Test  
{  
    static int i = 102;  
    static void TestMethod()  
    {  
        System.out.println("hi !! I am good !!");  
    }  
}  
public class TestClass extends Test   
{  
    public static void main (String args[])  
    {  
        Test.TestMethod();  
        System.out.println("i = "+Test.i);  
    }  
} 
# Can we assign the reference to this variable?
No, this cannot be assigned to any value because it always points to the current class object and this is the final reference in Java. However, if we try to do so, the compiler error will be shown. Consider the following example.

public class Test  
{  
    public Test()  
    {  
        this = null;   
        System.out.println("Test class constructor called");  
    }  
    public static void main (String args[])  
    {  
        Test t = new Test();  
    }  
}  
Output

Test.java:5: error: cannot assign a value to final variable this
        this = null; 
  # What is this keyword in java?
The this keyword is a reference variable that refers to the current object. There are the various uses of this keyword in Java. It can be used to refer to current class properties such as instance methods, variable, constructors, etc. It can also be passed as an argument into the methods or constructors. It can also be returned from the method as the current class instance.
# Can this keyword be used to refer static members?
Yes, It is possible to use this keyword to refer static members because this is just a reference variable which refers to the current class object. However, as we know that, it is unnecessary to access static variables through objects, therefore, it is not the best practice to use this to refer static members. Consider the following example.

public class Test   
{  
    static int i = 10;   
    public Test ()  
    {  
        System.out.println(this.i);      
    }  
    public static void main (String args[])  
    {  
        Test t = new Test();  
    }  
}  
Output

10


        ^
































