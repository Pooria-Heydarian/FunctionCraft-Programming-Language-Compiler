# FunctionCraft-Programming-Language-Compiler
This project is a complete implementation of a compiler for the **FunctionCraft Programming Language**. The project includes the development of a parser that processes FunctionCraft code, and this documentation provides a thorough explanation of the language features, syntax, and usage.

## Features

- **Parser Implementation:** A robust parser written in [Programming Language/Technology] that accurately processes FunctionCraft code.
- **Function Definitions:** Support for defining and invoking functions, including lambda functions and function pointers.
- **Control Structures:** Implementation of conditional statements (`if`, `else`, `elseif`) and looping constructs (`for`, `do`, `while`).
- **Data Types:** Support for primitive data types including integers, floats, strings, booleans, lists, and function pointers.
- **Pattern Matching:** Sophisticated pattern matching capabilities using `switch-case` style constructs.
- **Scoping:** Well-defined scoping rules that control variable visibility and lifetime.
- **Memory Management:** Efficient memory management features including stack-based allocation for function calls and variable assignments.

## Language Syntax

### Functions

- **Defining Functions:**
  ```plaintext
  def function_name(param1, param2, ...):
      # function body
  end
- **Lambda Function:**
  ```plaintext
  lambda_function = -> (param1, param2, ...) { function_body }
- **Function Pointer:**
  ```plaintext
  fptr = method(:function_name)
### Control Structures

- **conditional Statements:
  ```plaintext
  if condition:
    # code
  elseif another_condition:
    # code
  else:
    # code
  end

### Data Types
Supported Primitive data types include:
- **Integer:** `int`
- **Floating-Point: `float`
- **String:** `string`
- **Boolean:** `bool`
- **List:** `list`
- **Function Pointer: `fptr`

