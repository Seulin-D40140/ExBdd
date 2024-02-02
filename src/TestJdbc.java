import fr.fms.bdd.ArticleDao;

import fr.fms.entities.*;
import java.util.ArrayList;



class TestJdbc 
{
	public static void main(String[] args) throws Exception
	{	
		ArrayList<Article> articles = new ArrayList<>();
		ArticleDao article = new ArticleDao();
		Article cod = new Article ("call of duty ", "activision ", 119);
		
		
		
		System.out.println("*****************************");
		// ajout article
//		article.addArticle(cod);
//		article.displaybdd(articles);
		
		System.out.println("*****************************");
		// update article
//		article.UpdtArticle("systeme d'exploitation", "windows", 150.0 , 3);
//		article.UpdtArticle("the crew", "ubisoft", 49.90 , 16);
//		article.displaybdd(articles);
		
		System.out.println("*****************************");
		// supression article
//		article.removeArticle(5);
//		article.displaybdd(articles);
		
		System.out.println("*****************************");
//		 aficher 1 seul article
//		article.displayOneArticle(5);
		article.displaybdd(articles);
	}
}
