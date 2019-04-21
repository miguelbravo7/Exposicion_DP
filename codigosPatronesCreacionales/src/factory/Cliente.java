package factory;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tipoEquipo = "sobremesa";
		int memory = 16;
		double processor = 4.5;
		
		Factory fabrica = new FactoryIMP();
		Equipo miEquipo = fabrica.makeEquipo(tipoEquipo, memory, processor);
		System.out.println("Es un " + miEquipo.getType() + " de " + miEquipo.getMemory() + 
				" GB y " + miEquipo.getProcessor() + " GHz");

	}

}
