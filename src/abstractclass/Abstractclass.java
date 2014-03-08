package abstractclass;

public class Abstractclass {

}

public abstract class AbstractDrawFunction extends JPanel{
	private Polygon p = new Polygon();
	protected AbstractDrawFunction(){
		DrawFunction();
	}
	
	abstract double f(double x);
	
	public void drawFunction(){
		for(int x = -100; x <= 100;x++){
			p.addpoint(x + 200,200 - (int)f(x))
		}
	}
	
	@Override
	protected void paintCompoent(Graphics g){
	}
}

class TestFunctionA extends AbstractDrawFunction{
	
	public functionA(){
		
		
	}
	
}