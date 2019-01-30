import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class ProtetorDeTela extends JPanel{
	
	SecureRandom aleatorio = new SecureRandom();
	
	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		for(int i = 0; i < 100; i++) {
			
			g.setColor(new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256)));
			g.drawLine(aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()), aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));
			
		}
		
		repaint();
		
	}
	
}
