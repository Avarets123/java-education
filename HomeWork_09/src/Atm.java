public class Atm {
    private int balance;
    private int maxBalance;
    private int maxReceivingMoney;
    private int countOperations;

    public Atm() {
        this.maxBalance = 1_000_000;
        this.balance = 100_000;
        this.maxReceivingMoney = 20_000;
        this.countOperations = 0;
    }

    public Atm(int maxBalance, int balance, int maxReceivingMoney) {
        this.maxBalance = maxBalance;
        this.balance = balance;
        this.maxReceivingMoney = maxReceivingMoney;
        this.countOperations = 0;
    }


    public int recevingMoney(int money) {
        if (money > balance || money > maxReceivingMoney) {
            System.out.println("Операция невозможна");
        }
        this.countOperations++;
        this.balance -= money;
        return money;
    }

    public int addMoney(int money) {
        int check = money + balance;

        if (maxBalance < check) {
            this.countOperations++;
            return check - maxBalance;
        }

        this.balance += money;

        this.countOperations++;
        return this.balance;

    }
}
