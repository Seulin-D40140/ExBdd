
import java.util.ArrayList;


class TestJdbc 
{
	public static void main(String[] args) throws Exception
	{
		String strSql = "SELECT * FROM T_articles";
		//String strSqlAdd = "INSERT INTO T_articles ( Description , Brand , UnitaryPrice ) VALUES ( ? , ? , ? );";
		//String strSqlDel = "delete from T_articles where idArticle=17";
		String strSqlUpdt = "update T_articles set brand=\"windows\" where idArticle=3";
		String strSqlUpdt2 = "update T_articles set brand=\"ubisoft\" where idArticle=16";
		ArrayList<Article> articles = new ArrayList<>();
		ArticleDao article = new ArticleDao();
		try 
		{
			Class.forName("org.mariadb.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		article.UpdtArticle(strSqlUpdt);
		article.UpdtArticle(strSqlUpdt2);
		article.displayAll(articles, strSql);
		
	}
}
