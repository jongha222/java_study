import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = gcd(a,b);
        System.out.println("두 수의 최대공약수는 " + num + "입니다.");
    }
    static int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return a;
        }
        else if (a>b) {
            if (a % b == 0) {
                return b;
            }
            else {
                return gcd(b,a%b);
            }
        }
        else if (b > a) {
            if ( b % a == 0){
                return a;
            }
            else {
                return gcd(a,b%a);
            }
        }
        else {
            return a;
        }
    }
}