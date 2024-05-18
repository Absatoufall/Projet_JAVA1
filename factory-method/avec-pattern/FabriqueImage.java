public class FabriqueImage
{
	public static Image getInstance(String nomFichier)
	{
		Image image = null;
		int indexPoint = nomFichier.indexOf(".");
		String format = nomFichier.substring(++indexPoint);

		if (format.equalsIgnoreCase("PNG")) {
			image = new ImagePng(nomFichier);
		}
		else if (format.equalsIgnoreCase("JPG")) {
			image = new ImageJpg(nomFichier);
		}
		else if (format.equalsIgnoreCase("BMP")) {
			image = new ImageBmp(nomFichier);
		}
		else {
			System.err.println("Erreur : format non reconnu");
		}

		return image;
	}
}