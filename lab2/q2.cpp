#include<iostream>
#include<string.h>
using namespace std;
enum  result {wrong,correct,unanswered};

char ans[] = {'C','A','B','D','B','C','C','A'};
class student{


	public:
		char arr[8];
		result check[8];
		int corr=0,wr = 0,un = 0;
		student(char temp[8]){
			for(int i=0;i<8;i++){
				arr[i] = temp[i];
			}
		}
		string getResult(){
			int count = 0;
			for(int i=0;i<8;i++){
				if(arr[i] == 'X'){
					check[i] = unanswered;
					un++;
				}
				else if(arr[i] == ans[i]){
					check[i] = correct;
					count++;
					corr++;
				}
				else{
					check[i] = wrong;
					wr++;
				}
			}
			if(count>5){
				return "Pass";
			}
			else{
				return "Fail";
			}
		}


};
int main(){
	cout<<"Enter grades"<<endl;
	char arr[8];
	for(int i=0;i<8;i++){
		cin>>arr[i];
	}
	student *obj = new student(arr);
	cout<<obj->getResult()<<endl;
	for(int i=0;i<8;i++){
		cout<<i+1<<"\t"<<obj->arr[i]<<"\t"<<ans[i]<<"\t"<<obj->check[i]<<endl;
	}
	cout<<"Correct answers "<<obj->corr<<endl;
	cout<<"Wrong answers "<<obj->wr<<endl;
	cout<<"Unanswered "<<obj->un<<endl;
	return 0;
}
