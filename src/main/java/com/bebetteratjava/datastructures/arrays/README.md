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