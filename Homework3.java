import java.util.Scanner;
public class Homework3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("몇 개의 수를 입력할 예정인가요?");
        num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("수를 입력하세요:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[2];
        arr2[0] = arr[0];
        arr2[1] = arr[0];
        for (int k = 0; k < num; k++) { //arr2[0]에 최대값 저장
            if (arr[k] > arr2[0])
                arr2[0] = arr[k];
            else
                arr2[0] = arr2[0];
        }
        for (int k = 0; k < num; k++) {
            if (arr[k] < arr2[1])
                arr2[1] = arr[k];
            else
                arr2[1] = arr2[1];
        }
        System.out.println("최댓값: " + arr2[0]);
        System.out.println("최솟값: " + arr2[1]);

    }
}