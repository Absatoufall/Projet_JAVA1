public class Fichier
{
	private String nom, extension;
	private int taille;

	public Fichier(String nom, String extension, int taille)
	{
		this.nom = nom;
		this.extension = extension;
		this.setTaille(taille);
	}

	public String getNom()
	{
		return nom;
	}

	public String getExtension()
	{
		return extension;
	}

	public int getTaille()
	{
		return taille;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public void setExtension(String extension)
	{
		this.extension = extension;
	}

	public void setTaille(int taille)
	{
		if (taille >= 0)
		{
			this.taille = taille;
		}
		else
		{
			System.err.println("Erreur: taille incorrecte");
		}
	}

	public void afficher() {
		System.out.printf("Fichier %s.%s de taille %d\n", this.nom, this.extension, this.taille);
	}
}