# DSA  
A beginner's guide to getting started with Data Structures and Algorithms with JAVA.

### Table of contents
* [Installation](#1-installation)
* [Hello World](#2-hello-world)
* [Procedure Oriented Programming](#3-procedure-oriented-programming)
* [Object Oriented Programming](#4-object-oriented-programming)
* [Features of JAVA](#5-features-of-java)
* [Byte Code](#6-byte-code)
* [JDK](#7-jdk)
* [JRE](#8-jre)
* [JVM](#9-jvm)
* [Garbage Collector](#10-garbage-collector)
* [Data Types](#11-data-types)
* [Variables](#12-variables)
* [Packages](#13-packages)
* [Formatted Output](#14-formatted-output)
* [String Manipulation](#15-string-manipulation)
* [Data Structures](#16-data-structures)
* [Arrays](#17-arrays)
* [LinkedList](#18-linkedlist)
* [Stacks](#19-stacks)
* [Queue](#20-queue)
* [Binary Tree](#21-binary-tree)
* [Binary Search Tree](#22-binary-search-tree)
* [Heap](#23-heap)
* [Hashing](#24-hashing)
* [Graphs](#25-graphs)
* [Matrix](#26-matrix)
* [Advanced DS](#27-advanced-ds)
* [Collections in Java](#28-collections-in-java)
* [Algorithm Analysis](#29-algorithm-analysis)


<br>

### 1. Installation
```bash
$ sudo apt update
$ sudo apt install openjdk-8-jdk
$ java -version
```

### 2. Hello World
```
import java.util.*;
import java.lang.*;
import java.io.*;

class HelloWorld
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    System.out.println("Hello World");
	}
}
```

### 3. Procedure Oriented Programming
Procedure Oriented Programming is a programming paradigm (top-down approach), where a program is written as a sequence of procedures or functions therby divinding a large program into smaller programs with specific functionality.
In POP, the major emphasis is on procedure (function) and not on the data and most functions share data defined at global level.
POP languages are high-level languages such as BASIC, C, COBOL are machine-independent and we can develop program logic without having a knowledge about computer's architecture.


#### Characteristics of POP:
* Emphasis is on functions
* Functions share global data
* Uses Top-Down approach

### 4. Object Oriented Programming
An OOP is a design philosophy or programming paradigm, that models software design around data or objects rather than functions and logic. 
An object is referred to as a data field that has unique attributes and behavior and it also provides reusablity feature to develop productive logic, which means more emphasis is given on data.

#### Characteristics of OOP:
* More emphasis on data rather than functions
* Divides the program into no of objects

#### Basic elements of OOP:

* Class : It is a group of similar types of Objects which possess same attributes and behaviour. (Object factory / User-Desined datatype)
* Object :It is a unique entity that contains data and functions (characteristics and behaviour) toghether in an OOP.
* Data Abstraction : Act of representing essential features without including the background details
* Encapsulation : The wrapping of data and functions, toghether in a single unit.
* Data Hiding : The data which cannot be accessed directly outside class premise.
* Dynamic Binding : The process of linking function call to function signature
* Inheritance : Property by which object of one class acquire some common properties of another class
* Polymorphism : The process of using a function for more than one purpose.


### 5. Features of JAVA
* OOP language
* Both compiled and Intepreted
* Platform independent
* Multi-threaded
* Case-sensitive
* Robust and Secure


### 6. Byte-Code
Byte Code is an intermediate code in form of .class file which is generated as soon as a Java program is compiled and is then acted upon by JVM making it platform independent.
JAVA is a HLL. The program written in java is compiled to an intermediate code called Byte Code. This code is independent
of the machine on which the program is to run. When the code is to be run on any machine, an Intepretor known as JVM 
converts the Byte Code to MLL.

The conversion of HLL to MLL can be done in two ways
* Interpretor : Conversion in performed line by line, execution stops when an error is encountered
* Compiler : Conversion is performed all at once, all errors are listed toghether


### 7. JDK
The Java Development Kit (JDK) is a software development environment used for developing Java applications and applets. It includes the Java Runtime Environment (JRE), an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc) and other tools needed in Java development.

### 8. JRE
JRE stands for “Java Runtime Environment” and may also be written as “Java RTE.” The Java Runtime Environment provides the minimum requirements for executing a Java application; it consists of the Java Virtual Machine (JVM), core classes, and supporting files.

### 9. JVM
JVM(Java Virtual Machine) acts as a run-time engine to run Java applications. JVM is the one that actually calls the main method present in a java code. JVM is a part of JRE(Java Runtime Environment).

When we compile a .java file, .class files(contains byte-code) with the same class names present in .java file are generated by the Java compiler. This .class file goes into various steps when we run it. These steps together describe the whole JVM.

1) Class Loader Subsystem
	* Loading : The Class loader reads the .class file, generate the corresponding binary data and save it in method area.
	* Linking : Performs verification, preparation, and (optionally) resolution.
	* Initialization : In this phase, all static variables are assigned with their values defined in the code 

2) JVM Memory
	* Method area
	* Heap area
	* Stack area
	* PC registers
	* Native method stack

3) Execution Engine
	* Interpreter
	* Just-In-Time Compiler(JIT)
	* Garbage Collector
	
4) Java Native Interface (JNI)
5) Native Method Libraries

### 10. Garbage Collector
Garbage Collector destroys un-referenced objects. Main objective of Garbage Collector is to free heap memory by destroying unreachable objects.
An object is said to be eligible for GC(garbage collection) iff it is unreachable.

Just before destroying an object, Garbage Collector calls finalize() method on the object to perform cleanup activities. Once finalize() method completes, Garbage Collector destroys that object. finalize() method is present in Object class with following prototype.
```
protected void finalize() throws Throwable
```
The finalize() method called by Garbage Collector not JVM.
The finalize() method is never invoked more than once for any given object.

An object is said to be eligible for GC(garbage collection) iff it is unreachable. 
#### Ways: 
* Nullifying the reference variable
* Re-assigning the reference variable
```
Integer i = new Integer(4);
i = null;
```

### 11. Data Types
* Primitive 


| Data type | Size  | Value Range 	    | Precision |
|:---------:|:-----:|:----------------------|:---------:|
|boolean    | 1bit  | 0 or 1   		    |   	|	
|byte       | 1byte | -128 to 127	    |		|	
|char       | 2byte | 0 to 65,535	    |		|
|short      | 2byte | -32,768 to 32,767	    |		|
|int        | 4byte | -2^31 to 2^31-1	    |		|
|long       | 8byte | -2^63 to 2^63-1	    |		|
|float      | 4byte | -3.4E+38 to 3.4E+38   | 6 digits	|
|double     | 8byte | -1.7E+308 to 1.7E+308 | 15 digits |

* Derived
  * Class
  * Array
  * Interface etc
  
  
### 12. Variables
A Variable is a named memory location that holds a value.
There are three types of variables in Java:
* Local Variables : 
	* A variable defined within a block or method or constructor is called local variable. 
	* These variable are created when the block in entered or the function is called and destroyed after exiting from the block or when the call returns from the function.
	* Initilisation of Local Variable is Mandatory.
	* The scope of these variables exists only within the block in which the variable is declared. i.e. we can access these variable only within that block.

* Instance Variables: 
	* Instance variables are non-static variables and are declared in a class outside any method, constructor or block.
	* As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
	* Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier then the default access specifier will be used.
	* Initilisation of Instance Variable is not Mandatory. Its default value is 0
	* Instance Variable can be accessed only by creating objects.
	
* Static Variables: 
	* Static variables are also known as Class variables. These variables are declared similarly as instance variables, the difference is that static variables are declared using the static keyword within a class outside any method constructor or block.
	* Unlike instance variables, we can only have one copy of a static variable per class irrespective of how many objects we create.
	* Static variables are created at the start of program execution and destroyed automatically when execution ends.
	* Initilisation of Static Variable is not Mandatory. Its default value is 0
	
	
### 13. Packages
A mechamism of encapsulating a group of classes, interfaces or sub-packages
#### Types of Packages
* Built-in
	* java.lang
	* java.io
	* java.util
	* java.applet
	* java.awt
	* java.net
	
* User-Defined
```
package myPackage;
public class Hello{
	public void getNames(String s)
	{        
        	System.out.println(s);        
	}
}


import myPackage.Hello;
public class PrintName 
{
   public static void main(String args[]) 
   {       
       
      String name = "Welcome to JAVA";
      Hello obj = new Hello();
      
      obj.getNames(name);
   }
}
```

### 19. Formatted Output
#### Formatting output using System.out.printf()
```
class Format
{ 
  public static void main(String args[]) 
  { 
    int x = 100; 
    System.out.printf("%d\n", x); 		//100
  
    // this will print it upto 2 decimal places 
    System.out.printf("%.2f\n", Math.PI); 	//3.14
  
    float n = 5.2f; 
  
    // automatically appends zero to the rightmost part of decimal 
    System.out.printf("%.4f\n", n); 		//5.2000
  } 
} 
```

#### Formatting using DecimalFormat class
```
import java.text.DecimalFormat; 
  
class Format
{ 
  public static void main(String args[]) 
  { 
    double num = 123.4567; 
  
    // prints only numeric part of a floating number 
    DecimalFormat ft = new DecimalFormat("####"); 
    System.out.println(ft.format(num)); 		//123
  
    // this will print it upto 2 decimal places 
    ft = new DecimalFormat("#.##"); 
    System.out.println(ft.format(num)); 		//123.45
  
    // automatically appends zero to the rightmost part of decimal 
    // instead of #,we use digit 0 
    ft = new DecimalFormat("#.000000"); 
    System.out.println(ft.format(num)); 		//123.456700
  
    // automatically appends zero to the leftmost of decimal number 
    // instead of #,we use digit 0 
    ft = new DecimalFormat("00000.00"); 
    System.out.println(ft.format(num)); 		//00123.45
  
    // formatting money in dollars 
    double income = 23456.789; 
    ft = new DecimalFormat("$###,###.##"); 
    System.out.println(ft.format(income)); 		//$23,456.79
  } 
} 
```
	

### 15. String Manipulation

#### Built-in Character methods

* Character.isLetter()
* Character.isDigit()
* Character.isLetterorDigit()
* Character.isWhiteSpace()
* Character.isUpperCase()
* Character.toUpperCase()
* Character.isLowerCase()
* Character.toLowerCase()
* Character.getNumericValue()

#### Built-in String methods

* toLowerCase()
* toUpperCase()
* replace()
* trim()
* equals()
* equalsIgnoreCase()
* compareTo()
* length()
* charAt()
* substring()
* indexOf()
* lastIndexOf()
* concat()
* endsWith()
* startWith()

#### Built-in StringBuilder methods
```
StringBuilder st1 = new StringBuilder("Hello");
StringBuilder st2 = new StringBuilder();
```
* append() : st1.append(" World")
* insert() : st1.insert(1,"JAVA")
* replace() : st1.replace(3,7,"c++")
* delete() : st1.delete(3,7)
* reverse() : st1.reverse()
* setCharAt() : st1.setCharAt(4,'b')
* capacity()
* charAt()
* indexOf()
* lastIndexOf()
* substring()
* setLength()




#### String to Primitive type
```
int n = Integer.parseInt(str);
```

### Primitive to String type
```
String str = Integer.toString(n);
```

### 17. Data Structures
A data structure is a storage that is used to store and organize data. It is a way of arranging data so that it can be accessed and updated efficiently.


### 16. Arrays

#### An array is a collection of similar items stored at contiguous memory locations

* Arrays allow random access of elements.
* Arrays have better cache locality
* In Java all arrays are dynamically allocated.
* The direct superclass of an array type is Object. 
* Every array type implements the interfaces Cloneable and java.io.Serializable.

#### Declaration
* int[] intArray = new int[20];
* int[][] intArray = new int[10][20]; 
* int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 

#### Passing arrays to Methods
```
class Test 
{   
    public static void main(String args[])  
    { 
        int arr[] = {3, 1, 2, 5, 4}; 
        sum(arr); 
    } 
    public static void sum(int[] arr)  
    { 
        int sum = 0;     
        for (int i = 0; i < arr.length; i++) 
            sum+=arr[i]; 
        System.out.println("sum of array values : " + sum); 
    } 
} 
```

#### Returning Arrays from Methods

```
class Test 
{     
    public static void main(String args[])  
    { 
        int arr[] = m1();     
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i]+" "); 
    } 
    public static int[] m1()  
    { 
        return new int[]{1,2,3}; 
    } 
} 
```

#### Cloning of arrays
When you clone a single dimensional array, such as Object[], a “deep copy” is performed with the new array containing copies of the original array’s elements as opposed to references.
```
class Test 
{     
    public static void main(String args[])  
    { 
        int intArray[] = {1,2,3};     
        int cloneArray[] = intArray.clone();
        System.out.println(intArray == cloneArray); 	//false
        for (int i = 0; i < cloneArray.length; i++) { 
            System.out.print(cloneArray[i]+" "); 	//1 2 3
        } 
    } 
} 
```

A clone of a multidimensional array (like Object[][]) is a “shallow copy” however, which is to say that it creates only a single new array with each element array a reference to an original element array but subarrays are shared.
```
class Test 
{     
    public static void main(String args[])  
    { 
        int intArray[][] = {{1,2,3},{4,5}}; 
        int cloneArray[][] = intArray.clone();
	
        System.out.println(intArray == cloneArray);		//false
        System.out.println(intArray[0] == cloneArray[0]); 	//true
        System.out.println(intArray[1] == cloneArray[1]); 	//true
          
    } 
} 
```

### 17. LinkedList

### 18. Stacks

### 19. Queue

### 20. Binary Tree
A tree whose elements have at most 2 children is called a binary tree. Since each element in a binary tree can have only 2 children, we typically name them the left and right child.
A Binary Tree node contains following parts:
* Data
* Pointer to left child
* Pointer to right child


Unlike Arrays, Linked Lists, Stack and queues, which are linear data structures, trees are hierarchical data structures.

```
class Node 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 
```

### 21. Binary Search Tree

### 22. Heap

### 23. Hashing

### 24. Graphs
* Non-linear data structure. 
* A graph G is a set of ordered pair of Vertices V and a set of ordered pair of Edges E , G = (V,E)

Following two are the most commonly used representations of a graph.
1. Adjacency Matrix
2. Adjacency List

### 25. Matrix

### 26. Advanced DS

### 27. Collections in Java
Collections in Java is a framework that provides an architecture to store and manipulate the group of objects.

				Iterable
				    ^
				    |
				    |
				Collection
				    |
		--------------------------------------------
		|		    |			    |
		|		    |			    |	
	       List		  Queue	                   Set
	        |		    |			    |	
	- ArrayList	- Queue (Priority Queue)	- SortedSet (TreeSet)		
	- LinkedList	- Deque (Array Dequeue)		- Set (HashSet, LinkedHashSet)
	- Vector (Stack)
	

* #### Methods
```
.add
.addAll
.remove
.removeAll
.size
.contains
.toArray
.isEmpty
```

* #### Iterator interface
Iterator interface provides the facility of iterating the elements in a forward direction only.
```
.hasNext()
.next()
.remove()
```

```
Iterator<String> itr=coll.iterator();  
while(itr.hasNext()){  
	System.out.println(itr.next());  
}  
```

### I. List
### A. ArrayList
* dynamic arrays in Java
* allows random access
* no primitive types - only wrappers
* non-synchronized
* maintains insertion order
```
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  

list.add("Ravi");
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  

//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  

for (int i = 0; i < list.size(); i++)
    System.out.print(list.get(i) + " ");
}
```

### B. LinkedList
* impl of LinkedList DS
```
LinkedList<String> al=new LinkedList<String>();  

al.add("Ravi");  
al.add("Vijay");  
al.add("Ravi");  
al.add("Ajay");  

Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}
```


### C. Vector
* similar to ArrayList
* synchronized
```
Vector<String> v=new Vector<String>();  

v.add("Ayush");  
v.add("Amit");  
v.add("Ashish");  
v.add("Garima");  

Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}
```

### D. Stack
* impl LIFO DS
* push, peek, pop

```
Stack<String> stack = new Stack<String>();  

stack.push("Ayush");  
stack.push("Garvit");  
stack.push("Amit");  
stack.push("Ashish");  
stack.push("Garima");  

stack.pop();  

Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}
```



### 28. Algorithm Analysis
An algorithm is a finite sequence of logically related instructions to solve a computational problem.
#### Types of Algorithm
* Iterative (Top-down)
```
Fact(n)
{
	for i = 1 to n
	fact = fact * i;
	return fact;
}
```

* Recursive (Bottom-up)
```
Fact(n)
{
	if n = 1
		return 1;
	else
		return n * fact(n-1);
}

Asymptotic Analysis : mesauring order of growth of an algorithm in terms of input size

C < loglog(n) < log(n) < n^1/3 < n^1/2 < n < n^2 < n^3 < 2^n < n^n

Best Case − Minimum time required for program execution.
Average Case − Average time required for program execution.
Worst Case − Maximum time required for program execution.

```
#### Asymptotic Analysis
* Big-oh notation
```
The function f(n) = O(g(n)) if and only if there exist positive constants c, n0 such that
f(n) ≤ cg(n), ∀n ≥ n0 .
```
Big-oh can be used to denote all upper bounds on the time complexity of an algorithm. Big-oh also captures the worst case analysis of an algorithm.


* Omega notation
```
The function f (n) = Ω(g(n)) if and only if there exist positive constants c, n0 such that f(n) ≥
c.g(n), ∀n ≥ n0.
```
Omega can be used to denote all lower bounds of an algorithm. Omega notation also denotes the best case analysis of an algorithm.

* Theta notation
```
The function f (n) = Θ(g(n)) if and only if there exist positive constants c1 , c2 , n0 such that
c1 g(n) ≤ f (n) ≤ c2 g(n), ∀n ≥ n0 .
```
Theta can be used to denote tight bounds of an algorithm.


#### Alternative Big-oh notations:
* O(1)		: O(yeah)
* O(logn)	: O(nice)
* O(n logn)	: O(k-ish)
* O(n)		: O(ok)
* O(n^2)	: O(my)
* O(2^n)	: O(no)
* O(n^n) 	: O(damn)
* O(n!)		: O(mg!)


#### Calucalting Time-Complexity for Recurrence relations
* Step Count Method
* Substitution Method
* Master Theorem
* Recurrence Tree

```
Master Theorem :
Let a≥1 and b>1 be constants, let f(n) be a non negative function,
and let T(n) be defined on the non-negative integers by the recurrence

T(n) = aT(n/b) + f(n)

Then T(n) has the following asymptotic bounds:

Case 1: If f(n) = O(n log b a−e ) for some constant e>0 Then T(n) = θ(n log b a )
Case 2: If f(n) = θ(n log b a ) then T(n) = θ(n log b a * log n)
Case 3: If f(n) = Ω(n log b a+e ) for some constant e>0, and if af (n/b) ≤ cf (n) for
some constant c<1 and all sufficiently large n, then T(n) = θ(f(n)).
```

#### Analysis of Loops

* O(1) : set of non-recursive and non-loop statements
* O(n)
```
for (int i = 1; i <= n; i += c) {  
	// some O(1) expressions
}
for (int i = n; i > 0; i -= c) {
	// some O(1) expressions
}
 ```
 *  O(n^c)
 ```
for (int i = 1; i <=n; i += c) {
	for (int j = 1; j <=n; j += c) {
		// some O(1) expressions	
	}
}
for (int i = n; i > 0; i -= c) {
	for (int j = i+1; j <=n; j += c) {
		// some O(1) expressions
}
```
* O(Logn)
```
for (int i = 1; i <=n; i *= c) {
	// some O(1) expressions
}
for (int i = n; i > 0; i /= c) {
	// some O(1) expressions
}
```
* O(LogLogn)
```
for (int i = 2; i <=n; i = pow(i, c)) { 
	// some O(1) expressions
}
for (int i = n; i > 1; i = fun(i)) { 
	// some O(1) expressions
}
```

