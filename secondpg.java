public class secondpg {
    public static void main(String[] args) {
        int num = 243;
        int rev = 0;
        while(num!=0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number is: " + rev);}
    
}
