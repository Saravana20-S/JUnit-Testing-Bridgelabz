# JUnit Testing Programs in Java

## Overview

This repository contains solutions for **7 JUnit Testing programs** implemented in **Java** using **JUnit 5** and **Maven**. Each problem is organized into its own package with separate implementation and test classes. The project demonstrates unit testing, mathematical computations, recursion, binary operations, and utility methods.

---

## Technologies Used

- Java 21
- JUnit 5
- Maven
- IntelliJ IDEA

---

## Project Structure

```
JUnitTesting
│
├── pom.xml
│
└── src
    ├── main
    │   └── java
    │       └── com.bridgelabz
    │           ├── vendingmachine
    │           ├── dayofweek
    │           ├── temperatureconversion
    │           ├── monthlypayment
    │           ├── sqrt
    │           ├── binary
    │           └── binaryswap
    │
    └── test
        └── java
            └── com.bridgelabz
                ├── vendingmachine
                ├── dayofweek
                ├── temperatureconversion
                ├── monthlypayment
                ├── sqrt
                ├── binary
                └── binaryswap
```

---

# Problems Implemented

## UC1: Vending Machine

### Description
Calculate the minimum number of currency notes required to return change using recursion.

### Features
- Uses recursion
- Returns minimum number of notes
- Displays notes returned
- JUnit test cases for multiple amounts

### Concepts
- Recursion
- Arrays
- ArrayList
- Unit Testing

---

## UC2: Day of Week

### Description
Determine the day of the week for a given date using the Gregorian calendar formula.

### Features
- Uses mathematical formula
- Returns day number
- JUnit validation

### Concepts
- Static Methods
- Mathematical Computation
- JUnit Assertions

---

## UC3: Temperature Conversion

### Description
Convert temperatures between Celsius and Fahrenheit.

### Features
- Celsius to Fahrenheit
- Fahrenheit to Celsius
- JUnit validation

### Concepts
- Mathematical Formula
- Static Methods
- Unit Testing

---

## UC4: Monthly Payment Calculator

### Description
Calculate monthly loan payment based on principal amount, interest rate, and loan duration.

### Formula

```
Payment = (P × r) / (1 − (1 + r)^−n)
```

Where

- P = Principal
- r = Monthly Interest Rate
- n = Number of Monthly Payments

### Concepts

- Finance Formula
- Math.pow()
- JUnit Testing

---

## UC5: Square Root using Newton's Method

### Description

Compute the square root of a non-negative number using Newton's Iterative Method.

### Features

- High precision calculation
- Uses epsilon accuracy
- Handles invalid input

### Concepts

- Newton's Method
- Iteration
- Exception Handling
- JUnit Testing

---

## UC6: Decimal to Binary Conversion

### Description

Convert a decimal number into a 32-bit binary representation.

### Features

- Binary conversion
- 32-bit padding
- Power of 2 decomposition

### Concepts

- Binary Numbers
- StringBuilder
- Unit Testing

---

## UC7: Binary Nibble Swap

### Description

Convert a decimal number into binary, swap the two nibbles, convert back to decimal, and determine whether the result is a power of two.

### Features

- Binary Conversion
- Nibble Swapping
- Binary to Decimal Conversion
- Power of Two Check

### Concepts

- Bit Manipulation
- Binary Arithmetic
- JUnit Testing

---

# Running the Project

## Clone Repository

```bash
git clone <repository-url>
```

---

## Open Project

Open the project using **IntelliJ IDEA**.

---

## Install Dependencies

Maven automatically downloads all required dependencies.

```bash
mvn clean install
```

---

## Run All Tests

```bash
mvn test
```

or

- Open any test class.
- Click the **Run** button beside the test class.
- IntelliJ will execute all JUnit test cases.

---

# JUnit Features Used

- `@Test`
- `assertEquals()`
- `assertTrue()`
- `assertFalse()`
- `assertThrows()`

---

# Learning Outcomes

- Writing Unit Tests using JUnit 5
- Test-Driven Development (TDD) basics
- Mathematical programming
- Binary number operations
- Recursion
- Newton's Method
- Financial calculations
- Static utility methods
- Maven project structure
- Java package organization

---

# Author

**Saravanan S**

Java Developer | BridgeLabz Java Fellowship
