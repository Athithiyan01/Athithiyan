public class fourpg {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println("The given number is: "+num);
        int num1 = Integer.parseInt(args[1]);
        System.out.println("The given number is: "+num1);
        int num2 = Integer.parseInt(args[2]);
        System.out.println("The given number is: "+num2);
        greatestamongthreennumbers(num, num1, num2);
    }
    public static void greatestamongthreennumbers(int a, int b, int c){
        if(a > b && a > c){
            System.out.println("The greatest number is: "+a);
        }
        else if(b > a && b > c){
            System.out.println("The greatest number is: "+b);
        }
        else{
            System.out.println("The greatest number is: "+c);
        }
    }
    
}
