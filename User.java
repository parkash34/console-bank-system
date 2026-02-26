public class User {
    private String name;
    private String id;
    private int pin;
    private double balance;
    
    public User(String name, String id, int pin, double balance){
        this.name = name;
        this.id = id;
        this.pin = pin;
        this.balance = balance;
    }

    public int getPin(){return this.pin;}
    public String getName(){return this.name;}
    public String getId(){return this.id;}
    public double getBalance(){return this.balance;}


    public void deposit(double amount){
        this.balance += amount;
    }
    public void withDraw(double amount){
        if(amount <= this.balance){
            this.balance -= amount;
        } else{
            System.out.println("Insufficient Money!");
        }
    }
    public String toCSV(){
        return name + "," + id + "," + pin + "," + balance;
    }
}
