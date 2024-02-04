public class Main {
    public static void main(String[] args) {

        int score = 100;
        int topup = 1000;
        int amount = (score + topup);
        int bounse = (topup / 100 * 1);


        int balance = (score + topup + bounse);
        if (topup > 1000) {
            System.out.println("Баланс счета при пополнении на " + topup + " руб." + "равен " + balance + " руб.");
        }
        if (topup < 1000) {
            System.out.println("Баланс счета при пополнении на " + topup + " руб." + "равен " + amount + " руб.");
        } else {
            balance = (score + topup);
        }
        if (topup == 1000) {
            System.out.println("Баланс счета при пополнении на 1000 руб" + "равен " + amount + " руб.");
        }


    }
}