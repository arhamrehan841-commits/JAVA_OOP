# Overloading vs Overriding Cheat Sheet

## Comparison Table

| Feature       | Overloading                     | Overriding                        |
|---------------|---------------------------------|-----------------------------------|
| **When?**     | Compile-time                   | Runtime                           |
| **Where?**    | Same class                     | Parent-child classes              |
| **Parameters**| Must differ                    | Must be same                      |
| **Return type**| Can differ                     | Must be same                      |
| **Annotation**| No                              | Yes -> `@Override`                |
| **Purpose**   | Add flexibility                 | Change inherited behavior         |
| **Example**   | `add(int,int)` & `add(double,double)` | Parent: `show()`, Child: `show()` |

## Memory Trick
- **Overloading** → many forms, same class  
- **Overriding** → new behavior, subclass
