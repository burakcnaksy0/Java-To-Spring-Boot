package AbstractClassesAndInterface;

interface Boy {
	int değişken = 0; // The blank final field değişken may not have been initialized

	static String tanım() {
		return "bu interface implement eden class için " + "boy bilgilerinin dönülmesini garanti eder.";
	}

	// bu interface i implement eden classlar bu iki metodu kodlamak zorundadır.
	double boySantimetre();

	double boyMetre();

	// java 8 den sonra gelmiştir.
	// bunu kodlamak zorunda değiliz.
	default double boyKilometre() {
		return 0;
	}

}
