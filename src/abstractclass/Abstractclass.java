package abstractclass;
import java.awt.*;
import javax.swing.*;
public class Abstractclass {
	public static void main(String[] args){
		int x = 0;
		
		JFrame frame = new JFrame();
        frame.add(new JPanel()); 
        frame.setSize(1000,400);
        frame.setVisible(true);
        frame.getContentPane().add(new TestFunctionA());
        frame.getContentPane().add(new TestFunctionB());
        frame.getContentPane().add(new TestFunctionC());
        frame.getContentPane().setLayout(new GridLayout(1, 3,6,7));
		JPanel panel = new JPanel();
		panel.setVisible(true);
	}

}

abstract class AbstractDrawFunction extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private Polygon p = new Polygon();
	
	protected AbstractDrawFunction(){
		drawFunction();
	}
	
	abstract double f(double x);
	
	public void drawFunction(){
		for(int x = -100; x <= 100;x++){
			p.addPoint(x + 200,200 - (int)f(x));
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		drawFunction();
		g.drawLine(10, 200,300 ,200);
		g.drawLine(310,200, 410, 200);
		g.drawLine(420, 200, 520, 200);
		g.drawLine(200, 10,200 ,200);
		g.drawLine(200, 210,200 ,310);
		g.drawLine(500, 200,500 ,100);
		g.drawPolyline(p.xpoints,p.ypoints,p.npoints);
	}
}

class TestFunctionA extends AbstractDrawFunction{
	
	private static final long serialVersionUID = 1L;

	public double f(double x){
		return Math.pow(x, 2);
	}
}

class TestFunctionB extends AbstractDrawFunction{
	
	private static final long serialVersionUID = 1L;
	
	public double f(double x){
		return 50 * Math.sin(x / 100 * 2 * Math.PI);
	}
}

class TestFunctionC extends AbstractDrawFunction{
	
	private static final long serialVersionUID = 1L;
	
	public double f(double x){
		return 50 * Math.cos(x / 100 * 2 * Math.PI);
	}
}

class TestFunctionD extends AbstractDrawFunction{
	
	private static final long serialVersionUID = 1L;
	
	public double f(double x){
		return Math.tan(x);
	}
}

class TestFunctionE extends AbstractDrawFunction{
	
	private static final long serialVersionUID = 1L;
	
	public double f(double x){
		return Math.cos(x) + 5 * Math.sin(x);
	}
}

class TestFunctionF extends AbstractDrawFunction{
	
	private static final long serialVersionUID = 1L;
	
	public double f(double x){
		return 5 * Math.cos(x) + Math.sin(x);
	}
}

class TestFunctionG extends AbstractDrawFunction{
	
	private static final long serialVersionUID = 1L;
	
	public double f(double x){
		return Math.log(x);
	}
}