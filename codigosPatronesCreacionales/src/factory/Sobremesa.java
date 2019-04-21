package factory;

public class Sobremesa implements Equipo{
	
	int memory_;
	double processor_;
	
	public Sobremesa(int memory, double processor) {
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
	
	public String getType() {
		return "Sobremesa";
	}

}
