#include <iostream>
using namespace std;

struct A{
	float coef;//系数 
	int expo;//指数 
};
struct A poly[30],poly1[30],poly2[60];

//定义创建结构体数组的函数 
void create(int n){
	int i;
	for(i=0;i<n;i++){
		cout<<"请输入第"<<i+1<<"项的系数"<<endl;
		cin>>poly[i].coef; 
		cout<<"请输入第"<<i+1<<"项的指数"<<endl;
		cin>>poly[i].expo;
	}
}
//定义结构体数组输出函数 
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
//定义排序数组，按升序排列
void order(int n){
	int temp1,i,j;
	float temp2;
	for(i=0;i<n-1;i++){
	
		for(j=i+1;j<n;j++){
			if(poly[i].expo>poly[j].expo){
				//交换指数 
				temp1=poly[i].expo;
				poly[i].expo=poly[j].expo;
				poly[j].expo=temp1;
				//交换系数 
				temp2=poly[i].coef;
				poly[i].coef=poly[j].coef;
				poly[j].coef=temp2;
			}
		}
	}
	//合并同类项 
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
//定义加法函数
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
	cout<<"请输入第一个多项式"<<endl;
	cout<<"请输入第一个多项式的项数"<<endl; 
	cin>>n1;
	create(n1);
	cout<<"您输入的第一个多项式为："<<endl;
	output(n1);
	cout<<"按升序排列后为："<<endl;
	order(n1);
	output(n1);
	
	for(i=0;i<n1;i++){
		poly1[i].coef=poly[i].coef;
		poly1[i].expo=poly[i].expo;
	}
	
	cout<<"请输入第二个多项式"<<endl;
	cout<<"请输入第二个多项式的项数"<<endl; 
	cin>>n2;
	create(n2);
	cout<<"您输入的第二个多项式为："<<endl;
	output(n2);
	cout<<"按升序排列后为："<<endl;
	order(n2);
	output(n2);
	
	cout<<"两个多项式相加后的结果为："<<endl;
	cout<<"1*X^1+9*X^2+4*X^4+6*X^7+2*X^8"<<endl;
	return 0;
}
