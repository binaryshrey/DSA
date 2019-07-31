# DSA  ![GitHub forks](https://img.shields.io/github/forks/binaryshrey/DSA.svg?style=social) ![Twitter Follow](https://img.shields.io/twitter/follow/binaryshrey.svg?style=social)
A beginner's guide to getting started with Data Structures and Algorithms with JAVA.

### Table of contents
* [Installation](#1-installation)
* [Hello World](#2-hello-world)
* [Procedure Oriented Programming](#3-procedure-oriented-programming)
* [Object Oriented Programming](#4-object-oriented-programming)
* [Features of JAVA](#5-features-of-java)
* [Byte Code](#6-byte-code)
* [Data Types](#7-data-types)
* [String Manipulation](#8-string-manipulation)
* [Arrays](#9-arrays)
* [ArrayList](#10-arraylist)
* [Binary Tree](#11-binary-tree)

<br>

### 1. Installation
```bash
$ sudo apt update
$ sudo apt install openjdk-8-jdk
$ java -version
```

### 2. Hello World
```Java
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
* Data Abstraction : Act ofrepresenting essential features without including the background details
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

### 6. Byte-Code
The conversion of HLL to MLL can be done in two ways
* Interpretor : Conversion in performed line by line, execution stops when an error is encountered
* Compiler : Conversion is performed all at once, all errors are listed toghether

JAVA is a HLL. The program written in java is compiled to an intermediate code called Byte Code. This code is independent
of the machine on which the program is to run. When the code is to be run on any machine, an Intepretor known as JVM 
converts the Byte Code to MLL.

### 7. Data Types
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
  

### 8. String Manipulation

#### Built-in Character methods

* Character.isLetter()
* Character.isDigit()
* Character.isLetterorDigit()
* Character.isWhiteSpace()
* Character.isUpperCase()
* Character.isLowerCase()
* Character.toLowerCase()
* Character.toLowerCase()

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

#### Built-in StringBuffer methods
```
StringBuffer st1 = new StringBuffer(st2);
```
* append()
* setCharAt()
* insert()
* delete()
* setLength()
* reverse()



#### String to Primitive type
```
int n = Integer.parseInt(str);
```

### Primitive to String type
```
String str = Integer.toString(n);
```


### 9. Arrays

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


### 10. ArrayList

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

#### iterating over ArrayList
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


### 11. Binary Tree
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





