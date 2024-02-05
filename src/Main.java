public class Main {
    public static void main(String[] args) {

        int score = 100;
        int topup = 1500;
        int amount = (score + topup);
        int bouns = (topup / 100 * 1);


        int balance = (score + topup + bouns);
        if (topup > 1000) {
            System.out.println("Баланс счета при пополнении на " + topup + " руб. " + "равен: " + balance + " руб.");
        } else {
            System.out.println("Баланс счета при пополнении на " + topup + " руб." + "равен " + amount + " руб.");
        }
    }
}