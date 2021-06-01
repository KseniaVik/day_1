import java.util.Scanner;



        public class Main {
            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                int a = s.nextInt();
                int b = s.nextInt();
                System.out.println("Сложение: " + (a+b));
                System.out.println("Вычитание: " + (a-b));
                System.out.println("Умножение: " + (a*b));
                System.out.println("Деление: " + (a/b));
                System.out.println("Остаток от деления: " + (a%b));

            }
        }
