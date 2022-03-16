import java.util.*;
public class Absolute {
	public static void main(String args[]){
        int N = 13;
        int diff = 2;
        System.out.println(modifyNumber(N, diff));
    }
	static int sumOfDigit(int K){
        int sod = 0;
        while (K != 0){
            sod += K % 10;
            K /= 10;
        }
        return sod;
    }
	static int modifyNumber(int N, int diff) {
		int low = 1, high = N;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (mid - sumOfDigit(mid) < diff) {       
                low = mid + 1;
			}
			else {     
                high = mid - 1; 
			}
		}
		return (N - high);
	}
}
