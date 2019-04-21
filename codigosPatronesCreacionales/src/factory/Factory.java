package factory;

public interface Factory {
	
	public Equipo makeEquipo(String type, int memory, double processor);

}
