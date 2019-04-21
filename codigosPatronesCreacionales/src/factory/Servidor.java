package factory;

public class Servidor implements Equipo{
	
	int memory_;
	double processor_;
	
	public Servidor(int memory, double processor) {
		// TODO Auto-generated constructor stub
		
		this.memory_ = memory;
		this.processor_ = processor;
	}
	
	@Override
	public int getMemory() {
		// TODO Auto-generated method stub
		return this.memory_;
	}
	@Override
	public double getProcessor() {
		// TODO Auto-generated method stub
		return this.processor_;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Servidor";
	}

}
