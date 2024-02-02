import fr.fms.bdd.ArticleDao;
import fr.fms.bdd.UserDao;

class TestJdbc 
{
	public static void main(String[] args)
	{	
		ArticleDao article = new ArticleDao();
		UserDao user = new UserDao();
		
		System.out.println("*****************************");
		// ajout article
//		Article cod = new Article ("call of duty ", "activision ", 119);
//		article.add(cod);
//		article.displayAll();
		
		System.out.println("*****************************");
		// update article
//		Article crew = new Article("the crew", "ubisoft", 49);
//		Article windows = new Article("systeme d'exploitation", "windows", 150);
//		article.update(windows, 3);
//		article.update(crew , 16);
//		article.displayAll();
		
		System.out.println("*****************************");
		// supression article
//		article.remove(5);
//		article.displayAll();
		
		System.out.println("*****************************");
//		 aficher 1 seul article
		article.displayOne(5);
		
		System.out.println("*****************************");
//		ajouter user
//		User tete = new User("tete40", "taratete40");
//		user.add(tete);
//		user.displayAll();
		
		System.out.println("*****************************");
//		supprimer user 
//		user.remove(3);
//		user.displayAll();
		
		System.out.println("*****************************");
//		update user 
//		User tete = new User("tete40", "taratete40");
//		user.update(tete, 2);
//		user.displayAll();
		
		System.out.println("*****************************");
//		 aficher 1 seul user
		user.displayOne(4);
	}
}
