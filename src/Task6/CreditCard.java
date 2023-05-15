package Task6;

public class CreditCard {
    String accountNumber;
    int currentValue;
    int newCurrentValue;

    public CreditCard(String accountNumber, int currentValue) {
        this.accountNumber = accountNumber;
        this.currentValue = currentValue;
    }

    int replenish(int money) {
        System.out.println("Account № " + accountNumber + " has been replenished " + "+ " + money + " $");
        newCurrentValue = currentValue + money;
        return newCurrentValue;
    }

    int withdraw(int cash) {
        System.out.println(cash + " $" + " has been taken from the account № " + accountNumber);
        newCurrentValue = currentValue - cash;
        return newCurrentValue;
    }

    int checkCurrentValue() {
        System.out.println("Current value of the account № " + accountNumber + " is " + newCurrentValue + " $");
        return newCurrentValue;
    }
}
