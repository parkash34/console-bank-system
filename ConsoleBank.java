import java.util.Scanner;


public class ConsoleBank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        bank.loadData();
        while(true){
            System.out.println("\n--- WELCOME TO CONSOLE BANK ---");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("ID: ");
                String id = sc.nextLine();
                System.out.print("PIN: ");
                int pin = sc.nextInt();
                System.out.print("Initial Balance: ");
                double balance = sc.nextDouble();

                bank.registerUser(name, id, pin, balance);
            } else if(choice == 2){
                System.out.print("ID: ");
                String id = sc.nextLine();
                System.out.print("PIN: ");
                int pin = sc.nextInt();
                User user = bank.login(id, pin);

                if(user != null){

                    while(true){
                        System.out.println("\nWelcome " + user.getName());
                        System.out.println("1. Check Balance");
                        System.out.println("2. Deposit");
                        System.out.println("3. Withdraw");
                        System.out.println("4. Logout");

                        int option = sc.nextInt();
                        sc.nextLine();

                        if(option == 1){
                            System.out.println(user.getBalance());
                        } else if(option == 2){
                            System.out.print("Amount: ");
                            double depositAmount = sc.nextDouble();
                            user.deposit(depositAmount);
                        } else if(option == 3){
                            System.out.print("Amount: ");
                            double withDrawAmount = sc.nextDouble();
                            user.withDraw(withDrawAmount);
                        } else if(option == 4){ 
                            break;
                        } else{
                            System.out.println("Invalid credentials.");
                        }
                    }
                }
            } else if(choice == 3){
                bank.saveData();
                System.out.println("Goodbye! See you");
                break;
            }
        }
        sc.close();
    }
}
