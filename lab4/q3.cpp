#include<iostream>
#include<string>
using namespace std;

void print_per(string str,string temp){
	if(str.length()==0){
		cout<<temp<<" ";
		return;
	}
	int n = str.length();
	
	for(int i=0;i<n;i++){
		string temp2 = str.substr(0,i) + str.substr(i+1,n);
		print_per(temp2,temp + str[i]);
	
	}

}


int main(){
	cout<<"Enter string"<<endl;
	string str;
	cin>>str;
	cout<<"Permutations are"<<endl;
	print_per(str,"");
	cout<<endl;
}
