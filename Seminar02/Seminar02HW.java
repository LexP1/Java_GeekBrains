package Seminar02;

/**
 * ProgramSeminar02
 */
public class Seminar02HW {

    public static void main(String[] args) {
        int number = 10;
        int result = triangular(number);
        System.out.printf("Треугольное число n%d = %d\n", number, result);
    }

    public static int triangular(int n) {
        if (n == 1) return 1;
        int res = triangular (n - 1) + n;
        return res;
    }
}