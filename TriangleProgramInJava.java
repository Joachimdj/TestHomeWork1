/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleprogram;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 *
 * @author joachimdittman
 */
public class TriangleProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TriangleProgram n = new TriangleProgram();
        System.out.println(n.isItATriangle(2, 2, 2));
        System.out.println(n.isItATriangle(2, 3, 2));
        System.out.println(n.isItATriangle(9, 9, 2));
        System.out.println(n.isItATriangle(9, 9, 0));
        System.out.println(n.isItATriangle(3, 4, 10));
        System.out.println(n.isItATriangle(10, 4, 3));
        
        
    }
    
    public String isItATriangle(int a, int b, int c)
    {
       int result = 0;
        //Check that it is a triangle
    if(a == 0 || b == 0 || c == 0)
    {
        return "Invalid";
    }
    if(a + b > c || a + c > b || c + b > a)
    {
        
        //Scalene
        if(a != b && a != c && c != b)
        {
            result = 1;
        }
        
        //Isosceles
        if(a == b || a == c || c == b)
        {
            result = 2;
        }
        //Equilateral
        if(a == b && a == c && c == b)
        {
            result = 3;
        }
    }
    else
    {
        result = 0;
    }
        
        switch(result) {
   case 0 :
      // Statements
      return "Scalene";
   
   case 1 :
      // Statements
     return "Isosceles";
   case 2 :
      // Statements 
        return "Equilateral";
   case 3 :
      // Statements
      return "Invalid"; 
   
      
   // You can have any number of case statements.
   default : // Optional
      // Statements
       return "Invalid";
} 
    }
    
}
