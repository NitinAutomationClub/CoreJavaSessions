package day4;

public class MultiDimArray {

	public static void main(String[] args) {
		int a[][]=new int[3][4];
		
		//IstRow
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[0][3]=40;
	
		//IInd Row
		
		a[1][0]=50;
		a[1][1]=60;
		a[1][2]=70;
		a[1][3]=80;
		
		
		//IIIrd Row
		
		a[2][0]=90;
		a[2][1]=100;
		a[2][2]=200;
		a[2][3]=300;
		
		
		System.out.println(a[0][3]);
		
		
		int rowLength=a.length;
		System.out.println("Row Length :"+rowLength);
		
		int colLength=a[1].length;
		
		System.out.println("Column Length :"+ colLength);
		
		System.out.println("******Traversing all the Value**************");
		
		//to traverse all the value
		
		for(int i=0;i<rowLength;i++)//to travse row 
		{
			for(int j=0;j<colLength;j++)//to travse column 
			{
				System.out.println(a[i][j]);//a[0][0] ,a[0][1],a[0][2] a[0][3]
											//a[1][0] a[1][1],a[1][2] a[1][3]
				////a[2][0] a[2][2],a[2][2] a[2][3]
				
				
			}
			
			
			
		}
		System.out.println("out of loop");
		
		
		
		
		
	}

}
