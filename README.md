* [Windows](#windows)
* [Linux](#linux)
* [IDE](#ide)
* [Variable](#variable)
* [Type Casting](#type-casting)
* [Operator](#operator)
* [Control Flow](#control-flow)
* [Recursion](#recursion)
* [Class](#class)
* [Class path](#class-path)
* [Package](#package)
* [ACS](#access-control-specifier)
* [static](#static)
* [Overloading](#overloading)
* [String](#string)
* [StringBuilder StringBuffer](#stringbuilder-stringbuffer)
* [Console Input](#console-input)
* [Array](#array)
* [for each](#for-each)
* [N array](#nd-array)
* [Inheritance](#inheritance)
* [Object](#object-class)
* [abstract](#abstract)
* [interface](#interface)
* [Exception](#exception)
* [JVM Memory model](#jvm-memory-model)
* [Wrapper](#wrapper)
* [Generic](#generic)
* [Collection](#collection)
* [Thread](#thread)
* [File IO](#file-io)
* [Swing](#swing)

# Windows
Donwload java SE JDK and edit PATH (Computer - property - Environmental Variable)

1. [Java SE](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
2. Add PATH (C:\Program Files\Java\jdk1.x.x\bin;)
```
JDK = JRE + Development/debugging tools
JRE = JVM + Java Packages Classes(like util, math, lang, awt,swing etc)+runtime libraries.
JVM = Class loader system + runtime data area + Execution Engine.
```

# Linux
```
java -version
javac -version
sudo apt-get install default-jdk
```

# IDE
* [Eclipse](https://eclipse.org/downloads/)
* [NetBeans](https://netbeans.org/downloads/)
* [Sublime Text](https://www.sublimetext.com/3)
* [Visual Studio Code](https://code.visualstudio.com/download) 

# Variable
<table>
  <tr>
		<th>Data Type</th>
		<th>Data</th>
		<th>Size(byte)</th>
		<th>Range</th>
  </tr>
  <tr>
		<td>boolean</td>
		<td>true or false</td>
		<td>1</td>
		<td>true, false</td>
  </tr>
  <tr>
		<td>char</td>
		<td>characters</td>
		<td>2</td>
		<td>unicode characters</td>
  </tr>
  <tr>
		<td>byte</td>
		<td>1</td>
		<td>-128 ~ 127</td>
	 </tr>
  <tr>
		<td>short</td>
		<td>2</td>
		<td>-32768 ~ 32768</td>
  </tr>
  <tr>
		<td>int</td>
		<td>4</td>
		<td>-2147483648 ~ 2147483647</td>
  </tr>
  <tr>
		<td>long</td>
		<td>8</td>
		<td>-9223....808 ~ 9223....807</td>
  </tr>
  <tr>
		<td>float</td>
		<td rowspan="2">real number</td>
		<td>4</td>
		<td>±(1.40e-45 ~ 3.40e38)</td>
  </tr>
  <tr>
		<td>double</td>
		<td>8</td>
		<td>±(4.94e-324 ~ 1.79e308)</td>
  </tr>
</table>

```java
//line comment
/*block comment
multiple lines*/

public class PrintVariable{
	public static void main(String[] args){
		char ch1 = 'A';
		char ch2 = '訝';
		char ch3 = 0x3091;
		char ch4 = 0x3092;
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
	}
}
```

# Type Casting

* suffix for primitive data types
```java
public static void main(String[] args){
	double e1 = 125;
	float e2 = 7.125F;
	long n1 = 1000000000L;
	long n2 = 150;
	
	float num1 = 5.5 //by default double while float n1 = 5.5f makes it float
	long num2 = 55 //literal 55 is by default int type but long n2 = 55l makes it long type.
	double num3 = 5.5 //double n3 = 5.5d, d suffix is optional
}
```

* Implicit Conversion

[byte]→[short]→[int]→[long]→[float]→[double]<br>
				[char]→[int]<br>
```java
public static void main(String[] args){
	double n1 = 20; //int -> double
	int n2 = 20.5; //Error due to data loss; double -> int
	float n3 = 10; //int -> float
	double n4 = 3.5f + 12; // == 15.5f; float -> double
}
```

* Explicit Conversion
```java
public static void main(String[] args){
	int n = (int)3.15;
	long n1 = 198221221L;
	int n2 = (int)n1;
	int n3 = 99;
	long n4 = (long)n3;
}
```

# Operator
```java
/*Basic*/
	+ add
	- subtract
	* multiply
	/ divide
	% modulo

/*Compare*/
	< >
	<= >=
	!= ==
	&&
	||
	!

/*Unary*/
	int n1 = +2;
	int n2 = -n1;

/*Incr Decr*/
	n++ ++n
	n-- --n

/*Bit*/
	1 & 1 == 1
	1 & 0 == 0
	0 & 0 == 0
	1 | 1 == 1
	1 | 0 == 1
	0 | 0 == 0
	1 ^ 1 == 0
	1 ^ 0 == 1
	0 ^ 0 == 0
	~0 == 1
	~1 == 0
	<< <<< 
	>> >>>

/*Type conversion*/
	7/3 == 2
	7.0f/3.0f == 2.333...
	(float)7/3 == 2.333...
```

# Control flow
```java
/*1. if else*/
if(cond1){/*code*/} 
else if(cond2){/*code*/}
else {/*code*/}

/*2. similar to if else*/
int bigN = (n1 > n2) ? n1 : n2;
//returns n1 if n1 > n2, otherwise n2

/*3. switch break*/
switch(n){
case 1: 
	/*code*/
	break;
case2:
case3:
	/*code*/
	break;
...
default: 
	/*code*/
	break;
}

/*4. loop*/
for(int i = 0; i< N; i++){/*code*/}

while(cond){/*code*/}

do{/*code*/}
while(cond)

/*5. continue break*/
while(boolean){
	if(cond)
		break; /*break 'one' loop*/
	else
		continue;
}
```

## Recursion
```java
public static int toBinary(int dec){
	if (dec < 0)
		return -1;
	else if (dec == 0)
		return 0;
	else
		return dec % 2 + 10*toBinary(dec/2);
}

public static String toBinary(int n){
	if (n<= 0)
		return "";
	else if (n==1)
		return "1";
	else
		return toBinary(n/2)+ n%2;
}
```

# Class
```java
/*class declaration*/
class AAA{
/*member var*/
	int num;

/*constructor*/
	public AAA(){this.num = 0;}

/*member func*/
	public void add(int n){num += n;}
}
```

```java
Q: define a class that has a constuctor which is called only once after instance creation
class AAA{
	int num;
	static AAA inst = null;
	public static AAA createInst(){
		if (inst == null)
			inst = new AAA();
		return inst;
	}
	private AAA(){this.num = 0;}
	public void add(int n){num += n;}
}
```

## initialize reference var
```java
// initialized as a null
AAA a = null;
```

## final
```java
final int MAX_NUM = 10; // constant

```

# Class path
```
user@:~/workspace/java/src$ javac -d . *.java
user@:~/workspace/java/src$ ls
	FruitSalesMain3.class  package1  package4
	FruitSalesMain3.java   package2  PackageCircle.class
	orange                 package3  PackageCircle.java
user@:~/workspace/java/src$ java FruitSalesMain3 

user@:~/workspace/project1$ javac -d "PACKAGE DIR" "FILENAME TO COMPILE"
This will create that directory by which it sets directory location.
javac -d . *.java  #this will create package in current directory
javac -d mydir *.java  #this will create package in mydir directory
---
user@:~/workspace/java/src$ mkdir mydir
user@:~/workspace/java/src$ javac -d mydir *.java
user@:~/workspace/java/src$ cd mydir
user@:~/workspace/java/src/mydir$ ls
	FruitSalesMain3.class  PackageCircle.class
```

# Package

# Access control specifier 
<table>
	<tr>
		<th>ACS</th>
		<th>Class</th>
		<th>Package</th>
		<th>Inherited Class</th>
		<th>Others</th>
	</tr>
	<tr>
		<th>private</th>
		<td>&#9711;</td>
		<td>&#10005;</td>
		<td>&#10005;</td>
		<td>&#10005;</td>
	</tr>
	<tr>
		<th>default</th>
		<td>&#9711;</td>
		<td>&#9711;</td>
		<td>&#10005;</td>
		<td>&#10005;</td>
	</tr>
	<tr>
		<th>protected</th>
		<td>&#9711;</td>
		<td>&#9711;</td>	
		<td>&#9711;</td>
		<td>&#10005;</td>
	</tr>
	<tr>
		<th>public</th>
		<td>&#9711;</td>
		<td>&#9711;</td>
		<td>&#9711;</td>
		<td>&#9711;</td>
	</tr>
</table>

# Encapsulation
```java
class Budweiser{
	public void take(){System.out.println("My favorite American beer.");}
}

class Sapporo{
	public void take(){System.out.println("Japanese beer is great.");}
}

class Kirin{
	public void take(){System.out.println("Kirin beer is nice.");}
}

class BeerPack{
	Budweiser bud;
	Sapporo sap;
	Kirin kir;
	
	public BeerPack(){
		bud = new Budweiser();
		sap = new Sapporo();
		kir = new Kirin();
	}
	
	public void take(){
		bud.take();
		sap.take();
		kir.take();
	}
}

class Worker{
	public void drinkBeer(BeerPack pack){ pack.take();}
}

public class Encapsulation {
	public static void main(String[] args){
		Worker worker = new Worker();
		worker.drinkBeer(new BeerPack());
	}
}
```

# static
1. shared by all class instance
2. only one static variable can exist in memory
3. accessible anywhere (if declared 'public')
4. accessible by class and instance name
5. initialized when JVM creates class in memory
6. initializing inside constructor is not recommended
7. accessible by static method (from different package)

```java
class Class{
	public static final double PI =3.14;
	public static int var = 0;
	func{}
}

Class.var;
inst.var;
func{this.var}
```

## static method 
```java
class A{
	public static void doNothin(){/*code*/}
}
class MainClass{
	public static void main(String[] args){
		A.doNothin();
		
		A a = new A();
		a.doNothin();
	}
}
```

## main
```java
class Employer{
	private int myMoney;
	public Employer(int myMoney){
		this.myMoney = myMoney;
	}
	public void payForWork(Employee emp, int money){
		if(myMoney<money)
			return;
		emp.earnMoney(money);
		myMoney -= money;
	}
}
class Employee{
	private int myMoney;
	public Employee(int myMoney){
		this.myMoney = myMoney;
	}
	public void earnMoney(int money){
		myMoney +=money;
	}
}
/* when main method is inside either Employer or Employee class
user@9550:~/workspace/java/src$ java Employer
user@9550:~/workspace/java/src$ java Employee

2. class instance can be created in member functions - main method can be inside any classes */
```

# Overloading
```java
class A{
	private int a, b;
	
	public A(int a){
		this.a = a;
	}
	public A(int a, int b){
		this(a);
		this.b= b;
	}
	public void func(int n){}
	public void func(int n1, int n2){}
	public void func(String s){}
}

```

# String
[String API](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

# StringBuilder StringBuffer
[StringBuffer](https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html)

[Difference between StringBuilder and StringBuffer](http://stackoverflow.com/questions/355089/difference-between-stringbuilder-and-stringbuffer)

# Console Output
```java
class A{
	public String toString(){return "class A";}
}

A inst = new A();
System.out.println(inst);
```

## Escape Sequence
```java
\n new line
\t tab
\" quotation mark
\\ backslash

System.out.printf("integer %d, real number %f, character %c", 10, 3.1415, 'A');
```
<table>
  <tr>
	<th>formatter</th>
	<th>print form</th>
  </tr>
  <tr>
	<td>%d</td>
	<td>decimal</td>
  </tr>
  <tr>
	<td>%o</td>
	<td>octal(8)</td>
  </tr>
  <tr>
	<td>%x</td>
	<td>hex(16)</td>
  </tr>
  <tr>
	<td>%f</td>
	<td>real number</td>
  </tr>
  <tr>
	<td>%e</td>
	<td>real number format in e notation (.31415*10e+1)</td>
  </tr>
  <tr>
	<td>%g</td>
	<td>%e or %f</td>
  </tr>
  <tr>
	<td>%s</td>
	<td>string</td>
  </tr>
  <tr>
	<td>%c</td>
	<td>character</td>
  </tr>
</table>

```java
System.out.printf("%g %g \n", .0001, .00001);
// [console] 0.000100000 1.00000e-05
```

# Console Input
```java
/*1. old code*/
try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	int n = Integer.parseInt(str);
}
catch(IOException e){
	e.printStackTrace();
}

/*2. after java 5.0*/
Scanner sc = new Scanner(System.in);

Sytem.out.print("type integer : ");
int n = sc.nextInt(); sc.nextLine();

Sytem.out.print("type string : ");
String s = sc.nextLine();
```

# Array
```java
/*initialize*/
int[] arr = new int[3];
int[] arr = new int[3]{1,2,3};
int[] arr = new int[]{1,2,3};
int[] arr = {1,2,3};


int[] arr = new int[2];
arr[0]=10; arr[1] = 20;

String[] arr = new String[3];
arr[0]=new String("a");
arr[1]=new String("b");
arr[2]=new String("c");
```

## for each
```java
int arr[] = {1,2,3,4,5};
int sum = 0;
//for(int i : new int[]{1,2,3,4,5})

for(int i : arr)
	sum += i;
System.out.println(sum);
```

## Nd array

## main method
```java
public class MainParam {
	public static void main(String[] args) {
		for(String e: args)
			System.out.println(e);
	}
}
/ * user@9550:~/workspace/java/src$ java MainParam AAA BBB CCC
[console]AAA
BBB
CCC */
```

# Inheritance
[oracle document](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)

## Inheritance ACS
```java
package A;
class A{
	int defNum;
	private int privNum;
	protected int protNum;
	static int statNum = 0;
	
	public int getPrivNum(){return privNum;}
	protected void setNum(){
		defNum = 0;
		privNum = 0;
		protNum = 0;
	}
	public void setStaticNum(int n){statNum = n;}
}
```

```java
package B;
import A.*;
class B extends A{
	public B(){/*super();*/}
	public void setNum(){super.setNum();}
	public void showNum(){
		System.out.println("default num: " + defNum);
		System.out.println("private num: " + getPrivNum()); 
		System.out.println("protected num: " + protNum); /*accessible by inherited class*/
	}
	public static void showStaticNum(){
		System.out.println("static Num: " + statNum);
	}
}
```

## ISA HASA Composite
```java
/*ISA*/
class Computer{}
class Laptop extends Computer{}
class HPPavilion extends Laptop{}

/*HASA*/
class Gun{}
class Police extends Gun{}

/*Composite*/
class Gun{}
class Police{Gun pistol;}
```

## Overriding
```java
class AAA{
	public void ride(){System.out.println("AAA method called.");}
	public void load(){System.out.println("void method");}
}

class BBB extends AAA{
	public void ride(){System.out.println("BBB method called.");}
	public void load(int n){System.out.println("int method");}
}

class CCC extends BBB{
	public void ride(){System.out.println("CCC method called.");}
	public void load(double n){System.out.println("double method");}
}
public class RideAndLoad {
	public static void main(String[] args)
	{
		AAA ref1 = new CCC(); 
		BBB ref2 = new CCC();
		CCC ref3 = new CCC();
		
		/*override (hide) method of super class*/
		ref1.ride();
		ref2.ride();
		ref3.ride();
		
		ref1.load();
		ref2.load(2);
		ref3.load(3.33);
	}
}
```

## instanceof
```java
/*instanceof*/
class Box{
	public void simpleWrap(){System.out.println("simple wrap");}
}
class PaperBox extends Box{
	public void paperWrap(){System.out.println("paper wrap");}
}
class GoldenPaperBox extends PaperBox{
	public void goldenPaperWrap(){System.out.println("golden paper wrap");}
}

public class InstanceOf {
	public static void wrapBox(Box box){
		if (box instanceof GoldenPaperBox)
			((GoldenPaperBox) box).goldenPaperWrap();
		else if (box instanceof PaperBox)
			((PaperBox) box).paperWrap();
		else
			box.simpleWrap();
	}
	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldenPaperBox box3 = new GoldenPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
}

/*not using instanceof*/
class Box{
	public void SimpleWrap(){System.out.println("simple wrap");}
	public void wrap(){}
}
class PaperBox extends Box{
	public void paperWrap(){System.out.println("paper wrap");}
	public void wrap(){}
}
class GoldPaperBox extends PaperBox{ 
	public void goldWrap(){System.out.println("gold wrap");}
	public void wrap(){}
}

public class InstanceOf {
	public static void wrap(Box box){
		box.wrap();
	}
	
	public static void main(String[] args){
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrap(box1);
		wrap(box2);
		wrap(box3);
	}
}
```

# Object class
```java
/*can override object method inside class*/

public String toString(){/*code*/}
public void println(Object obj){/*code*/}	
```

## final
```java
final class MyClass{} /*do not allow class inheritance*/
final void func(param){} /*do not allow method overriding*/

eg. String is a final class
eg. Object has final method : wait() notify() notifyAll()
```

# abstract
* for inheritance
* not for instantiation

## abstract class & method
* inherited classes should define one
```java
abstract class AAA{
	void method1(){/*code*/}
	abstract void method2();
}

class BBB extends AAA{
	void method2(){/*code*/} 
}
```

# interface
```java
interface NumStorage {
	public void addInfo(String name, String number);
	public String searchName(String number);
}

class NumStorageImpl implements NumStorage{
	HashSet<NumInfo> infoStorage = new HashSet<NumInfo>();
	
	public void addInfo(String name, String number){
		infoStorage.add(new NumInfo(name, number));
	}
	
	public String searchName(String number){
		Iterator<NumInfo> itr = infoStorage.iterator();
		while(itr.hasNext()){
			NumInfo info = itr.next();
			if(number.compareTo(info.number) == 0)
				return info.name;
		}
		return null;
	}
}

class NumInfo {
	String name, number;
	public NumInfo(String name, String number){
		this.name = name;
		this.number = number;
	}
}

public class AbstractInterface {
	public static void main(String[] args){
		NumStorage storage = new NumStorageImpl();
		storage.addInfo("AAA", "000-0000");
		System.out.println("result: "+ storage.searchName("000-0000"));
	}
}
```

## class1 implements interface1, interface2
```java
public interface MyInterface{public void myMethod();}
public interface YourInterface{public void yourMethod();}

class OurClass implements MyInterface, YourInterface
	public void myMethod(){/*code*/}
	public void yourMethod(){/*code*/}
}
```

## interface1 extends interface2
```java
public interface MyInterface{
	public void myMethod();
}
public interface MySecondInterface extends MyInterface{
	public void mySecondMethod();
}
```

## Example
```java
/*
draft/PersonalInfoStorage.java
companyA/PersonalInfo.java
companyA/PersonalInfoStorageImpl.java */


/*PersonalInfoStorage.java*/
package hmproject.draft;

public interface PersonalInfoStorage {
	public void addPersonalInfo(String name, String perNum);
	public String searchName(String perNum);
}


/*PersonalInfo.java*/
package hmproject.companyA;

public class PersonalInfo {
	private String name;
	private String perNum;
	public PersonalInfo(String name, String perNum){
		this.setName(name);
		this.setPerNum(perNum);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPerNum() {
		return perNum;
	}
	public void setPerNum(String perNum) {
		this.perNum = perNum;
	}
}


/*PersonalInfoStorageImpl.java*/
package hmproject.companyA;

import java.util.HashSet;
import java.util.Iterator;

import hmproject.draft.PersonalInfoStorage;

public class PersonalInfoStorageImpl implements PersonalInfoStorage{
	HashSet<PersonalInfo> infoStorage = new HashSet<PersonalInfo>();
	
	public PersonalInfoStorageImpl(){
		
	}
	public void addPersonalInfo(String name, String perNum) {
		infoStorage.add(new PersonalInfo(name, perNum));
	}
	public String searchName(String perNum) {
		Iterator<PersonalInfo> itr = infoStorage.iterator();
		while(itr.hasNext()){
			PersonalInfo compInfo = itr.next();
			if (compInfo.getPerNum().compareTo(perNum) == 0)
				return compInfo.getName();
		}
		return null;
	}
}
```

## interface for const
```java
public class Week{
	public static final int MON = 1, TUE =2, /*vars*/ SUN =7;
}

public interface Week{
	int MON = 1, TUE =2, /*code*/ SUN = 7;
}
```

## interface to distinguish classes

## Example
```java
interface UpperCasePrintable{/*empty*/}

class ClassPrinter
{
	public static void print(Object obj)
	{
		String str = obj.toString();
		if(obj instanceof UpperCasePrintable)
			str = str.toUpperCase();
		
		System.out.println(str);
	}
}

class PointOne implements UpperCasePrintable
{
	int xPos, yPos;
	PointOne(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	public String toString()
	{
		return "(x = " + xPos + ", y = " + yPos + ")";
	}
}

class PointTwo
{
	int xPos, yPos;
	PointTwo(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	public String toString()
	{
		return "(x = " + xPos + ", y = " + yPos + ")";
	}
}

public class InterfaceMark {
	public static void main(String[] args)
	{
		PointOne pos1 = new PointOne(1,1);
		PointTwo pos2 = new PointTwo(2,2);
		
		ClassPrinter.print(pos1);
		ClassPrinter.print(pos2);
	}
}
```

## diamond UML
java does not support multi-inheritance, Workaround :
```java
/*ERROR CODE*/
class TV{
	public void onTV(){ System.out.println("Video Sending...");}
}

class Computer{
	public void dataReceive(){
		public void dataReceive(){ System.out.println("Video Receiving...");}
	}
}

class IPTV extends TV, Computer{ //ERROR!
	public void powerOn(){
		dataReceive();
		onTV();
	}
}


/*SOLUTION 1.*/
class TV{
	public void onTV(){ System.out.println("Video Sending...");}
}

interface Computer{
	public void dataReceive();
}
class ComputerImpl{	
	public void dataReceive(){ System.out.println("Video Receiving...");}
}

class IPTV extends TV implements Computer{
	ComputerImpl comp=new ComputerImpl();
	
	public void dataReceive(){comp.dataReceive();}
	
	public void powerOn(){
		dataReceive();
		onTV();
	}
}


/*SOLUTION 2.*/
interface TV{
	public void onTV();
}

interface Computer{
	public void dataReceive();
}

class TVImpl{
	public void onTV(){ System.out.println("Video Sending...");}
}

class ComputerImpl{	
	public void dataReceive(){ System.out.println("Video Receiving...");}
}

class IPTV implements TV, Computer{
	ComputerImpl comp=new ComputerImpl();
	TVImpl tv = new TVImpl();
	
	public void dataReceive(){comp.dataReceive();}
	public void onTV(){tv.onTV();}
	
	public void powerOn(){
		dataReceive();
		onTV();
	}
}


/*MAIN METHOD*/
public class MultiInheriAlternative{
	public static void main(String[] args){
		IPTV iptv=new IPTV();
		iptv.powerOn();
		
		TV tv=iptv;
		Computer comp=iptv;
	}
}
```

## Inner & Outer class
```java
class OuterClass{
	class InnerClass{}
}

public static void main(String[] args){
	OuterClass out1 = new OuterClass();
	OuterClass out2 = new OuterClass();
	
	OuterClass.InnerClass inn1 = out1.new InnerClass();
	OuterClass.InnerClass inn2 = out2.new InnerClass();
	OuterClass.InnerClass inn3 = out2.new InnerClass();
}
```

# Nested class
nested class (or static inner class) :
```java
class OuterClass{
	static class NestedClass{}
}
```

```java
class OuterClassOne{
	public OuterClassOne(){
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	static class NestedClass{
		public void simpleMethod(){
			System.out.println("nested instance method One");
		}
	}
}

class OuterClassTwo{
	public OuterClassTwo(){
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	
	private static class NestedClass{
		public void simpleMethod(){
			System.out.println("nested instance method Two");
		}
	}
}

public class NestedClassTest {
	public static void main(String[] args){
		OuterClassOne one = new OuterClassOne();
		OuterClassTwo two = new OuterClassTwo();
		
		OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();
		nst1.simpleMethod();
		
		//private : Error
		/*OuterClassTwo.NestedClass nst2 = new OuterClassTwo.NestedClass();
		nst2.simpleMethod();*/
	}
}
```

## Local class
```java
class OuterClass{
	public void createLocalClassInst(){
		class LocalClass{}
		LocalClass local = new LocalClass();
	}
}
```

A local class can only access local variables that are declared final :
```java
interface Readable{
	public void read();
}

class OuterClass{
	private String name;
	public OuterClass(String name){this.name = name;}
	
	public Readable createLocalClassInst(final int instID){
		class LocalClass implements Readable{
			public void read(){
				System.out.println("outer inst name: " + name);
				System.out.println("Local inst ID: " + instID);
			}
		}
		
		return new LocalClass();
	}
}

public class LocalClassTest {
	public static void main(String[] args)
	{
		OuterClass out1 = new OuterClass("outer class 1");
		Readable localInst1 = out1.createLocalClassInst(111);
		localInst1.read();
		
		OuterClass out2 = new OuterClass("outer class 2");
		Readable localInst2 = out2.createLocalClassInst(222);
		localInst2.read();
	}
}
```

## Anonymous class
similar to Local class, but without class name

```java
/*method 1.*/
class OuterClass{
	private String name;
	
	public OuterClass(String name){this.name = name;}
	
	public Readable createLocalClassInst(final int instID){
		return new Readable(){
			public void read(){
				System.out.println("outer inst name: " + name);
				System.out.println("Local inst ID: " + instID);
			}
		};
	}
}

/*method 2.*/
class OuterClass{
	private String name;
	
	public OuterClass(String name){this.name = name;}
	
	public Readable createLocalClassInst(final int instID){
		Readable read = new Readable(){
			public void read(){
				System.out.println("outer inst name: " + name);
				System.out.println("Local inst ID: " + instID);
			}
		};
		
		return read;
	}
}
```

# Exception

## try catch finally
```java
	try{
		/*code in which exception occurs*/
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	finally{/*always executed regardless of the exceptions*/}
```

* ArrayIndexOutOfBoundsException
* ClassCastException
* NegativeArraySizeException
* NullPointerException

```java
/*ArithmeticException catch area is never reached. Avoid this : */
try{}
catch(Throwable e){}
catch(ArithmeticException e){}
```

```java
try {
	int n1 = 1, n2 = 0;
	System.out.println("n1/n2 = " + n1 / n2);
} catch (ArithmeticException e) {
	System.out.println(e.getMessage());
}

try {
	int[] arr = new int[3];
	arr[-1] = 0;
} catch (ArrayIndexOutOfBoundsException e) {
	System.out.println(e.getMessage());
}

try {
	Object obj = new int[10];
	String str = (String) obj;
} catch (ClassCastException e) {
	System.out.println(e.getMessage());
}

try {
	int[] arr = new int[-10];
} catch (NegativeArraySizeException e) {
	System.out.println(e.getMessage());
}

try {
	String str = null;
	int len = str.length();
} catch (NullPointerException e) {
	System.out.println(e.getMessage());
}
```

## throw
'throws' will pass the error to his caller, which will handle the Exception in try~catch block

```java
/*throws an error to his caller*/
class AgeException extends Exception{
	public AgeException(){super("invalid age input");}
}

public class CustomException {
	public static int readAge() throws AgeException{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt(); sc.nextLine();
		
		if (age < 0) throw new AgeException();
		return age;
	}
	public static void main(String[] args) {
		System.out.print("type your age >>");
		
		try{
			int age = readAge();
		}
		catch(AgeException e){
			System.out.println(e.getMessage());
		}
	}
}

/*main method throws. Then the caller of main method should handle exception.
Since JVM is the caller, JVM will
	1. call getMessage()
	2. print stack trace
	3. terminate program */
class AgeInputException extends Exception{
	public AgeException(){super("invalid age input");}
}
public class CustomException {
	public static int readAge() throws AgeException{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt(); sc.nextLine();
		
		if (age < 0) throw new AgeException();
		return age;
	}
	public static void main(String[] args) throws AgeInputException{
		int age = readAge();
		System.out.println(age + " years old.");
	}
}
```

```java
import java.util.Scanner;

class AgeInputException extends Exception{
	public AgeInputException(){super("invalid age input.");}
}
class NameLengthException extends Exception{
	String wrongName;
	public NameLengthException(String wrongName){
		super("invalid name input");
		this.wrongName = wrongName;
	}
	public void showWrongName(){
		System.out.println("invalid name input: " + this.wrongName);
	}
}
class PersonalInfo{
	String name;
	int age;
	public PersonalInfo(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void showPersonalInfo(){
		System.out.println("name: " +name);
		System.out.println("age: " +age);
	}
}
public class PrintStackTrace {
	public static final Scanner sc = new Scanner(System.in);
	
	public static PersonalInfo readPersonalInfo() throws NameLengthException, AgeInputException{
		String name = readName();
		int age = readAge();
		return new PersonalInfo(name, age);
	}
	public static String readName() throws NameLengthException{
		System.out.print("name >>"); String name = sc.nextLine();
		if(name.length() < 2)
			throw new NameLengthException(name);
		return name;
	}
	public static int readAge() throws AgeInputException{
		System.out.print("age >>"); int age = sc.nextInt(); sc.nextLine();
		if (age < 0)
			throw new AgeInputException();
		return age;
	}
	public static void main(String[] args) {
		try{
			PersonalInfo info = readPersonalInfo();
		} catch(NameLengthException e){
			e.showWrongName();
			e.printStackTrace();
		} catch(AgeInputException e){
			e.printStackTrace();
		}
	}
}
```

## Exception class Hierarchy
Exception → Throwable ← Error (e.g. VirtualMachineError)<br>

![alt tag](http://images.techhive.com/images/idge/imported/article/jvw/1998/07/exceptfig1-100158195-orig.gif)

## RuntimeException
although it is a subclass of Exception, it is similar to Error subclasses

1. no 'try~catch' or 'throws'
2. does not handle serious problems as 'Error' would handle: errors related to environment in which application is running
3. therefore it occasionally uses 'try~catch' in order to continue program execution

```java
/*RuntimException Example*/
public class RuntimeExceptionCase {
	public static void main(String[] args){
		try{
			int[] arr = {0,1};
			arr[-2] = 1;
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		try{
			Object obj = new int[10];
			String str = (String)obj;
		} catch(ClassCastException e){
			System.out.println(e.getMessage());
		}
		try{
			int[] arr = new int[-10];
		} catch(NegativeArraySizeException e){
			System.out.println(e.getMessage());
		}
		try{
			String str = null;
			int len = str.length();
		} catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
	}
}
```

# JVM Memory model
OS allocate memories to applications (JVM as one of them). JVM memory:

* METHOD: method bytecode, static variable
* STACK: local, reference variable, parameter
* HEAP: instance, garbage collection

## JVM removes instances from heap memory
```java
public static void func(){
	String s1 = new String("inst1");
	String s2 = new String("inst2");
	s1=null;
	s2=null;
	//garbage-collection is executed by JVM follwing an algorithm
}
```

## Object : finalize
```java
/* finalize dispose of inst */
protected void finalize() throws Throwable
```

```java
/*ObjectFinalize.java*/
class MyName{
	String objName;
	public MyName(String objName){this.objName = objName;}
	
	/*override method to execute necessary steps defined in Object class*/
	public void finalize() throws Throwable{ 
		super.finalize();
		System.out.println(objName + " was disposed.");
	}
}

public class ObjectFinalize {
	public static void main(String[] args){
		MyName obj1 = new MyName("inst1");
		MyName obj2 = new MyName("inst2");
		obj1 = null;
		obj2 = null;
		
		System.out.println("terminates program.");
		
		//instances are ready for garbage-collection
		//finalize is expected to be called automatically, but it was called manually
		System.gc();
		System.runFinalization();
	}
}
```

## Object : equals
```java
public boolean equals(Object obj)
```

Override 'equals' method of the Object class
```java
class MyName{
	// override
	public boolean equals(Object obj){
		MyName cmp = (MyName)obj;
		if(obj.objName.equals(objName))
			return true;
		return false;
	}
}
```

## Object : clone
instance cloning requires implementing 'Cloneable' interface in order to call clone()
```java
protected Object clone() throws CloneNotSupportedException
```

```java
class Point implements Cloneable{
	private int x, y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void showPosition(){
		System.out.printf("[%d, %d]\n", x, y);
	}
	/*override protected to public*/
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class InstanceCloning {
	public static void main(String[] args){
		Point org = new Point(3,5);
		Point cpy;
		try{
			cpy = (Point)org.clone();
			org.showPosition();
			cpy.showPosition();
		} catch(CloneNotSupportedException e){
			System.out.println(e.getMessage());
		}
	}
}
```

## Shallow & Deep copy
```java
class Point implements Cloneable{
	private int x, y;
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public void showPosition(){
		System.out.printf("[%d, %d]\n", x, y);
	}
	public void changePosition(int newX, int newY){
		x = newX;
		y = newY;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Rectangle implements Cloneable{
	Point upperLeft, lowerRight;
	public Rectangle(int ulx, int uly, int lrx, int lry){
		upperLeft = new Point(ulx, uly);
		lowerRight = new Point(lrx, lry);
	}
	public void showPosition(){
		System.out.print("upper left:");  upperLeft.showPosition();
		System.out.print("lower right:");  lowerRight.showPosition();
		System.out.println();
	}
	public void changePosition(int x1, int y1, int x2, int y2){
		upperLeft.changePosition(x1, x2);
		lowerRight.changePosition(x2, y2);
	}
	/*shallow copy
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}*/
	/*deep copy*/
	public Object clone() throws CloneNotSupportedException{
		Rectangle cpy = (Rectangle)super.clone();
		cpy.lowerleft = (Point)lowerleft.clone();
		cpy.upperright = (Point)upperright.clone();
		return cpy;
	}
}
public class ShallowDeepCopy {
	public static void main(String[] args){
		Rectangle org = new Rectangle(1, 1, 9, 9);
		Rectangle cpy;
		try{
			cpy = (Rectangle)org.clone();
			org.changePosition(2, 2, 7, 7);
			org.showPosition();
			cpy.showPosition();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}
}
```

## String clone
String does not need deep copy

# Wrapper
java defines wrapper classes

* Boolean
* Character
* Byte
* Integer
* Long
* Float
* Double

## Wrapper Boxing & Unboxing
```java
/*Boxing*/
Integer ival = new Integer(10);
Integer ival2 = 10;
Integer ival3 = Integer.valueOf(10); //static method
Integer ival4 = Integer.valueOf(10);
boolean cond = ival3 == ival4; //true; just like new String("a") == new String("a")

/*Unboxing*/
ival = new Integer(ival.intValue() + 10) 
ival++;
ival2 += 10;
int n = ival;
int n2 = ival + ival2;
```

## Wrapper instance creation
```java
/*1. new Wrapper()*/
Integer n1 = new Integer(10); //instance creation 1
Integer n2 = new Integer(10); //instance creation 2
boolean b = n1==n2; //false;

/*2. static method: Wrapper class instance value cannot be changed just like String class.
New instances can be created and referenced.*/
Integer n1 = Integer.valueOf(10); //instance creation 1
Integer n2 = Integer.valueOf(10); //no instance creation, simply reference first instance
boolean b = n1==n2; //true;
```

## Big N
BigInteger and BigDecimal are immutable, arbitrary-precision numbers.

```java
BigInteger bigInt1 = new BigInteger("1000000000000000000000");
BigInteger bigInt2 = new BigInteger("-999999999999999999999"); 
BigInteger sum = bigInt1.add(bigInt2);

BigDecimal e1 = new BigDecimal("1.6");
BigDecimal e2 = new BigDecimal(".1");
System.out.println(e1.add(e2)); //1.7
System.out.println(e1.multiply(e2)); //.16
/*without quotes it will have round-off errors*/
```

```java
import java.math.BigDecimal;
import java.util.Scanner;

public class AbsoluteNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("type real num1 >> ");
		BigDecimal n1 = sc.nextBigDecimal();
		System.out.print("type real num2 >> ");
		BigDecimal n2 = sc.nextBigDecimal();
		
		BigDecimal sub = n1.subtract(n2);
		System.out.printf("distance = %f\n", dist.doubleValue());
	}
}
```

## Math
```java
/*Math static var & method*/
Math.PI;
Math.sqrt(2);
Math.toDegrees(Math.PI);
Math.sin(radian45);
Math.cos(radian45);
Math.tan(radian45);
Math.log(25);
Math.pow(2,4)
```

## Random
```java
class Random{
	public Random(){ this(System.currentTimeMillis());} //changes seed each time
	
	public boolean nextBoolean(){}
	public int nextInt(){}
	public long nextLong(){}
	public int nextInt(int n){}  // [0, n) int
	public float nextFloat(){} // [0.0, 1.0) float
	public double nextDouble(){} // [0.0, 1.0) double
	public double nextGaussian(){}
}
```

```java
import java.util.Random;
public class RandomNumberGenerator {
	public static void main(String[] args) {
		Random rand = new Random();
		for(int i =0; i<10; i++)
			System.out.println(rand.nextInt(1000));
	}
}
```

### Random(long seed);
```java
Random rand = new Random(long seed);
```
If two instances of Random are created with the same seed, and the same sequence of method calls is made for each, they will generate and return identical sequences of numbers. [read more](https://docs.oracle.com/javase/7/docs/api/java/util/Random.html)

```java
import java.util.Random;
public class RandomNumberGenerator {
	public static void main(String[] args) {
		Random rand = new Random(12);
		for(int i =0; i<10; i++)
			System.out.println(rand.nextInt(1000));
	}
}
```

### Random()
Creates a new random number generator. This constructor sets the seed of the random number generator to a value very likely to be distinct from any other invocation of this constructor.
 
```java
Random rand = new Random(); //this(System.currentTimeMillis()); changes seed each time
//rand.setSeed(System.currentTimeMillis());
//rand.setSeed((long)seed);
```

```java
import java.util.Random;
import java.util.Scanner;
public class RandomAtoB {
	public static void main(String[] args) {
		Random rand = new Random();
		int a =-5;
		int b =10;
		for(int i =0; i<10; i++)
			System.out.println(Math.min(a, b) + rand.nextInt(Math.abs(a-b) + 1));
	}
```

### Math.random()
```java
Math math = new Math();
public static double random(){} //[0.0, 1.0) double
```

```java
public class Random0to10 {
	public static void main(String[] args) {
		for(int i =0; i<5; i++)
			System.out.println((int)(Math.random()*10));
	}
}
```

## Tokenizer
```java
import java.util.StringTokenizer;
public class TokenizeString2 {
	public static void main(String[] args){
		String time = "12:30:50";
		String phone1 = "TEL 1-333-333";
		String phone2 = "TEL 1-333#333@3333";
		String code = "num+=1";
		
		StringTokenizer tk1 = new StringTokenizer(time, ":");
		StringTokenizer tk2 = new StringTokenizer(phone1); //separated by empty space; /t /n /r
		StringTokenizer tk3 = new StringTokenizer(phone2, " -#@");
		StringTokenizer tk4 = new StringTokenizer(code, "+=", true);
		
		while(tk1.hasMoreTokens())
			System.out.println(tk1.nextToken());
	}
}
```

# Generic

## Object Based Class
```java
class Orange{
	int sugar;
	public Orange(int sugar){this.sugar = sugar;}
	public void showSugar(){System.out.println("sugar: " + sugar + "mg");}
}
class FruitBox{
	Object item;
	public void store(Object item){this.item = item;}
	public Object pullOut(){return item;}
}
public class ObjectBasedFruitBox {
	public static void main(String[] args) {
		FruitBox box1 = new FruitBox();
		box1.store(new Orange(10));
		Orange org1 = (Orange)box1.pullOut();
		org1.showSugar();
		
		FruitBox box2 = new FruitBox();
		box2.store("orange2");
		Orange org2 = (Orange)box2.pullOut(); //Error!
		org2.showSugar();
	}
}
```

If Object is changed to Orange in the above, it's easier to find the error. However, it only handles Orange class, not Apple, Mango and Banana Classes.

## Generic class
```java
class Fruit {
	String name;
	public Fruit(String name){this.name = name;}
	public void showFruitInfo(){
		System.out.println("Fruit name: " + name);
	}
}

class Apple extends Fruit{
	int weight;
	public Apple(int weight){
		super("Apple");
		this.weight = weight;
	}
	public void showFruitInfo(){
		super.showFruitInfo();
		System.out.println("Apple weight: " + weight);
	}
}

class Orange extends Fruit{
	int sugar;
	public Orange(int sugar){
		super("Orange");
		this.sugar = sugar;
	}
	public void showFruitInfo(){
		super.showFruitInfo();
		System.out.println("Orange sugar: " + sugar);
	}
}

class FruitBox <T>{
	T item;
	/*public FruitBox(T item){this.item = item;}*/
	public void store(T item){this.item = item;}
	public T pullOut(){return item;}
}

class MultiFruitBox <T, U>{
	T item1;
	U item2;
	/*public MultiFruitBox(T item1, U item2){
		this.item1 = item1;
		this.item2 = item2;
	}*/
	public void storeItem1(T item1){this.item1 = item1;}
	public void storeItem2(U item2){this.item2 = item2;}
	
	public T pullOutItem1(){return item1;}
	public U pullOutItem2(){return item2;}
}

public class GenericBaseFruitBox {
	public static void main(String[] args){
		FruitBox<Orange> orgBox = new FruitBox<Orange>();
		orgBox.store(new Orange(10));
		Orange org = (Orange)orgBox.pullOut();
		org.showFruitInfo();
		
		FruitBox<Apple> aplBox = new FruitBox<Apple>();
		aplBox.store(new Apple(300));
		Apple apl = (Apple)aplBox.pullOut();
		apl.showFruitInfo();
	}
}
```

## Generic method
```java
class AAA{
	public String toString(){return "Class AAA";}
}
class BBB{
	public String toString(){return "Class BBB";}
}

class InstTypeShower{
	public <T> void showInstType(T inst){
		System.out.println(inst);
	}
	public <T,U> void showInstType(T inst1, U inst2){
		System.out.println(inst1);
		System.out.println(inst2);
	}
}
public class IntroGenericMethod {
	public static void main(String[] args){
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		InstTypeShower shower = new InstTypeShower();
		
		shower.<AAA>showInstType(aaa); //shower.showInstType(aaa);
		shower.<BBB>showInstType(bbb); //shower.showInstType(bbb);
		shower.<AAA, BBB>showInstType(aaa, bbb); //shower.showInstType(aaa, bbb);
	}
}
```

## Bounded Type parameter
Inside 'showInstType' method, inst1 and 2 can only be used with Object defined method. i.e. println() can be used since toString method is defined in Object class. To use other method it needs explicit type conversion or restricts generic param type:

```java
interface SimpleInterface{
	public void showYourName();
}

class UpperClass{
	public void showYourAncestor() {System.out.println("Upper class");}
}

class A extends UpperClass implements SimpleInterface{
	public void showYourName() {System.out.println("Class A");}
}
class B extends UpperClass implements SimpleInterface{
	public void showYourName() {System.out.println("Class B");}
}

public class BoundedTypeParam {
	
	/*public static <T> void showInstAncestor(T param){
		((SimpleInterface)param).showYourName();
	}
	public static <T> void showInstName(T param){
		((UpperClass)param).showYourAncestor();
	}*/
	
	public static <T extends SimpleInterface> void showInstAncestor(T param){
		param.showYourName();
	}
	public static <T extends UpperClass> void showInstName(T param){
		param.showYourAncestor();
	}
	
	public static void main(String[] args){
		A a = new A();
		B b = new B();
		
		showInstAncestor(a);
		showInstName(a);
		
		showInstAncestor(b);
		showInstName(b);
	}
}
```

## Generic Array method
```java
public class IntroGenericArray {
	public static <T> void showArray(T[] arr){
		for(T item: arr)
			System.out.println(item);
	}
	public static void main(String[] args) {
		String[] arr = {"first", "second", "thrid"};
		showArray(arr);
	}
}
```

## Generic Wildcard
```java
/*FruitBox<Apple> FruitBox<Orange> parameters cannot be used*/
public void method(FruitBox<Fruit> box){}
```

Use WildCard method:
```java
public class IntroWildCard {
	/*extends*/
	public static void openAndShowFruitBox1(FruitBox<? extends Fruit> box){
		Fruit fruit = box.pullOut();
		fruit.showFruitInfo();
		System.out.println();
	}
	/*super*/
	public static void openAndShowFruitBox2(FruitBox<? super Apple> box){
		Fruit fruit = box.pullOut();
		fruit.showFruitInfo();
		System.out.println();
	}
	public static void openAndShowFruitBox3(FruitBox<?> box){ //(FruitBox<? extends Object> box)
		Fruit fruit = box.pullOut();
		fruit.showFruitInfo();
		System.out.println();
	}
	
	public static void main(String[] args){		
		FruitBox<Apple> aplBox = new FruitBox<Apple>();
		aplBox.store(new Apple(100));
		
		FruitBox<Orange> orgBox = new FruitBox<Orange>();
		orgBox.store(new Orange(300));
		
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		box.store(new Fruit("Unidentified Fruit"));
		
		openAndShowFruitBox1(aplBox);
		openAndShowFruitBox1(orgBox);
		openAndShowFruitBox2(fruitBox);
	}
}
```

## Generic Inheritance
```java
class AAA<T>{  //one variable, T, decides the variable type of two classes
	T itemAAA;
}
class BBB<T> extends AAA<T>{
	T itemBBB;
} 
class CCC extends AAA<T>{ //class CCC doesn't have to be in generic type
	int itemCCC;
}

/*one can also choose T for class AAA<T>{} */
class AAA<T>{
	T itemAAA;
}
class BBB extends AAA<String>{
	int itemBBB;
}
class BBB<T> extends AAA<String>{
	T itemBBB;
}
```

## Generic interface
```java
interface MyInterface<T>{
	public T func(T item);
}
class MyImplement<T> implements MyInterface<T>{
	public T func(T item){
		return item;
	}
}

/*choose T */
interface MyInterface<T>{
	public T func(T item);
}
class MyImplement implements MyInterface<String>{
	public String func(String item){
		return item;
	}
}
```

## Generic restriction
Since primitive data types for T are Not Allowed for generic, use wrapper classes
```java
FruitBox<int> box1 = new FruitBox<int>(); //Error!
FruitBox<double> box2 = new FruitBox<double>(); //Error!
FruitBox<Integer> box3 = new FruitBox<Integer>(); //OK!
```

# Collection
Collection framework interface structures:

* Collection\<E\>
  * Set\<E\>
  * List\<E\>
  * Queue\<E\>
* Map\<K,E\>

## List
1. allows duplicate instance storages
2. instances are stored in order

### ArrayList
```java
public class IntroArrayList {
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.ensureCapacity(500);  //improve performance by ensuring capacity in advance
		
		list.add(new Integer(11));
		list.add(22);
		list.add(22);
		
		list.ensureCapacity(list.size()*2);
		
		for(Integer i : list)
			System.out.println(i);
		
		list.remove(0);
		
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}
```

### LinkedList
```java
class IntroLinkedList {
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(new Integer(11));
		list.add(22);
		list.add(22);
		
		for(Integer i : list)
			System.out.println(i);
		
		list.remove(0);
		
		for(int i = 0; i<list.size(); i++)
			System.out.println(list.get(i));
	}
}
```

### ArrayList vs LinkedList
* insert : ArrayList < LinkedList
* remove : ArrayList < LinkedList
* reference : ArrayList (index) > LinkedList (iterator)

ArrayList is useful when data size determined, whereas LinkedList is useful when data size is not determined.

```java
/*implement LinkedList*/
class Box<T>{
	public Box<T> nextBox;
	T item;
	public Box(){}
	public Box(T item){this.item = item;}
	public void store(T item){this.item = item;}
	public T pullOut(){return item;}
}
public class SimpleLinkedListImpl {
	public static void main(String[] args){
		Box<String> boxHead = new Box<String>();
		boxHead.store("First String");
		
		boxHead.nextBox = new Box<String>("Second String");
		boxHead.nextBox.nextBox = new Box<String>("Third String");
		
		Box<String> tempRef;
		tempRef = boxHead.nextBox;
		System.out.println(tempRef.pullOut());
		
		tempRef = tempRef.nextBox;
		System.out.println(tempRef.pullOut());
	}
}
```

Also check [leet](https://github.com/fggo/leet/blob/master/README.md#2-add-two-numbers) for singly linked list implementation.

## Iterator
iterator is useful since it can reference data regardless of types of collection class
```java
import java.util.Iterator;
import java.util.LinkedList;
public class IteratorUsage {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			String cmp = itr.next();
			if(cmp.compareTo("Second") == 0)
				itr.remove();
		}
		
		itr = list.iterator(); /*using iterator*/
		while(itr.hasNext())
			System.out.println(itr.next());
			
		for(String str : list) /*without using iterator*/
			System.out.println(str);
	}
}
```

### Collection restriction
As was the case for generic, primitive data types for T are Not Allowed for collection: Use wrapper classes.

## HashSet
No specific order that data is stored, No duplicate data.
```java
import java.util.HashSet;
import java.util.Iterator;
public class SetInterfaceFeature {
	public static void main(String[] args){
		HashSet<String> hset = new HashSet<String>();
		for(String s : new String[] {"First", "First", "Second", "Third"})
			hset.add(s);
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
```

### Hashcode & Equality
Hash Algorithm:

1. search for a group with hashCode() value
2. compare with equals(Object obj) inside the group

override two methods to implement your own class :
```java
import java.util.HashSet;
import java.util.Iterator;
class Person{
	String name;
	int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public int hashCode(){return name.hashCode() + age%7;}
	
	public boolean equals(Object obj){
		Person cmp = (Person)obj;
		if(name.compareTo(cmp.name) == 0 && age == cmp.age)
			return true;
		else
			return false;
	}
	public String toString(){return name;}
}

public class HashSetEquality {
	public static void main(String[] args){
		HashSet<Person> hset = new HashSet<Person>();
		for(int i : new int[]{1,2,2})
			hset.add(new Person(new Character((char)(i+64)).toString(), i));
		
		System.out.println("hash set size: " + hset.size());
		
		Iterator<Person> itr = hset.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
```

## TreeSet
Integer Data is stored in ascending order. But this does not apply when Data is of type \<T\>
```java
import java.util.TreeSet;
import java.util.Iterator;

public class SortTreeSet {
	public static void main(String[] args){
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(1);
		tree.add(2);
		tree.add(4);
		tree.add(3);
		tree.add(2);
		
		System.out.println("tree data size: " + tree.size()); //4
		
		Iterator<Integer> itr = tree.iterator();
		while(itr.hasNext())
			System.out.println(itr.next()); //tree stores data in ascending order: {1, 2, 3, 4}
	}
```

### TreeSet Comparable
Set rules for comparing data in TreeSet to order in ascending/descending
```java
/* inst.compareTo(param); returns +1 0 -1 when inst >=< param */
interface Comparable<T>{
	int compareTo(T obj);
}
```

```java
import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void showData(){
		System.out.printf("%s %d\n", name, age);
	}
	public int compareTo(Person obj){
		if(age > obj.age) 
			return +1;
		else if(age < obj.age)
			return -1;
		else
			return 0;
	}
	public String toString(){
		return name + " " + age;
	}
}
public class ComparablePerson {
	public static void main(String[] args) {
		TreeSet<Person> tree = new TreeSet<Person>();
		tree.add(new Person("b", 5));
		tree.add(new Person("a", 10));
		tree.add(new Person("c", 7));
		
		Iterator<Person> itr = tree.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
```

```java
import java.util.Iterator;
import java.util.TreeSet;

class MyString implements Comparable<MyString>{
	String str;
	public MyString(String str){this.str = str;}
	public int getLength(){return str.length();}
	public int compareTo(MyString obj){
		if(str.length() > obj.getLength())
			return +1;
		else if(str.length() < obj.getLength())
			return -1;
		else
			return 0;
	}
	public String toString(){return str;}
}
public class ComparableMyString {
	public static void main(String[] args) {
		TreeSet<MyString> sTree = new TreeSet<MyString>();
		sTree.add(new MyString("Orange"));
		sTree.add(new MyString("Melon"));
		sTree.add(new MyString("Blueberry"));
		
		Iterator<MyString> itr = sTree.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
```

### TreeSet Comparator
```java
interface Comparator<T>{
	int compare(T obj1, T obj2);
	boolean equals(Object obj);
}
```

```java
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StrLenComparator implements Comparator<String>{
	public int compare(String s1, String s2){
		return s1.length() - s2.length();
	}
}

public class IntroComparator {
	public static void main(String[] args) {
		TreeSet<String> sTree = new TreeSet<String>(new StrLenComparator());
		sTree.add("Orange");
		sTree.add("Apple");
		sTree.add("Kiwi");
		sTree.add("GrapeFruit");
		
		Iterator<String> itr = sTree.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
```

### Descending Iterator
```java
public class IntroComparator {
	public static void main(String[] args) {
		Iterator<String> itr = sTree.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
```

## HashMap
1. No duplicate key
2. Different values for a key
3. Hash algorithm applies

```java
import java.util.HashMap;
public class IntroHashMap {
	public static void main(String[] args){
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(new Integer(3), "bbobobofofofo");
		hmap.put(new Integer(8), "frararararara");
		hmap.put(new Integer(5), "quququzuuquz");
		
		System.out.println(hmap.get(3));
		System.out.println(hmap.get(5));
		System.out.println(hmap.get(8));
		
		hmap.remove(5);
		System.out.println(hmap.get(5));
	}
}
```

## TreeMap
```java
import java.util.NavigableSet;
import java.util.TreeMap;
public class IntroTreeMap {
	public static void main(String[] args){
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(1, "data1");
		tmap.put(5, "data5");
		tmap.put(2, "data2");
		tmap.put(4, "data4");
		tmap.put(3, "data3");
		
		NavigableSet<Integer> navi = tmap.navigableKeySet();
		
		Iterator<Integer> itr = navi.iterator();
		System.out.println("Ascending order...");
		while(itr.hasNext())
			System.out.println(tmap.get(itr.next()));
		
		itr = navi.descendingIterator();
		System.out.println("Descending order...");
		while(itr.hasNext())
			System.out.println(tmap.get(itr.next()));
	}
}
```

# Thread
Process: a running program with allocated memory. e.g. main method process.

* start() allocate memory to thread and run()
* thread shares CPU; multi-thread in one process

```java
class ShowThread extends Thread{
	public ShowThread(String name){setName(name);}
	public void run(){
		for(int i=0; i<100; i++){
			System.out.println("Thread " + getName());
			try{
				sleep(100); //pause .001*100
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
public class ThreadUnderstand {
	public static void main(String[] args) {
		ShowThread t1 = new ShowThread("Th-0");
		ShowThread t2 = new ShowThread("Th-1");
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("main thread ends");
	}
}
```

## ThreadClass extends AnotherClass implements Runnable
```java
class Sum{
	int num;
	public Sum(){num = 0;}
	public void addNum(int n){num+=n;}
	public int getNum(){return num;}
}
class AdderThread extends Sum implements Runnable{
	int start, end;
	public AdderThread(int s, int e){
		start = s;
		end = e;
	}
	public void run(){
		for(int i =start; i<=end; i++)
			addNum(i);
	}
}
public class RunnableThread {
	public static void main(String[] args) {
		AdderThread at1 = new AdderThread(1, 50);
		AdderThread at2 = new AdderThread(51, 100);
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		t1.start();
		t2.start();
		try{
			t1.join(); //pause until t1 thread terminates
			t2.join();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("1~100 sum: " + (at1.getNum() +at2.getNum()));
	}
}
```

Using Thread Class:
```java
class SumThread extends Thread{
	int sum;
	int start, end;
	public SumThread(int s, int e){
		sum = 0;
		start =s;
		end =e;
	}
	public void run(){
		for(int i=start; i<= end; i++)
			addNum(i);
	}
	public void addNum(int n){sum+=n;}
	public int getSum(){return sum;}
}
public class Sum1To100 {
	public static void main(String[] args){
		SumThread t1 = new SumThread(1, 50);
		SumThread t2 = new SumThread(51, 100);
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("1~100 Sum = " + (t1.getSum() + t2.getSum()));
	}
}
```

Without join(), main thread will execute println() before t1 and t2 threads ends, resulting in a smaller sum.

* [sleep](https://docs.oracle.com/javase/tutorial/essential/concurrency/sleep.html)
* [join](https://docs.oracle.com/javase/tutorial/essential/concurrency/join.html)

## Thread priority
```java
class MessageSendingThread extends Thread{
	String message;
	public MessageSendingThread(String message, int prio){
		this.message = message;
		setPriority(prio);
	}
	public void run(){
		for(int i =0; i<1000000;i ++){
			System.out.println(message + "(" + getPriority()+")");
			try{
				sleep(1); //suspend executing current thread, make CPU available to lower priority threads
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
public class PriorityTest {
	public static void main(String[] args) {
		MessageSendingThread t1 = new MessageSendingThread("AAA",Thread.MAX_PRIORITY);
		MessageSendingThread t2 = new MessageSendingThread("BBB",Thread.NORM_PRIORITY);
		MessageSendingThread t3 = new MessageSendingThread("CCC",Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}
```

## Thread Lifecycle
* New
* Runnable (start)
* Blocked (sleep, join)
* Dead (after run)

## Thread memory model
* Method: method (bytecode), static var
* Stack: local var, ref var, param
* Heap: inst, gc

New threads with new stack, share method and heap(instance address) in JVM memory. Multiple threads can approach the same instance variable, using instance address in Heap area.

```java
class Sum{
	int num;
	public Sum(){num = 0;}
	public void addNum(int n){num += n;}
	public int getNum(){return num;}
}
class AdderThread extends Thread{
	Sum sumInst;
	int start, end;
	public AdderThread(Sum sum, int s, int e){
		sumInst = sum;
		start =s;
		end =e;
	}
	public void run(){
		for(int i =start; i<=end; i++)
			sumInst.addNum(i);
	}
}
public class ThreadHeapMultiAccess {
	public static void main(String[] args) {
		Sum sInst = new Sum();
		AdderThread t1 = new AdderThread(sInst, 1, 50);
		AdderThread t2 = new AdderThread(sInst, 51, 100);
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("1~100 Sum = " + sInst.getNum());
	}
}
```

## Synchronization
When multiple threads approach one instance (or variable), synchronization is required to prevent thread interference. Check if a class is thread-safe(sync) before using it. e.g. StringBuffer is thread-safe. 

### Sync Error
```java
class Increment{
	int num;
	public void increment(){num++;} //sync is required
	public int getNum(){return num;}
}
class IncThread extends Thread{
	Increment inc;
	public IncThread(Increment inc){this.inc = inc;}
	public void run(){
		for(int i=0; i<10000; i++)
			for(int j =0; j<10000; j++)
				inc.increment();
	}
}
public class ThreadSyncError {
	public static void main(String[] args) {
		Increment inc = new Increment();
		IncThread t1 = new IncThread(inc);
		IncThread t2 = new IncThread(inc);
		IncThread t3 = new IncThread(inc);
		t1.start();
		t2.start();
		t3.start();
		try{
			t1.join();
			t2.join();
			t3.join();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(inc.getNum()); //result is less than 300 million
	}
}

```java
class Calculator{
	int opCnt = 0;
	public int add(int n1, int n2){
		opCnt++; //sync is required
		return n1+n2;
	}
	public int min(int n1, int n2){
		opCnt++; //sync is required
		return n1-n2;
	}
	public void showOpCnt(){
		System.out.println("operation count: " + opCnt);
	}
}
class AddThread extends Thread{
	Calculator cal;
	public AddThread(Calculator cal){this.cal = cal;}
	public void run(){
		System.out.println("1+2 = " + cal.add(1, 2));
		System.out.println("2+4 = " + cal.add(2, 4));
	}
}
class MinThread extends Thread{
	Calculator cal;
	public MinThread(Calculator cal){this.cal = cal;}
	public void run(){
		System.out.println("2-1 = " + cal.min(2, 1));
		System.out.println("4-2 = " + cal.min(4, 2));
	}
}
public class ThreadSyncMethod {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		AddThread t1 = new AddThread(cal);
		MinThread t2 = new MinThread(cal);
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		cal.showOpCnt(); //opCnt varies every time it compiles since it was not synchronized
	}
}
```

## Sync prevents thread interference

### Sync method 1
```java
public synchronized int add(int n1, int n2){
	opCnt++;
	return n1+n2;
}
```

### Sync method 2
```java
public int add(int n1, int n2){
	synchronized(this){
		opCnt++;
	}
	return n1+n2;
}
```

### Sync method 3
```java
class IHaveTwoNum{
	int num1 = 0, num2 = 0;
	//Create key. IHaveTwoNum instance (this) also has a key.
	Object key = new Object();
	
	/*num1 is synchronized with default key, while num2 is synchronized with new 'key' Object.
		One can also create two keys, e.g. key1, key2 Objects*/
	public void addOneNum1(){
		synchronized(this){
			num1+=1;
		}
	}
	public void addTwoNum1(){
		synchronized(this){
			num1+=2;
		}
	}
	public void addOneNum2(){
		synchronized(key){
			num2+=1;
		}
	}
	public void addTwoNum2(){
		synchronized(key){
			num2+=2;
		}
	}
	public void showAllNums(){
		System.out.printf("[num1, num2] = [%d, %d]\n", num1, num2);
	}
}
class AccessThread extends Thread{
	IHaveTwoNum twoNumInst;
	public AccessThread(IHaveTwoNum twoNumInst){
		this.twoNumInst = twoNumInst;
	}
	public void run(){
		twoNumInst.addOneNum1();
		twoNumInst.addTwoNum1();
		twoNumInst.addOneNum2();
		twoNumInst.addTwoNum2();
	}
}
public class SyncObjectKey {
	public static void main(String[] args) {
		IHaveTwoNum twoNumInst = new IHaveTwoNum();
		AccessThread t1 = new AccessThread(twoNumInst);
		AccessThread t2 = new AccessThread(twoNumInst);
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		twoNumInst.showAllNums();
	}
}
```

## Sync controls thread order
```java
class NewsPaper{
	String todayNews;
	public void setTodayNews(String todayNews){
		this.todayNews = todayNews;
	}
	public String getTodayNews(){
		return todayNews;
	}
}
class NewsWriter extends Thread{
	NewsPaper paper;
	public NewsWriter(NewsPaper paper){
		this.paper = paper;
	}
	public void run(){
		paper.setTodayNews("Java News!");
	}
}
class NewsReader extends Thread{
	NewsPaper paper;
	public NewsReader(NewsPaper paper){
		this.paper = paper;
	}
	public void run(){
		System.out.println("Today's News: " + paper.getTodayNews());
	}
}

public class NewsPaperStory {
	public static void main(String[] args) {
		NewsPaper paper = new NewsPaper();
		NewsWriter writer = new NewsWriter(paper);
		NewsReader reader1 = new NewsReader(paper);
		NewsReader reader2 = new NewsReader(paper);
		
		reader1.start(); // error since 'null' newspaper is calling getTodayNews()
		reader2.start(); // error
		writer.start();
		
		try{
			reader1.join();
			reader2.join();
			writer.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
```

## wait notify notifyAll
Sync can control order of threads(writer, reader) regardless of the code line order
```java
public final void wait() throws InterruptedException  /*a thread wait until another thread notify*/
public final void notify() /*wake a thread*/
public final void notifyAll() /*wake all thread*/ 
```

wait() notify() notifyAll() also need sync

```java
class NewsPaper{
	String todayNews;
	boolean isTodayNews = false;
	public void setTodayNews(String todayNews){
		this.todayNews = todayNews;
		isTodayNews = true;
		synchronized(this){
			notifyAll(); 
		}
	}
	public String getTodayNews(){
		if(isTodayNews == false){
			try{
				synchronized(this){
					wait();
				}
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		return todayNews;
	}
}
class NewsWriter extends Thread{ /*same as previous*/ }
class NewsReader extends Thread{ /*same as previous*/ }
public class NewsPaperStory {
	public static void main(String[] args) {
		/*same as previous*/
	}
}
```
Both reader1 and reader2 threads execute wait() in order. One thread can execute wait() while another thread has already executed wait() because wait() unlocks even sync block.

## wait notify notifyAll - Example
```java
import java.util.Scanner;

class IntegerComm{
	int num = 0;
	boolean isNewNum = false;
	public void setNum(int n){
		synchronized (this) {
			if(isNewNum == true){
				try{
					wait();
				} catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			this.num = n;
			isNewNum = true;
			notify();
		}
	}
	public int getNum(){
		int retNum = 0;
		synchronized (this) {
			if(isNewNum == false){
				try{
					wait();
				} catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			retNum = num;
			isNewNum = false;
			notify();
		}
		return retNum;
	}
}
class IntegerSum extends Thread{
	int sum = 0;
	IntegerComm comm = new IntegerComm();
	public IntegerSum(IntegerComm comm){
		this.comm = comm;
	}
	public int getSum(){
		return sum;
	}
	public void run(){
		for(int i =0;i <5; i++){
			sum += comm.getNum();
		}
	}
}
public class SumThreadTest{
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		IntegerComm comm = new IntegerComm();
		IntegerSum sum = new IntegerSum(comm);
		sum.start();
		for(int i =0;i<5; i++){
			System.out.printf("Type integer %d > ", (i+1));
			comm.setNum(sc.nextInt());
		}
		try{
			sum.join();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Sum of five integers = " + sum.getSum());
	}
}
```

## ReentrantLock - another way of sync
```java
private final ReentrantLock key = new ReentrantLock();
key.lock();
try{
	/*code*/
}
finally{
	key.unlock();
}
```

```java
import java.util.concurrent.locks.ReentrantLock;

class IHaveTwoNum{
	int num1 = 0;
	int num2 = 0;
	public void addOneNum1(){
		key1.lock();
		try{
			num1 += 1;
		}
		finally{
			key1.unlock();
		}
	}
	public void addTwoNum1(){
		key1.lock();
		try{
			num1+=2;
		}
		finally{
			key1.unlock();
		}
	}
	public void addOneNum2(){
		key2.lock();
		try{
			num2+=1;
		}
		finally{
			key2.unlock();
		}
	}
	public void addTwoNum2(){
		key2.lock();
		try{
			num2+=2;
		}
		finally{
			key2.unlock();
		}
	}
	public void showAllNums(){
		System.out.printf("[num1, num2] = [%d, %d]\n", num1, num2);
	}
	/* key lock and unlock prevents another thread from entering */
	private final ReentrantLock key1 = new ReentrantLock();
	private final ReentrantLock key2 = new ReentrantLock();
}
class AccessThread extends Thread{
	IHaveTwoNum twoNumInst;
	public AccessThread(IHaveTwoNum inst){
		twoNumInst = inst;
	}
	public void run(){
		twoNumInst.addOneNum1();
		twoNumInst.addTwoNum1();
		twoNumInst.addOneNum2();
		twoNumInst.addTwoNum2();
	}
}
public class UseReentrantLock {
	public static void main(String[] args) {
		IHaveTwoNum twoNumInst = new IHaveTwoNum();
		AccessThread t1 = new AccessThread(twoNumInst);
		AccessThread t2 = new AccessThread(twoNumInst);
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		twoNumInst.showAllNums();
	}
}
```

## await signal signalAll
ReentrantLock instance calls newCondition() to return Condition instance, which has methods await() signal() signalAll() They are similar to wait() notify() notifyAll(). 
Example: A thread gets string input, while another thread outputs the string. Also create a class where two threads exchange string.
```java
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class StringComm{
	String newString;
	boolean isNewString = false;
	private final ReentrantLock entLock = new ReentrantLock();
	private final Condition readCond = entLock.newCondition();
	private final Condition writeCond = entLock.newCondition();
	public void setNewString(String newStr){
		entLock.lock();
		try{
			if(isNewString == true)
				writeCond.await();
			newString = newStr;
			isNewString = true;
			readCond.signal();
		} catch(InterruptedException e){
			e.printStackTrace();
		} finally{
			entLock.unlock();
		}
	}
	public String getNewString(){
		String retString = null;
		entLock.lock();
		try{
			if(isNewString == false)
				readCond.await();
			retString = newString;
			isNewString = false;
			writeCond.signal();
		} catch(InterruptedException e){
			e.printStackTrace();
		} finally{
			entLock.unlock();
		}
		return retString;
	}
}
class StringReader extends Thread{
	StringComm comm;
	public StringReader(StringComm comm){
		this.comm = comm;
	}
	public void run(){
		for(int i =0;i<5; i++)
			System.out.printf("Output > %s\n",comm.getNewString());
	}
}
class StringWriter extends Thread{
	StringComm comm;
	public StringWriter(StringComm comm){
		this.comm = comm;
	}
	public void run(){
		Scanner sc = new Scanner(System.in);
		String userInput = null;
		for(int i =0;i<5; i++){
			userInput = sc.nextLine();
			comm.setNewString(userInput);
		}
	}
}
public class ConditionSyncStringReadWrite {
	public static void main(String[] args) {
		StringComm comm = new StringComm();
		StringReader reader = new StringReader(comm);
		StringWriter writer = new StringWriter(comm);
		System.out.println("Input Five Strings...");
		reader.start();
		writer.start();
		try{
			reader.join();
			writer.join();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Done.");
	}
}
```

# File IO

## InputStream
Create Stream using InputStream instance
```java
InputStream in = new FileInputStream("run.exe");

/*read and return 1-byte data. return -1 if no data to read*/
public abstract int read() throws IOException
public void close() throws IOException
```

## OutputStream
```java
OutputStream out = new FileOutputStream("run.exe");

public abstract void write() throws IOException
public void close() throws IOException
```
<br/>

## Bytes File copy 
ByteFileCopy.java
```java
import java.io.*;

public class ByteFileCopy {
	public static void main(String[] args) throws IOException{
		InputStream in = new FileInputStream("org.bin");
		OutputStream out = new FileOutputStream("cpy.bin");
		
		int copyByte = 0;
		int bData;
		
		while(true){
			bData = in.read();
			
			if (bData == -1)
				break;
			out.write(bData);
			copyByte++;
		}
		in.close();
		out.close();
		System.out.print("copied byte = " + copyByte);
	}
}

```
<br/>

BufferFileCopy.java
```java
import java.io.*;

public class BufferFileCopy {
	public static void main(String[] args) throws IOException{
		InputStream in = new FileInputStream("org.bin");
		OutputStream out = new FileOutputStream("cpy.bin");
		
		int copyByte = 0;
		int readLen;
		byte[] buf = new byte[1024];
		
		while(true){
			readLen = in.read(buf);
			if (readLen == -1)
				break;
			out.write(buf, 0, readLen);
			copyByte += readLen;
		}
		
		in.close();
		out.close();
		System.out.print("copied byte : " + copyByte);
	}
}
```

## FilterStream
```java
import java.io.*;

public class DataFilterStream {
	public static void main(String[] args) throws IOException{
		OutputStream out = new FileOutputStream("data.bin");
		DataOutputStream filterOut = new DataOutputStream(out);
		filterOut.writeInt(275);
		filterOut.writeDouble(3.1415);
		filterOut.close();
		
		InputStream in = new FileInputStream("data.bin");
		DataInputStream filterIn = new DataInputStream(in);
		int num1 = filterIn.readInt();
		double num2 = filterIn.readDouble();
		filterIn.close();
		
		System.out.printf("%d  %f", num1, num2);
	}
}
```

## BufferedStream
BufferedInputStream & BufferedOutputStream provide buffer as implemented in BufferFileCopy.java<br/>
you can set buffer size.<br/>
```java
public BufferedInputStream(InputStream in, int size)
public BufferedOutputStream(OutputStream out, int size)

public int read() throws IOException
public int read(byte[] b, int off, int len) throws IOException
/*Reads bytes from this byte-input stream into the specified byte array, starting at offset. */
```

ByteBufferedFileCopy.java
```java
import java.io.*;

public class ByteBufferedFileCopy {
	public static void main(String[] args) throws IOException{
		InputStream in = new FileInputStream("org.bin");
		OutputStream out = new FileOutputStream("cpy.bin");
		
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		int copyByte = 0;
		int bData;
		
		while(true){
			bData = bin.read();
			if (bData == -1)
				break;
			bout.write(bData);
			copyByte++;
		}
		
		bin.close();
		bout.close();
		System.out.println("copied byte : " + copyByte);
	}
}
```

## Buffer flush
once buffer is full, it sends buffered data to outputstream and writes to a file
```java
public void flush() throws IOException
```

## Filter + Buffered Stream
Performance test

1. FileOutputStream + BufferedOutputStream + DataOutputStream
2. FileOutputStream + DataOutputStream
```java
import java.io.*;

public class DataBufferFilterPerformance {
	public static void performanceTest(DataOutputStream dataOut) throws IOException{
		long startTime = System.currentTimeMillis();
		for(int i =0;i<5000; i++)
			for(int j =0; j<10000; j++)
				dataOut.writeDouble(12.345);
		
		dataOut.flush();
		long endTime = System.currentTimeMillis();
		
		System.out.println("time lapse: " + (endTime - startTime));
	}
	
	public static void main(String[] args) throws IOException{
		OutputStream out1 = new FileOutputStream("data1.bin");
		/*BufferedOutputStream bufFilterOut = new BufferedOutputStream(out);*/
		DataOutputStream dataOut = new DataOutputStream(out1);
		performanceTest(dataOut);
		dataOut.close();
		
		OutputStream out2 = new FileOutputStream("data2.bin");
		BufferedOutputStream bufFilterOut = new BufferedOutputStream(out2, 1024*10);
		DataOutputStream dataBufOut = new DataOutputStream(bufFilterOut);
		performanceTest(dataBufOut);
		dataBufOut.close();
	}
}
```

PrintStream
```java
public static final PrintStream out;
```
Example:
```java
import java.io.*;

class MyInfo{
	String info;
	public MyInfo(String info){
		this.info = info;
	}
	public String toString(){return info;}
}

public class PrintStreamToFile {
	public static void main(String[] args) throws IOException{
		OutputStream out = new FileOutputStream("println.txt");
		PrintStream pntOut = new PrintStream(out);
		
		MyInfo info = new MyInfo("I'm a student");
		pntOut.println("let me introduce myself");
		pntOut.println(info);
		pntOut.printf("age: %d  weight: %d", 100, 300);
		pntOut.close();
	}
}
```

## Byte vs Char Stream
Byte Stream cannot store char.<br/>
Encoding(char to number) differs for each OS.<br/>
Example:
```java
public static void main(Strin[] args) throws IOException{
	OutputStream out = new FileOutputStream("encoding.txt");
	out.write(65); //'A'
	out.write(66); //'B'
	out.close();
}
```
java provides Stream that outputs char based on OS.

## FileReader FileWriter
for character output and input<br/>
```java
/*FileReader method*/
public int read() throws IOException
public abstract int read(char[] cbuf, int off, int len) throws IOException

/*FileWriter method*/
public void write() throws IOException
public abstract void write(char[] cbuf, int off, int len) throws IOException
```

Linux encodes character(2-byte) to 1-byte. Following example outputs 3-byte size file.
```java
import java.io.*;
public class FileWriterStream {
	public static void main(String[] args) throws IOException{
		char ch1 = 'A';
		char ch2 = 'B';
		
		Writer out = new FileWriter("encoding.txt");
		out.write(ch1);
		out.write(ch2);
		out.write('\n');
		out.close();
	}
}
```

Reader will returns 6 bytes of char(compare to 3 bytes by Writer)
```java
import java.io.*;

public class FileReaderStream {
	public static void main(String[] args) throws IOException{
		char[] cbuf = new char[10];
		int readCnt;
		
		Reader in = new FileReader("encoding.txt");
		/*read (cbuf.legnth - off) characters and stores in char[] cbuf*/
		readCnt = in.read(cbuf, 0, cbuf.length);
		
		for(int i =0;i < readCnt; i++)
			System.out.println(cbuf[i]);
		
		in.close();
	}
}
```


## BufferedReader BufferedWriter

```java
/*BufferedReader*/
public String readLine() throws IOException

/*BufferedWriter*/
public void write(String str) throws IOException
```
Example:
```java
import java.io.*;

public class StringWriterReader {
	public static void main(String[] args) throws IOException{
		BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
		out.write("line number one"); out.newLine();
		out.write("line number two"); out.newLine();
		out.write("line number three"); out.newLine();
		out.close();
		
		BufferedReader in = new BufferedReader(new FileReader("String.txt"));
		String str;
		while(true){
			str = in.readLine();
			if(str == null)
				break;
			System.out.println(str);
		}
		in.close();
	}
}
```

## PrintWriter PrintReader (FilterStream)
```java
import java.io.*;

public class PrintWriterStream {
	public static void main(String[] args) throws IOException{
		PrintWriter out = new PrintWriter(new FileWriter("printf.txt"));
		out.printf("age : %d years old", 100);
		out.println();
		
		out.print("learn Input Output stream\n");
		out.close();
	}
}
```

Example with BufferedWriter
```java
import java.io.*;

public class BufferedPrintWriter {
	public static void main(String[] args) throws IOException{
		/*write*/
		FileWriter fout = new FileWriter("printf.txt");
		PrintWriter out = new PrintWriter(new BufferedWriter(fout));
		
		out.printf("age : %d years old", 100);
		out.println();
		
		out.print("learn Input Output stream\n");
		out.close();
		
		/*read*/
		BufferedReader in = new BufferedReader(new FileReader("printf.txt"));
		String str;
		
		while(true){
			str = in.readLine();
			if(str == null)
				break;
			System.out.println(str);
		}
		in.close();
	}
}
```

## ObjectStream

## Serializable
To use the following method, a class has to implement java.io.Serializable<br/>
Serializable does not have class method.
```java
public final void writeObject(Object obj) throws IOException
public final Object readObject() throws IOException, ClassNotFoundException
```

Example:
```java
import java.io.*;

class Point implements Serializable{
	int xpos, ypos;
	
	public Point(int x, int y){
		xpos = x;
		ypos = y;
	}
}
class Circle implements Serializable{
	Point center;
	double radius;
	
	public Circle(int x, int y, double r){
		center = new Point(x, y);
		radius = r;
	}
	
	public void showCircleInfo(){
		System.out.printf("[%d, %d]\n", center.xpos, center.ypos);
		System.out.printf("radius = %f\n", radius);
	}
}

public class ObjectSerializable {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.ser"));
		
		out.writeObject(new Circle(1, 1, 3.4));
		out.writeObject(new Circle(2, 2, 5.5));
		out.writeObject(new String("String class implements Serializable!"));
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object.ser"));
		Circle c1 = (Circle)in.readObject();
		Circle c2 = (Circle)in.readObject();
		String message = (String)in.readObject();
		in.close();
		
		c1.showCircleInfo();
		c2.showCircleInfo();
		System.out.print(message);
	}
}
```


## transient
no serialization!
```java
import java.io.*;

class PersonalInfo implements Serializable{
	String name;
	transient String secretInfo;
	int age;
	transient int secretNum;
	
	public PersonalInfo(String name, String sInfo, int age, int sNum){
		this.name = name;
		secretInfo = sInfo;
		this.age = age;
		secretNum = sNum;
	}
	public void showPersonalInfo(){
		System.out.println("name: " + name);
		System.out.println("secret info: " + secretInfo);
		System.out.println("age: " + age);
		System.out.println("secret num: " + secretNum);
		System.out.println();
	}
}

public class TransientMembers {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Personal.ser"));
		PersonalInfo info = new PersonalInfo("John", "Doe", 7, 666);
		info.showPersonalInfo();
		out.writeObject(info);
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Personal.ser"));
		PersonalInfo recovInfo = (PersonalInfo)in.readObject();
		in.close();
		
		recovInfo.showPersonalInfo();
	}
}
```

## RandomAccessFile
* IO at the same time
* IO location changeable
* File only Stream
```java
/*in*/
public int read() throws IOException
public int read(byte[] b, int off, int len) throws IOException
public final int readInt() throws IOException
public final double readDouble() throws IOException

/*out*/
public void write(int b) throws IOException
public void write(byte[] b, int off, int len) throws IOException
public final void writeInt(int v) throws IOException
public final void writeDouble(double v) throws IOException

/*change loc*/
public long getFilePointer() throws IOException
public void seek(long pos) throws IOException

/*constructor*/
public RandomAccessFile(String name, String mode) throws FileNotFoundException

mode:
"r" read
"rw" read and write
```

Example:
```java
import java.io.*;

public class RandomFileReadWrite {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("data.bin", "rw");
		System.out.println("Write.....");
		System.out.printf("current IO loc : %d byte\n", raf.getFilePointer());
		
		raf.writeInt(200);
		raf.writeInt(500);
		System.out.printf("current IO loc : %d byte\n", raf.getFilePointer());
		
		raf.writeDouble(33.2323);
		raf.writeDouble(3.1415);
		System.out.printf("current IO loc : %d byte\n", raf.getFilePointer());
		
		
		System.out.println("Read.....");
		raf.seek(0); //to front
		/*raf.seek(raf.length() - 8);*/ // to end
		System.out.printf("current IO loc : %d byte\n", raf.getFilePointer());
		
		System.out.println(raf.readInt());
		System.out.println(raf.readInt());
		System.out.printf("current IO loc : %d byte\n", raf.getFilePointer());
		
		System.out.println(raf.readDouble());
		System.out.println(raf.readDouble());
		System.out.printf("current IO loc : %d byte\n", raf.getFilePointer());
		raf.close();
	}
}
```


## File
* create and remove dir
* remove file
* print file name in dir

```java
public boolean mkdir()
public boolean mkdirs()
public boolean renameTo(File dest)

	/*make dir*/
	File myDir = new File("/home/username/JavaDirOne/JavaDirTwo");
	myDir.mkdirs(); 
	
	/*move a file*/
	File myFile = new File("/home/username/JavaOne/my.bin");
	File reFile = new File("/home/username/JavaTwo/my.bin");
	myFile.renameTo(reFile); 
```

File Seperator : OS independent
```java
String path = File.seperator + "home" + File.seperator + "username" + File.seperator; 
```

## Relative Path
Move file using relative path:
```java
import java.io.*;

public class FileMove {
	public static void main(String[] args) throws IOException{
		File myFile = new File("MyJava/my.bin");
		
		if(myFile.exists() == false){
			System.out.println("Non existent file!");
			return;
		}
		
		/*relative path*/
		File reDir = new File("YourJava"); 
		reDir.mkdir();
		File reFile = new File(reDir, "my.bin");
		myFile.renameTo(reFile);
		
		if(reFile.exists() == true)
			System.out.println("Moving File Success!");
		else
			System.out.println("Moving File Failure!");
			
		/*absolute path*/
		System.out.println(myFile.getAbsolutePath());
		System.out.println(reFile.getAbsolutePath());
	}
}
```

List files:
```java
import java.io.*;

public class ListFileDirectory {
	public static void main(String[] args) throws IOException{
		File myDir = new File("MyJava");
		File[] list = myDir.listFiles();
		
		for(int i =0; i<list.length; i++){
			System.out.print(list[i].getName());
			if(list[i].isDirectory())
				System.out.println("\t\t DIR");
			else
				System.out.println("\t\t FILE");
		}
	}
}
```

System.getProperty(key)
```java
key: 
	os.name
	java.home /*java installed dir*/
	user.dir /*current dir*/
	java.version /*JRE ver*/
```

Parent Dir:
```java
import java.io.*;

public class CurrentUpperDir {
	public static void showDirList(File[] list){
		for(int i =0; i<list.length; i++){
			System.out.print(list[i].getName());
			if(list[i].isDirectory())
				System.out.println("\t\t DIR");
			else
				System.out.println("\t\t FILE");
		}
	}
	public static void main(String[] args) throws IOException{
		String workingDir = System.getProperty("user.dir");
		File currentDir = new File(workingDir);
		System.out.println("current dir full path: " + workingDir);
		System.out.println("current dir name: " + currentDir.getName());
		showDirList(currentDir.listFiles());
		
		File upperDir = currentDir.getParentFile();
		System.out.println("\n\nupper dir name: " + upperDir.getName());
		showDirList(upperDir.listFiles());
		
	}
}
```

File Validation :
```java
public FileInputStream(File file) throws FileNotFoundException
public FileOutputStream(File file) throws FileNotFoundException
public FileReader(File file) throws FileNotFoundException
public FileWriter(File file) throws IOException


Example:
File = inFile = new File("data.bin");
if (inFile.exists() == false){
	/*handling*/
}
InputStream in = new FileInputStream(inFile);

```

# Swing
* AWT
* Swing
* SWT
* Flex

[The Swing Tutorial](http://java.sun.com/docs/books/tutorial/uiswing)

```java
import java.awt.*;
import javax.swing.*;

public class FirstSwing {
	public static void main(String[] args) {
		JFrame frm = new JFrame("First Swing");
		frm.setBounds(120, 120, 400, 100);
		frm.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("My Button");
		JButton btn2 = new JButton("Your Button");
		JButton btn3 = new JButton("Our Button");
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
}
```

## AWT
```java
import java.awt.*;
import java.awt.event.*;

public class FirstAWTExitEvent {
	public static void main(String[] args) {
		Frame frm = new Frame("First Swing");
		frm.setBounds(120, 120, 400,400);
		frm.setLayout(new FlowLayout());
		
		WindowListener listener = new WindowAdapter(){
			public void windowClosing(WindowEvent ev){
				System.exit(0);
			}
		};
		frm.addWindowListener(listener);
		
		Button btn1 = new Button("My Button");
		Button btn2 = new Button("Your Button");
		Button btn3 = new Button("Our Button");
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
}
```

## Exit value
```java
import java.io.IOException;

public class RunningProcess {
	public static void main(String[] args) throws IOException, InterruptedException{
		Process proc = Runtime.getRuntime().exec("java FirstAWTExitEvent");
		proc.waitFor();
		
		if (proc.exitValue() == 0)
			System.out.println("Terminated Normally");
		else
			System.out.println("Problem occurred during termination!");
	}
}
```

## EventHandler
```java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEventHandler implements MouseListener{

	public void mouseClicked(MouseEvent e) {
		JButton btn = (JButton)e.getComponent();
		btn.setText("Clicked");
		System.out.println("Clicked Button" + e.getButton());
		System.out.println("Mouse clicked and released");
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}	
}

public class EventHandler {
	public static void main(String[] args) {
		JFrame frm = new JFrame("First Swing");
		frm.setBounds(120,120,400,100);
		frm.setLayout(new FlowLayout());
		
		MouseListener listener = new MouseEventHandler();
		
		JButton btn1 = new JButton("My Button");
		btn1.addMouseListener(listener);
		
		JButton btn2 = new JButton("Your Button");
		btn2.addMouseListener(listener);
		
		JButton btn3 = new JButton("Our Button");
		btn3.addMouseListener(listener);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
}
```

## EventHandlerAns1
```java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import chapter25.FrameMouseEventHandler.FrameMouseEventHandler;
import chapter25.MouseEventHandler.MouseEventHandler;

public class MouseEventHandler implements MouseListener{
	public void mouseClicked(MouseEvent e) {
		JButton btn = (JButton)e.getComponent();
		btn.setText("Clicked");
		System.out.println("Clicked Button" + e.getButton());
		System.out.println("Mouse clicked and released");
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}	
}

public class FrameMouseEventHandler implements MouseListener{
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse on JFrame clicked and released");
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}	
}

public class EventHandlerAns1 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("First Swing");
		frm.setBounds(120,120,400,100);
		frm.setLayout(new FlowLayout());
		frm.addMouseListener(new FrameMouseEventHandler());
		
		MouseListener listener = new MouseEventHandler();
		
		JButton btn1 = new JButton("My Button");
		btn1.addMouseListener(listener);
		
		JButton btn2 = new JButton("Your Button");
		btn2.addMouseListener(listener);
		
		JButton btn3 = new JButton("Our Button");
		btn3.addMouseListener(listener);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
}
```

## EventHandlerAns2
```java
class MyJFrame extends JFrame{
	public MyJFrame(String title){
		super(title);
		setBounds(120,120,400,100);
		setLayout(new FlowLayout());
		addMouseListener(new FrameMouseEventHandler());
	}
}
public class EventHandlerAns2 {
	public static void main(String[] args) {
		JFrame frm = new MyJFrame("First Swing");
		
		MouseListener listener = new MouseEventHandler();
		
		JButton btn1 = new JButton("My Button");
		btn1.addMouseListener(listener);
		
		JButton btn2 = new JButton("Your Button");
		btn2.addMouseListener(listener);
		
		JButton btn3 = new JButton("Our Button");
		btn3.addMouseListener(listener);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
}
```

## EventHandlerAns3
```java
class MaJFrame extends JFrame implements MouseListener{
	public MaJFrame(String title){
		super(title);
		setBounds(120,120,400,100);
		setLayout(new FlowLayout());
		addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse on JFrame clicked and released");
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}	
}
public class EventHandlerAns3 {
	public static void main(String[] args) {
		JFrame frm = new MaJFrame("First Swing");
		
		MouseListener listener = new MouseEventHandler();
		
		JButton btn1 = new JButton("My Button");
		btn1.addMouseListener(listener);
		
		JButton btn2 = new JButton("Your Button");
		btn2.addMouseListener(listener);
		
		JButton btn3 = new JButton("Our Button");
		btn3.addMouseListener(listener);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
}
```

## EventHandlerAns4
```java
class MJFrame extends JFrame implements MouseListener{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	
	public MJFrame(String title){
		super(title);
		setBounds(120,120,400,100);
		setLayout(new FlowLayout());
		addMouseListener(this);
		
		btn1 = new JButton("My Button");
		btn2 = new JButton("Your Button");
		btn3 = new JButton("Our Button");
		
		MouseListener listener = new MouseEventHandler();		
		btn1.addMouseListener(listener);
		btn2.addMouseListener(listener);
		btn3.addMouseListener(listener);
		
		add(btn1);
		add(btn2);
		add(btn3);
	}
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse on JFrame clicked and released");
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}	
}
public class EventHandlerAns4 {
	public static void main(String[] args) {
		JFrame frm = new MJFrame("First Swing");
		frm.setVisible(true);
	}
}
```

## FlowLayout Manager
* L to R
* centered
* newline for long components

```java
import java.awt.*;
import javax.swing.*;
class LargeButton extends JButton{
	public LargeButton(String str){super(str);}
	
	public Dimension getPreferredSize(){
		Dimension largeBtmSz = new Dimension(
				super.getPreferredSize().width +30,
				super.getPreferredSize().height+15
				);
		return largeBtmSz;
	}
}

public class FlowLayoutManager {
	public static void main(String[] args) {
		JFrame frm = new JFrame("FlowLayout Test");
		frm.setBounds(120,120,400,200);
		frm.setLayout(new FlowLayout());
		
		frm.add(new JButton("Hi!"));
		frm.add(new JButton("HiHi!"));
		frm.add(new JButton("HiHiHi!"));
		
		frm.add(new LargeButton("Hi!"));
		frm.add(new LargeButton("HiHi!"));
		frm.add(new LargeButton("HiHiHi!"));
		frm.setVisible(true);
	}
}
```

## BorderLayout Manager
```java
public class BorderLayoutManager {
	public static void main(String[] args) {
		JFrame frm = new JFrame("BorderLayout Test");
		frm.setBounds(120,120,300,200);
		frm.setLayout(new BorderLayout());
		
		frm.add(new JButton("EAST"), BorderLayout.EAST);
		frm.add(new JButton("WEST"), BorderLayout.WEST);
		frm.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		frm.add(new JButton("NORTH"), BorderLayout.NORTH);
		frm.add(new JButton("CENTER"), BorderLayout.CENTER);
		
		frm.setVisible(true);
	}
}
```

## GridLayout Manager
```java
public class GridLayoutManager {
	public static void main(String[] args) {
		JFrame frm = new JFrame("FlowLayout Test");
		frm.setBounds(120,120,400,200);
		frm.setLayout(new GridLayout(3,2, 2,2));
		/*public GridLayout(int rows,
				  int cols,
				  int hgap,
				  int vgap)*/
		frm.add(new JButton("1-1")); frm.add(new JButton("1-2"));
		frm.add(new JButton("2-1")); frm.add(new JButton("2-2"));
		frm.add(new JButton("3-1")); frm.add(new JButton("3-2"));
		
		frm.setVisible(true);
	}
}
```

## MultiLayout Manager
JFrame[     : BorderLayout<br/>
	JPanel1[],     : FlowLayout, BorderLayout.NORTH<br/> 
	JPanel2[]     : GridLayout, BorderLayout.CENTER<br/>
]

```java
import java.awt.*;
import javax.swing.*;

public class MultiLayoutManager {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Multi Layout Test");
		frm.setBounds(120,120, 250,150);
		frm.setLayout(new BorderLayout()); //border
		
		JButton btn1 = new JButton("B1"); JButton btn2 = new JButton("B2");
		JButton btn3 = new JButton("B3"); JButton btn4 = new JButton("B4");
		JButton btn5 = new JButton("B5"); JButton btn6 = new JButton("B6");
		JButton btn7 = new JButton("B7"); JButton btn8 = new JButton("B8");
		JButton btn9 = new JButton("B9"); JButton btn10 = new JButton("B10");
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout()); //flow
		panel1.add(btn1); panel1.add(btn2); panel1.add(btn3); panel1.add(btn4);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2,3,2,2)); //grid
		panel2.add(btn5); panel2.add(btn6); panel2.add(btn7);
		panel2.add(btn8); panel2.add(btn9); panel2.add(btn10);
		
		frm.add(panel1, BorderLayout.NORTH);
		frm.add(panel2, BorderLayout.CENTER);
		
		frm.setVisible(true);
	}
}
```

## EventListener
(Event, EventListener)
* MouseEvent MouseListener
* MouseEvent MouseMotionListener
* TextEvent TextListener
* ItemEvent ItemListener
* AdjustmentEvent AdjustmentListener
* WindowEvent WindowListener
* ActionEvent ActionListener
<br/>

## MouseEvent
```java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import chapter25.MouseEventHandler.MouseEventHandler;

public class JButtonMouseEvent {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JButton Disable");
		frm.setBounds(120,120, 250,150);
		frm.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Button One");
		JButton btn2 = new JButton("Button Two");
		
		MouseListener mouseHandler = new MouseEventHandler();
		btn1.addMouseListener(mouseHandler);
		btn2.addMouseListener(mouseHandler);
		
		frm.add(btn1);
		frm.add(btn2);
		
		btn1.setEnabled(false);
		
		frm.setVisible(true);
	}
}
```

## ActionEvent
```java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*spacebar does not make mouse event! -> needs action event def*/
class ActionEventHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}
}

public class JButtonActionEvent {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JButton Disable");
		frm.setBounds(120,120, 250,150);
		frm.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Button One");
		JButton btn2 = new JButton("Button Two");
		
		ActionListener actionHandler = new ActionEventHandler();
		btn1.addActionListener(actionHandler);
		btn2.addActionListener(actionHandler);
		
		frm.add(btn1);
		frm.add(btn2);
		
		btn1.setEnabled(false);
		
		frm.setVisible(true);
	}
}
```

## WindowEvent
* dispose()
```java
import java.awt.event.*;
import javax.swing.*;

class WindowEventHandler implements WindowListener{
	String frameInfo;
	public WindowEventHandler(String info){
		frameInfo = info;
	}
	public void windowActivated(WindowEvent e) {
		System.out.println(frameInfo + "window activated");
	}
	public void windowClosed(WindowEvent e) {
		System.out.println(frameInfo + "window closed");
	}
	public void windowClosing(WindowEvent e) {
		JFrame frm = (JFrame)e.getWindow();
		frm.dispose();
		System.out.println(frameInfo + "window closing");
	}
	public void windowDeactivated(WindowEvent e) {
		System.out.println(frameInfo + "window deactivated");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println(frameInfo + "window deiconified");
	}
	public void windowIconified(WindowEvent e) {
		System.out.println(frameInfo + "window iconified");
	}
	public void windowOpened(WindowEvent e) {
		System.out.println(frameInfo + "window opened");
	}
}
public class JFrameWindowEvent {
	public static void main(String[] args) {
		JFrame frmOne = new JFrame("Frame One");
		JFrame frmTwo = new JFrame("Frame Two");
		
		frmOne.setBounds(120,120,250,150);
		frmTwo.setBounds(380,120,250,150);
		
		frmOne.addWindowListener(new WindowEventHandler("Frame One"));
		frmTwo.addWindowListener(new WindowEventHandler("Frame Two"));
		
		frmOne.add(new JButton("Button One"));
		frmTwo.add(new JButton("Button Two"));
		
		frmOne.setVisible(true);
		frmTwo.setVisible(true);
	}
}
```
<br/>

* System > exit(status)
* JFrame > setDefaultCloseOperation(WindowsConstants.DISPOSE_ON_CLOSE)
* JFrame > setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
```java
import javax.swing.*;

public class SetDefaultCloseOperation {
	public static void main(String[] args) {
		JFrame frmOne = new JFrame("Frame One");
		JFrame frmTwo = new JFrame("Frame Two");
		
		frmOne.setBounds(120,120,250,150);
		frmTwo.setBounds(380,120,250,150);
		
		/*frmOne.addWindowListener(new WindowEventHandler("Frame One"));
		frmTwo.addWindowListener(new WindowEventHandler("Frame Two"));*/
		frmOne.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frmTwo.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		frmOne.add(new JButton("Button One"));
		frmTwo.add(new JButton("Button Two"));
		
		frmOne.setVisible(true);
		frmTwo.setVisible(true);
	}
}
```

## MouseListener MouseMotionListener
```java
import java.awt.event.*;
import javax.swing.*;

class MouseMotionHandler implements MouseMotionListener{
	public void mouseDragged(MouseEvent e) {
		System.out.printf("Drag [%d, %d]\n", e.getX(), e.getY());
	}
	public void mouseMoved(MouseEvent e) {
		System.out.printf("Move [%d, %d]\n", e.getX(), e.getY());
	}
}
public class MouseMotionEvent {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Mouse Motion");
		frm.setBounds(120,120,250,150);
		frm.addMouseMotionListener(new MouseMotionHandler());
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
```

## Adapter Class
empty implementation allowed
```java
import java.awt.event.*;
import javax.swing.*;

public class MouseEventHandler implements MouseAdapter{
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse clicked and released");
	}	
}

public class AdapterEventHandling {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Mouse Motion");
		frm.setBounds(120,120,250,150);
		frm.addMouseListener(new MouseEventHandler());
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
```

Adapter Classes:

* MouseListener MouseAdapter
* MouseMotionListener MouseMotionAdapter
* TextListener NO ADAPTER
* ItemListener NO ADAPTER
* AdjustmentListener NO ADAPTER
* WindowListener WindowAdapter
* ActionListener NO ADAPTER

## Anonymous Adapter Class
```java
import java.awt.event.*;
import javax.swing.*;

public class AdapterEventHandling2 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Mouse Motion");
		frm.setBounds(120,120,250,150);
		frm.addMouseListener(
			new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					System.out.println("Mouse clicked and released");
				}
			}
		);
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
```

## Other Swing Components

## JLabel JTextField
```java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PWHandler implements ActionListener{
	JTextField id;
	JPasswordField pw;
	
	public PWHandler(JTextField id, JPasswordField pw){
		this.id = id;
		this.pw = pw;
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("ID : " + id.getText());
		System.out.println("Password : " + new String(pw.getPassword()));
		id.setText("");
		pw.setText("");
	}
}

public class JLabelAndTextField {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JLabel & JTextField");
		frm.setBounds(120,120,180,80);
		frm.setLayout(new GridLayout(2,2));
		
		JLabel idLabel = new JLabel("ID ", SwingConstants.RIGHT);
		JTextField idText = new JTextField(10);
		
		JLabel pwLabel = new JLabel("Password ", SwingConstants.RIGHT);
		JPasswordField pwText = new JPasswordField(10);
		pwText.setEchoChar('*');
		
		pwText.addActionListener(new PWHandler(idText, pwText));
		
		frm.add(idLabel); frm.add(idText);
		frm.add(pwLabel); frm.add(pwText);
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
```

## JTextArea JScrollPane
```java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonTextHandler implements ActionListener{
	JTextArea textArea;
	
	public ButtonTextHandler(JTextArea area){
		textArea = area;
	}
	
	public void actionPerformed(ActionEvent e) {
		textArea.setText("deleted all\n");
		textArea.append("write anything you want\n");
	}
}

public class JTextAreaScrollAdded {
	public static void main(String[] args){
		JFrame frm = new JFrame("JTextArea");
		frm.setBounds(120, 120, 250, 270);
		frm.setLayout(new FlowLayout());
		
		JTextArea textArea = new JTextArea(10, 20);
		textArea.append("write anything you want\n");
		textArea.setCaretPosition(textArea.getText().length());
		
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		JButton btn = new JButton("Clear");
		btn.addActionListener(new ButtonTextHandler(textArea));
		/*frm.add(textArea);*/
		
		/*JScrollPane simpleScroll = new JScrollPane(textArea);*/ //no scroll initially
		JScrollPane simpleScroll = new JScrollPane(textArea,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); //scroll initially
		frm.add(simpleScroll);
		frm.add(btn);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
```

## JCheckBox JRadioButton
```java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CheckBoxHandler implements ItemListener{
	JRadioButton btn1;
	JRadioButton btn2;
	JRadioButton btn3;
	
	public CheckBoxHandler(JRadioButton b1, JRadioButton b2, JRadioButton b3){
		btn1 = b1;
		btn2 = b2;
		btn3 = b3;
	}
	
	public void itemStateChanged(ItemEvent e) {
		
	}
}

public class JCheckBoxAndJRadioButton {
	public static void main(String[] args){
		JFrame frm = new JFrame("Choice Component");
		frm.setBounds(120,120, 200,200);
		frm.setLayout(new GridLayout(0, 1)); //width 1, any height
		
		JCheckBox checkBox = new JCheckBox("Are you a programmer?");
		
		JRadioButton rbtn1 = new JRadioButton("I like C");
		JRadioButton rbtn2 = new JRadioButton("I like C++");
		JRadioButton rbtn3 = new JRadioButton("I like Java", true);
		ButtonGroup bGroup = new ButtonGroup();
		bGroup.add(rbtn1); bGroup.add(rbtn2); bGroup.add(rbtn3);
		
		checkBox.addItemListener(new CheckBoxHandler(rbtn1, rbtn2, rbtn3));
		frm.add(checkBox);
		frm.add(rbtn1); frm.add(rbtn2); frm.add(rbtn3);
		
		rbtn1.setEnabled(false);
		rbtn2.setEnabled(false);
		rbtn3.setEnabled(false);
		
		rbtn1.addItemListener(
			new ItemListener(){
				public void itemStateChanged(ItemEvent e){
					if (e.getStateChange() == ItemEvent.SELECTED)
						System.out.println("I like C too");
				}
			}
		);
		
		rbtn2.addItemListener(
			new ItemListener(){
				public void itemStateChanged(ItemEvent e){
					if (e.getStateChange() == ItemEvent.SELECTED)
						System.out.println("I like C++ too");
				}
			}
		);
		
		rbtn3.addItemListener(
			new ItemListener(){
				public void itemStateChanged(ItemEvent e){
					if (e.getStateChange() == ItemEvent.SELECTED)
						System.out.println("I like Java too");
				}
			}
		);

		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
```

## Border
```java
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

/*class CheckBoxHandler implements ItemListener{}*/

public class JRadioButtonBorder {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Border");
		frm.setBounds(120,120, 200,180);
		frm.setLayout(new FlowLayout());
		
		JCheckBox checkBox = new JCheckBox("Are you a programmer?");
		
		JRadioButton rbtn1 = new JRadioButton("I like C");
		JRadioButton rbtn2 = new JRadioButton("I like C++");
		JRadioButton rbtn3 = new JRadioButton("I like Java", true);
		ButtonGroup bGroup = new ButtonGroup();
		bGroup.add(rbtn1); bGroup.add(rbtn2); bGroup.add(rbtn3);
		
		//border
		Border rbtnBorder = BorderFactory.createEtchedBorder();
		rbtnBorder = BorderFactory.createTitledBorder(rbtnBorder, "Language");
		
		JPanel rbtnBorderPanel = new JPanel();
		rbtnBorderPanel.setLayout(new GridLayout(0,1));
		rbtnBorderPanel.setBorder(rbtnBorder);
		rbtnBorderPanel.add(rbtn1);
		rbtnBorderPanel.add(rbtn2);
		rbtnBorderPanel.add(rbtn3);
		
		checkBox.addItemListener(new CheckBoxHandler(rbtn1, rbtn2, rbtn3));
		frm.add(checkBox);
		frm.add(rbtnBorderPanel);
		//frm.add(rbtn1); frm.add(rbtn2); frm.add(rbtn3);
		
		rbtn1.setEnabled(false);
		rbtn2.setEnabled(false);
		rbtn3.setEnabled(false);
		
		rbtn1.addItemListener(/*same as before*/);
		rbtn2.addItemListener(/*same as before*/);
		rbtn3.addItemListener(/*same as before*/);

		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
```

## JComboBox
```java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;

class MyFriend{
	String name;
	int age;
	public MyFriend(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){return name;}
	public void ShowFriendInfo(){
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}
}

class ChoiceHandler implements ItemListener{
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED){
			System.out.println("Selected...");
			((MyFriend)e.getItem()).ShowFriendInfo();
		}
		else{
			System.out.println("Deselected...");
			((MyFriend)e.getItem()).ShowFriendInfo();
		}
	}
}
class TextChangedHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		if((e.getActionCommand()).compareTo("comboBoxEdited") == 0)
			System.out.println("ComboBox Edited");
		else //"comboBoxChanged"
			System.out.println("ComboBox Changed");
	}
}

public class JComboBoxModel {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Choice Component");
		frm.setBounds(120,120,250,120);
		frm.setLayout(new GridLayout(0,2));
		
		Vector<MyFriend> friend = new Vector<MyFriend>();
		friend.add(new MyFriend("foo", 21));
		friend.add(new MyFriend("bar", 22));
		friend.add(new MyFriend("quz", 23));
		friend.add(new MyFriend("doe", 24));
		
		JLabel label1 = new JLabel(" ComboBox");
		JComboBox cmbBox1 = new JComboBox(friend);
		cmbBox1.setMaximumRowCount(3);
		cmbBox1.addItemListener(new ChoiceHandler());
		
		JLabel label2 = new JLabel(" Editable ComboBox");
		JComboBox cmbBox2 = new JComboBox(friend);
		cmbBox2.setEditable(true);
		cmbBox2.addActionListener(new TextChangedHandler());
		
		frm.add(label1); frm.add(cmbBox1);
		frm.add(label2); frm.add(cmbBox2);
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
```

## Look And Feel
```java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import chapter25.MouseEventHandler.MouseEventHandler;

public class LookAndFeelEventHandler {
	public static void main(String[] args) {
		try{
			/*UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");*/
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		JFrame frm = new JFrame("Look And Feel");
		frm.setBounds(120,120,400,100);
		frm.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("My Button");
		JButton btn2 = new JButton("Your Button");
		JButton btn3 = new JButton("Our Button");
		
		MouseListener listener = new MouseEventHandler();
		btn1.addMouseListener(listener);
		btn2.addMouseListener(listener);
		btn3.addMouseListener(listener);
		
		frm.add(btn1); frm.add(btn2); frm.add(btn3);
		frm.setVisible(true);
	}
}
```
