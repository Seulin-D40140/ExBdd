import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ArticleDao 
{
	public void displayAll(ArrayList<Article> articles , String str)
	{
		String url = "jdbc:mariadb://localhost:3306/Shop";
		String login = "root";
		String password = "fms2024";
		
		try (Connection connection = DriverManager.getConnection(url, login, password))
		{
			try(Statement statement = connection.createStatement())
			{
				try(ResultSet resultSet = statement.executeQuery(str))
				{
					while(resultSet.next())
					{
						int rsIdArticle = resultSet.getInt(1);
						String rsDescription = resultSet.getString(2);
						String rsMarque = resultSet.getString(3);
						double rsPrixUnitaire = resultSet.getDouble(4);
						
						articles.add((new Article(rsIdArticle , rsDescription , rsMarque , rsPrixUnitaire)));
					}
				}
			}
			for(Article a : articles)
			{
				System.out.println(a.getID() + " - " + a.getDescription() + " - " + a.getBrand() + " - " + a.getPrice());
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	} 
	
	public void addArticle(Article obj , String str)
	{
		String url = "jdbc:mariadb://localhost:3306/Shop";
		String login = "root";
		String password = "fms2024";
		
		try (Connection connection = DriverManager.getConnection(url, login, password))
		{
			try(PreparedStatement preState = connection.prepareStatement(str))
			{
				preState.setString(1,obj.getDescription());
				preState.setString(2, obj.getBrand());
				preState.setDouble(3, obj.getPrice());
				if(preState.executeUpdate() == 1)
				{
					System.out.println("insert OK");
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void UpdtArticle (String str)
	{
		String url = "jdbc:mariadb://localhost:3306/Shop";
		String login = "root";
		String password = "fms2024";
		
		try (Connection connection = DriverManager.getConnection(url, login, password))
		{
			try(Statement statement = connection.createStatement())
			{
				try(ResultSet resultSet = statement.executeQuery(str))
				{
					System.out.println("update OK");
				}
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}


