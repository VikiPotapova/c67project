package Task6;

public class ATM {
    int banknote1 = 20;
    int banknote2 = 50;
    int banknote3 = 100;
    int sumOfBanknotes1;
    int sumOfBanknotes2;
    int sumOfBanknotes3;
    int sumOfMoney;
    boolean result;

    public ATM(int sumOfBanknotes1, int sumOfBanknotes2, int sumOfBanknotes3) {
        this.sumOfBanknotes1 = sumOfBanknotes1;
        this.sumOfBanknotes2 = sumOfBanknotes2;
        this.sumOfBanknotes3 = sumOfBanknotes3;
    }

    int put(int cashIn) {
        System.out.println(cashIn + " $ has been added");
        return sumOfMoney += cashIn;

    }

    boolean take(int cashOut) {
        sumOfMoney -= cashOut;
        if ((cashOut % 20 == 0) || ((cashOut % 50) == 0) || ((cashOut % 100) == 0)) {
            result = true;
            System.out.println(cashOut + " $ is taking with " + sumOfBanknotes1 + " banknotes of " + banknote1 + "$, " + sumOfBanknotes2 + " banknotes of " + banknote2 + "$, " + sumOfBanknotes3 + " banknotes of " + banknote3 + "$");
        } else {
            result = false;
        }
        return result;
    }

}
