import java.util.Scanner;
public class SodaSupplier {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int arr[][] = new int[N][3];
		for (int i=0;i<N;i++) {
			int e=s.nextInt(),f=s.nextInt(),c=s.nextInt();
			arr[i][0]=e;
			arr[i][1]=f;
			arr[i][2]=c;
		}
		for (int[] a : arr){
			int extra = (a[0]+a[1])/a[2];
			int ext = (a[0]+a[1])/a[2];
			int left = (a[0]+a[1]) - extra*a[2];
			while(extra>=1){
				ext += ((extra+left)/a[2]);
				extra/=a[2];
				left = extra % a[2]; 
			}
			System.out.println(ext+left);
		}

	}
}

