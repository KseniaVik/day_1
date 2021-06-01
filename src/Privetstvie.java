import java.util.Scanner;

public class Privetstvie {
    public static void main(String[] args) {

        //Normal: Вводится имя и пол пользователя (пол задается значением либо 0, либо 1),
        //а программа выводит «Привет, дорогой(ая) <Имя>. Рад знакомству»

        Scanner s = new Scanner(System.in);
        System.out.println("Введите ваше имя и пол (женский - 1, мужской - 0)");
        String name = s.nextLine();
        byte pol = s.nextByte();
        if (pol == 1) System.out.println("Привет, дорогая " + name + ". Рад знакомству!");
        else System.out.println("Привет, дорогой " + name + ". Рад знакомству!");

    }
}
