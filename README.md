# Roman Numerals
A simple console application for converting integer numbers between 1-3999 to its corresponding Roman numeral symbol.

## Getting Started
Ensure that Java 8 is installed on your system with the correct `PATH` environment variables.

Clone the repository using the following command
```bash
git clone https://github.com/burhan-u/roman-numerals.git
```

## Compiling and Running
### Compiling
To compile the application, execute the following in the root directory
```bash
javac src/*.java
```

### Running
To run the application, execute the following
```bash
java -cp src/ Main
```

## Testing
Tests will be run using the JUnit Console Launcher, this is included inside the `lib` folder. Please ensure source files inside `src` have already been compiled beforehand.

### Compiling
Compile the test using the following command
```bash
javac -cp lib/junit-platform-console-standalone-1.4.1.jar:src/ test/*.java
```
**Note:** For Windows users, replace `:` with `;`

### Running tests
To run the tests, execute
```bash
java -jar lib/junit-platform-console-standalone-1.4.1.jar --cp src/:test/ -c NumberConverterTest
```
**Note:** For Windows users, replace `:` with `;`
