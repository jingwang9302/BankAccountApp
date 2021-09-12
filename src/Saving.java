public class Saving extends Account {
    private int saftyDepositeCode;
    private int saftyDepositNumber;

    public Saving(String name, String SSN, double initialAmount) {
        super(name, SSN, initialAmount);
        accountNumber = "2" + accountNumber;
        setSaftyDepositBox();
    }

    public void showInfo(){
        System.out.println(toString());
    }

    public void setSaftyDepositBox() {
        saftyDepositeCode = (int)(Math.random() * Math.pow(10,4));
        saftyDepositNumber = (int)(Math.random() * Math.pow(10,3));
    }

    @Override
    public void setRate() {
        rate = getBaseRate()*0.25;
    }

    @Override
    public String toString() {
        return super.toString() + "Saving{" +
                "saftyDepositeCode=" + saftyDepositeCode +
                ", saftyDepositNumber=" + saftyDepositNumber +
                '}';
    }
}
