public class BankTest {
    public static void main(String args[]) {
        if (args.length == 2 || args.length == 3) {
            BankAccount acc1 = args.length == 2 ? 
                new BankAccount(args[0], Integer.parseInt(args[1])):
                new BankAccount(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            System.out.println("Created a new account");
            System.out.println(acc1.getHolderName());
            System.out.println("Changing holder name");
            acc1.setHolderName("Billybob");
            System.out.println(acc1.getHolderName());
            System.out.println("Adding 200 moneys to your account");
            acc1.deposit(200);
            System.out.println("Withdrawing 100 moneys");
            acc1.withdraw(100);
            System.out.println("Current balance: " + acc1.getBalance());
            System.out.println("Trying to withdraw 150 moneys");
            acc1.withdraw(150);
        } else {
            System.out.println("Please provide at least a holder name and account number.");
        }
        
    }
}
