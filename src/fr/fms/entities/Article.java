package fr.fms.entities;

public class Article 
{
	int rsIdArticle;
	String rsDescription;
	String rsMarque;
	double rsPrixUnitaire;
	
	public Article( int rsIdArticle , String rsDescription , String rsMarque , double rsPrixUnitaire )
	{
		this.rsIdArticle = rsIdArticle;
		this.rsDescription = rsDescription;
		this.rsMarque = rsMarque;
		this.rsPrixUnitaire = rsPrixUnitaire;
	}
	public Article ( String rsDescription , String rsMarque , double rsPrixUnitaire )
	{
		this.rsDescription = rsDescription;
		this.rsMarque = rsMarque;
		this.rsPrixUnitaire = rsPrixUnitaire;
	}

	public int getID() 
	{
		return rsIdArticle;
	}

	public void setID(int rsIdArticle) 
	{
		this.rsIdArticle = rsIdArticle;
	}

	public String getDescription() 
	{
		return rsDescription;
	}

	public void setDescription(String rsDescription) 
	{
		this.rsDescription = rsDescription;
	}

	public String getBrand() 
	{
		return rsMarque;
	}

	public void setBrand(String rsMarque) 
	{
		this.rsMarque = rsMarque;
	}

	public double getPrice() 
	{
		return rsPrixUnitaire;
	}

	public void setPrice(double rsPrixUnitaire) 
	{
		this.rsPrixUnitaire = rsPrixUnitaire;
	}
}
