## Codes of Java — Practice Programs

This folder contains small, self-contained Java example programs for learning core concepts, algorithms, recursion, array/matrix problems, and common interview-style exercises.

What you'll find here
- Simple, single-file Java programs (default package) intended to be compiled and run directly.
- Short, focused examples useful for study, experimentation, and step-by-step debugging in an IDE.

Note: File descriptions below are inferred from the filenames. If you want, I can open any specific file and replace the guessed description with an exact summary.

## Quick start (Windows PowerShell)

Open PowerShell in this directory (`d:\Workplace\CodeVault\Java\codesOfJava`) and run:

```powershell
# Compile a file
javac FileName.java

# Run the compiled class (omit .class extension)
java FileName

# Example: compile and run arrays.java
javac arrays.java; java arrays
```

Tips
- Use an IDE (IntelliJ IDEA, VS Code with Java extensions) for easier execution, input prompts, and navigation.
- If a file defines a package, compile from the repository root and include package paths.

## Files in this folder

Below is an index of the files currently present in this folder and brief, practical descriptions to help you pick what to run.

- `arrays.java` — Examples working with arrays (possibly 1D/2D), traversals, search, and formatted output.
- `arraystest.java` — Array practice problems (sorting-related tasks, finding extremes, transforms).
- `arraystest2.java` — Additional array practice cases or variants/tests for `arraystest`.
- `bit.java` — Bit manipulation exercises (masking, shifting, checking bits, toggling, bitwise tricks).
- `calculator.java` — Simple console calculator demonstrating basic arithmetic and I/O.
- `convert.java` — Utilities to convert numbers or formats (e.g., number to words, base conversion).
- `iteration.java` — Loop constructs, pattern printing, and iterative examples.
- `matrix.java` — Matrix operations (reading 2D arrays, multiplication, traversal, or printing patterns).
- `recursion.java` — Fundamental recursion examples (factorial, Fibonacci, recursive sums, string recursion).
- `recursion2.java` — More advanced recursion problems (Hanoi, subsequences, recursion-based searches).
- `recursion3.java` — Additional recursion examples (array recursion or problem-specific implementations).
- `Solution.java` — Likely a solution for a specific problem (single-class entry point for an exercise).
- `Solutions.java` — Possibly multiple solutions or a collection of solved examples.
- `sorting.java` — Sorting algorithm implementations (bubble, selection, insertion, maybe quick/merge).
- `Test.java` — Playground/test harness containing many small utilities and demo calls.
- `README.md` — (this file) overview and instructions.

If any description above doesn't match the actual contents, tell me which file(s) and I'll open them and create accurate summaries.

## How to run multiple examples quickly

To compile all `.java` files in the folder:

```powershell
javac *.java
```

This will emit `.class` files; run any example by invoking `java ClassName`.

## Conventions & suggestions

- Prefer giving classes descriptive names and moving related examples into packages like `algorithms`, `recursion`, or `datastructures`.
- Add small sample input files (where required) and include example invocations and expected output in a comment block at the top of each file.
- Add unit tests (JUnit) for deterministic examples like sorting and conversion functions.

## Small checklist / contract for the folder

- Inputs: console input where used; otherwise examples have internal test values.
- Outputs: printed to console (System.out).
- Success criteria: file compiles with `javac` and runs with `java` producing expected sample output.

Edge cases to keep in mind
- Files that require interactive input will hang if run without providing expected values.
- Some examples may assume integer inputs and can crash on invalid input; consider adding simple validation.

## Next steps I can take (pick one)

1. Open specific files and create exact descriptions and sample input/output for each.
2. Reorganize examples into packages and update compile/run instructions.
3. Add a small batch script (`run-all.ps1`) that compiles and runs a selection of examples and captures output.

Tell me which you'd like and I'll proceed.

---
