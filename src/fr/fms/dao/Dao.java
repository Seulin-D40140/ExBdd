package fr.fms.dao;
import java.sql.Connection;

public interface Dao<T> 
{
	public Connection connection = Bddconnection.getConnection(); // connection a la bdd
	public void add( T obj); // ajouter un article
	public void remove(int id); // supprimer un article
	public void update ( T obj , int id); // mise a jour article
	public void displayOne(int id); // afficher 1 article 
	public void displayAll(); // afficher tout les articles
}
