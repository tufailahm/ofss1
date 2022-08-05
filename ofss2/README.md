Oracle University Content
JavaScript and HTML5: Develop Web Applications
JavaScript Fundamentals

Writing JavaScript code to declare variables, objects, functions and arrays

=================================================================================
What is Javascript ?
Client Side Validation
Interactivity
Add and remove elements dynamically using js


Real time :  Amazon,Facebook many many more


Editor: Visual studio code 


document


Some built in functions :

alert
confirm
prompt

Enter first number : 90
Enter second number : 10

Result is : 100

Hint : parseInt

15 minutes


Variables
-----------------

var


functions 






Form validation using JS
---------------------------------
<input type="text" id="username" name="username">

document.getElementById("username").value





<span>	- inline
<div>	- block


Javascript events
===================

onclick
onfocus
onblur
onmouse
onkeypress
many more


if (op == "div") {
          if (num2.value == 0) {
            alert("Number cannot be 0");
            num2.value = "";
            num2.focus();
          } else {
            document.getElementById("selectOp").value = "select";
            result.innerHTML =
              "Result : " + parseInt(num1.value) / parseInt(num2.value);
          }
        }



























Constructors 
Date() - Use the current date and time to create an instance of the object date. 
today = new Date();
Date(dateString) - Use the date specified by the string to create the instance of the date object. 
d1 = new Date("July 10, 2010 11:13:00");
Date(year, month, day) - Create an instance of date with the specified values. 
Date(year, month, day, hours, minutes, seconds) - Create an instance of date with the specified values where month begins from 0.



getDate()  
  getMonth() 0 indicating Jan
 getYear() 
 getDay()weekday 0 indicating Sunday
 getHours() getMinutes()   getSeconds() 
setDate(value)     setMonth(value) setYear(value)     setHours(value) setMinutes(value)  setSeconds(value) setFullYear(yy,mm,dd)
parse(string)

Use : 

<html><body>
<script>
var today= new Date();		//04th Aug 2022
var lastdate=new Date();		//04th Aug 2022
lastdate.setFullYear(2022,7,31);	//31st Aug 2022
if (lastdate>today)  {
	var day = 1000 * 60 * 60 * 24;
	x=(lastdate-today)/day;
  alert("Number of days left "+x);
  }
else  {
  alert("time up and you cannot apply for interview");
  }
</script></body></html>


Hands-on
-----------------------
The electricity bill has to be paid before the 15th of every month. Write java script code that will prompt the user to enter the bill number and credit card number (assume that the site has secure payment gateway). 

If the date user pays the bill beyond 15th but before end of the month, then a fine of Rs. 50 is added for each delayed day. Compute the final bill and pop up the result to the user.

Suppose current date is : 14th Feb --------
Enter the bill amount : [ ] 8700
Either : Your total bill is : 8700	- 14h Feb 
Or : Your total bill after late fees is : 9200 	- 25th	 Feb 
(20 mins)

4th Aug

Bill Amount :	[ 8700	]

Pay

Final Bill : Your total is 8700

25th Aug

Bill Amount :	[ 8700	]

Pay

Final Bill : Your total is 8700+500 = 9200





Three ways :
1) Internal 
2) External
3) Inline





Style Applications using CSS3 and JavaScript

Applying CSS styles to HTML documents
Using CSS3 features to add dynamic styles to elements with events
Using Media Queries and media data to adapt to different screens
Using JavaScript to add and remove styles from elements
Practice: Writing CSS rules to style elements in the document



<div class="demo">Oracle OFSS</div>
<button class="add">Change CSS style</button>

.demo {
  padding: 10px 20px;
  margin-bottom: 20px;
  font-size: 3em;
	
}

button {
  padding: 10px 20px;
  font-size: 1.2em;
}

body {
  font-family: arial;
  padding: 1em;
}


const button = document.querySelector('button');
button.addEventListener('click', () => {
    const element = document.querySelector('.demo');
    element.style.backgroundColor = 'red';
});







Day 2 Agenda
-----------------

Media Queries - CSS3/Javascript
-------------------------------------
RWD






























Dynamically add elements on a web page using javascript
Javascript Objects
 Regular Expressions
Converting Objects to JSON Strings
Cookies , Local Storages
Creating Closures and explaining Variable Scope
Prototypes
Drag-and-Drop
Aninations
Ajax
jQuery

<!DOCTYPE html>
<html>
<head>
<style>
body {
    background-color:lightgreen;
}
@media only screen and (min-width: 600px) {

   .username:before
   {
	content:"User Name :";
   }
    body	
   {
      background-color:lightblue;
   }
}
@media only screen and (min-width: 780px) {

   .username:before
   {
	content:"Please enter User Name :";
   }
    body	
   {
      background-color:pink;
   }
}
@media only screen and (max-width: 500px) {

   .username:before
   {
	content:":::";
	
   }
   body	
   {
      background-color:lightblue;
   }
}
</style>
</head>
<body>
<div class="username">
<input type="text">
</div>
</body>
</html>



-------------------
Dynamically adding controls


createElement
setAttribute



Storage 
====================

localStorage.set and get [""]
sessionStorage

Cookies
key - value	- store the data







 Regular Expressions in javascript

@
.

// Validates email address of course.
function validEmail(e) {
    var filter = /^\s*[\w\-\+_]+(\.[\w\-\+_]+)*\@[\w\-\+_]+\.[\w\-\+_]+(\.[\w\-\+_]+)*\s*$/;
    return String(e).search (filter) != -1;
}

---------Another example :: 

<input type='text' id='txtEmail'/>
<input type='submit' name='submit' onclick='checkEmail();'/>

<script>
    function checkEmail() {
        var email = document.getElementById('txtEmail');
        var filter = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        if (!filter.test(email.value)) {
            alert('Please provide a valid email address');
            email.focus;
            return false;
        }
    }
</script>


Ajax
-------------------




Asynchronous Javascript and XML
-refresh part of a web page and not the whole page



XMLHttpRequest














WHY ??
JSON ( Javascript object notation )

Javascript objects and JSON



/*replace the value of "city" to upper case:*/
var text = '{ "name":"Tarun", "age":"39", "city":"Mumbai"}';
var obj = JSON.parse(text, function (key, value) {
  if (key == "city") {
    return value.toUpperCase();
  } else {
    return value;
  }
});

document.getElementById("demo").innerHTML = obj.name + ", " + obj.city;



The JSON.stringify() method converts JavaScript objects into strings.

When sending data to a web server the data has to be a string.


/*replace the value of "city" to upper case:*/
var obj = { "name":"Tarun", "age":"39", "city":"New York"};
var text = JSON.stringify(obj, function (key, value) {
  if (key == "city") {
    return value.toUpperCase();
  } else {
    return value;
  }
});


-------------------------
Whenever you create a function within another function, you have created a closure. 
The inner function is the closure. 
This closure is usually returned so you can use the outer function’s variables at a later time.

function outerFunction () 
{
    const outer = `I see the outer variable!`
  
    function innerFunction() {
      console.log(outer)
    }
  
    return innerFunction
  }
  
  outerFunction()() // I see the outer variable!



---
Closures in js
 hello()
        {
              let ename = "Tufail"
                 function innerHello()
              {
                      console.log(ename)
              }
             return innerHello();
        }


** this will be available in clousers , 

----------
Jquery

=================

javascript library - show / hide



































