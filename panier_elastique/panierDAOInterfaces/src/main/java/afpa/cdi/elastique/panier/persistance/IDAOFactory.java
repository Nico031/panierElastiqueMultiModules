/**
 * 
 */
package afpa.cdi.elastique.panier.persistance;

import afpa.cdi.elastique.panier.modele.Famille;

/**
 * @author Dara
 *
 */
public interface IDAOFactory {
	
	    // Add your DAO interfaces here
	    DAO<Famille> getFamilleDAO();
	    
}

