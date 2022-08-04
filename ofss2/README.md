Oracle University Content
JavaScript and HTML5: Develop Web Applications
JavaScript Fundamentals

Writing JavaScript code to declare variables, objects, functions and arrays
Writing JavaScript Arrays to store data
Defining JavaScript Objects as a key-value store
Accessing the properties of an object
Practice: Writing JavaScript code to pass tests in Jasmine


The JavaScript API

Validating user input with JavaScript and Regular Expressions
Handling multiple values with JavaScript Collections
Manipulating Dates with the JavaScript Date API
Practice: Creating a meal-divider application
Practice: Calculating the total based on the age

Web Application Data

Converting Objects to JSON Strings
Parsing JSON Strings into JavaScript Objects
Storing Objects by using the JSON API, Cookies, and Local Storage
Practice: Saving user input using JSON and Local Storage
Practice: Restoring saved data when page loads

Style Applications using CSS3 and JavaScript

Applying CSS styles to HTML documents
Using CSS3 features to add dynamic styles to elements with events
Using Media Queries and media data to adapt to different screens
Using JavaScript to add and remove styles from elements
Practice: Writing CSS rules to style elements in the document

Advanced JavaScript

Defining Functions
Creating Closures and explaining Variable Scope
Writing JavaScript functions as modules
Creating Prototypes
Creating Drag-and-Drop interactions with JavaScript
Creating JavaScript Timers and Delays to create animations in HTML
Using the HTML5 Canvas Object to draw in pages
Practices: Creating a Canvas, intervals, Drag and Drop, and implementing Mouse Gestures

AJAX and WebSocket

Using AJAX with JavaScript to request data from an Application Server
Using AJAX to consume RESTful Web Services
Using AJAX calls to create "Server Push" interactions
Identifying alternatives to AJAX used in legacy code
Understanding AJAX Security
Using WebSocket to create Real-time Client/Server interactions
Identifying the required Back-End technologies for REST and WebSocket with Java EE7
Practices: Creating a Single-Page Application using RESTand a Tic-Tac-Toe Game Client with WebSocket

Developing Applications with jQuery

Adding jQuery and jQuery UI libraries to your projects
Using Selectors and DOM manipulators to handle documents
Handling Events with jQuery
Animating elements and Applying effects in the document
Handling AJAX server responses

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
  backgroundColor : 'blue'
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





















=============2nd


<div class="demo" style="color: red;">Hello</div>
<button class="add">Change CSS style</button>


.demo {
  padding: 10px 20px;
  margin-bottom: 20px;
  font-size: 3em;
}

.element{
    color: blue;
}

button {
  padding: 10px 20px;
  font-size: 1.2em;
}

body {
  font-family: arial;
  padding: 1em;
  font-weight: bold;
}


const button = document.querySelector("button");
button.addEventListener("click", changeMultipleCSS);

function changeMultipleCSS(e) {
  // Defining all our CSS styles
  const myStyles = `
    display: block;
    width: 80%;
    background-color: red;
    border: 2px;
    font-size: 5em;
    color: white;
    margin: 20px;
    padding-left: 10px;
    padding-bottom: 10px;
    border: 2px solid black;
  `;
  const element = document.querySelector(".demo");

  element.style.cssText = myStyles;
}



=====================3rd

style id="demo">
  .element {
    background: red;
    color: white;
    padding: 10px 20px;
    margin-bottom: 20px;
  }

  button {
    padding: 10px 20px;
    font-size: 1.2em;
  }

  body {
    font-family: arial;
    padding: 1em;
  }
</style>

<div class="element">
  Demo
</div>
<button>Modify Stylesheet</button>




var button = document.querySelector('button');
button.addEventListener('click', modifyStyleSheet);

function modifyStyleSheet(){
  // Getting the stylesheet
  const stylesheet = document.styleSheets[0];
  console.log(stylesheet);
  let elementRules;

  // looping through all its rules and getting your rule
  for(let i = 0; i < stylesheet.cssRules.length; i++) {
    if(stylesheet.cssRules[i].selectorText === '.element') {
      elementRules = stylesheet.cssRules[i];
    }
  }

  // modifying the rule in the stylesheet
  elementRules.style.setProperty('background', 'blue');
}
















