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

##Kth Most Frequent String
##### Familiarity Rating 4
##### Things to ask before diving into problem
* What if K is greater than occurrence of any word in input?
* What if multiple values have same Kth occurrence
##### Acceptable approach
1. Use Hashmap to calculate frequency and then sort by the value which is frequency<br>
D: Need to implement a custom comparator
2. Use a hashtree( sorted hash table)
3. Map frequency to list of (Strings,Integers) and vice versa( Integer, List<Strings>)<br/>
D: Lookup is o(n) time
4. Use first approach and use alternative to sort to find kth element
##### Best Approach
Need to find one as the above one has flaws.

##### TODO
* Write  a program than returns all words with K frequency.
* Write  a program using java 8

##### Lessons Learned:
* Learned about keySey and how to sort on key in hashmap

##Clock Angle
##### Familiarity Rating 8
##### Things to ask before diving into problem
* How do we want the angle to be represented in radians,degree?
* How accurate should the difference be ?do we consider the change in hour hand during the hour or min
* which angle are we returning? smalled angle(acute or obtuse)
 
##### Acceptable approach
##### Best Approach
##### Lessons Learned:
* type casting can you cause issue if constants are of int type for double type calculations

##Merge K Sorted Arrays
##### Familiarity Rating 
##### Things to ask before diving into problem
* Are all the arrays of same length and how many arrays can be present?

##### Acceptable approach
1) Combine all arrays and sort them after merging all arrays<br>
Runtime (Kn * log(kn)). This does note leverage fact that arrays are presorted
2) Create an array of size of no of arrays  to save curr index in each array and increment pointer if element
is added from given array.<br>
Runtime (Kn * K). Which is worse than before
3) Usage of priority queue.
##### Best Approach
##### Lessons Learned:
* Usage of priority queue and how first solution is not always best also sometimes second one also.




