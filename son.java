interface father
{
	abstract void call();
	abstract void talk();
}
interface mother
{
	abstract void call();
	abstract void talk();
}
class son implements father,mother
{
	public void call()
	{
		System.out.println("Hello");
		
	}
	public void talk()
	{
		System.out.println("How r u ");
		
	}
}