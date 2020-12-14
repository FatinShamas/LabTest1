package labtest1;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double sales;
		double commission=0;
		int hours;
		double wages=0;
		
		
		System.out.print("Enter sales: RM" );
		sales = in.nextDouble();
		System.out.print("Enter hours worked: ");
		hours = in.nextInt();
		
		
		if (sales>= 150 && sales <=300) {
			commission= 0.05 * sales;
		
		}
			else 
				if(sales>= 301 && sales <=500) {
					commission= 0.1 * sales;
					
				}
				else
					if(sales>= 500) {
						commission= 0.15 * sales;
						
					}
		System.out.println();
		System.out.println("Commission: " +commission);
		
		//wages
		wages= hours * 5 + commission;
		System.out.println("Daily wages: " +wages);
	
		}
		
	}




