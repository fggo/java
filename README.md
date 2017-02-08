* [Java On Windows] (https://github.com/fggo/java/blob/master/README.md#windows)
* [Java On Linux] (https://github.com/fggo/java/blob/master/README.md#linux)
* [IDE] (https://github.com/fggo/java/blob/master/README.md#ide)
* [First Program] (https://github.com/fggo/java/blob/master/README.md#first-program)
* [Variable] (https://github.com/fggo/java/blob/master/README.md#variables)
* [Type Casting] (https://github.com/fggo/java/blob/master/README.md#type-casting)
* [Operator] (https://github.com/fggo/java/blob/master/README.md#operator)
* [Conditional Statement] (https://github.com/fggo/java/blob/master/README.md#condition)
* [Recursion] (https://github.com/fggo/java/blob/master/README.md#recursion)
* [Class] (https://github.com/fggo/java/blob/master/README.md#class)
* [Class path] (https://github.com/fggo/java/blob/master/README.md#class-path)
* [ACS] (https://github.com/fggo/java/blob/master/README.md#access-control-specifier)
* [static] (https://github.com/fggo/java/blob/master/README.md#static-var)
* [Overload] (https://github.com/fggo/java/blob/master/README.md#overloading)
* [String] (https://github.com/fggo/java/blob/master/README.md#string-class)
* [StringBuilder StringBuffer] (https://github.com/fggo/java/blob/master/README.md#stringbuilder-stringbuffer)
* [Console Input] (https://github.com/fggo/java/blob/master/README.md#console-input)
* [Array] (https://github.com/fggo/java/blob/master/README.md#array)
* [for each] (https://github.com/fggo/java/blob/master/README.md#for-each)
* [N array] (https://github.com/fggo/java/blob/master/README.md#nd-array)
* [main] (https://github.com/fggo/java/blob/master/README.md#main-method)
* [Inheritance] (https://github.com/fggo/java/blob/master/README.md#inheritance)
* [Object] (https://github.com/fggo/java/blob/master/README.md#object-class)
* [abstract] (https://github.com/fggo/java/blob/master/README.md#abstract-class)
* [interface] (https://github.com/fggo/java/blob/master/README.md#interface)
* [Exception] (https://github.com/fggo/java/blob/master/README.md#exception)
* [Memory model] (https://github.com/fggo/java/blob/master/README.md#memory-model)
* [Wrapper] (https://github.com/fggo/java/blob/master/README.md#wrapper-class)
* [Generic] (https://github.com/fggo/java/blob/master/README.md#generic)
* [Collection] (https://github.com/fggo/java/blob/master/README.md#collection)
* [Thread] (https://github.com/fggo/java/blob/master/README.md#thread)
* [File IO] (https://github.com/fggo/java/blob/master/README.md#file-io)
* [Swing] (https://github.com/fggo/java/blob/master/README.md#swing)


## Windows
Donwload java SE JDK and edit PATH (Computer - property - Environmental Variable)

1. [Java SE] (http://www.oracle.com/technetwork/java/javase/downloads/index.html)
2. Add PATH (C:\Program Files\Java\jdk1.x.x\bin;)
```
JDK = JRE + Development/debugging tools
JRE = JVM + Java Packages Classes(like util, math, lang, awt,swing etc)+runtime libraries.
JVM = Class loader system + runtime data area + Execution Engine.
```

## Linux
Install java using command line
```
java -version
javac -version
sudo apt-get install default-jdk
```

## IDE

* [Eclipse] (https://eclipse.org/downloads/)
* [NetBeans] (https://netbeans.org/downloads/)
* [Visual Code] (https://code.visualstudio.com/download)

## First program
```java
public class FirstProgram{
	public static void main(String[] args){
		System.out.println("Basic Java program.");
		System.out.println("Learning Java.");
	}
}
```

## Comment
```java
//line comment
/*block 
comment
allows
multi line*/
```

## Variables
<table>
  <tr>
    <td>Data Type</td>
    <td>Data</td>
    <td>Size(byte)</td>
    <td>Range</td>
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
    <td rowspan="4">integer number</td>
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
    <td>+-(1.40e-45 ~ 3.40e38)</td>
  </tr>
  <tr>
    <td>double</td>
    <td>8</td>
    <td>+-(4.94e-324 ~ 1.79e308)</td>
  </tr>
</table>

```java
//UnicodeChar.java
char ch1 = 'A';
char ch2 = '亀';
char ch3 = 0x3091;
char ch4 = 0x3092;
```

## Type Casting

```java
//SuffixConst.java
double e1 = 125;
float e2 = 7.125F;

long n1 = 1000000000L;
long n2 = 150;
System.out.println(e2);
System.out.println(n1);
```

* Implicit Conversion
```java
byte - short \ int - long - float -> double
       char  /

double n1 = 20; //ok (int -> double)
int n2 = 20.5; //error due to data loss (double -> int)
float n3 = 10; //ok (int -> float)
double n4 = 3.5f + 12; // ok (= 15.5f float -> double)
```

* Explicit Conversion
```java
int n = (int)3.15;

long n1 = 198221221L;
int n2 = (int)n1;

int n3 = 99;
long n4 = (long)n3;
```

## Operator
```java

basic op
+ add
- subtract
* multiply
/ divide
% modulo

compare
< > 
<= >= 
!= ==
&& || !

unary 
+ - 
int n1 = +2; 
int n2 = -n1;

incr decs
n++ ++n
n-- --n

bit op
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
2 << 3 == 16

type conv
7/3 == 2
7.0f/3.0f == 2.333...
(float)7/3 == 2.333...
```
## Condition

## if else
```java
if(cond1) {
	/*code*/
} 
else if(cond2){
	/*code*/
}
else {
	/*code*/
}
```
### similar to if else
```java
/* returns n1 if n1 > n2, otherwise returns n2*/
int bigN = (n1 > n2) ? n1 : n2;
```

## switch break
```java
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

```

## for while do while
```java
for(int i = 0; i< N; i++){/*code*/}
while(cond){/*code*/}
do{/*code*/} while(cond)
```

## continue break
```java
for(;;){
	/*code*/
	if(cond)
		continue;
}

while(true){
	/*code*/
	if(cond)
		break; /*break 'one' loop*/
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
```

## class
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

## Constructor

### Constuctor called only once
```java
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

## Ref val null
```java
AAA a = null; //init ref variable as null
```


## final keyword
```java
final int MAX_NUM = 10; // constant

```

## Class path
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

## Package

## Access control specifier 
<table>
	<tr>
		<td>ACS</td>
		<td>Class</td>
		<td>Package</td>
		<td>Inherited Class</td>
		<td>Others</td>
	</tr>
	<tr>
		<td>private</td>
		<td>&#9711;</td>
		<td>&#10005;</td>
		<td>&#10005;</td>
		<td>&#10005;</td>
	</tr>
	<tr>
		<td>default</td>
		<td>&#9711;</td>
		<td>&#9711;</td>
		<td>&#10005;</td>
		<td>&#10005;</td>
	</tr>
	<tr>
		<td>protected</td>
		<td>&#9711;</td>
		<td>&#9711;</td>	
		<td>&#9711;</td>
		<td>&#10005;</td>
	</tr>
	<tr>
		<td>public</td>
		<td>&#9711;</td>
		<td>&#9711;</td>
		<td>&#9711;</td>
		<td>&#9711;</td>
	</tr>
</table>

## Encapsulation
```java
class Budweiser{
	public void take(){System.out.println("Favorite American beer.");}
}

class Sapporo{
	public void take(){System.out.println("Japanese beer.");}
}

class Kirin{
	public void take(){System.out.println("Favorite beer.");}
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
	public void takeBeer(BeerPack pack){ pack.take();}
}

public class Encapsulation {
	public static void main(String[] args){
		Worker worker = new Worker();
		worker.takeBeer(new BeerPack());
	}
}
```

## static var
1. shared by all class inst
2. only 'one' static var exists in memory
3. accessible anywhere (if declared 'public')
4. accessible by classname and instancename
5. init when JVM creates class in memory
6. init inside constructor is not recommended
7. accessible by static method (in diff package)
```java
class {
	public static final double PI =3.14;
	public static int var = 0;
	func{}
}
main{}

class.var;
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

## Overloading

## String class

## StringBuilder StringBuffer
[StringBuffer](https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html)

[Difference between StringBuilder and StringBuffer](http://stackoverflow.com/questions/355089/difference-between-stringbuilder-and-stringbuffer)

## Console Output
```java
class A{
	public String toString(){return "class A";}
}

A inst = new A();
System.out.println(inst);
```

### Escape Sequence
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
[console] 0.000100000 1.00000e-05
```
## Console Input
```java
/*1.*/
try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	int n = Integer.parseInt(str);
}
catch(IOException e){
	e.printStackTrace();
}
/*2.java 5.0*/
Scanner sc =new Scanner(System.in);

Sytem.out.print("type integer : ");
int n = sc.nextInt(); sc.nextLine();

Sytem.out.print("type string : ");
String s = sc.nextLine();
```

## Array

## for each
```java
int sum = 0;
for(int i : new int[]{1,2,3,4,5})
	sum += i;
System.out.println(sum);
```

## Nd array

## main method
```java
public static void main(String[] args){}
```

## Inheritance
[oracle document](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)

### Inheritanc ACS
```java
package A;
class A{
	int defnum;
	private int privnum;
	protected int protnum;
	static int statnum = 0;
	
	public int getPrivNum(){return privnum;}
	protected void setNum(){
		defnum = 0;
		privnum = 0;
		protnum = 0;
	}
	
	public void setStaticNum(int n){statnum = n;}
}
---
package B;
import A.*;
class B extends A{
	public B(){/*super();*/}
	public void setNum(){super.setNum();}
	public void showNum(){
		System.out.println("default num: " + defnum);
		System.out.println("private num: " + getPrivNum()); 
		System.out.println("protected num: " + protnum); /*accessible by inheritted class*/
	}
	public static void showStaticNum(){
		System.out.println("static num: " + statnum);
	}
}
```

### ISA HASA Composite
```java
/*ISA*/
class Computer{}
class Laptop extends Computer{}
class DellXPS extends Laptop{}

/*HASA*/
class Gun{}
class Police extends Gun{}

/*Composite*/
class Gun{}
class Police{Gun pistol;}
```

### Overriding
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


### instanceof
```java
/*instanceof*/
class Box{
	public void simpleWrap(){System.out.println("simple wrap");}
	public void wrap(){simpleWrap();}
}
class PaperBox extends Box{
	public void paperWrap(){System.out.println("paper wrap");}
	public void wrap(){paperWrap();}
}
class GoldPaperBox extends PaperBox{ 
	public void goldWrap(){System.out.println("gold wrap");}
	public void wrap(){goldWrap();}
}

public class InstanceOf2 {
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

## Object class
```java
/*can override object method inside class*/

public String toString(){/*code*/}
public void println(Object x){/*code*/}	
```

### final
```java
final class MyClass{} /*do not allow class inheritance*/
final void func(param){} /*do not allow method overriding*/

eg. String is a final class
eg. Object has final method : wait() notify() notifyAll()
```

## abstract class
* for inheritance
* not for instantiation

### abstract method
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

## interface
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

### class implements two interfaces
```java
public interface MyInterface{public void myMethod();}
public interface YourInterface{public void yourMethod();}

class OurClass implements MyInterface, YourInterface
	public void myMethod(){/*code*/}
	public void yourMethod(){/*code*/}
}
```

### interface inherits another
```java
public interface MyInterface{
	public void myMethod();
}
public interface MySecondInterface extends MyInterface{
	public void mySecondMethod();
}
```

### interface for const
```java
public class Week{
	public static final int MON = 1, TUE =2, /*vars*/ SUN =7;
}

public interface Week{
	int MON = 1, TUE =2, /*code*/ SUN = 7;
}
```

### uppercase interface
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

### diamond UML
java does not support multi inheritance. there's a workaround :
```java
/*code1.*/
class TV{
	public void onTV(){System.out.println("Video Sending...");}
}

interface Computer{
	public void dataReceive();
}

class ComputerImpl{	
	public void dataReceive(){System.out.println("Video Receiving...");}
}

class IPTV extends TV implements Computer{
	ComputerImpl comp=new ComputerImpl();
	
	public void dataReceive(){comp.dataReceive();}
	
	public void powerOn(){
		dataReceive();
		onTV();
	}
}

/*code2.*/
interface TV{
	public void onTV();
}

interface Computer{
	public void dataReceive();
}

class TVImpl{
	public void onTV(){System.out.println("Video Sending...");}
}

class ComputerImpl{	
	public void dataReceive(){System.out.println("Video Receiving...");}
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

/*main method*/
public class MultiInheriAlternative{
	public static void main(String[] args){
		IPTV iptv=new IPTV();
		iptv.powerOn();
		
		TV tv=iptv;
		Computer comp=iptv;
	}
}
```

### Inner & Outer class
```java
class OuterClass{
	public void method(){/*code*/}
	class InnerClass{}
}

public static void main(String[] args){
	OuterClass out1 = new OuterClass();
	OuterClass out2 = new OuterClass();
	out1.method();
	out2.method();
	
	OuterClass.InnerClass inn1 = out1.new InnerClass();
	OuterClass.InnerClass inn2 = out2.new InnerClass();
	OuterClass.InnerClass inn3 = out2.new InnerClass();
}
```

### Nested class
'nested' or 'static inner' class
```java
class OuterClass{
	static class NestedClass{}
}
```
Example:
```java

class OuterClassOne
{
	public OuterClassOne()
	{
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	
	static class NestedClass
	{
		public void simpleMethod(){System.out.println("nested instance method One");}
	}
}

class OuterClassTwo
{
	public OuterClassTwo()
	{
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	
	private static class NestedClass
	{
		public void simpleMethod(){System.out.println("nested instance method Two");}
	}
}

public class NestedClassTest {
	public static void main(String[] args)
	{
		OuterClassOne one = new OuterClassOne();
		OuterClassTwo two = new OuterClassTwo();
		
		OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();
		nst1.simpleMethod();
		
		//private : error
		/*OuterClassTwo.NestedClass nst2 = new OuterClassTwo.NestedClass();
		nst2.simpleMethod();*/
	}
}
```

### Local class
```java
class OuterClass{
	public void createLocalClassInst(){
		class LocalClass{}
		LocalClass local = new LocalClass();
	}
}
```
Example:
a local class can only access local variables that are declared final.
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

### Anonymous class
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

## Exception

### try catch finally
```java
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		
	try{
		System.out.print("integer n1: ");
		int n1 = sc.nextInt(); sc.nextLine();
		System.out.print("integer n2: ");
		int n2 = sc.nextInt(); sc.nextLine();
		
		System.out.println("n1/n2 = " + n1/n2);
		System.out.println("n1%n2 = " + n1%n2);
		
		int[] arr = {0,1};
		arr[-1] = 1;
	}
	catch(ArithmeticException e){
		System.out.println(e.getMessage());
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("invalid index : " + e.getMessage());
	}
	finally{
		/*this code is always executed whether exception occurs or not*/
	}
}
```
Defined Exception classes :

* ArrayIndexOutOfBoundsException
* ClassCastException
* NegativeArraySizeException
* NullPointerException
<br/>

Avoid this :
```java
/*ArithmeticException catch area is never reached.*/
try{/*code*/}
catch(Throwable e){}
catch(ArithmeticException e){}
```

### throw
Custom exception: <br/>
e.g. exception can be defined for negative 'age' input

* throws will pass the error to his caller to handle it
* try catch block will handle the Exception
<br/>

after 'throws' there're two ways to handle

1. caller will handled exception with try catch
2. caller 'throws'

```java
/*1. caller try catch*/
import java.util.Scanner;

class AgeInputException extends Exception{
	public AgeInputException(int age){
		super("invalid age input!");
	}
}

public class ProgrammerDefineException {

	public static int readAge() throws AgeInputException{
		Scanner sc = new Scanner(System.in);
		System.out.print("age: ");
		
		int age = sc.nextInt(); sc.nextLine();
		
		if(age < 0)
			throw new AgeInputException();
		
		return age;
	}
	
	public static void main(String[] args){
		try{
			int age = readAge();
			System.out.println(age + " years old.");
		}
		catch(AgeInputException e){
			System.out.println(e.getMessage());
		}
	}
}

/*2. caller (main method)'throws'*/
class AgeInputException extends Exception{
	/*save as above*/
}
public class ProgrammerDefineException {
	
	public static int readAge() throws AgeInputException{
		/*same as above*/
	}
	
	public static void main(String[] args) throws AgeInputException{
		int age = readAge();
		System.out.println(age + " years old.");
	}
}
```
Then the caller of main method should handle exception. <br/>
since JVM is the caller, JVM will

1. call getMessage()
2. print stack trace
3. terminate program
<br/>

Example:
```java
import java.util.Scanner;

class AgeException extends Exception{
	public AgeException(){
		super("invalid age input!");
	}
}

class NameLengthException extends Exception{
	int len;
	
	public NameLengthException(int len){
		super("name is too short!");
		this.len = len;
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
	
	public static PersonalInfo readPersonalInfo() throws AgeException, NameLengthException{
		
		String name = readName();
		if (name.length() < 2)
			throw new NameLengthException(name.length());
		
		int age = readAge();
		if(age < 0)
			throw new AgeException();
		
		return new PersonalInfo(name, age);
	}
	
	public static int readAge() throws AgeException{
		System.out.print("age: ");
		int age = sc.nextInt(); sc.nextLine();
		
		if(age < 0)
			throw new AgeException();
		
		return age;
	}
	
	public static String readName() throws NameLengthException{
		System.out.print("age: ");
		String name = sc.nextLine();
		
		if (name.length() < 2)
			throw new NameLengthException(name.length());
		
		return name;
	}
	
	public static void main(String[] args){
		try{
			PersonalInfo info = readPersonalInfo();
			info.showPersonalInfo();
		}
		catch(NameLengthException e){
			e.printStackTrace();
		}
		catch(AgeException e){
			e.printStackTrace();
		}
	}
}
```

### Exception class Hierarchy
Exception → Throwable ← Error <br/>
e.g. VirtualMachineError <br/>
![alt tag] (http://images.techhive.com/images/idge/imported/article/jvw/1998/07/exceptfig1-100158195-orig.gif)

### RuntimeException
although it is a subclass of Exception, it is similar to Error subclasses

1. no 'try~catch' or 'throws'
2. does not handle serious problems as 'Error' would handle:<br/> errors related to environment in which application is running
3. in order to continue program, it occasionally uses try~catch 
<br/>

RuntimException Example:
```java
public class RuntimeExceptionCase {
	public static void main(String[] args){
		try{
			int[] arr = {0,1};
			arr[-2] = 1;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		
		try{
			Object obj = new int[10];
			String str = (String)obj;
		}
		catch(ClassCastException e){
			System.out.println(e.getMessage());
		}
		
		try{
			int[] arr = new int[-10];
		}
		catch(NegativeArraySizeException e){
			System.out.println(e.getMessage());
		}
		
		try{
			String str = null;
			int len = str.length();
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
	}
}
```

## Memory model
JVM memory:

* Method: method (bytecode), static var
* Stack: local var, ref var, param
* Heap: inst, garbage collection

### Object : finalize
```java
/* finalize dispose of inst */
protected void finalize() throws Throwable
```

ObjectFinalize.java
```java
class MyName{
	String objName;
	public MyName(String objName){this.objName = objName;}
	
	/*override Object method*/
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
		
		// instances ready for gc
		// expect finalize to be automatically called
		// but sometimes it has to be manually called 
		System.gc();
		System.runFinalization();
	}
}
```

### Object : equals
```java
public boolean equals(Object obj)
```

same impl as above plus 'equals' method override
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

### Object : clone
requires to implement Cloneable interface to call clone()
```java
protected Object clone() throws CloneNotSupportedException
```
Example:
```java
class Point implements Cloneable{
	private int xpos, ypos;
	
	public Point(int x, int y){
		xpos = x;
		ypos = y;
	}
	
	public void showPosition(){
		System.out.printf("[%d, %d]\n", xpos, ypos);
	}
	
	/*override protected to pulbic*/
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
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}
}
```

### Shallow & Deep copy
```java
class Point implements Cloneable{
	private int xpos, ypos;
	
	public Point(int x, int y){
		xpos = x;
		ypos = y;
	}
	public void showPosition(){
		System.out.printf("[%d, %d]\n", xpos, ypos);
	}
	public void changePosition(int x, int y){
		xpos = x;
		ypos = y;
	}
	
	/*override protected to pulbic*/
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class Rectangle implements Cloneable{
	Point lowerleft;
	Point upperright;
	
	public Rectangle(int llx, int lly, int urx, int ury){
		lowerleft = new Point(llx, lly);
		upperright = new Point(urx, ury);
	}
	public void showPosition(){
		System.out.print("lower left: "); lowerleft.showPosition();
		System.out.print("upper right: "); upperright.showPosition();
		
	}
	public void changePosition(int llx, int lly, int urx, int ury){
		lowerleft.changePosition(llx, lly);
		upperright.changePosition(urx, ury);
	}
	
	/*shallow copy*/
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
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

### String clone
String does not need deep copy


## Wrapper
java defines wrapper classes

* Boolean
* Character
* Byte
* Integer
* Long
* Float
* Double

```java
/*boxing*/
Integer ival = new Integer(10);
Integer ival2 = 10;
Integer ival3 = Integer.valueOf(10);
Integer ival4 = Integer.valueOf(10);

//just like String, ival3 == ival4

/*unboxing*/
ival = new Integer(ival.intValue() + 10) 
ival++;
ival2 += 10;
int n = ival;
int n2 = ival + ival2;
```

### Big N
* BigInteger
```java
BigInteger bigval = new BigInteger("1000000000000000000000");
```

* BigDecimal
precision in floating num
```java
BigDecimal bigval = new BigDecimal("3.1415");
```
<br/>

Example:
```java

import java.math.BigDecimal;
import java.util.Scanner;

public class AbsoluteNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("type real num1: ");
		BigDecimal n1 = sc.nextBigDecimal();
		System.out.print("type real num2: ");
		BigDecimal n2 = sc.nextBigDecimal();
		
		BigDecimal sub = n1.subtract(n2);
		
		System.out.println("absolute difference: " + sub.abs());
		
	}
}
```
### Math
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

### Rand
```java
Random rand = new Random();

public boolean nextBoolean()
public int nextInt()
public long nextLong()
public int nextInt(int n)  // [0, n) int
public float nextFloat() // [0.0, 1.0) float
public double nextDouble() // [0.0, 1.0) double
public double nextGaussian()
```

```java
Math math = new Math();
public static double random() // [0.0, 1.0) double
```
<br/>

PseudoRandom.java
```java
import java.util.Random;
/*Random(long seed)
Random rand = new Random();*/
Random rand = new Random(System.currentTimeMillis()); //same as above
//Random rand = new Random((long)Math.random());
//Random rand = new Random(Double.valueOf(Math.random()).longValue());

for(int i =0; i<100; i++)
	System.out.println(rand.nextInt(1000));
```
<br/>

RandomAtoB.java
```java
Random rand = new Random();
int a =1, b =10;
for(int i =0; i<10; i++)
	System.out.println(Math.min(a, b) + rand.nextInt(Math.abs(a-b)));
```
<br/>

Random0to10.java
```java
for(int i =0; i<5; i++)
	System.out.println((int)(Math.random()*10));
```

### Tokenizer
```java
import java.util.StringTokenizer;
public class TokenizeString2 {
	public static void main(String[] args){
		String phone = "TEL 1-333#333@3333";
		String code = "num+=1";
		
		StringTokenizer tk1 = new StringTokenizer(phone, " -#@");
		StringTokenizer tk2 = new StringTokenizer(code, "+=", true);
		
		while(tk1.hasMoreTokens())
			System.out.println(tk1.nextToken());
		
		while(tk2.hasMoreTokens())
			System.out.println(tk2.nextToken());
	}
}
```

## Generic

### Generic class
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
	public FruitBox(T item){this.item = item;}
	public void store(T item){this.item = item;}
	public T pullOut(){return item;}
}

class MultiFruitBox <T, U>{
	T item1;
	U item2;
	
	public MultiFruitBox(T item1, U item2){
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public void storeItem1(T item1){this.item1 = item1;}
	public void storeItem2(U item2){this.item2 = item2;}
	
	/*public T pullOut(){return item;}*/
}

public class GenericBaseFruitBox {
	public static void main(String[] args){
		FruitBox<Orange> orgBox = new FruitBox<Orange>(new Orange(10));
		Orange org = (Orange)orgBox.pullOut();
		org.showFruitInfo();
		
		FruitBox<Apple> aplBox = new FruitBox<Apple>(new Apple(300));
		Apple apl = (Apple)aplBox.pullOut();
		apl.showFruitInfo();
	}
}
```

### Generic method
IntroGenericMethod.java
```java
class AAA{
	public String toString(){return "class AAA";}
}
class BBB{
	public String toString(){return "class BBB";}
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
		shower.<AAA, BBB>showInstType(aaa, bbb);
	}
}
```
<br/>

### Bounded Type param
Inside 'showInstType' method, inst1 and 2 can only be used with Object defined method<br/>
i.e. println() can be used since toString method is defined in Object class<br/>
To use other method it needs explicit type conversion or restricts generic param type :<br/>
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

### Generic Array method
```java
public class IntroGenericArray {
	public static <T> void showArrayData(T[] arr){
		for(int i = 0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
	
	public static void main(String[] args){
		String[] arr = new String[]{"a", "b", "c"};
		showArrayData(arr);
	}
}
```

### Generic Wildcard
param ```FruitBox<Apple>``` or ```FruitBox<Orange>```is not allowed for
```java
public void method(FruitBox<Fruit> param){/*code*/}
```
Use WildCard method:
```java
public class IntroWildCard {
	/*extends*/
	public static void openAndShowFruitBox(FruitBox<? extends Fruit> box){
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
	
	public static void main(String[] args){
		FruitBox<Fruit> box = new FruitBox<Fruit>();
		box.store(new Fruit("Unidentified Fruit"));
		
		FruitBox<Apple> aplBox = new FruitBox<Apple>();
		aplBox.store(new Apple(100));
		
		FruitBox<Orange> orgBox = new FruitBox<Orange>();
		orgBox.store(new Orange(300));
		
		openAndShowFruitBox(box);
		openAndShowFruitBox(aplBox);
		openAndShowFruitBox(orgBox);
	}
}
```

### Generic Inheritance
```java
class AAA<T>{
	T itemAAA;
}
class BBB<T> extends AAA<T>{
	T itemBBB;
}
class CCC extends AAA<T>{
	int itemCCC;
}

/*you can also choose T for AAA<T>*/
class AAA<String>{
	String itemAAA;
}
class BBB extends AAA<String>{
	int itemBBB;
}
class BBB<T> extends AAA<String>{
	T itemBBB;
}

```

### Generic interface
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
interface MyInterface<String>{
	public String func(String item);
}
class MyImplement implements MyInterface<String>{
	public String func(String item){
		return item;
	}
}
```

## Collection
Collection interfaces:<br/>

* Collection\<E\>
  * Set\<E\>
  * List\<E\>
  * Queue\<E\>
* Map\<K,E\>

### ArrayList

### LinkedList

### ArrayList vs LinkedList



## Thread

## File IO

## Swing
