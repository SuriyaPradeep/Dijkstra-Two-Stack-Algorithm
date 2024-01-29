# Dijkstra-Two-Stack-Algorithm(Java)
Algorithm used for evaluating arithmetic expressions.  The algorithm employs two stacks, an operand stack, and an operator stack, to perform expression evaluation.

### Algorithm Working
 **1. Operand Stack and Operator Stack:**

- **Operand Stack:** This stack is used to store operands (numeric values) encountered in the expression.
- **Operator Stack:** This stack is used to store operators (+, -,* *, /) encountered in the expression.


 **2. Scanning the Expression:**

- The expression is scanned from left to right.
- When a numeric value (operand) is encountered, it is pushed onto the operand stack.
- When an operator is encountered, it is pushed onto the operator stack.

 **3. Handling Parentheses:**

- If an opening parenthesis is encountered, it is ignored.
- If a closing parenthesis is encountered, two operands and one operator are popped from the stacks, the operation is performed, and the result is pushed back onto the operand stack.

**4. Completing the Evaluation:**

- After scanning the entire expression, the algorithm continues to perform operations until both stacks are empty.

**Example:**
Let's consider the expression: `(3 + 4) * 5 - 6 / 2`

1. **Operand Stack:** `3 4 5 6`
2. **Operator Stack:** `+ * - /`

- After scanning the entire expression, the algorithm continues to perform operations:
    1. Pop `*`, pop `5`, and pop `4` (operand stack: `3 20`).
    2. Pop `-`, pop `2`, and pop `6` (operand stack: `3 20 3`).
    3. Pop `+`, pop `3`, and pop `3` (operand stack: `23`).

The final result is `23`, which is the evaluation of the given expression.
