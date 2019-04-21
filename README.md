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
# Can we overload the constructors?
Yes, the constructors can be overloaded by changing the number of arguments accepted by the constructor or by changing the data type of the parameters. Consider the following example.

class Test   
{  
    int i;   
    public Test(int k)  
    {  
        i=k;  
    }  
    public Test(int k, int m)  
    {  
        System.out.println("Hi I am assigning the value max(k, m) to i");  
        if(k>m)  
        {  
            i=k;   
        }  
        else   
        {  
            i=m;  
        }  
    }  
}  
public class Main   
{  
    public static void main (String args[])   
    {  
        Test test1 = new Test(10);  
        Test test2 = new Test(12, 15);  
        System.out.println(test1.i);  
        System.out.println(test2.i);  
    }  
}  
      
In the above program, The constructor Test is overloaded with another constructor. In the first call to the constructor, The constructor with one argument is called, and i will be initialized with the value 10. However, In the second call to the constructor, The constructor with the 2 arguments is called, and i will be initialized with the value 15.


# Can you make a constructor final?
No, the constructor can't be final.
# What is the purpose of a default constructor?
The purpose of the default constructor is to assign the default value to the objects. The java compiler creates a default constructor implicitly if there is no constructor in the class.

class Student3{  
int id;  
String name;  
  
void display(){System.out.println(id+" "+name);}  
  
public static void main(String args[]){  
Student3 s1=new Student3();  
Student3 s2=new Student3();  
s1.display();  
s2.display();  
}  
}  
Test it Now
Output:

0 null
0 null
# can be override the constructor(N0)
# What is the output of the following Java program?
class Test   
{  
    int i;   
}  
public class Main   
{  
    public static void main (String args[])   
    {  
        Test test = new Test();   
        System.out.println(test.i);  
    }  
}  
The output of the program is 0 because the variable i is initialized to 0 internally. As we know that a default constructor is invoked implicitly if there is no constructor in the class, the variable i is initialized to 0 since there is no constructor in the class.
# What is the output of the following Java program?
class Test   
{  
    int test_a, test_b;  
    Test(int a, int b)   
    {  
    test_a = a;   
    test_b = b;   
    }  
    public static void main (String args[])   
    {  
        Test test = new Test();   
        System.out.println(test.test_a+" "+test.test_b);  
    }  
} 
There is a compiler error in the program because there is a call to the default constructor in the main method which is not present in the class. However, there is only one parameterized constructor in the class Test. Therefore, no default constructor is invoked by the constructor implicitly.

# How can constructor chaining be done using this keyword?
Constructor chaining enables us to call one constructor from another constructor of the class with respect to the current class object. We can use this keyword to perform constructor chaining within the same class. Consider the following example which illustrates how can we use this keyword to achieve constructor chaining.

public class Employee  
{  
    int id,age;   
    String name, address;  
    public Employee (int age)  
    {  
        this.age = age;  
    }  
    public Employee(int id, int age)  
    {  
        this(age);  
        this.id = id;  
    }  
    public Employee(int id, int age, String name, String address)  
    {  
        this(id, age);  
        this.name = name;   
        this.address = address;   
    }  
    public static void main (String args[])  
    {  
        Employee emp = new Employee(105, 22, "Vikas", "Delhi");  
        System.out.println("ID: "+emp.id+" Name:"+emp.name+" age:"+emp.age+" address: "+emp.address);  
    }  
      
}  
Output

ID: 105 Name:Vikas age:22 address: Delhi
# What's the order of call of constructors in inheritiance?
Ans: In case of inheritance, when a new object of a derived class is created, first the constructor of the super class is invoked and then the constructor of the derived class is invoked.
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
# What is the Inheritance?
Inheritance is a mechanism by which one object acquires all the properties and behavior of another object of another class. It is used for Code Reusability and Method Overriding. The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also. Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

There are five types of inheritance in Java.

Single-level inheritance
Multi-level inheritance
Multiple Inheritance
Hierarchical Inheritance
Hybrid Inheritance
# Multiple inheritance is not supported in Java through class.
To reduce the complexity and simplify the language, multiple inheritance is not supported in java. Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.

Since the compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. So whether you have the same method or different, there will be a compile time error.

class A{  
void msg(){System.out.println("Hello");}  
}  
class B{  
void msg(){System.out.println("Welcome");}  
}  
class C extends A,B{//suppose if it were  
   
 Public Static void main(String args[]){  
   C obj=new C();  
   obj.msg();//Now which msg() method would be invoked?  
}  
}  
Test it Now
 Compile Time Error
#  Which class is the superclass for all the classes?
The object class is the superclass of all other classes in Java.
# What is aggregation?
Aggregation can be defined as the relationship between two classes where the aggregate class contains a reference to the class it owns. Aggregation is best described as a has-a relationship. For example, The aggregate class Employee having various fields such as age, name, and salary also contains an object of Address class having various fields such as Address-Line 1, City, State, and pin-code. In other words, we can say that Employee (class) has an object of Address class. Consider the following example.

Address.java

public class Address {  
String city,state,country;  
  
public Address(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
  
}  
Employee.java

public class Emp {  
int id;  
String name;  
Address address;  
  
public Emp(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  
  
public static void main(String[] args) {  
Address address1=new Address("gzb","UP","india");  
Address address2=new Address("gno","UP","india");  
  
Emp e=new Emp(111,"varun",address1);  
Emp e2=new Emp(112,"arun",address2);  
      
e.display();  
e2.display();  
      
}  
}  
Output

111 varun
gzb UP india
112 arun
gno UP india 
# What is composition?
Holding the reference of a class within some other class is known as composition. When an object contains the other object, if the contained object cannot exist without the existence of container object, then it is called composition. In other words, we can say that composition is the particular case of aggregation which represents a stronger relationship between two objects. Example: A class contains students. A student cannot exist without a class. There exists composition between class and students.
# What is the difference between aggregation and composition?
Aggregation represents the weak relationship whereas composition represents the strong relationship. For example, the bike has an indicator (aggregation), but the bike has an engine (composition).
# Why does Java not support pointers?
The pointer is a variable that refers to the memory address. They are not used in Java because they are unsafe(unsecured) and complex to understand.
# What is super in java?
The super keyword in Java is a reference variable that is used to refer to the immediate parent class object. Whenever you create the instance of the subclass, an instance of the parent class is created implicitly which is referred by super reference variable. The super() is called in the class constructor implicitly by the compiler if there is no super or this.

class Animal{  
Animal(){System.out.println("animal is created");}  
}  
class Dog extends Animal{  
Dog(){  
System.out.println("dog is created");  
}  
}  
class TestSuper4{  
public static void main(String args[]){  
Dog d=new Dog();  
}  
}  
Test it Now
Output:

animal is created
dog is created
# How can constructor chaining be done by using the super keyword?
class Person  
{  
    String name,address;   
    int age;  
    public Person(int age, String name, String address)  
    {  
        this.age = age;  
        this.name = name;  
        this.address = address;  
    }  
}  
class Employee extends Person   
{  
    float salary;  
    public Employee(int age, String name, String address, float salary)  
    {  
        super(age,name,address);  
        this.salary = salary;  
    }  
}  
public class Test   
{  
    public static void main (String args[])  
    {  
        Employee e = new Employee(22, "Mukesh", "Delhi", 90000);  
        System.out.println("Name: "+e.name+" Salary: "+e.salary+" Age: "+e.age+" Address: "+e.address);  
    }  
}  
Output

Name: Mukesh Salary: 90000.0 Age: 22 Address: Delhi
# What are the main uses of the super keyword?
There are the following uses of super keyword.

super can be used to refer to the immediate parent class instance variable.
super can be used to invoke the immediate parent class method.
super() can be used to invoke immediate parent class constructor.
# What are the differences between this and super keyword?
There are the following differences between this and super keyword.

The super keyword always points to the parent class contexts whereas this keyword always points to the current class context.
The super keyword is primarily used for initializing the base class variables within the derived class constructor whereas this keyword primarily used to differentiate between local and instance variables when passed in the class constructor.
The super and this must be the first statement inside constructor otherwise the compiler will throw an error.
# What is the output of the following Java program?
class Person   
{  
    public Person()   
    {  
        System.out.println("Person class constructor called");  
    }  
}  
public class Employee extends Person   
{  
    public Employee()   
    {  
        System.out.println("Employee class constructor called");  
    }  
    public static void main (String args[])  
    {  
        Employee e = new Employee();  
    }  
}  
Output

Person class constructor called
Employee class constructor called
Explanation

The super() is implicitly invoked by the compiler if no super() or this() is included explicitly within the derived class constructor. Therefore, in this case, The Person class constructor is called first and then the Employee class constructor is called.
# Can you use this() and super() both in a constructor?
No, because this() and super() must be the first statement in the class constructor.

Example:

public class Test{  
    Test()  
     {  
         super();   
         this();  
         System.out.println("Test class object is created");  
     }  
     public static void main(String []args){  
     Test t = new Test();  
     }  
}  
Output:

Test.java:5: error: call to this must be first statement in constructor
# What is object cloning?
The object cloning is used to create the exact copy of an object. The clone() method of the Object class is used to clone an object. The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create. If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.
# What is method overriding:
If a subclass provides a specific implementation of a method that is already provided by its parent class, it is known as Method Overriding. It is used for runtime polymorphism and to implement the interface methods.
-Rules for Method overriding
The method must have the same name as in the parent class.
The method must have the same signature as in the parent class.
Two classes must have an IS-A relationship between them
# Can we override the static method?
No, you can't override the static method because they are the part of the class, not the object.
# Why can we not override static method?
It is because the static method is the part of the class, and it is bound with class whereas instance method is bound with the object, and static gets memory in class area, and instance gets memory in a heap.
# Can we override the overloaded method?
Yes.
# Difference between method Overloading and Overriding.
Method Overloading	                                             Method Overriding
1) Method overloading increases the readability of the program.	Method overriding provides the specific implementation of the method that is already provided by its superclass.
2) Method overloading occurs within the class.	       Method overriding occurs in two classes that have IS-A relationship between them.
3) In this case, the parameters must be different.	       In this case, the parameters must be the same.
4) return type may or may no be same                                Return type must be same
# Can we override the private methods?
No, we cannot override the private methods because the scope of private methods is limited to the class and we cannot access them outside of the class.
# Can we change the scope of the overridden method in the subclass?
Yes, we can change the scope of the overridden method in the subclass. However, we must notice that we cannot decrease the accessibility of the method. The following point must be taken care of while changing the accessibility of the method.

The private can be changed to protected, public, or default.
The protected can be changed to public or default.
The default can be changed to public.
The public will always remain public.
# What is the output of the following Java program?
class Base  
{  
    void method(int a)  
    {  
        System.out.println("Base class method called with integer a = "+a);  
    }  
       
    void method(double d)  
    {  
        System.out.println("Base class method called with double d ="+d);  
    }  
}  
   
class Derived extends Base  
{  
    @Override  
    void method(double d)  
    {  
        System.out.println("Derived class method called with double d ="+d);  
    }  
}  
   
public class Main  
{      
    public static void main(String[] args)  
    {  
        new Derived().method(10);  
    }  
}  
Output

Base class method called with integer a = 10
Explanation

The method() is overloaded in class Base whereas it is derived in class Derived with the double type as the parameter. In the method call, the integer is passed.
 # What is the output of the following Java program?
class Base   
{  
    public void baseMethod()  
    {  
        System.out.println("BaseMethod called ...");  
    }  
}  
class Derived extends Base   
{  
    public void baseMethod()  
    {  
        System.out.println("Derived method called ...");  
    }  
}  
public class Test   
{  
    public static void main (String args[])  
    {  
        Base b = new Derived();  
        b.baseMethod();  
    }  
}  
Output

Derived method called ...
Explanation

The method of Base class, i.e., baseMethod() is overridden in Derived class. In Test class, the reference variable b (of type Base class) refers to the instance of the Derived class. Here, Runtime polymorphism is achieved between class Base and Derived. At compile time, the presence of method baseMethod checked in Base class, If it presence then the program compiled otherwise the compiler error will be shown. In this case, baseMethod is present in Base class; therefore, it is compiled successfully. However, at runtime, It checks whether the baseMethod has been overridden by Derived class, if so then the Derived class method is called otherwise Base class method is called. In this case, the Derived class overrides the baseMethod; therefore, the Derived class method is called.
# Can you declare the main method as final?
Yes, We can declare the main method as public static final void main(String[] args){}.
# Can we declare a constructor as final?
The constructor can never be declared as final because it is never inherited. Constructors are not ordinary methods; therefore, there is no sense to declare constructors as final. However, if you try to do so, The compiler will throw an error.

# Can we declare an interface as final?
No, we cannot declare an interface as final because the interface must be implemented by some class to provide its definition. Therefore, there is no sense to make an interface final. However, if you try to do so, the compiler will show an error.
# What is the difference between the final method and abstract method?
The main difference between the final method and abstract method is that the abstract method cannot be final as we need to override them in the subclass to give its definition
# What is the difference between compile-time polymorphism and runtime polymorphism?
There are the following differences between compile-time polymorphism and runtime polymorphism.

SN	compile-time polymorphism	                                                 Runtime polymorphism
1)	In compile-time polymorphism, call to a method is resolved at compile-time.	In runtime polymorphism, call to an overridden method is resolved at runtime.
2)	It is also known as static binding, early binding, or overloading.	It is also known as dynamic binding, late binding, overriding, or dynamic method dispatch.
3)	Overloading is a way to achieve compile-time polymorphism in which, we can define multiple methods or constructors with different signatures.	Overriding is a way to achieve runtime polymorphism in which, we can redefine some particular method or variable in the derived class. By using overriding, we can give some specific implementation to the base class properties in the derived class.
4)	It provides fast execution because the type of an object is determined at compile-time.	It provides slower execution as compare to compile-time because the type of an object is determined at run-time.
5)	Compile-time polymorphism provides less flexibility because all the things are resolved at compile-time.	Run-time polymorphism provides more flexibility because all the things are resolved at runtime.
# What is Runtime Polymorphism?
In case of upcasting ,when we call or invoke a overriden method then implementation or defination executed from subclass.
class Bike{  
  void run(){System.out.println("running");}  
}  
class Splendor extends Bike{  
  void run(){System.out.println("running safely with 60km");}  
  public static void main(String args[]){  
    Bike b = new Splendor();//upcasting  
    b.run();  
  }  
}  
Test it Now
Output:
running safely with 60km.
# Can you achieve Runtime Polymorphism by data members?
No, because method overriding is used to achieve runtime polymorphism and data members cannot be overridden. We can override the member functions but not the data members. Consider the example given below.

class Bike{  
 int speedlimit=90;  
}  
class Honda3 extends Bike{  
 int speedlimit=150;  
 public static void main(String args[]){  
  Bike obj=new Honda3();  
  System.out.println(obj.speedlimit);//90  
   }  
Test it Now
Output:
90
# What is the difference between static binding and dynamic binding?
In case of the static binding, the type of the object is determined at compile-time whereas, in the dynamic binding, the type of the object is determined at runtime.

Static Binding
class Dog{  
 private void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Dog d1=new Dog();  
  d1.eat();  
 }  
}  
Dynamic Binding
class Animal{  
 void eat(){System.out.println("animal is eating...");}  
}  
  
class Dog extends Animal{  
 void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Animal a=new Dog();  
  a.eat();  
 }  
} 
# What is the output of the following Java program?
class BaseTest   
{  
  void print()  
  {  
    System.out.println("BaseTest:print() called");  
  }  
}  
public class Test extends BaseTest   
{  
  void print()   
  {  
    System.out.println("Test:print() called");  
  }  
  public static void main (String args[])  
  {  
    BaseTest b = new Test();  
    b.print();  
  }  
}  
Output

  Test:print() called
  # What is Java instanceOf operator?
The instanceof in Java is also known as type comparison operator because it compares the instance with type. It returns either true or false. If we apply the instanceof operator with any variable that has a null value, it returns false. Consider the following example.

class Simple1{  
 public static void main(String args[]){  
 Simple1 s=new Simple1();  
 System.out.println(s instanceof Simple1);//true  
 }  
}  
Test it Now
Output
true
# What are the two types of Exceptions in Java ? Which are the differences between them ?
Java has two types of exceptions: checked exceptions and unchecked exceptions. Unchecked exceptions do not need to be declared in a method or a constructor’s throws clause, if they can be thrown by the execution of the method or the constructor, and propagate outside the method or constructor boundary. On the other hand, checked exceptions must be declared in a method or a constructor’s throws clause. See here for tips on Java exception handling.

# What is the difference between Exception and Error in java ?
Exception and Error classes are both subclasses of the Throwable class. The Exception class is used for exceptional conditions that a user’s program should catch. The Error class defines exceptions that are not excepted to be caught by the user program.
# What is the difference between throw and throws ?
The throw keyword is used to explicitly raise a exception within the program. On the contrary, the throws clause is used to indicate those exceptions that are not handled by a method. Each method must explicitly specify which exceptions does not handle, so the callers of that method can guard against possible exceptions. Finally, multiple exceptions are separated by a comma.
# What is the importance of finally block in exception handling ?
A finally block will always be executed, whether or not an exception is actually thrown. Even in the case where the catch statement is missing and an exception is thrown, the finally block will still be executed. Last thing to mention is that the finally block is used to release resources like I/O buffers, database connections, etc.

# What will happen to the Exception object after exception handling ?
The Exception object will be garbage collected in the next garbage collection.
 # How does finally block differ from finalize() method ?
A finally block will be executed whether or not an exception is thrown and is used to release those resources held by the application. Finalize is a protected method of the Object class, which is called by the Java Virtual Machine (JVM) just before an object is garbage collected.
# What are pass by reference and pass by value ?
When an object is passed by value, this means that a copy of the object is passed. Thus, even if changes are made to that object, it doesn’t affect the original value. When an object is passed by reference, this means that the actual object is not passed, rather a reference of the object is passed. Thus, any changes made by the external method, are also reflected in all places.
# What happens if you remove static modifier from the main method?
Program compiles successfully . But at runtime throws an error “NoSuchMethodError”.
# What is “this” keyword in java?
Within an instance method or a constructor, this is a reference to the current object — the object whose method or constructor is being called. You can refer to any member of the current object from within an instance method or a constructor by using this.
Usage of this keyword

Used to refer current class instance variable.
To invoke current class constructor.
It can be passed as an argument in the method call.
It can be passed as argument in the constructor call.
Used to return the current class instance.
Used to invoke current class method (implicitly)
# What is the scope of variables in Java in following cases? 

Member Variables (Class Level Scope) : The member variables must be declared inside class (outside any function). They can be directly accessed anywhere in class
Local Variables (Method Level Scope) : Variables declared inside a method have method level scope and can’t be accessed outside the method.
Loop Variables (Block Scope) : A variable declared inside pair of brackets “{” and “}” in a method has scope withing the brackets only.
# Why the main method is static in java?
The method is static because otherwise there would be ambiguity: which constructor should be called? Especially if your class looks like this:



public class JavaClass
{
  protected JavaClass(int x)
  {   }
   public void main(String[] args) 
   {

    }
}
Should the JVM call new JavaClass(int)? What should it pass for x? If not, should the JVM instantiate JavaClass without running any constructor method? because that will special-case your entire class – sometimes you have an instance that hasn’t been initialized, and you have to check for it in every method that could be called. There are just too many edge cases and ambiguities for it to make sense for the JVM to have to instantiate a class before the entry point is called. That’s why main is static.
# A blank final variable in Java is a final variable that is not initialized during declaration. Below is a simple example of blank final.

    // A simple blank final example 
    final int i;
    i = 30;






































        ^
































