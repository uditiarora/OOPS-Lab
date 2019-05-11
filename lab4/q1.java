import java.util.Scanner;

public class q1 {
	public static int estimatePeople(boolean arr[]){
		int counter = 0;
		for(int i = 1;i<arr.length;i++){
			if(arr[i]){
				counter++;
			}
		}
		return counter;
	}

	public static boolean util(boolean arr[]){
		for(int i = 1;i<arr.length;i++){
			if(!arr[i]){
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of people in the party ");
		int n = sc.nextInt();
		int m = 1000;
		int count = 0;
		int estimate = 0;
		for(int i=0;i<m;i++){
			boolean guests[] = new boolean[n];
			guests[1] = true;
			boolean heard = false;
			int next = -1; 
			int current = 1;
			while(!heard){
				next = 1 + (int)(Math.random() * (n-1)); 
				if(next == current){ 
					while(next == current){
						next = 1 + (int)(Math.random() * (n-1));
					}
				}
				if(guests[next]){
					if(util(guests)){
						count++;
					}
					estimate = estimate + estimatePeople(guests);
					heard = true;
				}
				guests[next] = true; 
				current = next;
			}
		}
		System.out.println("Empirical probability that everyone will hear rumor except Alice "+(double)count/m);
		System.out.println("Average amount of people that rumor reached is: "+ estimate/m);
	}

	

}
