package com;

public class NumberPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPatterns nPattern= new NumberPatterns();
		//nPattern.pattern_1();
		//nPattern.pattern_2();
		//nPattern.pattern_3();
		nPattern.diamondPattern();

	}
	
	//pattern 1 - each row starts with 1
public void pattern_1() {
	int i,j, row=7;
	for(i=0;i<row;i++) {
		int n=1;
		for(j=0;j<=i;j++) {
			System.out.print(n+" ");
			n++;
		}
		
		System.out.println();
	}

}
//pattern_2- Number increases continuously
	public void pattern_2() {
		int i,j, n=1,row=7;
		for(i=0;i<row;i++) {
	
			for(j=0;j<=i;j++) {
				System.out.print(n+" ");
				n++;
		}
		
		System.out.println();
	}

}

	public void pattern_3() {
		int i,j,k,row=7;
	
	for(i=0;i<row;i++) {
		int n=1;
		for(k=0;k<row-i;k++) {
			System.out.print(" ");
		}
		for(j=0;j<=i;j++) {
		
			System.out.print(n+" ");
			n=n*(i-j)/(j+1);
		}
	
		System.out.println();
	}

	}
	//pattern_4- Diamond pattern
	public void diamondPattern() {
		
		for (int i = 1; i <= 4; i++)  
		{  
		int n = 8;  
		for (int j = 1; j<= n - i; j++)   
		{   
		System.out.print(" ");   
		}   
		for (int k = i; k >= 1; k--)  
		{  
		System.out.print(k);  
		}  
		for (int l = 2; l <= i; l++)   
		{  
		System.out.print(l);   
		}   
		System.out.println();   
		}   
		for (int i = 3; i >= 1; i--)  
		{  
		int n = 10;  
		for (int j = 0; j<= n - i; j++)   
		{  
		System.out.print(" ");   
		}   
		for (int k = i; k >= 1; k--)  
		{  
		System.out.print(k);  
		}  
		for (int l = 2; l <= i; l++)  
		{  
		System.out.print(l);  
		}  
		System.out.println();  
		}  
	}
	
}
