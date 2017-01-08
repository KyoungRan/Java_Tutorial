# Java Practicum New Year

Happy New Year! Let's write some code.

We're going to keep it a little easier today and just practice the basics again. Here's today's TODO list:

1. Fork this project on Github
2. Clone your fork using IntelliJ
3. Create a `main` function
4. Print Hello World to the screen
5. Create a `static` function called `add`
    1. The function should take in two `int` parameters
    2. It should return the sum of the two parameters
    3. In your main function, create a variable called `sum` that stores an `int`
    4. In your main function, call `add` with the parameters 3 and 5, and store the output into `sum`
6. In `MainTest`, create a new test method called `testAdd`
    1. In `testAdd`, run `add` with 2 and 4 as inputs, and assert that the output is 6
    2. In `testAdd`, run `add` with -3 and 7 as inputs, and assert that the output is 4
7. Create a function called `explode`
    1. The function should take in one `String` as a parameter
    2. Loop through each character in the `String` and print it
        * (Hint) [length](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#length())
        * (Hint) [charAt](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#charAt(int))
    3. In your `main` function, call `explode` with the word "Boom"
8. Create a new class called `FancyPrinter`
    1. It should have an instance variable called `stringArr` that is a `String` array
    2. Create a constructor for `FancyPrinter` that takes in a `String`
        1. The constructor should [split](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)) the string on spaces and store the split string into `stringArr`
    3. Create a method called `print` that takes in no parameters
        1. The method should print out each member of `stringArr` on its own line
    4. In your `main` function, create and store an instance of `FancyPrinter`, passing "I can code" into the constructor
    5. In your `main` function, call the `FancyPrinter` instance's `print` method
9. Create a new class called `ClassyPrinter`
    1. `ClassyPrinter` should inherit from `FancyPrinter`
    2. Override the `print` function
        1. The `print` function should print the contents of `stringArr` in reverse order
    3. In your `main` function, create and store an instance of `ClassyPrinter`, passing "I'm a pro" into the constructor
    4. In your `main` function, call the `ClassyPrinter` instance's `print` method
    5. Create another `print` method that takes in a `boolean`
        1. If the parameter is `true`, call the `super` class's `print` method
        2. If the parameter is `false`, call this class's `print` method that takes in no parameters
    7. In your `main` function, call `print` from your `ClassyPrinter` instance with `true` as an input
10. Pat yourself on the back. Good job.