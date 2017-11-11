# Data Structures - Linked List

##Binary Search Tree Validation
##### Familiarity Rating 5
##### Things to ask before diving into problem
* What are the values in the tree String,int ?
* How are duplicates handled in here left or right of parent?<br/>
Usually duplicate goes in left

##### Not Acceptable approach


##### Acceptable approach


##### Best Approach


#### Lessons Learned
* Double check you input data 3 times before starting the problem. I made a mistake in creating initial data loosing valuable time

## Tree Level Order
##### Familiarity Rating 8
##### Things to ask before diving into problem
* How to handle tree with no values
##### Not Acceptable approach

##### Acceptable approach
BFS using queue
##### Best Approach
same as above

#### Lessons Learned
* How to implement a Queue in java.

## Longest Consecutive Branch
##### Familiarity Rating 6
##### Things to ask before diving into problem
* What data does the tree consist of ?
* what do you mean by consecutive  ? 123 or 321
##### Acceptable approach
1) Using recursion we will navigate the tree <br>
In method signature we will pass the next node & prev value & prev length <br>
If next node is +1 of prev we call recursively both left and right subtree with length + 1<br>
find the max of returned value and assign that as max<br>
Otherwise we call recursively left and right og the  node with length 1 (new count start)<br>
compare this with the prev lenght and return the max value
##### Best Approach
above


## Balanced Binary Tree
##### Familiarity Rating 5
##### Things to ask before diving into problem
* What is definition of BST? FYI there are 2 . Here is [example](https://www.youtube.com/watch?v=nOcFiGl5Vy4)
    1) No two branches in the full tree are more than 1 different
    2) Given any node in tree the left and right subtree are no more than 1 diff in max height <b>Implementing</b>
##### Not Acceptable approach

##### Acceptable approach

##### Best Approach



