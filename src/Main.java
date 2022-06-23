public class Main {

    public static void main(String[] args) {
        int balance = 100;
        int popolnenie = 3000;
        int itogo = balance + popolnenie;
        int bonus;
        if (itogo <= 1000) {
            System.out.println("Сумма недостаточна для начисления бонусов. Надо пополнить на 1000руб и более");
            System.out.println("На вашем счету на данный момент " + itogo + " рублей");
        } else {
            bonus = popolnenie / 100;
            int summa = itogo + bonus;
            System.out.println("Вы получите " + bonus + " бонусных рублей");
            System.out.println("С учетом бонусов на вашем счету " + summa + " рублей");
        }
    }
}