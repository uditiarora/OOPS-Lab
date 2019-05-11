#include<bits/stdc++.h>
#include<string.h>

using namespace std;

class bank
{
	float bal;
	char name[100];
	public:
		bank(char name[],float bal)
		{
			this->bal=bal;
			strcpy(this->name,name);
		}
		float deposit(float amount)
		{
			bal=amount+bal;
			float bal1=bal;
			return bal1;
		}
		
		float withdraw(float amount)
		{
			float bal1;
			if (bal>=amount)
			{
				bal=bal-amount;
				bal1=bal;
			}
			else
				bal1=0;
			
			return bal1;
		}
};

int main()
{
	bank *b1 = new bank("uditi",10000);
	float amountd,amountw,newbal;
	cout<<"enter the amount to deposit:";
	cin>>amountd;
	newbal=b1->deposit(amountd);
	cout<<"\nnew balance is:"<<newbal;
	cout<<"\nenter the amount to withdraw:";
	cin>>amountw;
	newbal=b1->withdraw(amountw);
	cout<<"\nnew balance is:"<<newbal<<"\n";
}


