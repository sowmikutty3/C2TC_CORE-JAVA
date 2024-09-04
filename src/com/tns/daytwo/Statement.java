package com.tns.daytwo;

public class Statement {
	public static void main (String[] args) {
	    //Conditional statements
		//if   
		
		int x = 10;    
		int y = 12;    
		if(x+y > 20)
		{    
		System.out.println("x + y is greater than 20");    
		} 
		
		//if else
		
		if(x+y < 10) {  
			System.out.println("x + y is less than      10");  
			}   else {  
			System.out.println("x + y is greater than 20");  
			} 

		//if else if
		
		String city = "Delhi";  
		if(city == "Meerut") {  
		System.out.println("city is meerut");  
		}else if (city == "Noida") {  
		System.out.println("city is noida");  
		}else if(city == "Agra") {  
		System.out.println("city is agra");  
		}else {  
		System.out.println(city);  
		}  
		
		//nested if 
		
		String address = "Delhi, India";    
	    
		if(address.endsWith("India")) {    
		if(address.contains("Meerut")) {    
		System.out.println("Your city is Meerut");    
		}else if(address.contains("Noida")) {    
		System.out.println("Your city is Noida");    
		}else {    
		System.out.println(address.split(",")[0]);    
		}    
		}else {    
		System.out.println("You are not living in India");    
		} 
		
		//switch 
		
		int num = 2;  
		switch (num){  
		case 0:  
		System.out.println("number is 0");  
		break;  
		case 1:  
		System.out.println("number is 1");  
		break;  
		default:  
		System.out.println(num);  
		}  
		
		//Looping Statements
		// for loop
		
		int sum = 0;  
		for(int j = 1; j<=10; j++) {  
		sum = sum + j;  
		}  
		System.out.println("The sum of first 10 natural numbers is " + sum);  
		
		//While loop
		
		int i = 0;    
		System.out.println("Printing the list of first 10 even numbers \n");    
		while(i<=10) {    
		System.out.println(i);    
		i = i + 2;    
		}  
		
		// Do while loop
		
		   
		System.out.println("Printing the list of first 10 even numbers \n");    
		do {    
		System.out.println(i);    
		i = i + 2;    
		}while(i<=10); 
		
		//break statement
		
		for(int n = 0; n<= 10; n++) {  
			System.out.println(i);  
			if(i==6) {  
			break;  
			}  
			}  
		

		//continue statement
		
		  
		for(int k = 0; k<= 2; k++) {  
		  
		for (int j = i; j<=5; j++) {  
		  
		if(j == 4) {  
		continue;  
		}  
		System.out.println(j);  
		}  
		}  
		
		

}
}
