import java.util.ArrayList;

public class Dossier
{
	private String nom;
	private ArrayList<Object> elements;

	public Dossier(String nom) {
		this.nom = nom;
		this.elements = new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Object> getElements() {
		return elements;
	}

	public void ajouter(Object element) {
		this.elements.add(element);
	}

	public void supprimer(Object element) {
		this.elements.remove(element);
	}

	public void afficher() {
		System.out.printf("========== Contenu du dossier %s ==========\n", this.nom);

		for (Object element : elements) {
			if (element instanceof Fichier) {
				((Fichier) element).afficher();
			}
			else if (element instanceof Dossier) {
				((Dossier) element).afficher();
			}
			else {
				System.err.println("Erreur : type inconnu");
			}
		}

		System.out.printf("============ Fin du dossier %s ============\n", this.nom);
	}
}
