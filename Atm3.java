import java.util.* ;
import java.io.*;

class User {
    private String name;
    private String accountNumber;
    private double balance;
    private int pin;
  
    public User(String name, String accountNumber, double balance, int pin) {
      this.name = name;
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.pin = pin;
    }
  
    public String getName() {
      return name;
    }
  
    public String getAccountNumber() {
      return accountNumber;
    }
  
    public int getPin(){
      return pin;
    }
  
    public double getBalance() {
      return balance;
    }
  
    public void deposit(double amount) {
      balance += amount;
    }
  
    public void withdraw(double amount) {
      balance -= amount;
    }
  }
  
  class Admin {
    private ATM atm;
  
    public Admin(ATM atm) {
      this.atm = atm;
    }
  
    public void createNewUser(String name, String accountNumber, double balance, int pin) {
      atm.createUser(name, accountNumber, balance, pin);
    }
  
    public void deleteUser(String accountNumber) {
      atm.deleteUser(accountNumber);
    }
  
    public User[] getUsers() {
      return atm.getUsers();
    }
  }
  
  class ATM {
    private User[] users;
    private String adminPassword;
    private int numberOfUsers;
  
    public ATM(String password) {
      users = new User[100];
      adminPassword = password;
      numberOfUsers = 0;
    }
  
    public User getUser(String accountNumber) {
      for (int i = 0; i < numberOfUsers; i++) {
        if (users[i].getAccountNumber().equals(accountNumber)) {
          return users[i];
        }
      }
      return null;
    }
  
    public boolean authenticate(String accountNumber, String pin) {
      User user = getUser(accountNumber);
      if (user != null) {
        // Authenticate user based on PIN
        return true;
      }
      return false;
    }
  
    public void deposit(String accountNumber, double amount) {
      User user = getUser(accountNumber);
      if (user != null) {
        user.deposit(amount);
      }
    }
  
    public void withdraw(String accountNumber, double amount) {
      User user = getUser(accountNumber);
      if (user != null) {
        user.withdraw(amount);
      }
    }
  
    public double checkBalance(String accountNumber) {
      User user = getUser(accountNumber);
      if (user != null) {
        return user.getBalance();
      }
      return -1;
    }
  
    public boolean isAdmin(String password) {
      return password.equals(adminPassword);
    }
  
    public void createUser(String name, String accountNumber, double balance, int pin) {
      if (numberOfUsers < 100) {
        users[numberOfUsers] = new User(name, accountNumber, balance, pin);
        numberOfUsers++;
      }
    }
  
    public void deleteUser(String accountNumber) {
      for (int i = 0; i < numberOfUsers; i++) {
        if (users[i].getAccountNumber().equals(accountNumber)) {
          users[i] = null;
          for (int j = i; j < numberOfUsers - 1; j++) {
            users[j] = users[j + 1];
          }
          users[numberOfUsers - 1] = null;
          numberOfUsers--;
          break;
        }
      }
    }
  
    public User[] getUsers() {
      return Arrays.copyOf(users, numberOfUsers);
    }
  }
  
  public class Atm3 {
    public static void main(String[] args) throws IOException {
      ATM atm = new ATM("admin123");
      Admin admin = new Admin(atm);
  
      // Load users from file
      BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
      String line;
      while ((line = reader.readLine()) != null) {
        String[] values = line.split(",");
        String name = values[0];
        String accountNumber = values[1];
        double balance = Double.parseDouble(values[2]);
        int pin = Integer.parseInt(values[3]);
        atm.createUser(name, accountNumber, balance, pin);
      }
      reader.close();
  
      Scanner scanner = new Scanner(System.in);
      boolean quit = false;
      while (!quit) {
        System.out.println("1. Create new user");
        System.out.println("2. Delete user");
        System.out.println("3. View all users");
        System.out.println("4. Deposit");
        System.out.println("5. Withdraw");
        System.out.println("6. Check balance");
        System.out.println("7. Exit");
        System.out.print("Enter choice (1-7): ");
        int choice = scanner.nextInt();
  
        switch (choice) {
          case 1:
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter account number: ");
            String accountNumber = scanner.next();
            System.out.print("Enter balance: ");
            double balance = scanner.nextDouble();
            System.out.print("Enter PIN: ");
            int pin = scanner.nextInt();
  
            admin.createNewUser(name, accountNumber, balance, pin);
            break;
          case 2:
            System.out.print("Enter account number: ");
            accountNumber = scanner.next();
            admin.deleteUser(accountNumber);
            break;
          case 3:
            User[] users = admin.getUsers();
            for (int i = 0; i < users.length; i++) {
              if (users[i] != null) {
                System.out.println("Name: " + users[i].getName());
                System.out.println("Account number: " + users[i].getAccountNumber());
                System.out.println("Balance: " + users[i].getBalance());
                System.out.println("PIN: " + users[i].getPin());
              }
            }
            break;
          case 4:
            System.out.print("Enter account number: ");
            accountNumber = scanner.next();
            System.out.print("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            atm.deposit(accountNumber, depositAmount);
            break;
          case 5:
            System.out.print("Enter account number: ");
            accountNumber = scanner.next();
            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();
            atm.withdraw(accountNumber, withdrawalAmount);
            break;
          case 6:
            System.out.print("Enter account number: ");
            accountNumber = scanner.next();
             balance = atm.checkBalance(accountNumber);
            if (balance != -1) {
              System.out.println("Balance: " + balance);
            } else {
              System.out.println("Invalid account number.");
            }
            break;
          case 7:
            quit = true;
            break;
          default:
            System.out.println("Invalid choice.");
            break;
        }
        System.out.println();
      }
      scanner.close();
    }
  }