
# Java Assignment Test Case

**Name**: Dimas Adit Thalia Putra  
**Class**: SIB - 1B  
**NIM**: 244107060037  

## Description
This repository contains the test cases and implementations of various data structure algorithms in Java. The provided code includes algorithms such as sequential search and sorting techniques like quick sort, shell sort, and others.

## How to Compile and Run the Code

### Compilation Command:
To compile the Java code, use the following command:

```bash
javac -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" "src/dataStructure/*.java"
```

### Running the Tests:
To run the test cases with JUnit, use the following command:

```bash
java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar;src" org.junit.runner.JUnitCore dataStructure.{class}
```

### Example:
Replace `{class}` with the class name you want to test. For example, if you want to run tests for `SequentialSearch`, use:

```bash
java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar;src" org.junit.runner.JUnitCore dataStructure.SequentialSearchTest
```

## Libraries Required:
1. **JUnit**: Version 4.13.2
2. **Hamcrest**: Version 1.3
