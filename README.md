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
* [String Manipulation](#14-string-manipulation)
* [Arrays](#15-arrays)
* [Binary Tree](#16-binary-tree)
* [Graphs](#17-graphs)
* [Algorithm Analysis](#18-algorithm-analysis)
* [Formatted Output](#19-formatted-ouput)
* [Iterators](#20-iterators)
* [Collections in JAVA](#21-collections-in-java)
* [List Interface](#22-list-interface)
* [Queue Interface](#23-queue-interface)
* [Set Interface](#24-set-interface)
* [Important Collections](#25-important-collections)

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

/* Name of the class has to be "Main" only if the class is public. */
class HelloWorld
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    System.out.println("Hello World");
	}
}
```

### 3. Procedure Oriented Programming
High-level languages provide an easy approach to users in developing their logic to solve any given problem.
These languages are machine-independent and we can develop program logic without having a knowledge about computer's architecture.
Conventional programming using High-level languages such as BASIC, C, COBOL are called Procedural Oriented Programming(POP).
It allows users to develop thier logic by applying a no of functions to increase program productivity.

#### Characteristics of POP:
* Emphasis is on functions
* Functions share global data
* Uses Top-Down approach

### 4. Object Oriented Programming
An OOP is a modular approach, which allows data to be applied within the stipulated program area. It also provides reusablity feature to 
develop productive logic, which means more emphasis is given on data.

#### Characteristics of OOP:
* More emphasis on data rather than functions
* Divides the program into no of objects

#### Basic elements of OOP:

* Class : It is a group of similar types of Objects which possess same attributes and behaviour. (Object factory / User-Desined datatype)
* Object :It is a uniques entity that contains data and functions (characteristics and behaviour) toghether in an OOP.
* Data Abstraction : Act of representing essential features without including the background details
* Encapsulation : The wrapping of data and functions, toghether in a single unit.
* Data Hiding : The data which cannot be accessed directly outside class premise, although they are in same class
* Dynamic Binding : The process of linking function call to function signature
* Inheritance : Property by which object of one class acquire some common properties of another class
* Polymorphism : The process of using a function for more than one purpose.


### 5. Features of JAVA
* OOP language
* Both compiled and Intepreted
* Platform independent
* Multi-threaded
* Case-sensitive
* Architecture-neutral
* Robust and Secure


### 6. Byte-Code
The conversion of HLL to MLL can be done in two ways
* Interpretor : Conversion in performed line by line, execution stops when an error is encountered
* Compiler : Conversion is performed all at once, all errors are listed toghether

JAVA is a HLL. The program written in java is compiled to an intermediate code called Byte Code. This code is independent
of the machine on which the program is to run. When the code is to be run on any machine, an Intepretor known as JVM 
converts the Byte Code to MLL.

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

	

### 14. String Manipulation

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


### 15. Arrays

An array is a group of like-typed variables that are referred to by a common name
The direct superclass of an array type is Object.
Every array type implements the interfaces Cloneable and java.io.Serializable.
```
int arr[] = new int[10];	//declaring and allocating memory
int num[] = {1,2,3,4,5};	//storing the data
Student[] arr = new Student[7]; //Array of Objects - student is a user-defined class
```

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


### 16. Binary Tree
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
### 17. Graphs
* Non-linear data structure. 
* A graph G is a set of ordered pair of Vertices V and a set of ordered pair of Edges E , G = (V,E)

Following two are the most commonly used representations of a graph.
1. Adjacency Matrix
2. Adjacency List



### 18. Algorithm Analysis
An algorithm is a finite sequence of logically related instructions to solve a computational problem.
#### Types of Algorithm
* Iterative 
```
Fact(n)
{
	for i = 1 to n
	fact = fact * i;
	return fact;
}
```

* Recursive
```
Fact(n)
{
	if n = 1
		return 1;
	else
		return n * fact(n-1);
}
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
* Substitution Method
* Master Theorem

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
### 20. Iterator
#### Iterator
‘Iterator’ is an interface which belongs to collection framework. It allows us to traverse the collection in forward direction, access the data element and remove the data elements of the collection.
* hasNext()
* next()
* remove()
```
ArrayList<String> list = new ArrayList<String>(); 
Iterator<String> i = list.iterator(); 
```

#### ListIterator
‘ListIterator’ in Java is an Iterator which allows users to traverse Collection in both direction. It contains the following methods :
* hasNext( )
* Next()
* hasPrevious()
* Previous()
* remove()



### 21. Collections in JAVA
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.
Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).








### 22. List Interface

List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.

List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.
````
List <data-type> list1= new ArrayList();  
List <data-type> list2 = new LinkedList();  
List <data-type> list3 = new Vector();  
List <data-type> list4 = new Stack();  
````


#### ArrayList

Java ArrayList class uses a dynamic array for storing the elements. It inherits AbstractList class and implements List interface. The List interface extends Collection and Iterable interfaces in hierarchical order.

#### Declaration
````
ArrayList<Integer> list = new ArrayList<Integer>();	//variable size
ArrayList<Boolean> list = new ArrayList<Boolean>(10);	//fixed size
ArrayList<String>  list = new ArrayList<String>();
````
	
#### Methods 
* add(Object o): This method is used to append a specificd element to the end of a list.
* addAll(int index, Collection C): Used to insert all of the elements starting at the specified position from a specific collection into the mentioned list.
* remove(int index): Removes the element at the specified position in this list.
* removeAll(Collection c): Removes from this list all of its elements that are contained in the specified collection
* retainAll(Collection c): Retains only the elements in this list that are contained in the specified collection.
* contains(Object o): Returns true if this list contains the specified element.
* set(int index, E element): Replaces the element at the specified position in this list with the specified element.
* isEmpty(): Returns true if this list contains no elements.
* size(): Returns the number of elements in this list.
* get(int index): Returns the element at the specified position in this list.
* indexOf(Object O): The index the first occurrence of a specific element is either returned, or -1 in case the element is not in the list.
* lastIndexOf(Object O): The index the last occurrence of a specific element is either returned, or -1 in case the element is not in the list.
* clear(): This method is used to remove all the elements from any list.

#### Iterating over ArrayList
* for loop
```
ArrayList<Integer> list = new ArrayList<Integer>(5);
for(int i=0;i<list.size();i++){
	System.out.println(list.get(i));
}
```

* forEach
```
ArayList<Integer> list = new ArrayList<Integer>(5);
list.forEach(lists -> {
	System.out.println(lists);
})
````

#### Searching
* contains(Object o): Returns true if this list contains the specified element.
* indexOf(Object O): The index the first occurrence of a specific element is either returned, or -1 in case the element is not in the list.
* lastIndexOf(Object O): The index the last occurrence of a specific element is either returned, or -1 in case the element is not in the list.

#### Sorting
* Collections.sort()
* ArrayList.sort()


#### LinkedList
LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. It can store the duplicate elements.
It maintains the insertion order and is not synchronized.
````
import java.util.*;  
public class TestJavaCollection2{  
	public static void main(String args[]){  
	LinkedList<String> al=new LinkedList<String>();  
	al.add("Ravi");  
	al.add("Vijay");  
	al.add("Ravi");  
	Iterator<String> itr=al.iterator();  
	while(itr.hasNext()){  
		System.out.println(itr.next());  
	}  
	}  
}  
````
```
LinkedList<String> object = new LinkedList<String>(); 
```
* object.size(); 
* object.get(2); 

* object.add("A");
* object.add(2, "E"); 
* object.addLast("C"); 
* object.addFirst("D"); 

* object.remove(3); 
* object.removeFirst(); 
* object.removeLast(); 
* object.removeFirstOccurrence​('E')

* object.set(2.'E');  // replace
* object.contains("E"); 

* object.toArray();

* object.clear();
* object.clone(); 
* object.indexOf(Object o): 
* object.lastIndexOf(Object o): 
* object.pollFirst():
* object.pollLast():



#### Vector
Vector uses a dynamic array to store the data elements. It is similar to ArrayList. However, It is synchronized and contains many methods that are not the part of Collection framework.

````
import java.util.*;  
	public class TestJavaCollection3{  
	public static void main(String args[]){  
	Vector<String> v=new Vector<String>();  
	v.add("Ayush");  
	v.add("Amit");  
	v.add("Ashish");  
	v.add("Garima");  
	Iterator<String> itr=v.iterator();  
	while(itr.hasNext()){  
		System.out.println(itr.next());  
	}  
	}  
}  
````




#### Stack

The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack. The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.

````
import java.util.*;  
public class TestJavaCollection4{  
	public static void main(String args[]){  
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
	}  
}  
````

### 23. Queue Interface

Queue interface maintains the first-in-first-out order. It can be defined as an ordered list that is used to hold the elements which are about to be processed. There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.

````
Queue<String> q1 = new PriorityQueue();  
Queue<String> q2 = new ArrayDeque();  
````

#### Priority Queue
The PriorityQueue class implements the Queue interface. It holds the elements or objects which are to be processed by their priorities. PriorityQueue doesn't allow null values to be stored in the queue.
````
import java.util.*;  
public class TestJavaCollection5{  
	public static void main(String args[]){  
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
	}  
}  
````

### 24. Set Interface

Set Interface in Java is present in java.util package. It extends the Collection interface. It represents the unordered set of elements which doesn't allow us to store the duplicate items. We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.

````
Set<data-type> s1 = new HashSet<data-type>();  
Set<data-type> s2 = new LinkedHashSet<data-type>();  
Set<data-type> s3 = new TreeSet<data-type>();  
````

#### HashSet
HashSet class implements Set Interface. It represents the collection that uses a hash table for storage. Hashing is used to store the elements in the HashSet. It contains unique items.


````
import java.util.*;  
public class TestJavaCollection7{  
	public static void main(String args[]){  
		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}  
````

### 25. Important Collections

#### 1. HashSet

* HashSet stores the elements by using a mechanism called hashing.
* HashSet contains unique elements only.
* HashSet allows null value.
* HashSet class is non synchronized.
* HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
* HashSet is the best approach for search operations.
* The initial default capacity of HashSet is 16, and the load factor is 0.75.
* HashSet implements Set Interface.
````
  HashSet<String> set=new HashSet();  
       set.add("One");    
       set.add("Two");    
       set.add("Three");   
       set.add("Four");  
       set.add("Five");  
       Iterator<String> i=set.iterator();  
       while(i.hasNext())  
       {  
       	 System.out.println(i.next());  
       }  
````
* set.add("hello")
* set.remove("one")
* set.size()
* set.clear()
* set.isEmpty()
* set.contains("two")
* set.Iterator iterator()
* set.clone()

#### 2. HashMap

* HashMap class contains values based on the key.
* HashMap class contains only unique keys.
* HashMap class may have one null key and multiple null values.
* HashMap class is non synchronized.
* HashMap class maintains no order.
* The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

````
import java.util.*;  
class HashMap1{  
 public static void main(String args[]){  
   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
    System.out.println("Initial list of elements: "+hm);  
      hm.put(100,"Amit");    
      hm.put(101,"Vijay");    
      hm.put(102,"Rahul");   
       
      System.out.println("After invoking put() method ");  
      for(Map.Entry m:hm.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }  
        
      hm.putIfAbsent(103, "Gaurav");  
      System.out.println("After invoking putIfAbsent() method ");  
      for(Map.Entry m:hm.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }  
      HashMap<Integer,String> map=new HashMap<Integer,String>();  
      map.put(104,"Ravi");  
      map.putAll(hm);  
      System.out.println("After invoking putAll() method ");  
      for(Map.Entry m:map.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }  
 }  
}  
````


* void clear(): Used to remove all mappings from a map.
* boolean containsKey(Object key): Used to return True if for a specified key, mapping is present in the map.
* boolean containsValue(Object value): Used to return true if one or more key is mapped to a specified value.
* Object clone(): It is used to return a shallow copy of the mentioned hash map.
* boolean isEmpty(): Used to check whether the map is empty or not. Returns true if the map is empty.
* Set entrySet(): It is used to return a set view of the hash map.
* Object get(Object key): It is used to retrieve or fetch the value mapped by a particular key.
* Set keySet(): It is used to return a set view of the keys.
* int size(): It is used to return the size of a map.
* Object put(Object key, Object value): It is used to insert a particular mapping of key-value pair into a map.
* putAll(Map M): It is used to copy all of the elements from one map into another.
* Object remove(Object key): It is used to remove the values for any particular key in the Map.
* Collection values(): It is used to return a Collection view of the values in the HashMap.
* compute(K key, BiFunction<K, V> remappingFunction): This method Attempts to compute a mapping for the specified key and its * current mapped value (or null if there is no current mapping).
* computeIfAbsent(K key, Function<K> mappingFunction): This method If the specified key is not already associated with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into this map unless null.
* forEach(BiConsumer<K, V> action): This method Performs the given action for each entry in this map until all entries have been processed or the action throws an exception.
* getOrDefault(Object key, V defaultValue): This method returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for t/he key.
* merge(K key, V value, BiFunction<K, V> remappingFunction): This method If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.

* replace(K key, V oldValue, V newValue): This method replaces the entry for the specified key only if currently mapped to the specified value.
* replaceAll(BiFunction<K, V> function): This method replaces each entry’s value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.


#### 3. LinkedHashMap
Java LinkedHashMap contains values based on the key.
Java LinkedHashMap contains unique elements.
Java LinkedHashMap may have one null key and multiple null values.
Java LinkedHashMap is non synchronized.
Java LinkedHashMap maintains insertion order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

````
import java.util.*;  
public class LinkedHashMap3 {  
   public static void main(String args[]) {  
    Map<Integer,String> map=new LinkedHashMap<Integer,String>();        
     map.put(101,"Amit");    
     map.put(102,"Vijay");    
     map.put(103,"Rahul");    
     System.out.println("Before invoking remove() method: "+map);     
    map.remove(102);  
    System.out.println("After invoking remove() method: "+map);    
   }      
}  
````

* void clear(): This method is used to remove all the mappings from the map.
* boolean containsKey(Object key): This method is used to returns true if a specified element is mapped by one or more keys.
* Object get(Object key): The method is used to retrieve or fetch the value mapped by the specified key.
* protected boolean removeEldestEntry(Map.Entry eldest): The method is used to return true when the map removes its eldest entry from the map.
* entrySet​(): This method returns a Set view of the mappings contained in this map.
* forEach​(BiConsumer<K,V> action): This method Performs the given action for each entry in this map until all entries have been processed or the action throws an exception.
* getOrDefault​(Object key, V defaultValue): This method returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
* keySet​(): This method returns a Set view of the keys contained in this map.
removeEldestEntry​(Map.Entry<K,V> eldest): This method returns true if this map should remove its eldest entry.
* replaceAll​(BiFunction<K,V> function): This method replaces each entry’s value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
* values​(): This method returns a Collection view of the values contained in this map.


