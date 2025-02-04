package compte;

public class compte {
	private static int n=0;
	private int num;
	private double solde;
	private personne ti;
	private double dbm;
	private double dcm;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public personne getTi() {
		return ti;
	}
	public void setTi(personne ti) {
		this.ti = ti;
	}
	public double getDbm() {
		return dbm;
	}
	public void setDbm(double dbm) {
		this.dbm = dbm;
	}
	public double getDcm() {
		return dcm;
	}
	public void setDcm(double dcm) {
		this.dcm = dcm;
	}
	
	public static int getN() {
		return n;
	}
	public static void setN(int n) {
		compte.n = n;
	}
	@Override
	public String toString() {
		return "compte [num=" + num + ", solde=" + solde + ", tiulaire=" + ti + ", debit max=" + dbm + ", decouvert max=" + dcm + "]";
	}
	public compte(personne ti)
	{
		this.num=++n;
		this.solde=0;
		this.ti=ti;
		this.dbm=1000;
		this.dcm=800;
	}
	public compte(personne ti,double dbm,double dcm,double solde)
	{
		this.num=++n;
		this.solde=solde;
		this.ti=ti;
		this.dbm=dbm;
		this.dcm=dcm;
	}
	void crediter(double mnt)
	{
		if(mnt>0)
		{
			this.solde+=mnt;
		}
		
	}
	public boolean debiter(double mnt)
	{
		if(mnt<this.dbm && this.solde-mnt>-this.dcm)
		{
			this.solde -=mnt;
			return true;
		}
		return false;
	}
	boolean estadecouvert()
	{
		return solde<0;
	}
	public double montantdecouvert()
	{
		if(dcm<0)
		{
			return solde;
		}
		return solde;
	}
	public void virement(double m, compte c)
	{
		if(this.debiter(m))
		{
			c.crediter(m);
		}
	}
	public static void virement(double m, compte c1, compte c2)
	{
		if(c1.debiter(m))
		{
			c2.crediter(m);
		}
	}
	
}
