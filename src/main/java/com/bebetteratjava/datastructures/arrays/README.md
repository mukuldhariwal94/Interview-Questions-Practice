# Arrays

##N Stacks
##### Familiarity Rating 3

##### Things to ask before diving into problem
* What to do if my array is full and I push
* What to do if I try to pop from empty array
* What is n is greater than the size of list?

##### Acceptable approach
1) if no of stacks is 1<br>
Have  a pointer for available index and modify it for push or pop<br/>
2) If no of stacks is 2<br> <b> Implemented </b>
   1) Split array in half in middle <br/>
  the issue with this approach is stack may be full even though there is space in array
   2) Split array from opposite ends <br/>
   this way we overcome issue of space in array since one pointer increments and other decrements
   until array is full
3)  If no of stacks > 2<br/>
<b>Implemented</b>
    1) Create a top of stack array pointer to top of stacks
    2) create a data array 
    3) Create a nextIndex array [used for pushing and popping]
    4) Have a pointer called nextAvailable
        
##### Best Approach
Approach 3


##2 Stacks In Array
##### Familiarity Rating 7
##### Things to ask before diving into problem
* What is n is greater than the 2

##### Acceptable approach
1) Create two pointer, Put first pointer at start of array second pointer in middle of array<br>
This implementation has one issue where  a stack could be full even through there is space is array
and it can be hard to accommodate that
2) Create two pointers one at start of array and one at end.
        
##### Best Approach
Approach 2

##Three Sum
##### Familiarity Rating 6
##### Things to ask before diving into problem
* Are all integers unique in input?
* Are duplicates allowed in output?
* Are permutations accepted as unique sum?

##### Not Acceptable approach
Brute force approach . Have three pointers  and increment them for each numbers.
O(n3) time

##### Acceptable approach
* Sort the input in ascending order<br>
Iterate over each element in array with a start and end pointer pointing to other indexes<br>
<b>Performance Tweaks</b>
    1) Ignore element in array if > 0
    2) Ignore element in array if duplicates both when selecting currIndex and moving start and end indices

##### Best Approach
Above


##Zero Sum SubArray
##### Familiarity Rating 6
##### Things to ask before diving into problem
* What to do if  a subArray of zero sum does not exist
* Do we need to find a subSet of zero sum or smalled subset?
* Can more than one subArray Exist
##### Not Acceptable approach

##### Acceptable approach
1) We could have two pointers and calculate the sub between the pointers. This will take O(n^2)
2) Sort the Array<br>
Find the cumulative sum at each index position (i.e index  = 2 sum of all elements till but excluding index 2)<br>
If there is a subset who's sum is 0 then the sum at end index of the subSet will be same as start index.<br>
This takes O(n) time

##### Best Approach
2 is the best approach


##Merge Arrays
##### Familiarity Rating 5
##### Things to ask before diving into problem
* What is element type in array?
##### Not Acceptable approach

##### Acceptable approach
1) Have two pointers at start of both arrays. Every time an element is copied from 
second array move all elements in first array to right. This has runtime of O(n^2)
2) Shift everything in bigger array at start . Then have two pointers at start of
both array's.Compare elements and copy the smaller one at the currIndex. The advantage
of this from above is that we do not have to move all elements in bigger to right
every time we insert an element from second array.
3) Have start position for both array to end of array. Advantage of this from the
above is that elements in bigger array do not have to be moved to right.Compare
array element and copy the larger
##### Best Approach

##### TODO 
Merge Sort full implementation <br>
Work of figuring use case of if and while in head<br>
&& and  || in head