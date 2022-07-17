package handsOn;
import java.util.Scanner;

public class arithmeticCalculator {
	
	    static void calculate(int n1,int n2,int option) {
	    	int result=0;
	    	if(option==1) {
	    		result+=(n1+n2);
	    		System.out.println(result);
	    	}
	    	else if(option==2) {
	    		result+=(n1-n2);	
	    		System.out.println(result);
	    	}
	    	else if(option==3) {
	    		result+=(n1*n2);
	    		System.out.println(result);
	    	}
	    	else if(option==4) {
	    		result+=(n1/n2);	
	    		System.out.println(result);
	    	}
	 
	    }

        public static void main(String args[]) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the first number: ");
        	int num1=sc.nextInt();
        	System.out.println("Enter the second number: ");
        	int num2=sc.nextInt();
        	System.out.println("Enter the option you want to perform: \n1.add \n2.subtract \n3.multiply \n4.division \n5.exit");
        	
        
        	while(true) {
        	int option=sc.nextInt();
        	if(option==5) {
        		System.out.println("program ends");
        		break;
        	}
        	else if(option>=6) {
        		System.out.println("Wrong option! Choose between 1 and 5");
        		continue;
        	}
        	
            calculate(num1,num2,option);
        	}
        }
}
