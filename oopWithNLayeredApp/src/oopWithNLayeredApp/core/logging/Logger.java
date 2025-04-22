package oopWithNLayeredApp.core.logging;
// Core layer : Uygulama genelinde kullanılabilecek ortak araçlar, sınıflar, exception handler'lar burada yer alır.
// Genellikle bağımlılıkları yöneten altyapılar da buradadır.

public interface Logger {
	void log(String data);
}
