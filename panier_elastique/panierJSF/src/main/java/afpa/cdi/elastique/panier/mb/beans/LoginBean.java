/**
 * 
 */
package afpa.cdi.elastique.panier.mb.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import afpa.cdi.elastique.panier.modele.Client;

/**
 * @version 1.0
 * @date 	27 mars 2019
 * @author 	nico
 *
 */

@ManagedBean
@RequestScoped
public class LoginBean implements Serializable{ /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Client client;

	/**
	 * Constructeur
	 */
	public LoginBean() {
		this.client = new Client();
	}
	


	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}
	
	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * methode pour verifier l'identité du client
	 * @return
	 */
	public boolean validate() {
		
		if (this.client.getLogin().equals("lana") && this.client.getPassword().equals("travail!")) {
			return true;
		} else {
			return false;
		}
	}
	
	
}