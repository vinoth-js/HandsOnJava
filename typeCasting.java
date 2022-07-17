package handsOn;


public class typeCasting {
     public static void main(String args[]) {
    	 //Implicit typeCasting-from small dataType to large dateType
    	 System.out.println("Implicit typeCasting or Widening");
    	 short s=1;
    	 //implicitly typeCasted
    	 int i=s;
    	 long l=s;
    	 float f=s;
    	 double d=s;
    	 
    	 char c='g';
    	 int ic=c;
    	 double dc=c;
    	 
    	 System.out.println("short to integer: "+i);
    	 System.out.println("short to long: "+i);
    	 System.out.println("short to float: "+i);
    	 System.out.println("short to double: "+i);
    	 
    	 System.out.println("character to int: "+ic);
    	 System.out.println("character to double: "+dc);
    	 
    	 
      	 System.out.println("Explicit typeCasting or Narrowing");
    	 //Explicit typeCasting-from large dataType to small dataType
    	 
    	 float fl=22.2f;
    	 //explicitly typeCasted
    	 long lo=(long)fl;
    	 int in=(int)fl;
    	 short sh=(short)fl;
    	 
    	 System.out.println("float to long: "+lo);
    	 System.out.println("float to int: "+in);
    	 System.out.println("float to short: "+sh);

     }
}
