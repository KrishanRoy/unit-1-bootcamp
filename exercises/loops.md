# Loops

## Resources

* [For Loops](https://github.com/joinpursuit/Pursuit-Core-Android/blob/master/cohort_5.4/unit_01/01_05_For_Loops_and_Methods.md)
* [While Loops](https://github.com/joinpursuit/Pursuit-Core-Android/blob/master/cohort_5.4/unit_01/01_04_While_Loops_in_Java.md)

# Exercises

1. Write a method that prints the numbers 1 through 10 using a loop.
2. Write a method that prints the numbers 1 through 10 using a different kind of loop.
3. Write a method that takes in an `int` n and prints the numbers 1 through n.
4. Write a method that takes in an `int` n and prints the even numbers 2 through n.
5. Write a method that prints the sum of 1 through 10 using a loop.
6. Write a method that takes in an `int` n and prints the sum of the numbers 1 through n using a loop.
7. Use the method you wrote in part 6 to print the sum of the numbers from 1 through 10000.
8. Write a method that takes in an `int` n and a `String` s and prints out s on its own line, n times. If n is negative, print "".
9. Modify the method to print out the string concatenated with itself n times.
10. Write a method that prints the first ten Fibonnaci numbers.
11. Modify the method to sum the first ten Fibonnaci numbers.
12. Modify the method to take in an `int` n and sum the first n Fibonnaci numbers.

## Exercises++

#### 1. `sumNumbers`

Given a string, return the sum of the numbers appearing in the string,
ignoring all other characters. A number is a series of 1 or more digit
chars in a row. (Note: Character.isDigit(char) tests if a char is one
of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a
string to an int.)

```
sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
```

#### 2. Is Not

Given a string, return a string where every appearance of the
lowercase word "is" has been replaced with "is not". The word
"is" should not be immediately preceeded or followed by a
letter -- so for example the "is" in "this" does not count.
(Note: Character.isLetter(char) tests if a char is a letter.)

```
notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
```

#### 3. Between Words

Given a string and a non-empty word string, return a string made
of each char just before and just after every appearance of the
word in the string. Ignore cases where there is no char before or
after the word, and a char may be included twice if it is between two words.

```
wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
```

#### 4. Number Puzzle

Use nested for loops to generate a list of all the pairs of
positive two digit numbers whose sum is 60, and whose difference is 14.

#### 5. Digits

Use nested for loops to generate a list of all the positive
two digit numbers. Display the numbers, and the sums of their digits.

```
10, 1+0 = 1
11, 1+1 = 2
12, 1+2 = 3
13, 1+3 = 4
14, 1+4 = 5
15, 1+5 = 6
16, 1+6 = 7
17, 1+7 = 8
18, 1+8 = 9
19, 1+9 = 10
20, 2+0 = 2
21, 2+1 = 3
22, 2+2 = 4

// (etc.)

97, 9+7 = 16
98, 9+8 = 17
99, 9+9 = 18
```
