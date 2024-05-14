public class Voiture {
    // Les attributs de la classe Voiture
    private String marque;
    private String modele;
    private int anneeFabrication;
    private String couleur;
    private double vitesse;

    // Constructeur de la classe Voiture
    public Voiture(String marque, String modele, int anneeFabrication, String couleur) {
        this.marque = marque;
        this.modele = modele;
        this.anneeFabrication = anneeFabrication;
        this.couleur = couleur;
        this.vitesse = 0.0; // Initialiser la vitesse à zéro au démarrage
    }

    // Méthode pour démarrer la voiture
    public void demarrer() {
        System.out.println("Bravo");
        System.out.println("La voiture démarre avec succes .");

    }

    // Méthode pour arrêter la voiture
    public void arreter() {
        System.out.println("Oppss La voiture s'arrête.");
    }

    // Méthode pour accélérer la voiture
    public void accelerer(double acceleration) {
        this.vitesse += acceleration;
        System.out.println("La voiture accélère à " + this.vitesse + " km/h.");
    }

    // Méthode pour ralentir la voiture
    public void ralentir(double deceleration) {
        this.vitesse -= deceleration;
        System.out.println("La voiture ralentit à " + this.vitesse + " km/h.");
    }

    // Méthode pour afficher les détails de la voiture
    public void afficherDetails() {
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("Année de fabrication : " + anneeFabrication);
        System.out.println("Couleur : " + couleur);
        System.out.println("Vitesse : " + vitesse + " km/h");
    }

    // Méthode principale pour tester la classe Voiture
    public static void main(String[] args) {
        // Création d'une instance de Voiture
        Voiture maVoiture = new Voiture("Toyota", "Corolla", 2020, "rouge");

        // Appel des méthodes pour manipuler la voiture
        maVoiture.demarrer();
        maVoiture.accelerer(30);
        maVoiture.ralentir(10);
        maVoiture.arreter();

        // Affichage des détails de la voiture
        maVoiture.afficherDetails();
    }
}
