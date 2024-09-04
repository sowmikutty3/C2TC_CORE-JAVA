package com.tns.dayone;

public class Operators {

	    public static void main (String[] args) {
	          
	        // Arithmetic operators
	        int a = 10;
	        int b = 3;
	      
	        System.out.println("a + b = " + (a + b));
	        System.out.println("a - b = " + (a - b));
	        System.out.println("a * b = " + (a * b));
	        System.out.println("a / b = " + (a / b));
	        System.out.println("a % b = " + (a % b));
	        
	        
	        // Using unary operators
	        System.out.println("Postincrement : " + (a++));
	        System.out.println("Preincrement : " + (++a));

	        System.out.println("Postdecrement : " + (b--));
	        System.out.println("Predecrement : " + (--b));
	        
	     // Assignment operators
	        int f = 7;
	        System.out.println("f += 3: " + (f += 3));
	        System.out.println("f -= 2: " + (f -= 2));
	        System.out.println("f *= 4: " + (f *= 4));
	        System.out.println("f /= 3: " + (f /= 3));
	        System.out.println("f %= 2: " + (f %= 2));
	        System.out.println("f &= 0b1010: " + (f &= 0b1010));
	        System.out.println("f |= 0b1100: " + (f |= 0b1100));
	        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
	        System.out.println("f <<= 2: " + (f <<= 2));
	        System.out.println("f >>= 1: " + (f >>= 1));
	        System.out.println("f >>>= 1: " + (f >>>= 1));    
	        
	        
	     // Comparison operators
	      
	        int c = 5;

	        System.out.println("a > b: " + (a > b));
	        System.out.println("a < b: " + (a < b));
	        System.out.println("a >= b: " + (a >= b));
	        System.out.println("a <= b: " + (a <= b));
	        System.out.println("a == c: " + (a == c));
	        System.out.println("a != c: " + (a != c));  
	        
	     // Logical operators
	        boolean x = true;
	        boolean y = false;
	      
	        System.out.println("x && y: " + (x && y));
	        System.out.println("x || y: " + (x || y));
	        System.out.println("!x: " + (!x)); 
	        
	        

	     // Bitwise operators
	        int d = 0b1010;
	        int e = 0b1100;
	        System.out.println("d & e: " + (d & e));
	        System.out.println("d | e: " + (d | e));
	        System.out.println("d ^ e: " + (d ^ e));
	        System.out.println("~d: " + (~d));
	        System.out.println("d << 2: " + (d << 2));
	        System.out.println("e >> 1: " + (e >> 1));
	        System.out.println("e >>> 1: " + (e >>> 1));
	        
	        
	        
	          
	    }
	}
	


