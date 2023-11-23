package atelier06;

public class Arbre extends Végétal {
	// ajout d'attributs propres à la sous-classe

		/**
		 * le constructeur de Arbre fait appel au constructeur de la sur-classe Végétal
		 */
		public Arbre(String type) { 
			super(type);
			}

		/** présentation des caractéristiques des arbre */
		public void présente() {
			// appel de la méthode de la sur-classe
			super.présente();
			System.out.println("je suis un arbre ");
		}


	}

