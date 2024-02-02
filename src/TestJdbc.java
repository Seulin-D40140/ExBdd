import fr.fms.bdd.ArticleDao;

import fr.fms.entities.*;
import java.util.ArrayList;

class TestJdbc 
{
	public static void main(String[] args)
	{	
		ArrayList<Article> articles = new ArrayList<>();
		ArticleDao article = new ArticleDao();
		Article cod = new Article ("call of duty ", "activision ", 119);
		Article crew = new Article("the crew", "ubisoft", 49.90);
		Article windows = new Article("systeme d'exploitation", "windows", 150.0);
		
		
		System.out.println("*****************************");
		// ajout article
//		article.addArticle(cod);
//		article.displaybdd(articles);
		
		System.out.println("*****************************");
		// update article
//		article.UpdtArticle(windows, 3);
//		article.UpdtArticle(crew , 16);
//		article.displaybdd(articles);
		
		System.out.println("*****************************");
		// supression article
//		article.removeArticle(5);
//		article.displaybdd(articles);
		
		System.out.println("*****************************");
//		 aficher 1 seul article
//		article.displayOneArticle(5);
//		article.displaybdd(articles);
	}
}
