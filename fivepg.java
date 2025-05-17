public class fivepg {
    public static void main(String[] args) {
        int amount = Integer.parseInt(args[0]);
        System.out.println("The given amount is: "+amount);
        calculate(amount);
    }
    public static void calculate(int amt){
        if(amt > 0 && amt <=500){
            System.out.println("The amount is: "+amt);
        }
        else if(amt > 500 && amt <= 1000){
            int discount = amt * 10 / 100;
            int amount = amt - discount;
            System.out.println("The amount after discount is: "+amount);
        }
        else if(amt > 1000 && amt <= 2000){
            int discount = amt * 20 / 100;
            int amount = amt - discount;
            System.out.println("The amount after discount is: "+amount);
        }
        else{
            System.out.println("Invalid amount");
        }
        }
    }
