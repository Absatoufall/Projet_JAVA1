public class Image
{
	private String nom, format;
	protected byte pixels[][];

	public Image(String nomFichier)
	{
		int indexPoint = nomFichier.indexOf(".");
		this.nom = nomFichier.substring(0, indexPoint);
		this.format = nomFichier.substring(++indexPoint).toUpperCase();
	}

	public byte[][] getPixels()
	{
		return this.pixels;
	}

	public String getNom()
	{
		return this.nom;
	}

	public String getFormat()
	{
		return this.format;
	}
}