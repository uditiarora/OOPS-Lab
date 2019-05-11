#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main(){
	string s;
	cout<<"Enter string"<<endl;
	cin>>s;
	transform(s.begin(), s.end(), s.begin(), ::tolower);
	int n = s.length();
	int arr[26];
	for(int i=0;i<26;i++){
		arr[i] = 0;
	}
	for(int i=0;i<n;i++){
		arr[s[i] - 'a']++;
	}
	int flag = 0;
	for(int i=0;i<26;i++){
		if(arr[i]>1){
			flag=1;
			cout<<i<<endl;
			break;
		}
	}
	if(flag==1){
		cout<<"Not a perfect string."<<endl;
	}
	else{
		cout<<"Perfect String."<<endl;
	}
	return 0;
}
