package AbstractClassesAndInterface;

public class İnsan extends Hayvan {

	public İnsan(double boy, double kilo) {
		this.setBoy(boy);
		this.setKilo(kilo);
	}

	@Override
	public double boySantimetre() {
		// TODO Auto-generated method stub
		return this.getBoy();
	}

	@Override
	public double boyMetre() {
		// TODO Auto-generated method stub
		return this.getBoy() / 100;
	}

	@Override
	public double boyKilometre() {
		// TODO Auto-generated method stub
		return this.getBoy() / 1000;
	}

	@Override
	public boolean canlıMı() {
		// TODO Auto-generated method stub
		return true;
	}
}
