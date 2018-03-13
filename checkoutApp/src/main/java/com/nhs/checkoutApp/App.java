package com.nhs.checkoutApp;

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
        for (String e : itemsPurchase) {  
           System.out.println(e);
           if(e.equalsIgnoreCase("apple")) {
        	   appleCount++;
           }else if(e.equalsIgnoreCase("orange")) {
        	   orangeCount++;
           }
        }
        
       float totalAmt = checkoutItems(appleCount, orangeCount, false);
       System.out.println("Total Amount: "+totalAmt);
    }
	private static float checkoutItems(int appleCount, int orangeCount, boolean offerAvailable) {
		// TODO Auto-generated method stub
		
		return appleCount*applePrice+orangeCount*orangePrice;
		
		
	}
}
