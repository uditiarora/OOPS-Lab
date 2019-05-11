import java.util.*;
public class q3{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		int count = 0;
		Random rand = new Random();
		for(int i=0;i<1000;i++){
			HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
			int arr[] = new int[n];
			for(int j=0;j<n;j++){
				int x = rand.nextInt(n);
				while(m.containsKey(x)){
					x = rand.nextInt();
				}
				arr[j] = x;
				m.put(x,1);
				if(arr[j] == j){
					count++;
					break;
				}
			}
		}
		float temp = (float)count/1000;
		System.out.println("Fraction of times atleast one guest gets their original beer : "+temp);
	}

}
