# Codes of Java — Practice Programs

A collection of small Java programs used for learning and practicing core concepts, algorithms, and common interview-style problems. Each source file demonstrates a focused topic with comments and examples.

---

## Quick overview

- Language: Java (recommended JDK 11+)
- Purpose: Learning and experimentation — each file is typically self-contained with a `main` method.
- Organization: Files are standalone examples (default package). Use an IDE or command line to compile and run individual files.

---

## How to run an example

From the folder containing the `.java` file:

1. Compile:
   ```bash
   javac FileName.java
   ```
2. Run:
   ```bash
   java FileName
   ```

If a file uses packages, run from the repository root and include package paths accordingly. Use your IDE (IntelliJ/VS Code/Eclipse) for easier input handling and debugging.

---

## File index (short descriptions)

- **arrays.java** — 2D array input, searching for an element, and formatted output.
- **arraystest.java** — Array practice problems (second largest, move zeros, reverse).
- **bit.java** — Bit manipulation examples (set, clear, update via masks).
- **calculator.java** — Console calculator: add, subtract, multiply, divide, percent.
- **convert.java** — Convert numbers to words (up to thousands). String/array usage.
- **iteration.java** — Loop examples and pattern printing (e.g., hollow box).
- **recursion.java** — Multiple recursion examples: sums, factorial, Fibonacci, power, string reverse, patterns.
- **recursion2.java** — Advanced recursion: Tower of Hanoi, subsequences, first/last occurrence, deduplication.
- **recursion3.java** — Recursive sum over an array.
- **sorting.java** — Implementations and explanations: Bubble, Selection, Insertion sorts.
- **Test.java** — Miscellaneous small functions: primes, factorial, common elements, patterns, char counts.

(If any filename above doesn't match current files, refer to the directory to confirm exact names.)

---

## Conventions and tips

- Keep each example in its own file for clarity.
- Prefer descriptive class names when expanding examples.
- Add small input validation and comments to turn quick experiments into reusable snippets.
- When demonstrating algorithms, include both iterative and recursive variants when relevant.

---

## Suggested improvements (for future work)

- Organize examples into packages (e.g., algorithms, recursion, data_structures).
- Add a quick index file (e.g., index.md) with links to each example and sample input/output.
- Include unit tests (JUnit) for deterministic examples.
- Add a CONTRIBUTING.md with coding style and commit guidelines.

---

## Notes

- Some examples expect console input; use your IDE or terminal to provide values.
- For demonstrating division by zero results like NaN, prefer `Double.NaN` where appropriate.

---

## Contact / Ownership

This folder is a personal learning repository. Use and adapt the examples for study. If you plan to share or expand the content, include attribution and consider cleaning up/organizing files into packages.

---