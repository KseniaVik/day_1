import java.util.Scanner;

public class Visokosniy_god {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        //год является високосным, если его номер кратен 4, но не кратен 100, а также если он кратен 400
        // для проверки список високосных: 1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940,
        //1944, 1948, 1952, 1956, 1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996
        if (a%4==0 && a%100!=0 || a%400==0) {
            System.out.println("Это високосный год!");
        }
        else System.out.println("Это не високосный год, слава богам!");
    }
}
