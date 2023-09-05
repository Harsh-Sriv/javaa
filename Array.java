import java.util.ArrayList;
public class Array {

	public static void main(String[] args) {
		int[] marks= {100,80,90};
		//int[] mark=new int[2];
		
		//System.out.println(marks.length);
		for(int i=0;i<marks.length;i++)
		{
		System.out.println(marks[i]);
		}
		char[] name= {'r','a','m','a'};
		System.out.println(name.length);
		for(int i=0;i<name.length;i++)
		{
		System.out.println(name[i]);
		}
		boolean[] results= {true,false,true};
		for(int i=0;i<results.length;i++)
		{
			System.out.println(results[i]);
		}
		String[] names= {"lux","raja","Kamal"};
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		{
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20);
		System.out.println(l);
		}
				
	}

}

