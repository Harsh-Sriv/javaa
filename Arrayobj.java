public class Arrayobj {
	public static void main(String[] args) {
		string n=new string();
		n.roll=2;
		n.name="Lux";
        string n1=new string();
        n1.roll=3;
        n1.name="Vijay";
        System.out.println(n.roll+" "+n.name);
        string b[]=new string[2];
           	 b[0]=n;
             b[1]=n1;
              
        for(int i=0;i<b.length;i++)
        {
       	System.out.println(b[i].roll+": "+b[i].name);
        }
        for(string k:b)
        {
        	System.out.println(k.roll+":"+k.name);
        }
	}

}