package atelier06;

public abstract class Végétal {
		private String famille;

		/**
		 * création d'une nouvelle instance de la classe Végétal
		 * 
		 * @param type   nom de la famille vegetal
		 */
		public Végétal(String type) {
			famille = type;
		}

		/** présentation des caractéristiques de l'animal */
		public void présente() {
			System.out.println("je suis un représentant de la famille des " + famille );
		}

	}

