//: Playground - noun: a place where people can play

import UIKit




func isItATriangle(a:Int,b:Int,c:Int) -> String
{
    
    var result = 0
    
    //Check that it is a triangle
    if(a == 0 || b == 0 || c == 0)
    {
        return "Invalid"
    }
    if(a + b > c || a + c > b || c + b > a)
    {
        
        //Scalene
        if(a != b && a != c && c != b)
        {
            result = 1
        }
        
        //Isosceles
        if(a == b || a == c || c == b)
        {
            result = 2
        }
        //Equilateral
        if(a == b && a == c && c == b)
        {
            result = 3
        }
    }
    else
    {
        result = 0
    }
    switch(result) {
    case 1:
        return "scalene"
    case 2:
        return "isosceles"
    case 3:
        return "equilateral"
    default :
        return "Invalid"
    }
}
 //Scalene

isItATriangle(a: 1, b: 2, c: 3)

//Isosceles
isItATriangle(a: 1, b: 2, c: 1)

//Equilateral
isItATriangle(a: 1, b: 1, c: 1)

//Not a triangle
isItATriangle(a: 0, b: 1, c: 1)
