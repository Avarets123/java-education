public class Main {
    public static void main(String[] args) {

        Atm defaultAtm = new Atm();
        defaultAtm.addMoney(30000);
        defaultAtm.recevingMoney(10000);


        Atm customAtm = new Atm(500000, 50000, 5000);
        customAtm.recevingMoney(3000);
        customAtm.addMoney(10000);



    }
}