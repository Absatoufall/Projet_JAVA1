public class ExplorateurFichier
{
	public static void main(String[] args)
	{
		Fichier fichier1 = new Fichier("blondy", "mp3", 1024);
		Fichier fichier2 = new Fichier("marley", "mp4", 2048);
		Fichier fichier3 = new Fichier("globe", "png", 1428);
		Fichier fichier4 = new Fichier("mane", "jpg", 148);
		Fichier fichier5 = new Fichier("gawlo", "mp3", 1248);
		Fichier fichier6 = new Fichier("lucky", "wmv", 1248);

		Dossier dossier1 = new Dossier("Music");
		dossier1.ajouter(fichier1);
		dossier1.ajouter(fichier2);

		Dossier dossier2 = new Dossier("Images");
		dossier2.ajouter(fichier3);
		dossier2.ajouter(fichier4);

		// System.out.println("Affichage d'un fichier");
		// fichier5.afficher();

		// System.out.println("Affichage de dossiers");
		// dossier1.afficher();
		// dossier2.afficher();

		Dossier racine = new Dossier("Multimedia");
		racine.ajouter(fichier5);
		racine.ajouter(dossier1);
		racine.ajouter(fichier6);
		racine.ajouter(dossier2);

		racine.afficher();
	}
}
