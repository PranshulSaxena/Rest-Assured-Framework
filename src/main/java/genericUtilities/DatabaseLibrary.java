package genericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DatabaseLibrary {

	Connection con = null;
	
	/**
	 * This method is used to connect to database
	 * @throws Throwable
	 * @author PranshulSaxena
	 */
	public void connectToDB() throws Throwable
	{
		Driver driverRef = new Driver();
		// load or register the database
		DriverManager.registerDriver(driverRef);
		// connect to the database
		con = DriverManager.getConnection(IPathConstants.dbUrl, IPathConstants.dbUsername, IPathConstants.dbPassword);
		System.out.println("Connected to the database");
	}
	
	/**
	 * This method is used to execute query and get the data
	 * @param query
	 * @param data
	 * @param columnIndex
	 * @param expData
	 * @return
	 * @throws Throwable
	 * @author PranshulSaxena
	 */
	public String executeQueryAndGetData(String query, int columnIndex, String expData) throws Throwable
	{
		boolean flag = false;
		//String data = null;
		ResultSet result = con.createStatement().executeQuery(query);
		while(result.next())
		{
			//data = result.getString(columnIndex);
			if(result.getString(columnIndex).equalsIgnoreCase(expData))
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("----->Data verified");
			return expData;
		}
		else
		{
			System.out.println("----->Data not verified");
			return "";
		}
	}
	
	/**
	 * This method is used to close the database
	 * @throws Throwable
	 * @author PranshulSaxena
	 */
	public void closeDB() throws Throwable
	{
		con.close();
	}
	
}
