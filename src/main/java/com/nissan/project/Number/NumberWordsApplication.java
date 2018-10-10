package com.nissan.project.Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class NumberWordsApplication {
	private final NumberWords numberWords ;
	private final BufferedReader reader ;
	
	public NumberWordsApplication() {
		numberWords = new NumberWords() ;
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	
	public void execute() {
		
			try {
				System.out.println( "Enter the number (0 to exit): " ) ;
				String value = reader.readLine() ;
				int number = Integer.parseInt( value ) ;
			     while(number!=0){
		                if(number>0 && number<=999){
		                  
		                       System.out.print("\nAfter conversion:\t");
		                       String s=numberWords.toWords(((number / 100) % 10), " HUNDRED");
		                       System.out.print(s);
		                       String s1=numberWords.toWords((number % 100), " ");
		                       System.out.print(s1);

		                } else{
		                    System.out.print("NUMBER OUT OF RANGE");
		                }
		                System.out.println( "\nEnter the number (0 to exit): " ) ;
						value = reader.readLine() ;
						number = Integer.parseInt( value ) ;
		            }
			} catch ( Exception e ) {
				System.out.println( "Invalid number" ) ;
			}
		
	}

	public static void main(String[] args) {
		new NumberWordsApplication().execute() ;
	}

}
