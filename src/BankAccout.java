import java.util.LinkedList;
import java.util.List;

public class BankAccout{
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();
        String file = "/Users/apple/Downloads/NewBankAccounts.csv";
//        Checking checkingAcc1 = new Checking("Tracey ","678095561", 1000);
//        Saving savingScc1 = new Saving("Tracey","200459236", 2000);
//
//        checkingAcc1.showInfo();
//        savingScc1.showInfo();

        //read csv
        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder){
            System.out.println("new account");
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " "+ SSN + " "+accountType+ " "+initDeposit );

            if(accountType.equals("Savings")){
                System.out.println("open saving");
                accounts.add(new Saving(name,SSN,initDeposit));
            } else if(accountType.equals("Checking")){
                System.out.println("open checking");
                accounts.add(new Checking(name,SSN,initDeposit));
            } else {
                System.out.println("error account type");
            }
        }



        for(Account account : accounts){
            account.showInfo();
        }
        //create account

    }

}
