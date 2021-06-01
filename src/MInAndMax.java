import java.util.Scanner;

public class MInAndMax {
    public static void main(String[] args) {

        //Hard: Наибольшее и наименьшее число из трех введенных в консоль.

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a>b) {          // если это тру, то надо сравнить с с
            if (a>c) {      // если это тру, то оно макс и надо оставшиеся два числа сравнить
                System.out.println(a + " - наибольшее число");
                if (b>c) {
                    System.out.println(c + " - наименьшее число");
                }
                else {
                    System.out.println(b + " - наименьшее число");
                    }
            }
            else { // если а было меньше с, то значит а просто между этими двумя и тут всё и так понятно
                System.out.println(c +" - наибольшее число" );
                System.out.println(b + " - наименьшее число");
            }
        }
        else {
            if (a>c) {      //если а изначально была больше b, то ее надо сравнить с с, если больше, то она в середине
                System.out.println(b + " - наибольшее число");
                System.out.println(c + " - наименьшее число");
            }
            else {          //если она меньше с, то значит вообще самая маленькая, и надо сравнить b с с
                if (b>c) {
                    System.out.println(b + " - наибольшее число");
                }
                else {
                    System.out.println(c + " - наибольшее число");
                }
                System.out.println(a + " - наименьшее число");
            }
        }

        // второй вариант с нагугленными методами Макс и Мин

        int d = s.nextInt();
        int e = s.nextInt();
        int f = s.nextInt();
        int max = Math.max(d,Math.max(e,f));
        int min = Math.min(d,Math.min(e,f));
        System.out.println(max + " - наибольшее число");
        System.out.println(min + " - наименьшее число");


    }
}
