
import java.util.ArrayList;
import java.util.Properties;


class TestJdbc 
{
	public static void main(String[] args) throws Exception
	{	
		ArrayList<Article> articles = new ArrayList<>();
		ArticleDao article = new ArticleDao();
		Article cod = new Article ("call of duty ", "activision ", 119);
		
		article.tryForName();
		
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
		// aficher 1 seul article
//		article.displayOneArticle(16);
		article.displaybdd(articles);
		
//		Properties prp = CreateConfigFile.readFile("configtext.txt");
//		System.out.println(prp.getProperty("db.login"));
	}
}
