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






