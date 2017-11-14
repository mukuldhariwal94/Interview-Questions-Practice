# Data Structures - Stacks and Queues

##Max Stack
##### Familiarity Rating 7
##### Things to ask before diving into problem
* Is this a LIFO stack ?

##### Not Acceptable approach
* Loop through all elements in stack to find max since that is O(n) not O(1)

##### Acceptable approach
* Additional pointer to node to point to prevMax to keep track when popping elements

##### Best Approach

##Stack From Queue
##### Familiarity Rating 7
##### Things to ask before diving into problem
* What functions we want to implement?<br>
like push,pop,size etc...
* What is the use case will there be more pushing or popping?<br>
This can affect where we want to do pre processing when pushing or when popping

##### Acceptable approach
1) Pre process on push
2) Pre process on pop
##### Best Approach
either works depending on use case

##Sort Stack
##### Familiarity Rating 7
##### Things to ask before diving into problem
* What kind of data is in stack? int is easy to compare
* How is stack designed ? should pop give the max element or min element

##### Acceptable approach
<b>Implement</b> max on top, min on top
* Take a temp var and if the new stack have value ( > or < ) then push the element back on first stack
* Once the new stack has no element ( > or <) temp then push that to stack

##### Best Approach
above

##Reverse Stack
##### Familiarity Rating 7
##### Things to ask before diving into problem
* can we use temp variables if not data structures
* Do we have to use existing stack implementation or make our own stack implementation
fyi : Problem is super easy if we implement stack

##### Acceptable approach
1) Pop elements from the stack starting from the bottom of stack<br>
for each elements from bottom insert it back in stack at the very bottom everytime.

##### Best Approach
above
