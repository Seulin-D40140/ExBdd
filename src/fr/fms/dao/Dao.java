package fr.fms.dao;
import java.sql.Connection;
import java.util.ArrayList;

public interface Dao<T> 
{
	public Connection connection = Bddconnection.getConnection(); // connection a la bdd
	public void addArticle( T obj); // ajouter un article
	public void removeArticle(int idArticle); // supprimer un article
	public void UpdtArticle ( T obj , int id); // mise a jour article
	public void displayOneArticle(int idArticle); // afficher 1 article 
	public void displaybdd(ArrayList<T> articles); // afficher tout les articles
}
