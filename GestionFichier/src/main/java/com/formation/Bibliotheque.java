import java.util.*;
public class Bibliotheque {

	public static void main(String [] arg){
		
	        Scanner lectureClavier = new Scanner(System.in);
		// Appel du constructeur par d�faut
		Livre livrePoche = new Livre();

		System.out.print("Entrez le titre : ");
		livrePoche.setTitre(lectureClavier.next());
		System.out.print("Entrez la categorie : ");
		livrePoche.setCategorie(lectureClavier.next());
		System.out.print("Entrez le nom de l'auteur : ");
		livrePoche.setNomAuteur(lectureClavier.next());
		System.out.print("Entrez le prenom de l'auteur : ");
		livrePoche.setPrenomAuteur(lectureClavier.next());		
		System.out.print("Entrez le numero ISBN : ");
		livrePoche.setIsbn(lectureClavier.next());
		
		
		System.out.print("Code du livre " + livrePoche.getTitre()+ " : ");
		System.out.println(livrePoche.getCode());
		// Afficher toutes les propri�t�s
		livrePoche.afficherUnLivre();
		
		
		Livre unPolar = new Livre("Le myst�re de la chambre jaune","Leroux", "Gaston", "Policier", "2253005495");
		unPolar.afficherUnLivre();
	}
}
