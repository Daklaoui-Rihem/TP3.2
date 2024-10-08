package compte;

public class personne {
	private String nom;
	private String prenom;
	private String adresse;
	public personne(String n, String p, String a)
	{
		this.nom=n;
		this.prenom=p;
		this.adresse=a;
	}
	@Override
	public String toString() {
		return "personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}
	
	
}
