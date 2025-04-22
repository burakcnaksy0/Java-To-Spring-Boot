package AbstractClassesAndInterface;

public abstract class Hayvan implements Boy {
	private double boy;
	private double kilo;
	public abstract boolean canlıMı();
	
	public double getBoy() {
		return boy;
	}
	public void setBoy(double boy) {
		this.boy = boy;
	}
	public double getKilo() {
		return kilo;
	}
	public void setKilo(double kilo) {
		this.kilo = kilo;
	}
	
	

}
