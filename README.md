Junit
Duration: 2 days
What are software tests?
Why are software tests helpful?
Testing frameworks for Java

Code (or application) under test
Test fixture
Unit tests and unit testing
Integration tests
Performance tests
Behavior vs. state testing

The JUnit framework
How to define a test in JUnit?
Example JUnit test
JUnit naming conventions
JUnit naming conventions for Maven
JUnit test suites
Run your test from the command line

Available JUnit annotations
Assert statements
Test execution order
Disabling tests

Creating JUnit tests
Running JUnit tests
Extracting the failed test and stacktraces
JUnit static imports
Wizard for creating test suites
Testing exception
JUnit Plug-in Test


Why Tests 
=============
public class Calculator
{
	public int add(int num1,int num2)
	{
		return num1+num1;
	}
}



Software tests

TDD - Test Driven Development - In this approach ,we write the tests first and then the development takes place

BDD - Behavior Driven Development (selenium, cucumber)


What is Junit ?

Open source java unit testing framework

** Unit Testing : testing a part of an application, not the whole one.



Junit 5 (Jupiter) - Maven dependency 

Requirement for Junit 5 is : JDK1.8


Junit Annotations
================



@Test


expected=20
actual=


import static org.junit.jupiter.api.Assertions


assertEquals(expected,actual)

@DisplayName

Ordering Tests
---------------------------------
Why
How 



UtilityTest


Create three tests


malayalam	- true
shubham		- false
hello		-false




Testing "hello" to be not palindrome
Testing "malayalam" to be palindrome
Testing "hello" to be not palindrome



Overall - GREEN


@Order












Methods stubs
========================




@BeforeEach
	- This annotated method will run before every test
@BeforeAll
	- This annotated method will run before all the tests
	- It will run only once
	- static method

@AfterEach
	- This annotated method will run after every test
@AfterAll
	- This annotated method will run after all the tests
	- It will run only once
	- static method









Testing exception
=================

ArithemeticException
ArrayIndexOutOfBoundsException
NumberFormatException


public int convertToNumber(String number)
{
	return Integer.parseInt(number);
}



"90"+5		= 905

90+5		= 95




int result = convertToNumber("90")

int result = convertToNumber("ninety")	- expectation NumberFormatException



Another Example :







Day 2

Types of Testing:-

1. Unit Testing
It focuses on the smallest unit of software design.
 In this, we test an individual unit or group of interrelated units.
 It is often done by the programmer by using sample input and observing its corresponding outputs. 

Example:

a) In a program we are checking if the loop, method, or 
   function is working fine
b) Misunderstood or incorrect, arithmetic precedence.
c) Incorrect initialization


====================



2. Integration Testing
The objective is to take unit-tested components and build a program structure that has been dictated by design.
 Integration testing is testing in which a group of components is combined to produce output. 

Integration testing is of four types: (i) Top-down (ii) Bottom-up (iii) Sandwich (iv) Big-Bang 

Big-Bang - Everything will be combined at once and get tested. 
Top -down - top modules are integrated first
Bottom - up - bottopm modules are integrated first
Sandwich : Both top-down and Bottom-up will be used


Example:

(a) Black Box testing:- It is used for validation.  In this, we ignore internal working mechanisms and 
focus on what is the output?.

(b) White box testing:- It is used for verification.  In this, we focus on internal mechanisms i.e.
how the output is achieved?


3. Regression Testing
Every time a new module is added leads to changes in the program. 
** This type of testing makes sure that the whole component works properly even after adding components to the complete program. 

Example 

Plane example 


4. Smoke Testing
This test is done to make sure that the software under testing is ready or stable for further testing 
It is called a smoke test as the testing of an initial pass is done to check if it did not catch the fire or smoke in the initial switch on. 
Example: 

If the project has 2 modules so before going to the module 2,  make sure that module 1 works properly	- smoke testing

5. Alpha Testing
This is a type of validation testing. It is a type of acceptance testing which is done before the product is released to customers. It is typically done by QA people. 
Example: 

When software testing is performed internally within the organization

6. Beta Testing
The beta test is conducted at one or more customer sites by the end-user of the software. This version is released for a limited number of users for testing in a real-time environment 

Example: 
When software testing is performed for the limited number of people


7. System Testing
This software is tested such that it works fine for the different operating systems. It is covered under the black box testing technique. In this, we just focus on the required input and output without focusing on internal working. 
In this, we have security testing, recovery testing, stress testing, and performance testing 
Example: 

This includes functional as well as nonfunctional  testing

non functional - includes behavior testing and also which is not tested at functional testing level.
NON-FUNCTIONAL TESTING(NFT) is defined as a type of Software testing to check non-functional aspects (performance, usability, reliability, etc) of a software application. It is designed to test the readiness of a system as per nonfunctional parameters which are never addressed by functional testing.

An excellent example of non-functional test would be to check how many people can simultaneously login into a software.
Another example : logging, transaction, security




8. Stress Testing
In this, we give unfavorable conditions to the system and check how they perform in those conditions. 
Example: 

(a) Test cases that require maximum memory or other resources are executed
(b) Test cases that may cause thrashing in a virtual  operating system
(c) Test cases that may cause excessive disk requirement

9. Performance Testing
It is designed to test the run-time performance of software within the context of an integrated system. 
It is used to test the speed and effectiveness of the program. 
It is also called load testing. In it we check, what is the performance of the system in the given load.
Example: 

Checking several processor cycles.


===============================================================================



@RepeatedTest(5)

 @Disabled on Test Class
public class CalculatorTest

enable or disable the execution of the specific tests in JUnit 5 using inbuilt conditional execution annotations.

The inbuilt conditional annotations, that we can use to configure the conditions when a test should run and when it should not, are as follows.

@EnabledOnOs and @DisabledOnOs
These annotations enable or disable the execution of the annotated test based on a particular operating system.
The supported operating systems are listed in enum org.junit.jupiter.api.condition.OS are AIX, Linux, Mac, Solaris, Windows and Others.
When applied at the class level, all test methods within that class will be enabled on the same specified operating systems.
If a test method is disabled via this annotation, the test class will be initiated, only the test method and its life cycle methods will not be executed.
@Test
@EnabledOnOs(OS.MAC)
void testOnMacOs() {
    assertTrue(true);
}

@Test
@DisabledOnOs(OS.WINDOWS)
void doNotTestOnWindows() {
    assertTrue(true);
}



--------


. @EnabledOnJre and @DisabledOnJre
These annotations can help in enabling or disabling the test for particular JRE version.
The supported values can be found in the latest version of the JRE enum.
If the current JRE version cannot be detected then none of the constants defined in JRE enum will be considered.
@Test
@DisabledOnJre(JRE.JAVA_8)
void disabledOnJava8() {
    assertTrue(true);
}

@Test
@EnabledOnJre({ JRE.JAVA_17, JRE.JAVA_18 })
void enabledOnJava17Or18() {
    assertTrue(true);
}'


--------------
Maven
	Lifecycle
		validate
		compile
		test				- run all the tests
			if any 1 tests fails, 
		package				-jar
		Integration test
		Verify
		Install
		deploy





mvn test

mvn package





There are two things I want to point out:
















First, if we want to use the native JUnit 5 support of the Maven Surefire Plugin, we must ensure that at least one test engine implementation is found from the classpath. That's why we ensured that the junit-jupiter-engine dependency is found from the classpath when we configured the dependencies of our Maven build.

Second, if we use the default configuration of the Maven Surefire Plugin, it runs all test methods found from a test class if the name of the test class:

Starts or ends with the string: Test.
Ends with the string: Tests.
Ends with the string: TestCase.

pom.xml

<dependencies>

		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter</artifactId>
			<version>5.8.2</version>
			<scope>test</scope>
		</dependency>    
 
	</dependencies>

	<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.22.2</version>
        </plugin>
    </plugins>



-- update the project
-- change it to jdk1.8


---Terminal
'mvn' is not recognized as an internal or external command,
operable program or batch file

Solution : 
Download maven and set the path



open 
>mvn clean test 



----------------------------------------------------
+ topics


Selenium

Automated 


Use case : I want to test amazon search functionality



		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.1.2</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>5.1.0</version>
		</dependency>






















