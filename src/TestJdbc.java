
import java.util.ArrayList;


class TestJdbc 
{
	public static void main(String[] args) throws Exception
	{	
		Article cod = new Article ("call of duty ", "activision ", 119);
		
		ArrayList<Article> articles = new ArrayList<>();
		ArticleDao article = new ArticleDao();
		article.tryForName();
		
		System.out.println("*****************************");
//		article.addArticle(cod);
//		System.out.println("*****************************");
//		article.displaybdd(articles);
//		article.UpdtArticle("systeme d'exploitation", "windows", 150.0 , 3);
//		System.out.println("*****************************");
//		article.displaybdd(articles);
		article.displayAll();
	}
}
