# Data Structures - Linked List

##Nth-to-last Linked List Element
##### Familiarity Rating 7
##### Things to ask before diving into problem
* What is n is greater than the size of list?

##### Acceptable approach
* Have a runner and follower
##### Best Approach

##Split a Linked List
##### Familiarity Rating 7
##### Things to ask before diving into problem
* How to split list in half if it is odd sized
* What if list is empty or has one element only

##### Acceptable approach
*  Have a runner and follower . 
##### Best Approach


##Palindromes
##### Familiarity Rating 8
##### Things to ask before diving into problem

##### Acceptable approach
<b>Implemented ALL </b>
1) Create a reverse linked List and compare it with first one
2) Create a reverse linked List<br>
Find the middle of the linkedList ignore middle element if odd number of letters<br>
Compare the first half of both the original and reversed
3) Use stack to push first half of list and then pop the stack if it is empty by end
then it means list was palindrome

##### Best Approach
 3 is best approach 
 
 
##Print Reversed Linked List
##### Familiarity Rating 6
##### Things to ask before diving into problem
* What is the size of the list?
* What is the value in the list?
* What is the format of the output look like?

##### Acceptable approach
<b>Implemented all </b>(recursion,reversing existing,new reverese)
1) Reverse the existing linked List (Existing or make a copy)

    advantages
    * No extra stack space is used
    * This can be faster than recursion
    
    disadvantages
    * Multiple passes over the list to reverse and print the reversed list
    * Making a copy of original list might take extra space

2) Use Recursion to go to end of list and print the elements from there

    advantages
    * list is not modified
    
    disadvantages
    * a lot of stack space is taken due to recursion

##### Best Approach
depends on size of list


##Dedup Linked List
##### Familiarity Rating 8
##### Things to ask before diving into problem
* Which duplicate needs to be removed the first occurrence or later occurrence?
* Can we use external data structures?
* What is stored in the linked List

##### Acceptable approach
1) Using external data structure [Set]
2) Without using external data structure [double loop]

##### Best Approach
either works a small twist can be to not use a prev variable.

##Random Linked List
##### Familiarity Rating 6
##### Things to ask before diving into problem
* ask details about the structure of linked list
* Can a random pointer point to itself?
* What is going to be value in the list?
* Can a random pointer be null?

##### Acceptable approach
1) Use a map to associate nodes between old and new list<br> 
Create a new list with the random pointing to null<br>
create a mapping of same node in old list to new list<br>
do a second pass over the original list and for original val in map find the new node in mapping and set the random pointer to it.<br>

2)Modify Original List<br>
Create new nodes right after the ordinal with random pointing to null i.e 1st node is original and 2nd node is new list node <br>
The next node in new list list will be one next to what orignial is pointing to<br>
after all is said and done seprate the two list and return the head of new list


##### Best Approach

##List Cycles
##### Familiarity Rating 8
##### Things to ask before diving into problem
* Is it a singly linked list or doubly linked list ?
* Can we mark the nodes as we iterate through it?
* Are we looking for cycles on Nodes(mem address) on value of node(data)?

##### Acceptable approach
1) Create a hashSet and if there is a cycle we can verify if it is in set.<br>
Runtime O(n) Space O(n)
2)Create two nodes slow pointer and fast pointer 

##### Best Approach

