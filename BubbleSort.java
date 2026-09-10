import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int ans = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = ans;
                }
            }
        }
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i]);
            if (i <= n - 2) {
                System.out.print("#");
            }
        }
    }
}
