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
    <td>integer number</td>
    <td>1</td>
    <td>-128 ~ 127</td>
  </tr>
  <tr>
    <td>short</td>
    <td>integer number</td>
    <td>2</td>
    <td>-32768 ~ 32768</td>
  </tr>
  <tr>
    <td>int</td>
    <td>integer number</td>
    <td>4</td>
    <td>-2147483648 ~ 2147483647</td>
  </tr>
  <tr>
    <td>long</td>
    <td>integer number</td>
    <td>8</td>
    <td>-9223....808 ~ 9223....807</td>
  </tr>
  <tr>
    <td>float</td>
    <td>real number</td>
    <td>4</td>
    <td>+-(1.40*10^-45 ~ 3.40*10^38)</td>
  </tr>
  <tr>
    <td>double</td>
    <td>real number</td>
    <td>8</td>
    <td>+-(4.94*10^-324 ~ 1.79*10^308)</td>
  </tr>
  <tr>
    <td colspan="2">Three</td>
  </tr>
</table>
