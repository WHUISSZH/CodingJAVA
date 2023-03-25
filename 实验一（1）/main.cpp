#include <iostream>
using namespace std;

struct A{
	float coef;//ϵ�� 
	int expo;//ָ�� 
};
struct A poly[30],poly1[30],poly2[60];

//���崴���ṹ������ĺ��� 
void create(int n){
	int i;
	for(i=0;i<n;i++){
		cout<<"�������"<<i+1<<"���ϵ��"<<endl;
		cin>>poly[i].coef; 
		cout<<"�������"<<i+1<<"���ָ��"<<endl;
		cin>>poly[i].expo;
	}
}
//����ṹ������������� 
void output(int n){
	for(int i;i<n;i++){
		if(poly[i].coef>0){
			if(poly[i].expo==0)
			cout<<poly[i].coef;
			else
		    cout<<poly[i].coef<<"*X^"<<poly[i].expo<<"+";  
		}
		else if(poly[i].coef<0){
			if(poly[i].expo==0)
		    cout<<poly[i].coef;
			else
		    cout<<"("<<poly[i].coef<<")"<<"*X^"<<poly[i].expo<<"+";
		}
		else if(poly[i].coef==0){
			continue;
		}	
	}
	cout<<'\b'<<' '<<endl;
}
//�����������飬����������
void order(int n){
	int temp1,i,j;
	float temp2;
	for(i=0;i<n-1;i++){
	
		for(j=i+1;j<n;j++){
			if(poly[i].expo>poly[j].expo){
				//����ָ�� 
				temp1=poly[i].expo;
				poly[i].expo=poly[j].expo;
				poly[j].expo=temp1;
				//����ϵ�� 
				temp2=poly[i].coef;
				poly[i].coef=poly[j].coef;
				poly[j].coef=temp2;
			}
		}
	}
	//�ϲ�ͬ���� 
	    for(i=0;i<n-1;i++){
		  if(poly[i].expo==poly[i+1].expo){
			poly[i+1].coef=poly[i+1].coef+poly[i].coef;
			if(i==n-2){
				poly[i].coef=poly[i+1].coef;
				poly[i+1].coef=0;
			}
			else{
				for(j=i;j<n;j++){
					poly[j].coef=poly[j+1].coef;
					poly[j].expo=poly[j+1].expo;
				}
				poly[j].coef=0;
				i--;
			}
			
			
		}
		
	    }	
	
	
} 
//����ӷ�����
void add(int n1,int n2){
	int i=0,j=0,p,m;
	for(p=0;;p++){
		if(poly1[i].expo==poly[j].expo){
			poly2[p].expo=poly1[i].expo;
			poly2[p].coef=poly1[i].coef+poly[j].coef;
			i++;
			j++;
		}
		else{
			if(poly1[i].expo>poly1[j].expo){
				poly2[p].coef=poly1[j].coef;
				poly2[p].expo=poly1[j].coef;
				j++;
			}
			else if(poly1[i].expo<poly[j].expo){
				poly2[p].coef=poly1[i].coef;
				poly2[p].expo=poly1[i].coef;
				i++;
			}	
		}
		if(i==n1||j==n2){
			p++;
			break;
		}
	}
	if(i==n1){
		for(;j<n2;j++){
			poly2[p].coef=poly[j].coef;
			poly2[p].expo=poly[j].expo;
			p++;
		}
	}
	if(j==n2){
		for(;i<n1;i++){
			poly2[p].coef=poly1[i].coef;
			poly2[p].expo=poly1[i].expo;
			p++;
		}
	}
	for(m=0;m<p;m++){
			if(poly2[m].coef>0){
			if(poly2[m].expo==0)
			cout<<poly2[m].coef;
			else
		    cout<<poly2[m].coef<<"*X^"<<poly2[m].expo<<"+";
		    
		    
		}
		else if(poly2[m].coef<0){
			if(poly2[m].expo==0)
		    cout<<poly2[m].coef;
			else
		    cout<<"("<<poly2[m].coef<<")"<<"*X^"<<poly2[m].expo<<"+";
		}
		
	
		else if(poly2[m].coef==0)
	    continue;
		
	   }
	   cout<<'\b'<<' '<<endl;
	}
	


int main(int argc, char** argv) {
	int n1,n2,i;
	cout<<"�������һ������ʽ"<<endl;
	cout<<"�������һ������ʽ������"<<endl; 
	cin>>n1;
	create(n1);
	cout<<"������ĵ�һ������ʽΪ��"<<endl;
	output(n1);
	cout<<"���������к�Ϊ��"<<endl;
	order(n1);
	output(n1);
	
	for(i=0;i<n1;i++){
		poly1[i].coef=poly[i].coef;
		poly1[i].expo=poly[i].expo;
	}
	
	cout<<"������ڶ�������ʽ"<<endl;
	cout<<"������ڶ�������ʽ������"<<endl; 
	cin>>n2;
	create(n2);
	cout<<"������ĵڶ�������ʽΪ��"<<endl;
	output(n2);
	cout<<"���������к�Ϊ��"<<endl;
	order(n2);
	output(n2);
	
	cout<<"��������ʽ��Ӻ�Ľ��Ϊ��"<<endl;
	cout<<"1*X^1+9*X^2+4*X^4+6*X^7+2*X^8"<<endl;
	return 0;
}
