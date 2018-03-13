package com.nhs.checkoutApp;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	
	static float  applePrice=0.60f;
	static float orangePrice=0.25f;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        List<String> itemsPurchase = Arrays.asList(args);  
        int appleCount=0;
        int orangeCount=0;
        System.out.println("Items:\n");
        for (String e : itemsPurchase) {  
        	
           System.out.println(e);
           if(e.equalsIgnoreCase("apple")) {
        	   appleCount++;
           }else if(e.equalsIgnoreCase("orange")) {
        	   orangeCount++;
           }
        }
        
       float totalAmt= Float.valueOf(new DecimalFormat("#.##").format(checkoutItems(appleCount, orangeCount, false))); 
       System.out.println("\nWithout Offer, Total Amount: "+totalAmt);
       
       totalAmt= Float.valueOf(new DecimalFormat("#.##").format(checkoutItems(appleCount, orangeCount, true))); 
       System.out.println("With Offer, Total Amount: "+totalAmt);
    }
	private static float checkoutItems(int appleCount, int orangeCount, boolean offerAvailable) {
		// TODO Auto-generated method stub
		if(offerAvailable==false) {
		return appleCount*applePrice+orangeCount*orangePrice;
		}
		else {
			
			return (appleCount/2+appleCount%2)*applePrice+(orangeCount/3*2*orangePrice+orangeCount%3*orangePrice);
			
		}
		
	}
	
	
}
