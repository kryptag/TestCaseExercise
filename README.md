# TestCaseExercise
Was given a buggy implementation of an arraylist and was supposed to test and then fix errors


The changes can be found in MyArrayListWithBugs.java on line 37 and 63.

## Get method

The problem here was that on line 37 there was checked for `if(index <= 0 || nextFree < index)` .
This made it impossible to get the first entry in the ArrayList because its starts on 0

## Add to index method
The problem here is that after we add an Object to the Array we want to move `nextFree` up.
this was never done in `public void add(int index, Object o)` but only in  `public void add(Object o)`. So by putting a simple `nextFree++` at the end of `public void add(int index, Object o)` we squashed the bug
