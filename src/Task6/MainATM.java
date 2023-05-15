package Task6;

public class MainATM {
    public static void main(String[] args) {
        ATM bancomat = new ATM (30,20,10);
        bancomat.sumOfMoney = bancomat.sumOfBanknotes1 * bancomat.banknote1 + bancomat.sumOfBanknotes2 * bancomat.banknote2 + bancomat.sumOfBanknotes3 * bancomat.banknote3;
        System.out.println("Current amount of money in the ATM: " + bancomat.sumOfMoney);
        bancomat.put(120);
        bancomat.take(200);
        System.out.println("Current amount of money in the ATM: " + bancomat.sumOfMoney);
    }
}
