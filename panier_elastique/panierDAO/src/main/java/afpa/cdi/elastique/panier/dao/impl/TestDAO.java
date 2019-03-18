package afpa.cdi.elastique.panier.dao.impl;


import afpa.cdi.elastique.panier.dao.impl.FamilleDAO;
import afpa.cdi.elastique.panier.modele.Famille;
import afpa.cdi.elastique.panier.persistance.DAO;



/**
 * @author nico
 */
public class TestDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		DAO<Famille> famDAO = new DAOFactoryJDBC().getFamilleDAO();
		
		//System.out.println(famDAO.find(1));
		System.out.println(famDAO.findAll());
		
		 

		
		
	}

}
