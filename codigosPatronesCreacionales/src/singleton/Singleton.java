package singleton;

public class Singleton {
	
	private static Singleton singleton_;
	private String saludo_;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstanceSingleton() {
		if(singleton_ == null) {
			singleton_ = new Singleton();
		}
		return singleton_;
	}
	
	public void Saluda(String saludo) {
		this.saludo_ = saludo;
	}
	
	public String getSaludo() {
		return this.saludo_;
	}
}
