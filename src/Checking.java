public class Checking extends Account{
    private int pin;
    private int cardNumber;

    public Checking(String name, String SSN, double initialAmount) {
        super(name, SSN, initialAmount);
        accountNumber = "1" + accountNumber;
        setDebitCard();
    }

    public void showInfo(){
        System.out.println(toString());
    }

    private void setDebitCard(){
        cardNumber = (int)(Math.random()*Math.pow(10,12));
        pin = (int)(Math.random()*Math.pow(10,4));

    }

    @Override
    public void setRate() {
        rate = getBaseRate()*0.15;
    }

    @Override
    public String toString() {
        return super.toString() + " Checking{" +
                "pin='" + pin + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
