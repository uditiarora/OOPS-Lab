import java.util.Random;
class Father extends Thread
{
	Random rand = new Random();
	public void run(){
		while(true){
			deposit();
		}
	}
	public synchronized void deposit(){
		if(q2.balance <= 2000){
			int r = rand.nextInt(200);
			q2.balance += r;
			System.out.println("Father deposited Rs " + r + ". New Balance is Rs " + q2.balance + ".");
		}
	}
}
class Son extends Thread{
	Random rand = new Random();
	public void run(){
		while(true){
			withdraw();	
		}
	}
	public synchronized void withdraw(){
		
		if(q2.balance >= 500){
			int r = rand.nextInt(150);
			q2.balance -= r;
			System.out.println("Son withdrawed Rs " + r + ". New Balance is Rs " + q2.balance + ".");
		}
	}
}
class q2{
	public static int balance = 600;
	public static void main(String[] args){
		Father f = new Father();
		Son s = new Son();
		f.start();
		s.start();
	}
}
