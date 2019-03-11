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













