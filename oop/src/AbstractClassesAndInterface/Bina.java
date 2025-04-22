package AbstractClassesAndInterface;

public class Bina implements Boy {

	@Override
	public double boySantimetre() {
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	public double boyMetre() {
		// TODO Auto-generated method stub
		return 20;
	}
	
	// isteğe bağlı olarak kullanılır
	@Override
	public double boyKilometre() {
		// TODO Auto-generated method stub
		return 0.02;
	}
}
