import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name, Password and Balance to Create an Account");

//        Create user
        String name=sc.next();
        String password=sc.next();
        double balance=sc.nextDouble();


        BankUser user=new BankUser(name, balance,password);

//        add amount
        String message=user.addMoney(100000);
        System.out.println(message);

//        withdraw money
        System.out.println("Enter amount you want to Withdraw:");
        int money=sc.nextInt();
        System.out.println("Enter password:");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        System.out.println("Remaining Balance :"+user.getBalance());
//        rate of interest
        System.out.println("Interest after 10 years will be:");
        System.out.print(user.calculateInterest(10));
    }

}