public class thirdpg {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println("The given number is: "+num);
        chknum(num);
    }
    public static  void chknum(int a){
        if( a >0){
            System.out.println("Positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
            
    }
}
