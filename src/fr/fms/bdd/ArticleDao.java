package fr.fms.bdd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.fms.dao.Dao;
import fr.fms.entities.*;

public class ArticleDao implements Dao<Article>
{
	public void displaybdd(ArrayList<Article> articles )
	{
		String strSql = "SELECT * FROM T_articles"; 
		
		try(Statement statement = connection.createStatement())
		{
			try(ResultSet resultSet = statement.executeQuery(strSql))
			{ 
				while( resultSet.next())
				{
					System.out.println(resultSet.getString(2));
					int rsID = resultSet.getInt(1);
					String rsDescription = resultSet.getString(2);
					String rsBrand = resultSet.getString(3);
					double rsPrise = resultSet.getDouble(4);
					articles.add(new Article(rsID , rsDescription , rsBrand , rsPrise));
//						System.out.print("id : " + resultSet.getInt(1) + " ,  desc : " + resultSet.getString(2) + " ,  marque : " + resultSet.getString(3));
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
	
	public void addArticle(Article obj)
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
			e.printStackTrace();
		}
	}
	
	public void removeArticle(int idArticle)
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
			e.printStackTrace();
		}
	}
	
	public void UpdtArticle (String description , String brand , Double price , int id)
	{
		String strSqlUpdt = "update T_articles set Description=? ,  brand=?  , UnitaryPrice=? where idArticle=?";
		
		try(PreparedStatement ps = connection.prepareStatement(strSqlUpdt))
		{
			ps.setString(1, description);
			ps.setString(2, brand);
			ps.setDouble(3, price);
			ps.setInt(4, id);
			
			if( ps.executeUpdate() == 1)
			{
				System.out.println("insert update OK");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void displayOneArticle(int idArticle)
	{
		String strSqlAll = "select * from t_articles where t_articles.idArticle ="+idArticle;
		
		try(Statement statement = connection.createStatement())
		{
			try(ResultSet resultSet = statement.executeQuery(strSqlAll))
			{ 
				while(resultSet.next())
				{
					System.out.print("id : " + resultSet.getInt(1) + " ,  desc : " + resultSet.getString(2) + " ,  marque : " + resultSet.getString(3));
				}
			}
			catch (Exception e) 
			{
				System.out.println("pb1");
				e.printStackTrace();
			}
		}
		catch (Exception e) 
		{
			System.out.println("pb2");
			e.printStackTrace();
		}
	}	
	
}


