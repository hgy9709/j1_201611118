public class LeapYear{
	void leap(int[] a){
		for(int b:a){
			if ((b%4 == 0 && a%100 != 0) || (a % 400 ==0)){
			System.out.println(y+"is leap year");
		}	else {
			System.out.println(y+"is not leap year"); 
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {1790, 1849. 1947, 1978, 1988. 1999, 2016 };
		new LeapYear().leap(years);
		}
	}