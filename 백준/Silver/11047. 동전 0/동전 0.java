import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		int result = 0;
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=N-1; i>=0; i--) {
			if (K/arr[i] > 0) {
				result += K/arr[i];
				K %= arr[i];
			}
            if (K ==0) {
                break;
            }
		}
		System.out.println(result);
	}
}