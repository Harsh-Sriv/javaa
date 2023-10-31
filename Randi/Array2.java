import java.lang.Math;
public class Array2 {

	public static void main(String[] args) {
		System.out.println("Hello pl Enter the Values:");
		int[][] num=new int[2][4];
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				num[i][j]=(int)(Math.random()*10);
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
			
		}
	}
}
