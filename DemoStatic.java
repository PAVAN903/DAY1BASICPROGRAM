class DemoStatic{

    static int a=20;
    static int b;

 public static void math(int c){
    System.out.println("initializing static block");
    System.out.println(a+b+c);
}
   static {
    System.out.println("static block");
    b=a*30;
  }
 public static void main(String[] args) {
   math(10);
  }
}
