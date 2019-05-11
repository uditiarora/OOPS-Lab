#include<iostream>
#include<thread>
#include<mutex>
#include<stdlib.h>
using namespace std;
int amount = 600;
std::mutex mtx;
class father{
	public:
		void operator()(int x){
			while(1){
				deposit();	
			}
		}
		void deposit(){
			mtx.lock();
			if(amount<2000){
				int temp = rand()%200 + 1;
				amount += temp;
				cout<<"Father added "<<temp<<" Amount now = "<<amount<<endl;
			}	
			mtx.unlock();
		}
};
class son{
	public:
		void operator()(int x){
			while(1){
				withdraw();
			}
		}
		void withdraw(){
			mtx.lock();
			if(amount>500){
				int temp = rand()%150 + 1;
				amount -= temp;
				cout<<"Son withdrew "<<temp<<" Amount now = "<<amount<<endl;
			}
			mtx.unlock();
		}
};

int main(){
	thread th1(father(),1);
	thread th2(son(),1);
	th1.join();
	th2.join();
	return 0;
}
