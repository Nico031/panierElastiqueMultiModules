/**
 * 
 */
package afpa.cdi.elastique.panier.mb.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

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
	
	private String login;
	
	private String password;

	/**
	 * Constructeur
	 */
	public LoginBean() {
		System.out.println("in constructeur()");
	}
	
	

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}



	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}



	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}



	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}



	/**
	 * @return the client
	 */
	public Client getClient() {
		System.out.println( "in getClient()" );
		return client;
	}
	
	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		System.out.println( "in setClient()" );
		this.client = client;
	}

	/**
	 * methode pour verifier l'identité du client
	 * @return
	 */
	public String validate() {
	    System.out.println("in validate()");
	    if (this.getLogin().equals("lana") && this.getPassword().equals("travail!")) {
	    	client = new Client(this.getLogin(), this.getPassword());
	    return "success"; 
	    } else {
	    	//ne marche pas -> voir comment afficher
	    	FacesMessage message = new FacesMessage( "Veuillez saisir un login et/ou password valide" );
	        FacesContext.getCurrentInstance().addMessage( null, message );
	    	return "failure";
	    	
	    }
	    
	}
	

	
	
}