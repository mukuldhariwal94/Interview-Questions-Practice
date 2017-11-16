# Bit Manipulation

##No Of 1's In Binary Representation Of Problem
##### Familiarity Rating 9
##### Things to ask before diving into problem
* N/A

##### Acceptable approach

##### Best Approach


##Rotate Bits
##### Familiarity Rating 8
##### Things to ask before diving into problem
* Do we want to rotate left or rotate right?

##### Acceptable approach

##### Best Approach

##Gray Number
##### Familiarity Rating 7
##### Things to ask before diving into problem
* what is gray numbers
##### Acceptable approach
* Exclusive OR the two input numbers
   * keep left shifting the result of XOR until it is odd numbers(i.e %2 == 1) and then if there is only one 1 then next
   left shift should result in a zero equivalent(odd numbers always have 2^0 filled)
   * (X) & (X-1) == 0 if number is power of 2 only(1,2,4,(not 6),8,16,32,64 ...)

##### Best Approach

##Swap Variables
##### Familiarity Rating 7
##### Things to ask before diving into problem

##### Acceptable approach
1) x = x+ y <br>
  y = x - y [(x+y) - y = x] <br>
  x = x - y[(x+y) - ((x+y) - y) = y] <br> 
2) x ^ x ~ 0 (it gets negated) <br>
<b>Order matters</b><br>
x = x ^ y<br>
y = x ^ y [ (x ^ y) ^ y = x]<br>
x = x ^ y [ (x ^ y) ^ ((x ^ y)^ y ) = y] <br>
##### Best Approach
approach 2 since we do not have be concerned with overflow issue's

##Sum
##### Familiarity Rating 8
##### Things to ask before diving into problem

##### Acceptable approach
<implemented> using  Recursion and while loop <br>
1) Calculate the partial sum using XOR <br>
 Calculate the carryover using AND after that left shift by 1.<br>
 repeat this until carryOver is 0;<br>
##### Best Approach
above 