# Miscellaneous

##FizBuzz Problem
##### Familiarity Rating 10
##### Things to ask before diving into problem
* Can numbers be -ve ?
* How is 0 handled ?
* range of input?

##### Acceptable approach
if number is divisible by 15 fizBuzz<br/>
Divisible by 5 buzz <br/>
Divisible by 3 Fizz  <br/>
Else print number
##### Best Approach
Same as above

##Anagram Problem
##### Familiarity Rating 8
##### Things to ask before diving into problem
* What is the input range 26 alphabets or ASCII or 2 byte unicode?
* Is Capitalization an consideration i.e is BANANA same as banana;

##### Acceptable approach
Create an array to store ascii value of first input by incrementing relative pos<br/>
Decrement val from second array<br/>
Check if array is 0 at end

##### Best Approach
Same as above

##String Compression
##### Familiarity Rating 8
##### Things to ask before diving into problem
* Clarify if one repetition must be just char or char 1
##### Acceptable approach
Create a String builder<br>
loop through string comparing two consecutive letters<br>
if the match increment count else append that char and count to sb<br>
after loop append the last char in String and count<br>
check if compressed string is smaller than actual input and return appropriate one<br>
##### Best Approach
Same as above