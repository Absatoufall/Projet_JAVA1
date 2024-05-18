public class ImageShower
{
	public static void main(String[] args)
	{
		String nomFichier = (args.length != 0) ? args[0] : "Toto.bmp";
		ImageShower.afficherImage(nomFichier);
	}

	public static void afficherImage(String nomFichier)
	{
		Image image = FabriqueImage.getInstance(nomFichier);

		byte[][] pixels = image.getPixels();
		ImageShower.showPixels(pixels);
	}

	public static void showPixels(byte[][] pixels)
	{
		for (int i = 0; i < pixels.length; i++)
		{
			for (int j = 0; j < pixels[i].length; j++)
			{
				System.out.print(pixels[i][j] + "\t");
			}
			System.out.println();
		}
	}
}