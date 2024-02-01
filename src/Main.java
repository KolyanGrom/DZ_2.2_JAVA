public class Main {
    public static void main(String[] args) {

        int x = 100;
        int up = 1500;
        int amount = (x + up);
        int bounse = (up / 100 * 1);


        int balance = (x + up + bounse);
        if (up > 1000) {
            System.out.println("Баланс счета при пополнении на " + up + " руб." + "равен " + balance + " руб.");
        }
        if (up < 1000) {
            System.out.println("Баланс счета при пополнении на " + up + " руб." + "равен " + amount + " руб.");
        }


    }
}