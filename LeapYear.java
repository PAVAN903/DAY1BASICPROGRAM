import java.util.Scanner;
class LeapYear{
  public static void main (String [] args){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter a year");
     int year=sc.nextInt();
      boolean isLeapYear=false;

       if(year %4 ==0){
 	
	if(year % 100==0){

	if (year % 400==0){
	     isLeapYear=true;
}

}else{
isLeapYear=true;
}
}
    if(isLeapYear){
	System.out.println(year + "is leapyear");
	}else{
	      System.out.println(year + "not leapyear");

}
}
}