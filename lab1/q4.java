import java.util.*;
class q4{
	public static void main(String[] args){

		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			int temp = sc.nextInt();
			arr[i] = temp;
			m.put(temp,i);			
		}
		int k = sc.nextInt();
		boolean flag = false;
		for(int i=0;i<n;i++){
			if(m.containsKey(k-arr[i]) && m.get(k-arr[i])!=i){
				System.out.println("Yes");
				flag = true;
				break;
			}
		}
		if(flag==false)
			System.out.println("No");
	}
}
