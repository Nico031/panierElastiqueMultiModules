package afpa.cdi.elastique.panier.dao.impl;

import afpa.cdi.elastique.panier.modele.Famille;
import afpa.cdi.elastique.panier.persistance.DAO;
import afpa.cdi.elastique.panier.persistance.IDAOFactory;

public class DAOFactoryJDBC implements IDAOFactory {

	public DAO<Famille> getFamilleDAO() {
		
		return new FamilleDAO();
	}

}
