package com.nissan.project.Number;

public class NumberWords {

	public String toWords( int num,String val ) {
		String result = "" ;
		  String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
          };
          String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
          if (num > 19) {
              result=result+tens[num / 10] + " " + ones[num % 10];
          } else {
        	  result=result+ones[num];
          }
          if (num > 0) {
        	  result=result+val;
          }
          return result.trim();
	}

}
