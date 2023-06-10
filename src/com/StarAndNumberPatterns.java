package com;

public class StarAndNumberPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarAndNumberPatterns pattern = new StarAndNumberPatterns();
		//pattern.rightTriangle();
		//pattern.leftTrinagle();
		//pattern.pyramid();
		//pattern.diamond();
		//pattern.downwardTriangle();
		pattern.MirroredRightTriangle();
	}

//************************************************************************************	
	//Right Triangle Star Pattern
	public void rightTriangle() {
	int row=5;
	for(int i=0;i<row;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}}
//************************************************************************************	
	
	//Left Triangle Star pattern
	public void leftTrinagle() {
		
		int row=5;
		//int k=2(row-1);
		for(int i=1;i<=row;i++) {
			
			for(int k=2*(row-i);k>0;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
//Pyramid star pattern
	public void pyramid() {
		int row =5;
		
		for(int i=1;i<=row;i++) {
			for(int k=(row-i);k>0;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//Diamond shape pattern
	public void diamond() {
		
		int row =5;
		
		for(int i=1;i<2*row;i++) {
			for(int k=(row-i);k>0;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<(2*i-1);j++) {
				System.out.print("*");
			}
			
			for(int k=1;k<=(i-row);k++) {
				System.out.print(" ");
			}
	// need to check on this logic	
//			int m=0;
//			for(int j=1;j<=(row+2-m);j++) {
//				System.out.print("*");
//				m--;
//			}
//			
			
			
			System.out.println();
		}
	}
	//Downward Triangle
	public void downwardTriangle() {
		int row=7;
		for(int i=0;i<=row;i++) {
			for(int j=row-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//Mirrored Right Triangle
	public void MirroredRightTriangle() {
		
		int row =5;
		for(int i=1;i<=row;i++) {
			for(int k=row-i;k>0;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
		

}

