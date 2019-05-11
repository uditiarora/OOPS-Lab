import java.util.*;

class amicable extends Thread{
	int n,sum;
	public amicable(int n){
		this.n = n;
		this.sum = 0;
	}
	public void run(){
		for(int i=1;i<=n;i++){
			if(n%i == 0){
				sum += i;
			}
		}
	}
}

class q1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		amicable t1 = new amicable(n1);
		amicable t2 = new amicable(n2);
		t1.start();
		t2.start();
		
		try{
			t1.join();
			t2.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		if(t1.sum == t2.sum){
			System.out.println("Numbers are amicable");
		}
		else{
			System.out.println("Number are not amicable");
		}
	
	}
	

}

