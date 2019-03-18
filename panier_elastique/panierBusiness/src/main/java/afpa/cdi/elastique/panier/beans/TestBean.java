package afpa.cdi.elastique.panier.beans;

import afpa.cdi.elastique.panier.services.ServiceFiltre;

public class TestBean {

public static void main(String[] args) {

		ServiceFiltre.init();
		System.out.println(ServiceFiltre.getListBlocFiltre());
	
		
	}
}
