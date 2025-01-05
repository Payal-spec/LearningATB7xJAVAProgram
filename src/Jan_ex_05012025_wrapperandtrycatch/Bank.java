package Jan_ex_05012025_wrapperandtrycatch;

public class Bank {
    private String currency;
    private int amount;

    public Bank(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Integer add (Bank Bankname){
        if( !Bankname.currency.equalsIgnoreCase("INR"))
            try {
                throw new Exception("Currency does not matched!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        Integer sum = this.amount + Bankname.amount;
        return sum;
    }
}
