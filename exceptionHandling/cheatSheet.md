# ⚙️ Java Exception Handling Cheat Sheet

Exception handling in Java allows you to handle runtime errors gracefully and keep your program running smoothly.

---

## 🧱 Keywords Used in Exception Handling

| **Keyword** | **Description** |
|--------------|----------------|
| `try` | Contains code that might throw an exception |
| `catch` | Handles the exception thrown by the `try` block |
| `finally` | Executes code regardless of whether an exception occurred (used for cleanup) |
| `throw` | Used to manually throw an exception |
| `throws` | Declares exceptions that a method might throw |

---

## ⚙️ Common Exceptions

| **Exception** | **Type** | **Cause** | **Example** |
|----------------|----------|-----------|--------------|
| `Exception` | Compile-time (Base Class) | Parent class of all checked exceptions | `catch(Exception e)` |
| `ArithmeticException` | Runtime | Divide by zero | `int x = 5 / 0;` |
| `ArrayIndexOutOfBoundsException` | Runtime | Invalid array index | `arr[5]` when size < 5 |
| `NullPointerException` | Runtime | Accessing null object | `s.length()` when `s = null` |
| `NumberFormatException` | Runtime | Invalid number format | `Integer.parseInt("abc")` |
| `FileNotFoundException` | Compile-time | File not found | `new FileReader("data.txt");` |
| `IOException` | Compile-time | Input/output error | Reading or writing a file |
| `ClassNotFoundException` | Compile-time | Class not found dynamically | `Class.forName("MyClass");` |
| `InterruptedException` | Compile-time | Thread interrupted | `Thread.sleep(1000);` |

---

✅ **Quick Notes**
- **Checked Exceptions:** Must be handled or declared using `throws`.
- **Unchecked Exceptions:** Occur at runtime (don’t need to be declared).
- `catch(Exception e)` → catches all exceptions.
- Always close files or resources in the `finally` block.
