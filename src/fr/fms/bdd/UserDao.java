package fr.fms.bdd;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.fms.dao.Dao;
import fr.fms.entities.User;

public class UserDao implements Dao<User>
{
	ArrayList<User> users = new ArrayList<>();

	@Override
	public void add(User obj) 
	{
		String strSqlAdd = "INSERT INTO T_users ( Login , Password ) VALUES ( ? , ? );";
		
		try(PreparedStatement ps = connection.prepareStatement(strSqlAdd))
		{
			ps.setString(1, obj.getLoginUser());
			ps.setString(2, obj.getPasswordUser());
			if( ps.executeUpdate() == 1)
			{
				System.out.println("insert  add OK");
			}
		}
		catch (Exception e) 
		{
			System.out.println(" erreur methode add user " + e );
			e.printStackTrace();
		}
	}

	@Override
	public void remove(int idUser) 
	{
		String strSqlDel = "delete from T_users where idUser= ? ";
		
		try(PreparedStatement ps = connection.prepareStatement(strSqlDel))
		{
			ps.setInt(1, idUser);
			
			if( ps.executeUpdate() == 1)
			{
				System.out.println("insert delete OK");
			}
		}
		catch (Exception e) 
		{
			System.out.println(" erreur methode remove user " + e );
			e.printStackTrace();
		}
	}

	@Override
	public void update(User obj, int id) 
	{
		String strSqlUpdt = "update T_users set Login=? , Password=? where iduser=?";
		
		try(PreparedStatement ps = connection.prepareStatement(strSqlUpdt))
		{
			ps.setString(1, obj.getLoginUser());
			ps.setString(2, obj.getPasswordUser());
			ps.setInt(3, id);
			
			if( ps.executeUpdate() == 1)
			{
				System.out.println("insert update OK");
			}
		}
		catch (Exception e) 
		{
			System.out.println(" erreur methode update user " + e );
			e.printStackTrace();
		}
	}

	@Override
	public void displayOne(int idUser) 
	{
		String strSqlAll = "select * from t_users where t_users.idUser = ? ";
		
		try(PreparedStatement statement = connection.prepareStatement(strSqlAll))
		{
			statement.setInt(1, idUser);
			try(ResultSet resultSet = statement.executeQuery())
			{ 
				while(resultSet.next())
				{
					System.out.println("ID : " + resultSet.getInt(1) + "  LOGIN : "+ resultSet.getString(2) + "  PASSWORD: "+ resultSet.getString(3));
				}
			}
			catch (Exception e) 
			{
				System.out.println(" erreur query dans la methode displayOne user " + e );
				e.printStackTrace();
			}
		}
		catch (Exception e) 
		{
			System.out.println(" erreur methode displayOne article " + e );
			e.printStackTrace();
		}
	}

	@Override
	public void displayAll() 
	{
		String strSql = "SELECT * FROM T_users"; 
		
		try(Statement statement = connection.createStatement())
		{
			try(ResultSet resultSet = statement.executeQuery(strSql))
			{ 
				while( resultSet.next())
				{
					int userID = resultSet.getInt(1);
					String userLogin = resultSet.getString(2);
					String userPassword = resultSet.getString(3);
					users.add(new User(userID , userLogin , userPassword ));
				}
			}
			for(User u : users)
			{
				System.out.println( u.getIduser() + " - " + u.getLoginUser() + " - " + u.getPasswordUser());
			}
		} 
		catch (Exception e) 
		{
			System.out.println(" erreur methode display user  " + e );
			e.printStackTrace();
		}
	}
	
}
