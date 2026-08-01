# java_daily — Java concepts explained (up to the topics in this repo)

This README focuses on clear, practical explanations of the Java language features that this repository exercises. It is not a setup guide — instead it explains concepts and shows short idiomatic examples so you can understand and extend the exercises already in the repo (folders: Array, Looping, Methods, Recursion, Scanner, Strings, conditonal_statement).

---

## Quick map of topics in this repo
- conditonal_statement — if / if-else / switch
- Looping — for, enhanced for (for-each), while, do-while
- Array — single-dimensional arrays and basic array-processing patterns
- Strings — String API, comparison, mutability concerns, StringBuilder
- Methods — declaration, parameters, return types, overloading, recursion examples
- Recursion — base case, recursion pattern, example problems
- Scanner — console input handling and common pitfalls

---

## 1. Basic Java building blocks (very short recap)
- Every Java program is built from classes. Execution starts at public static void main(String[] args).
- Types: primitive (int, long, double, boolean, char, byte, short, float) and reference types (String, arrays, objects).
- Variables have a type; local variables must be initialized before use.
- Expressions and statements: Java evaluates expressions and executes statements; semicolon ends a statement.

Example main skeleton:
```java
public class Example {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```

---

## 2. Conditional statements
- if: evaluates a boolean expression and executes a block.
- if-else: choose between two branches.
- else-if chains: evaluate sequentially.
- switch: good for discrete value branching (works with int, String, enums).

Examples:
```java
int x = 10;
if (x > 0) {
    System.out.println("positive");
} else if (x < 0) {
    System.out.println("negative");
} else {
    System.out.println("zero");
}

// switch with String
String s = "red";
switch (s) {
    case "red" -> System.out.println("stop");
    case "green" -> System.out.println("go");
    default -> System.out.println("unknown");
}
```

Notes:
- Use braces {} even for single-line blocks — it's clearer and safer.
- Avoid complex logic in condition expressions; extract to well-named boolean methods.

---

## 3. Looping constructs
- for: counted loops.
- enhanced for (for-each): iterate collections/arrays.
- while: pre-check loop.
- do-while: post-check loop (executes at least once).

Examples:
```java
// basic for
for (int i = 0; i < 10; i++) { /* ... */ }

// for-each
int[] arr = {1,2,3};
for (int v : arr) {
    System.out.println(v);
}

// while
int i = 0;
while (i < arr.length) {
    i++;
}

// do-while
int j = 0;
do {
    j++;
} while (j < 1);
```

When to use which:
- for: when index is needed or known number of iterations.
- for-each: when you only need elements.
- while/do-while: when repetition depends on runtime condition.

---

## 4. Arrays
- Declaration: int[] a; or int a[];
- Creation: a = new int[5]; or int[] a = {1,2,3};
- Arrays are fixed-size; use Lists for dynamic size.
- Common patterns: traversal, searching, reversing, aggregating (sum, max), sorting.

Examples:
```java
int[] nums = {3, 1, 4, 1, 5};
int sum = 0;
for (int n : nums) sum += n;

// find max
int max = nums[0];
for (int n : nums) if (n > max) max = n;
```

Tips:
- Pass arrays to methods to keep code modular.
- Use Arrays utility class: Arrays.sort(arr), Arrays.toString(arr).

---

## 5. Strings
- Strings are immutable reference types.
- Use equals(...) to compare content, not `==`.
- Common methods: length(), charAt(i), substring(begin, end), indexOf(...), toLowerCase(), trim().
- For building/modifying strings repeatedly, use StringBuilder.

Examples:
```java
String a = "hello";
String b = new String("hello");
System.out.println(a.equals(b)); // true
System.out.println(a == b);      // likely false

// StringBuilder for concatenation in loops
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 3; i++) sb.append(i).append(',');
String result = sb.toString();
```

Pitfalls:
- Using nextLine() after nextInt() with Scanner — need to consume newline.

---

## 6. Methods (functions)
- Syntax: [modifiers] returnType name(params) { ... }
- static methods belong to the class; instance methods belong to objects.
- Overloading: same method name, different parameter lists.
- Keep methods short and single-responsibility.

Example:
```java
public static int add(int a, int b) {
    return a + b;
}
```

Passing arrays and objects:
- Java passes references by value. Modifying an object's internal state inside a method affects caller; reassigning the parameter doesn't.

---

## 7. Recursion
- Recursion: a method calling itself. Must have a base case to stop recursion.
- Use recursion when a problem is naturally hierarchical (tree traversal, divide-and-conquer) but watch stack depth.

Factorial example:
```java
public static int factorial(int n) {
    if (n <= 1) return 1;        // base case
    return n * factorial(n - 1);
}
```

Tail recursion vs normal recursion:
- Java does not guarantee tail-call optimization; deep recursion can cause StackOverflowError. Convert to iterative solutions where necessary.

---

## 8. Scanner (console input)
- java.util.Scanner reads tokens and lines from InputStream (System.in).
- Methods: nextInt(), next(), nextLine(), hasNext(), hasNextInt().

Example:
```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
if (sc.hasNextInt()) {
    int n = sc.nextInt();
    sc.nextLine(); // consume leftover newline if you plan to call nextLine() next
}
sc.close();
```

Common pitfall:
- After nextInt(), the newline remains in the buffer; calling nextLine() will read that empty line. Use an extra nextLine() to consume it.

---

## 9. Small problem patterns used in the repo
- Area calculations (Acircle.java, Atriangle.java) — use basic arithmetic and Math library (Math.PI).
- Simple arithmetic/exercises (Addition.java, Discount.java) — practice operators and I/O.
- Run / Run1 — likely harness or main method examples to run other classes.

Recommended patterns for solutions:
- Validate inputs early.
- Keep main method thin: parse input and delegate to well-named methods.
- Add unit tests for logic methods where possible.

---

## 10. Short reference: common idioms
- Compare strings: a.equalsIgnoreCase(b) or a.equals(b).
- Null-safe equals: Objects.equals(a, b).
- Iterating with index and element:
  for (int i = 0; i < arr.length; i++) { int val = arr[i]; }
- Defensive programming: check array bounds, null checks.

---

## Where to look in this repo
- Open folders like `Looping`, `Array`, `Strings` and read their Java files and any local README per exercise.
- For each example: identify the main() method or file with sample inputs, read implementation, then refactor into small methods (good learning practice).

---

## Next steps (suggested)
- For each folder pick one file, rewrite the solution so the main delegates to small methods and add short comments explaining each step.
- Add unit tests (JUnit) for algorithmic methods (not main).
- For recursion examples, add an iterative equivalent to compare performance and stack behavior.

---

License / Contact
- This repo is maintained by sumitjhalava. If you want I can commit this README to the repository or expand any topic with deeper examples (e.g., collections, OOP, exceptions, file I/O).
