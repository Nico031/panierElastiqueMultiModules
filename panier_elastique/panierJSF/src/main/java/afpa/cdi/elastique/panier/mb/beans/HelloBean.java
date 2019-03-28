package afpa.cdi.elastique.panier.mb.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import afpa.cdi.elastique.panier.beans.BlocFiltre;
import afpa.cdi.elastique.panier.services.ServiceFiltre;

/**
 * @author Dara
 *
 */

/*@ManagedBean permet de préciser au serveur que ce bean est dorénavant géré par JSF. Cela signifie simplement que JSF 
 va utiliser ce bean en tant que modèle associé à une ou plusieurs vues. Par défaut, le nom du bean correspond au nom 
 de la classe, la majuscule en moins*/
@ManagedBean

// on précise au serveur la portée de ce bean. Ici portée = session
@SessionScoped
public class HelloBean implements Serializable{

	private List<BlocFiltre> listBF;
	public HelloBean() {
		ServiceFiltre.init();
		listBF= ServiceFiltre.getListBlocFiltre();
	}

	private static final long serialVersionUID = 1L;

	public String getCoucou() {
		return "Coucou";
	}
	
	
	

}
