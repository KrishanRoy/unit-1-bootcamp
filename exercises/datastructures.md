# Data Structures

## Resources

* [Video - ArrayList: Arrays the easy way](https://www.udemy.com/java-tutorial/#/lecture/161106)
* [Arrays and ArrayLists](https://github.com/joinpursuit/Pursuit-Core-Android/blob/master/cohort_5.4/unit_01/01_14_Arrays_and_ArrayLists.md)
* [Video - HashMap: Retrieving Objects via a key](https://www.udemy.com/java-tutorial/#/lecture/161682)
* [Video - Sets](https://www.udemy.com/java-tutorial/#/lecture/174878)
* [HashMaps and Sets](https://github.com/joinpursuit/Pursuit-Core-Android/blob/master/cohort_5.4/unit_01/01_15_HashMaps_and_HashSets.md)

# Exercises

Complete these exercises in `DataStructures.java`. Please use the `Cat.java` class to complete these exercises.

#### 1. Cool Cats Pt. II

1. Create an ArrayList of 5 Cats.
2. Use a loop to print the contents of each object in the ArrayList.

#### 2. Most Frequent Element

Write a method called `mostFrequentElement` that takes an ArrayList of
Integers and finds the most frequently occurring element in the ArrayList.
 At the end print the element and its number of occurrences. If there is
 more than one such element, any one of them may be printed.

**Bonus Challenge**

What needs to be changed to make this work on an array of Strings?

#### 3. Group HashMap

1. Create a HashMap that maps the names of all the Pursuit Fellows in your last group HW project to their age.
2. Use a loop to print each key-value pair of the HashMap.

#### 4. canRentACar

Write a method called `canRentACar` that takes the Pod HashMap as a parameter
and returns whether or not the Pod can rent a car. If one or more students is
over 25, it should return `true`. If no one in the Pod is over 25, it should return `false`.

## Exercises++

#### 5. wordsWithoutList

Given an array of strings and an integer, write a method that return a an ArrayList where all the strings of the given length are omitted.

```
wordsWithoutList({"a", "bb", "b", "ccc"}, 1) → {"bb", "ccc"}
wordsWithoutList({"a", "bb", "b", "ccc"}, 3) → {"a", "bb", "b"}
wordsWithoutList({"a", "bb", "b", "ccc"}, 4) → {"a", "bb", "b", "ccc"}
```

#### 6. How many clumps?

Say that a "clump" in an ArrayList is a series of 2 or
more adjacent elements of the same value. Write a method that returns the number of clumps in the given ArrayList.

```
countClumps({1, 2, 2, 3, 4, 4}) → 2
countClumps({1, 1, 2, 1, 1}) → 2
countClumps({1, 1, 1, 1, 1}) → 1
```

#### 7. Sorting sentences

Write a method that takes a String sentence, breaks it up into an
ArrayList of Strings (one word per ArrayList element), and prints out the words in alphabetical order.
