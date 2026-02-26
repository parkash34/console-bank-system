import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Bank {

    private HashMap<String, User> users = new HashMap<>();

    public void registerUser(String name, String id, int pin, double balance){
        User user = new User(name, id, pin, balance);
        users.put(id, user);
    }
    public void saveData() {
        try {
            FileWriter writer = new FileWriter("bank_db.txt");
            for (User user : users.values()) {
                writer.write(user.toCSV() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Could not save data.");
        }
    }

    public void loadData() {
        try {
            File file = new File("bank_db.txt");
            Scanner reader = new Scanner(file);
    
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
            
                String name = parts[0];
                String id = parts[1];
                int pin = Integer.parseInt(parts[2]); 
                double balance = Double.parseDouble(parts[3]); 
    
                User user = new User(name, id, pin, balance);
                users.put(id, user);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file exists yet");
        }
    }


    public User login(String id, int pin){
        if(users.containsKey(id)){
            User user = users.get(id);
            if(user.getPin() == pin){
                return user;
            }
        }
        return null;
    }
}
