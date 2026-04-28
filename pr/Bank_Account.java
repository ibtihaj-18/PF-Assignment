import java.util.Scanner;
public class Bank_Account{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bankName;
        String accountHoldername;
        String accountNo;
        int amount;
        void transaction(){
            System.out.println("Enter amount you want to deposit: ");
            int depositWish = sc.nextInt();

            if(depositWish <= amount){
                System.out.println("Collect Your Money = " + depositWish);
            }
            else{
                System.out.println("Not Enough Amount Present in your account, Aey Ghareeb");
            }
        }

    }
}