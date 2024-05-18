import java.io.File;

public class Main {

    public static void main(String[] args) {
        // Chemin du dossier principal
        String cheminPrincipal = "composite";

        // Affichage de la structure des dossiers
        afficherStructure(new File(cheminPrincipal), "");
    }

    public static void afficherStructure(File dossier, String indent) {
        if (dossier.isDirectory()) {
            System.out.println(indent + "---" + dossier.getName()+""+"");
            File[] fichiers = dossier.listFiles();

            if (fichiers != null) {
                for (int i = 0; i < fichiers.length; i++) {
                    File fichier = fichiers[i];
                    if (fichier.isDirectory()) {
                        afficherStructure(fichier, indent + "    ");
                    } else {
                        System.out.println(indent + "    " + fichier.getName());
                    }
                }
            }
        }
    }
}
