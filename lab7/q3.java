class Odd extends Thread{
	Object lock = null;
	Odd(Object l){
		this.lock = l;
	}
	public void run(){
		try{
			synchronized(lock){
				for(int i=1;i<=1000;i+=2){					
					System.out.println(i);
					lock.notify();
					lock.wait();
							
				}
				lock.notify();
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
class Even extends Thread{
	Object lock = null;
	Even(Object l){
		this.lock = l;
	}
	public void run(){
		
		try{
			synchronized(lock){
				for(int i=2;i<=1000;i+=2){
					System.out.println(i);
					lock.notify();
					lock.wait();
							
				}
				lock.notify();
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
class q3{
	public static void main(String[] args){
		Object lock = new Object();
		Even even = new Even(lock);
		Odd odd = new Odd(lock);	
		odd.start();
		even.start();
	}
}
