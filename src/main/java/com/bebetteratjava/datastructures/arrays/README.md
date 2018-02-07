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
also usecase for && and  || in head


##Merge Arrays
##### Familiarity Rating 7

##### Things to ask before diving into problem
* what elements are in array and how is it sorted
* How to handle duplicate elements in array (if location of element is needed)

##### Not Acceptable approach
Brute force since the rows and columns are also sorted.

##### Acceptable approach
1) do binary search on each row in matrix. Runtime 0(mlogn) ( m is row , n is no of columns)
2) have two binary searches for row and column . a bit complicated and hard to implement.
3) have a pointer at end of row and if number is greater than row then skip the row.<br>
If the nbr is less than last value in row then decrement the pointer to move the columns until nbr is found<br>
take precautions for array out of bounds for row and column

##### Best Approach
3rd approach.

##### TODO 
Find the location of an element in sorted matrix which can hve duplicates


##Longest Consecutive 
##### Familiarity Rating 5

##### Things to ask before diving into problem
* what elements are in array and how is it sorted
* How to handle duplicate elements in array (if location of element is needed)

##### Not Acceptable approach
Brute force

##### Acceptable approach
1) Sort the array and check if next element is expected next element
2) Store all data in a HashSet and check if prev is in set if so skip otherwise 
that is the start of your sequence.At end store the end of sequence and lenght and 
populate an array and return.

##### Best Approach
3rd approach.


