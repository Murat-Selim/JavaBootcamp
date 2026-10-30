# Java Bootcamp

Java learning exercises organized by homework and topic. Examples cover arrays, conditions, loops, strings, methods, classes, inheritance, and abstraction.

## Browse the examples

- `src/Homework1/`: language fundamentals and small algorithm exercises.
- `src/Homework2/`: methods, classes, products/customers, and inheritance.
- `src/Homework3/`: credit-management examples.
- `src/Homework4/`: additional object-oriented exercises.

## Run one example

Install a JDK providing `javac` and `java`. The repository has no Maven or Gradle build file; compile an individual example or import the source folder into a Java IDE.

```sh
git clone https://github.com/Murat-Selim/JavaBootcamp.git
cd JavaBootcamp
javac -encoding UTF-8 -d out src/Homework1/array/Main.java
java -cp out Homework1.array.Main
```

This example prints the numbers 1 through 6. Other exercises can contain multiple classes; include their source files when compiling them. Package names and directory capitalization matter.

## Validation

There is no repository-wide test runner. Compile and run the exercise you are changing, then compare its console output with the intended behavior.

## License

[MIT](LICENSE). Preserve original course and third-party attribution.
