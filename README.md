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
```java

```
