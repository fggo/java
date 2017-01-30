* [Install Java On Windows] (https://github.com/fggo/java-basic/blob/master/README.md#windows)
* [Install Java On Linux] (https://github.com/fggo/java-basic/blob/master/README.md#linux)
* [Download IDE] (https://github.com/fggo/java-basic/blob/master/README.md#ide)
* [First Program] (https://github.com/fggo/java-basic/blob/master/README.md#first-program)
<!--
* [Comment] (https://github.com/fggo/java-basic/blob/master/README.md#comment)
* [Variable] (https://github.com/fggo/java-basic/blob/master/README.md#variables)
* [Type Casting] (https://github.com/fggo/java-basic/blob/master/README.md#type-casting)
* [Operator] (https://github.com/fggo/java-basic/blob/master/README.md#operator)
* [if else] (https://github.com/fggo/java-basic/blob/master/README.md#if-else)
* [similar to if else] (https://github.com/fggo/java-basic/blob/master/README.md#similar-to-if-else)
* [switch break] (https://github.com/fggo/java-basic/blob/master/README.md#switch-break)
* [for while do while] (https://github.com/fggo/java-basic/blob/master/README.md#for-while-do-while)
* [continue break] (https://github.com/fggo/java-basic/blob/master/README.md#continue-break)
* [Recursion] (https://github.com/fggo/java-basic/blob/master/README.md#recursion)
* [class] (https://github.com/fggo/java-basic/blob/master/README.md#class)
* [Constructor] (https://github.com/fggo/java-basic/blob/master/README.md#constructor)
* [Constuctor called only once] (https://github.com/fggo/java-basic/blob/master/README.md#constructor-called-only-once)
* [Ref val null] (https://github.com/fggo/java-basic/blob/master/README.md#ref-val-null)
* [final keyword] (https://github.com/fggo/java-basic/blob/master/README.md#final-keyword)
* [Class path] (https://github.com/fggo/java-basic/blob/master/README.md#class-path)
* [Package] (https://github.com/fggo/java-basic/blob/master/README.md#package)
* [Access control specifier ] (https://github.com/fggo/java-basic/blob/master/README.md#access-control-specifier)
* [Encapsulation] (https://github.com/fggo/java-basic/blob/master/README.md#encapsulation)
* [static var] (https://github.com/fggo/java-basic/blob/master/README.md#static-var)
* [static method ] (https://github.com/fggo/java-basic/blob/master/README.md#static-method)
* [Overloading] (https://github.com/fggo/java-basic/blob/master/README.md#overloading)
* [String class] (https://github.com/fggo/java-basic/blob/master/README.md#string-class)
* [StringBuilder StringBuffer] (https://github.com/fggo/java-basic/blob/master/README.md#stringbuilder-stringbuffer)
* [Console Output] (https://github.com/fggo/java-basic/blob/master/README.md#console-output)
* [Escape Sequence] (https://github.com/fggo/java-basic/blob/master/README.md#escape-sequence)
* [Console Input] (https://github.com/fggo/java-basic/blob/master/README.md#console-input)
* [Array] (https://github.com/fggo/java-basic/blob/master/README.md#array)
* [for each] (https://github.com/fggo/java-basic/blob/master/README.md#for-each)
* [Nd array] (https://github.com/fggo/java-basic/blob/master/README.md#nd-array)
* [main method] (https://github.com/fggo/java-basic/blob/master/README.md#main-method)
* [Inheritance] (https://github.com/fggo/java-basic/blob/master/README.md#inheritance)
-->

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
1. shared by all class instances
2. 'one' static variable can exist in memory
3. accesible from anywhere (declared as public)
4. init when JVM creates class in memory
5. init not possible by constructor
6. init only once. (before constructor is called)
7. static var only accessible by static method
```java
class {
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
		A.doNothing();
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


