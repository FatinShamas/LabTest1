package labtest1;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int items;
		int price1,price2,price3;
		int quant1,quant2,quant3;
		double tot1,tot2,tot3,totprice,disc;
		
		System.out.print("Enter the number of items: ");
		items = in.nextInt();
		System.out.print("Enter price of first items:RM ");
		price1 = in.nextInt();
		System.out.print("Enter quantity of first items: ");
		quant1 = in.nextInt();
		System.out.println();
		
		tot1 = price1 * quant1;
		
		System.out.print("Enter price of second items:RM ");
		price2 = in.nextInt();
		System.out.print("Enter quantity of second items: ");
		quant2 = in.nextInt();
		System.out.println();
		
		tot2 = price2 * quant2;
		
		
		System.out.print("Enter price of third items:RM ");
		price3 = in.nextInt();
		System.out.print("Enter quantity of third items: ");
		quant3 = in.nextInt();
		System.out.println();
		
		tot3 = price3 * quant3;
		
		totprice =tot1 + tot2 + tot3;
		System.out.println("Total Price :RM " +totprice);
		
		if(totprice > 100 ) {
			disc = (totprice * 0.2);
		}else
			disc = (totprice * 0.1);
		
		System.out.println("Discount received:RM " +disc);
		System.out.println("Price to be paid:RM " +(totprice-disc));
			
		
		
		
	
		}
		
	 

	}


