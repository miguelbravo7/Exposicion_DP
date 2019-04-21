package singleton;

public class MainSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton singleton1 = Singleton.getInstanceSingleton();
		Singleton singleton2 = Singleton.getInstanceSingleton();
		
		singleton1.Saluda("Hola!! :)");
		System.out.println(singleton2.getSaludo());
		
		singleton2.Saluda("Qué tal??");
		System.out.println(singleton1.getSaludo());
		System.out.println(singleton2.getSaludo());

	}

}
