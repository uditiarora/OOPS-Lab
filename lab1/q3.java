import java.util.*;
class Student implements Comparable<Student>{
	 private int rollno;
	private String name;
	 private float marks[];
	 private float grade;
	public Student(){
		this.rollno = 0;
		this.name="";
		this.marks = new float[4];
		this.grade = 0;
	}
	public int compareTo(Student obj){
		return (this.name.compareTo(obj.name));
	}
	public void sort(Student[] arr){
		Arrays.sort(arr);
	
	}
	public void readData(){
		System.out.println("Enter data\n");
		Scanner s = new Scanner(System.in);
		this.rollno = s.nextInt();
		this.name = s.next();
		for(int i=0;i<4;i++){
			this.marks[i] = s.nextFloat();
		}
		this.calculate();
		
	}
	public void calculate(){
		float total = 0;
		for(int i=0;i<4;i++){
			total += this.marks[i];
		}
		this.grade = total/4;

	}
	public  void displayData(){
		System.out.print(this.rollno+" "+this.name+" ");
		for(int i=0;i<4;i++){
			System.out.print(this.marks[i]+" ");
		}
		System.out.println(this.grade);
		
	}
}



class q3{
	public static void main(String[] args){
	
		Student arr[] = new Student[5];
		for(int i=0;i<5;i++){
			arr[i] = new Student();
			arr[i].readData();
			arr[i].calculate();
		}
		Student temp = new Student();
		temp.sort(arr);
		for(int i=0;i<5;i++){
			arr[i].displayData();
		}
		
		
		
	
	}

}
