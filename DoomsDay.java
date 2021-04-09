import java.util.Scanner;
public class DoomsDay{ 
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int dom[]={31,28,31,30,31,30,31,31,30,31,30,31};
		String weekDay="";
		for (int i=0;i<a;i++) {
			int wod_r =0;
			int m = s.nextInt();
			int d = s.nextInt();
			int yod=0;
			for (int k=0;k<m-1;k++){
				yod+=dom[k];
			}
			yod+=d;
			// 346 (12/DEC) is Monday, so that 346%7=3, and 7-3=4, so it needs to add 4.
			// Making it sure to the correct date	
			wod_r = (yod+4)%7;
			switch(wod_r){
				case 0:
					weekDay="Monday";
					break;
				case 1:
					weekDay="Tuesday";
					break;
				case 2:
					weekDay="Wednesday";
					break;
				case 3:
					weekDay="Thursday";
					break;
				case 4:
					weekDay="Friday";
					break;
				case 5:
					weekDay="Saturday";
					break;
				case 6:
					weekDay="Sunday";
					break;
			}
			System.out.println(weekDay);
		}
	}
}
