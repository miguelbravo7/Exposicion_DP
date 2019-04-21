package factory;

public class FactoryIMP implements Factory {
	
	public final static String SOBREMESA = "sobremesa";
	public final static String PORTATIL = "portatil";
	public final static String SERVIDOR = "servidor";
	

	@Override
	public Equipo makeEquipo(String type, int memory, double processor) {
		// TODO Auto-generated method stub
		switch(type) {
		case("sobremesa"):
			return new Sobremesa(memory,processor);
		case("portatil"):
			return new Portatil(memory, processor);
		case("servidor"):
			return new Servidor(memory, processor);
		default:
			return null;
		}
	}

}
