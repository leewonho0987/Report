package SRP1;

public class FileManager {
	
	public void readData(String fileName)
	{
		
	}
	
	public void processData(String data)
	{
		
	}
	
	public void saveData(String fileName, String data)
	{
	
	}
	
	public static void main(String[] args)
	{
		
	FileManager fileManager = new FileManager();
	
	String data = "This is the data to process";
	String processedData = "";
	
	fileManager.readData("data.txt");
	fileManager.processData(data);
	fileManager.saveData("processed_data.txt",processedData);
	}
}
