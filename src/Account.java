public abstract class Account implements IRate{
    // common props
    private String name;
    private String SSN;
    private double balance;
    protected String accountNumber;
    private double initialAmount;

    private static int index = 10000;
    protected double rate;

    //constructor
    public Account(String name, String SSN, double initialAmount) {
        this.name = name;
        this.SSN = SSN;
        this.balance = initialAmount;

        //set account number
        index++;
        this.accountNumber = generateAccountNumber();

        setRate();

    }

    //common methods
    private String generateAccountNumber(){
        String lastTwoSSN = SSN.substring(SSN.length()-2);
        int unique5Digits = index;
        int randomNumber = (int)(Math.random() * Math.pow(10,3));
        return lastTwoSSN + unique5Digits + randomNumber;
    }
    private double deposit(double amount){
        balance += amount;
        System.out.println("Deposit "+ amount);
        return balance;
    }

    private double withdraw(double amount){
        balance -= amount;
        System.out.println("Withdraw " + amount);
        return balance;
    }

    private void transfer(String towhere, double amount){
        balance -=amount;
        System.out.println("Transfer to " + towhere);
    }

    public void showInfo(){
        System.out.println(toString());
    }

    public abstract void setRate();

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", SSN='" + SSN + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", rate=" + rate +
                '}';
    }
}
