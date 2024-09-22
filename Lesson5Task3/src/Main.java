public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMoneyAmount(1000); // передайте в банкомат сумму на счету
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        bankAccount.withdrawAll();// вызовите метод вывода средств
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {
    private long moneyAmount;

    // допишите код методов
    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long newMoneyAmount) {
        moneyAmount = newMoneyAmount;
    }

    public void withdrawAll() {
        long withdrawnAmount = moneyAmount;
        moneyAmount = 0;
        System.out.println("Со счёта снято " + withdrawnAmount + " р.");
    }
}