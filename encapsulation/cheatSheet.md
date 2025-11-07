+-------------------+-----------------------------------------------------------+
| Concept           | Explanation / Example                                      |
+-------------------+-----------------------------------------------------------+
| Encapsulation     | Hiding internal data (private) and controlling access     |
|                   | via public methods.                                        |
+-------------------+-----------------------------------------------------------+
| Private variable  | private int salary;  // cannot access directly outside    |
+-------------------+-----------------------------------------------------------+
| Public setter     | public void setSalary(int s) { salary = s; }             |
+-------------------+-----------------------------------------------------------+
| Public getter     | public int getSalary() { return salary; }                |
+-------------------+-----------------------------------------------------------+
| Validation        | Inside setter: if(s >= 0) salary = s; else print error   |
+-------------------+-----------------------------------------------------------+
| Example: BankAcct | private float balance;                                    |
|                   | void setBalance(float b){ if(b>=0) balance=b; }          |
|                   | void getBalance(){ System.out.println(balance); }        |
+-------------------+-----------------------------------------------------------+
| Example: Student  | private int marks;                                       |
|                   | void setMarks(int m){ if(m>=0 && m<=100) marks=m; }      |
|                   | int getMarks(){ return marks; }                          |
+-------------------+-----------------------------------------------------------+
| Example: Employee | private static int min_salary=120000;                   |
|                   | void updateSalary(int s){ if(s>=min_salary) min_salary=s;}|
|                   | int getSalary(){ return min_salary; }                    |
+-------------------+-----------------------------------------------------------+
| Benefits          | Protects data, allows validation, safe and maintainable  |
+-------------------+-----------------------------------------------------------+
