import java.util.Random;
public class ThreeDigit{
 public static void main(String [] args){
Random ran=new Random();
int number=ran.nextInt(900)+100;
System.out.println(number);
}
}


------------------------------------------------------
import java.util.Random;
public class FourDigit{
 public static void main(String [] args){
Random ran=new Random();
int number=ran.nextInt(9000)+1000;
System.out.println(number);
}
}