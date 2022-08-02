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





























