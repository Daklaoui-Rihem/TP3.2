package compte;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personne p1=new personne("Dak","Ryy","Zarzouna");
		personne p2=new personne("D","Ryry","Benzart");
		compte c1=new compte(p1);
		compte c2=new compte(p2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("Apres Crediter:");
		c1.crediter(1000);
		c2.crediter(5000);
		System.out.println(c1);
		System.out.println(c2);
		c1.virement(200, c2);
		compte.virement(300, c1, c2);
		System.out.println(c1);
		System.out.println(c2);
	}

}
