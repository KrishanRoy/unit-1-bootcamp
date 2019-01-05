# Conditionals

## Resources
[Conditionals](https://github.com/joinpursuit/Pursuit-Core-Android/blob/master/cohort_5.4/unit_01/01_03_Control_Structures_in_Java.md)

# Exercises

1. Write a method `isOdd` that takes in an `int` n. Returns a `true` if n is odd, and `false` otherwise.
2. Write a method `isMultipleOfThree` that takes in an `int` n. Returns `true` if n is a multiple of three, and `false` otherwise.
3. Write a method `isOddAndIsMultipleOfThree` that takes in an `int` n. Returns `true` if n is both odd and a multiple of three, and false otherwise.
4. Write a method `isOddAndIsMultipleOfThree2` - if you used `isOdd` and `isMultipleofThree` in your last solution, don't use it this time. If you did not, write this method building on your last methods.
5. Write a method `fizzMultipleofThree` that takes in an `int` n and prints "Fizz" if n is a multiple of three, and prints n otherwise.

Look at the following `Person.java` class:

```java
package org.pursuit;

public class Person {
    private String name;
    private String phoneNumber;
    private String city;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

5. Write a method that takes in a `Person` and returns `true` if the person is from London, and `false` otherwise.
6. Write a method that takes in a `Person` and prints the name if the person has a name longer than 5 characters, and otherwise prints "Name is too short."

## Exercises++

#### 1. Cigar Party

When squirrels get together for a party, they like to have cigars.
A squirrel party is successful when the number of cigars is between
40 and 60, inclusive. Unless it is the weekend, in which case there
is no upper bound on the number of cigars. Write a method called `
cigarParty` that takes an `int` (the number of cigars) and `boolean`
(whether or not it is the weekend) as parameters, and returns `true`
if the party with the given values is successful, or `false` otherwise.

#### 2. Caught Speeding

You are driving a little too fast, and a police officer stops you.
Write code to compute the result, encoded as an int value: 0=no ticket,
 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
  If speed is between 61 and 80 inclusive, the result is 1. If speed
  is 81 or more, the result is 2. Unless it is your birthday -- on that
  day, your speed can be 5 higher in all cases.

```
caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0
```

#### 3. Alarm Clock

Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue,
...6=Sat, and a boolean indicating if we are on vacation,
return a string of the form "7:00" indicating when the alarm
clock should ring. Weekdays, the alarm should be "7:00" and
on the weekend it should be "10:00". Unless we are on
vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

```
alarmClock(1, false) → "7:00"
alarmClock(5, false) → "7:00"
alarmClock(0, false) → "10:00"
```

#### 4. Lottery Ticket

You have a green lottery ticket, with `int`s a, b, and c on it.
 If the numbers are all different from each other, the result is 0.
 If all of the numbers are the same, the result is 20. If two of
 the numbers are the same, the result is 10. Write a method that
 takes 3 `int`s as parameters and returns the correct result.

#### 5. Blackjack

Given 2 int values greater than 0, return whichever value is
nearest to 21 without going over. Return 0 if they both go over.

```
blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
```

#### 6. Evenly Spaced

Given three ints, a b c, one of them is small, one is medium
and one is large. Return true if the three values are evenly
spaced, so the difference between small and medium is the same
as the difference between medium and large.

```
evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
```