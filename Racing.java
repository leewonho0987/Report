package DIP4;

public class Racing extends Games{

	public Racing()
	{
		title = returnTitle();
		version = returnversion();
	}
	
	public String returnTitle()
	{
		return "Racing";
	}
	
	public String returnversion()
	{
		return "v2.3";
	}
}
