# TestHomeWork1

You can find the code here:
TestHomeWork1/TestHomeWork - 1.playground/Contents.swift

Translated the program to Java from Swift. See TriangleProgram.java.

| Test                | Input            |Output|
| -------------       |-------------     |-----|
| Is it Equilateral   | 2,2,2            | Pass |
| Is it Equilateral   | 2,3,2            | Fail |
| Is it Isosceles     | 9,9,2            | Pass |
| Is it Isosceles     | 9,9,0            | Fail |
| Insert some text    | 9,9,"Bird"       | Fail |
| Is it Scalene       | 3,4,10           | Pass |
| Is it Scalene       | 10,4,3           | Pass |



# Evaluation of Jonathan Egebak Carlsen program 
Running inspector in Netbeans:
Controller.java
- Missing Javadoc times two. 

Running Metrics:
- Complexity 3 
  
public int findShapeOfTriangle(int a, int b, int c) {
        //Checks if its scalene 
        // check if a| b | c is 0
        // Check if the sum is bigger than int
        // Check if its a triangle
        if (a + b <= c || a + c <= b || b + c <= a) {
            return -1;
        } else if (a != b && a != c && b != c) {
            return 3;
        } //Checks if its isosceles   
        else if (a == b && b != c || a == c && c != b || b == c && b != a) {
            return 2;
        } //Checks if its equilateral 
        else if (a == b && b == c) {
            return 1;
        } else {
            //Should never be returned.
            return -100;
        } 
    }  

Comments:
- Missing print out of which type of triangle it is, in the console.
- Return type should be a string, to show which triangle it is. 
- Code comments should be on it´s own line. 

# Coding standards
- Use camelCase as the text standard.
- Use english names.
