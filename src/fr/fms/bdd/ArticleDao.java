package fr.fms.bdd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.fms.dao.Dao;
import fr.fms.entities.*;

public class ArticleDao implements Dao<Article>
{
	ArrayList<Article> articles = new ArrayList<>();
	
	public void displayAll()
	{
		String strSql = "SELECT * FROM T_articles"; 
		
		try(Statement statement = connection.createStatement())
		{
			try(ResultSet resultSet = statement.executeQuery(strSql))
			{ 
				while( resultSet.next())
				{
					int rsID = resultSet.getInt(1);
					String rsDescription = resultSet.getString(2);
					String rsBrand = resultSet.getString(3);
					double rsPrise = resultSet.getDouble(4);
					articles.add(new Article(rsID , rsDescription , rsBrand , rsPrise));
				}
			}
			for(Article a : articles)
			{
				System.out.println(a.getID() + " - " + a.getDescription() + " - " + a.getBrand() + " - " + a.getPrice());
			}
		} 
		catch (Exception e) 
		{
			System.out.println(" erreur methode display article " + e );
			e.printStackTrace();
		}
	} 
	
	public void add(Article obj)
	{
		String strSqlAdd = "INSERT INTO T_articles (Description , Brand , UnitaryPrice ) VALUES ( ? , ? , ? );";
		
		try(PreparedStatement ps = connection.prepareStatement(strSqlAdd))
		{
			ps.setString(1, obj.getDescription());
			ps.setString(2, obj.getBrand());
			ps.setDouble(3, obj.getPrice());
			if( ps.executeUpdate() == 1)
			{
				System.out.println("insert  add OK");
			}
		}
		catch (Exception e) 
		{
			System.out.println(" erreur methode add article " + e );
			e.printStackTrace();
		}
	}
	
	public void remove(int idArticle)
	{
		String strSqlDel = "delete from T_articles where idArticle= ? ";
		
		try(PreparedStatement ps = connection.prepareStatement(strSqlDel))
		{
			ps.setInt(1, idArticle);
			
			if( ps.executeUpdate() == 1)
			{
				System.out.println("insert delete OK");
			}
		}
		catch (Exception e) 
		{
			System.out.println(" erreur methode remove article " + e );
			e.printStackTrace();
		}
	}
	
	public void update (Article obj , int id)
	{
		String strSqlUpdt = "update T_articles set Description=? ,  brand=?  , UnitaryPrice=? where idArticle=?";
		
		try(PreparedStatement ps = connection.prepareStatement(strSqlUpdt))
		{
			ps.setString(1, obj.getDescription());
			ps.setString(2, obj.getBrand());
			ps.setDouble(3, obj.getPrice());
			ps.setInt(4, id);
			
			if( ps.executeUpdate() == 1)
			{
				System.out.println("insert update OK");
			}
		}
		catch (Exception e) 
		{
			System.out.println(" erreur methode update article " + e );
			e.printStackTrace();
		}
	}
	
	public void displayOne(int idArticle)
	{
		String strSqlAll = "select * from t_articles where t_articles.idArticle = ? ";
		
		try(PreparedStatement statement = connection.prepareStatement(strSqlAll))
		{
			statement.setInt(1, idArticle);
			try(ResultSet resultSet = statement.executeQuery())
			{ 
				while(resultSet.next())
				{
					System.out.println("ID : " + resultSet.getInt(1) + " ,  DESC : " + resultSet.getString(2) + " ,  MARQUE : " + resultSet.getString(3));
				}
			}
			catch (Exception e) 
			{
				System.out.println(" erreur query dans la methode displayOne " + e );
				e.printStackTrace();
			}
		}
		catch (Exception e) 
		{
			System.out.println(" erreur methode displayOne article " + e );
			e.printStackTrace();
		}
	}	
}


