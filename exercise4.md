# Exercise4
Unit tests can help immediately identifying issues in specific functions. This is done by the test calling a method with certain parameters and then validating the return value only passing the test if they match. By doing that, each component of an application can be tested individually and issues can be identified more easily. Using Unit Tests can also help show test coverage (The percentage of classes and methods covered by a Unit Test) to immediately see which part of the program has been tested and which hasn't

## Testing
In this example we're testing a calculator app capable of basic arithemtic operations

### Add
First, add is tested by adding two integers but asserting aginst a double to see how it reacts, adding two integers aginst another integer for basic functionality testing and then adding an integer with a double

### Subtract
Then subtract is tested which first subtracts two doubles and then two integers to test its basic functionality. Finally a negative number is subtracted from itself, asserted against 0

### Multiply
Multiplication is tested with another integer and double operation, one having a nested multiplication with the third test consisting of a very large number multiplied with 0

### Division
Finally division is tested, first with a division that leads to an integer and then a double. Additionally the edge case of division against 0 is tested, which asserts against NaN
