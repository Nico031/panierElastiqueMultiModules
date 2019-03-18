package afpa.cdi.elastique.panier.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import afpa.cdi.elastique.panier.beans.BlocFiltre;
import afpa.cdi.elastique.panier.beans.LigneFiltre;
import afpa.cdi.elastique.panier.dao.impl.DAOFactoryJDBC;
import afpa.cdi.elastique.panier.dao.impl.FamilleDAO;
import afpa.cdi.elastique.panier.modele.Famille;
import afpa.cdi.elastique.panier.persistance.DAO;
import afpa.cdi.elastique.panier.persistance.IDAOFactory;


/**
 * Classe regroupant les 3 filtres : famille, ss-famille, marque et qui les
 * remplit de lignes de filtres
 * 
 * @author HP
 *
 */

public class ServiceFiltre implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// attribut liste de blocs filtres static car on a qu'une seule liste de bloc
	private static List<BlocFiltre> listBlocFiltre = new ArrayList<BlocFiltre>();	// il faut instancier sinon nullpointerexcep

	// on est en static => pas de constructeur
	

	// méthode qui initialise la liste de blocs composés des listes de lignes dans
	// les blocs
	public static void init() {
		
		//si je n'ai pas de blocs => j'ajoute les blocs
		//ou je remets ma liste à vide et j'ajoute les blocs sinon l'affichage se double à chaque actualisation de la page
		listBlocFiltre = new ArrayList<BlocFiltre>();
		
		// prépa du bloc filtre
		BlocFiltre blocFiltre1 = new BlocFiltre("Famille");

		// remplir le bloc avec les lignes de filtres
		// on instancie objet DAO pour utiliser la méthode findAll()
		IDAOFactory factory = new DAOFactoryJDBC();
		DAO familleDAO = factory.getFamilleDAO();
		
		// on recup la vraie liste des familles dans une liste
		List<Famille> listeFamille = familleDAO.findAll();

		// ajout des lignes dans le bloc filtre
		// pour chaque famille de la liste, je la met dans un objet ligneFamille et
		// l'ajoute à mon bloc

		for (Famille famille : listeFamille) {

			LigneFiltre ligneFamille = new LigneFiltre(famille.getId(), famille.getIntitule(), false);

			blocFiltre1.add(ligneFamille);

		}

		// on ajoute le bloc1 pret à la liste de bloc
		listBlocFiltre.add(blocFiltre1);

		
		
	}

	// méthode pour retourner la liste de blocs complète
	public static List<BlocFiltre> getListBlocFiltre() {
		return listBlocFiltre;
	}

}
