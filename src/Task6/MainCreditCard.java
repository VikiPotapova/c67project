package Task6;

public class MainCreditCard {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("1", 1000);
        CreditCard card2 = new CreditCard("2", 2000);
        CreditCard card3 = new CreditCard("3", 3000);
        card1.replenish(250);
        card2.replenish(700);
        card3.withdraw(400);
        card1.checkCurrentValue();
        card2.checkCurrentValue();
        card3.checkCurrentValue();
    }
}
