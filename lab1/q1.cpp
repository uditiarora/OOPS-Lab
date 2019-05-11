#include<iostream>
using namespace std;

class Date{
	int date,month,year;
	public:
	Date(){
		date = 12;
		month = 3;
		year = 1993;
	}
	Date(int extra,int date=12,int month=20,int year=2000){
		this->date = date;
		this->month = month;
		this->year = year;
	}
	Date(const Date &obj){
		date = obj.date;
		month = obj.month;
		year = obj.year;
	}
	
	void print(){
		printf("%d %d %d\n",date,month,year);
	}
};



int main(){
	Date obj1;
	obj1.print();
	Date obj2(0,04,03,1998);
	obj2.print();
	Date obj3(obj1);
	obj3.print();
	
}
