public class ImagePng extends Image
{
	public ImagePng(String nomFichier)
	{
		super(nomFichier);
		this.pixels = new byte[3][2];
	}

	private void init()
	{
		for (int i = 0; i < this.pixels.length; i++)
		{
			for (int j = 0; j < this.pixels[i].length; j++)
			{
				this.pixels[i][j] = 1;
			}
		}
	}

	public byte[][] getPixels() {
		this.init();
		return this.pixels;
	}
}