import java.util.*;

class player{
	String name;
	int delhi,mumbai,kolkata,chennai;
	static int max = Integer.MIN_VALUE;
	float avg;
	int total;
	public player(String name,int delhi,int mumbai,int kolkata,int chennai){
		this.name = name;
		this.delhi = delhi;
		this.mumbai = mumbai;
		this.kolkata = kolkata;
		this.chennai = chennai;
		total = delhi + mumbai + kolkata + chennai;
		avg = (float)total/4;
		max = Math.max(max,total);
		
	}
	public void display(){
		System.out.println(this.name+" "+this.total+" "+this.avg);
	}
}


class q3{
	public static void main(String[] args){
		player arr[] = new player[5];
		arr[0] = new player("dhoni",45,130,10,75);
		arr[1] = new player("sachin",75,170,60,55);
		arr[2] = new player("dravid",51,45,125,65);
		arr[3] = new player("yuvraj",40,70,65,40);
		arr[4] = new player("ganguly",35,90,55,120);
		for(int i=0;i<5;i++){
			arr[i].display();
			
		}
		for(int i=0;i<5;i++){
			if(player.max == arr[i].total){
				System.out.println(arr[i].name);
			}
		}
		
	}


}

