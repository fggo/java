* [Install Java On Windows] (https://github.com/fggo/java-basic/blob/master/README.md#windows)
* [Install Java On Linux] (https://github.com/fggo/java-basic/blob/master/README.md#linux)
* [Download IDE] (https://github.com/fggo/java-basic/blob/master/README.md#ide)
* [First Program] (https://github.com/fggo/java-basic/blob/master/README.md#first-program)
* [Comment] (https://github.com/fggo/java-basic/blob/master/README.md#comment)
* [Variable] (https://github.com/fggo/java-basic/blob/master/README.md#variables)

# Windows
Donwload java SE and edit PATH (Computer > property > Environmental Variable)

1. [Java SE] (http://www.oracle.com/technetwork/java/javase/downloads/index.html)
2. Add PATH (C:\Program Files\Java\jdk1.x.x\bin;)

# Linux
Install java using commands
```
	java -version
	javac -version
	sudo apt-get install default-jdk
```

# IDE

* [Eclipse] (https://eclipse.org/downloads/)
* [NetBeans] (https://netbeans.org/downloads/)
* [Visual Code] (https://code.visualstudio.com/download)

# First program
```java
public class FirstProgram{
	public static void main(String[] args){
		System.out.println("Basic Java program.");
		System.out.println("Learning Java.");
	}
}
```

# Comment
```java
//line comment
/*block 
comment
allows
multi line*/
```

# Variables
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
		char ch2 = '한';
		char ch3 = 0x3091;
		char ch4 = 0x3092;
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
```

# Type Casting

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
byte - short \ int - long - float -> double
       char  /
```java
double n1 = 20; //ok (int -> double)
int n2 = 20.5; //error due to data loss (double -> int)
float n3 = 10; //ok (int -> float)
double n4 = 3.5f + 12; // ok (= 15.5f float -> double)
```

* Explicit Conversion
int n = (int)3.15;

long n1 = 198221221L;
int n2 = (int)n1;

int n3 = 99;
long n4 = (long)n3;

# Operator
```java
/*
+ add
- subtract
* multiplicate
/ divide
% modulo
< > <= >= != ==
&& || !
+ - int n1 = +2; int n2 = -n1;
n++ ++n
n-- --n
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
<< <<< >> >>>
2 << 3 == 16

*/
7/3 == 2
7.0f/3.0f == 2.333...
(float)7/3 == 2.333...
```

# if else
if {} else if {} else {}

```java
int big = (n1 > n2) ? n1 : n2; 
```

# switch break
```java
switch(n){
case 1: ...
	break;
...
default: ...
	break;
}

```

# for{} while{}  do{}while(condition)

# continue, break
```java
for(;;){
	if(cond)
		continue;
}

while(true){
...
	if(cond)
		break; //break 'one' loop
}
```
