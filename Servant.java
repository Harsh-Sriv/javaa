class Servant extends Employee
{
	void display()
	{
		System.out.println("Abstract method in derived class");
	}	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Servant obj=new Servant();
    obj.display();
    obj.show();
    	
	}

}
