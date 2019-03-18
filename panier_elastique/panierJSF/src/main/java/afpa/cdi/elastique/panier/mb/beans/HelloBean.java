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

@ManagedBean
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
