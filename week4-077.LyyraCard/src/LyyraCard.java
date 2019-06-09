public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    @Override
    public String toString() {
        return "The card has " + balance + " euros";
    }

    public void payEconomical() {
        // write code here
        if(this.balance - 2.50 >= 0){
            this.balance = balance - 2.50;
        }
    }

    public void payGourmet() {
        // write code here
        if (this.balance - 4.00 >= 0) {
            this.balance = balance - 4.00;
        }
    }

    public void loadMoney(double amount) {
        // write code here
        if(amount < 0){
            this.balance = balance + 0;
        }

        if(this.balance + amount > 150) {
            this.balance = 150;
        }
        else if (amount < 0){
                amount=0;
        } else
            this.balance = balance + amount;

    }


}
