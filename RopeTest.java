package main;

import static org.junit.Assert.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.junit.Test;

public class RopeTest {
	
	static Scanner input = new Scanner(System.in);
	private final double LENGTH = 3.0;
	private final double MAXTENSION = 60.0;
	private String text = JOptionPane.showInputDialog("Mass of Object:");
	private double mass = Double.parseDouble(text);
	
	double thisV = Math.sqrt(MAXTENSION*LENGTH/mass);
	
	@Test
	public void test() {
		if(thisV>=40)assertEquals("40",Rope.maxVelocity(MAXTENSION,LENGTH,mass));
		else if(thisV>=15)assertEquals("20",Rope.maxVelocity(MAXTENSION,LENGTH,mass));
		else if(thisV>=5)assertEquals("10",Rope.maxVelocity(MAXTENSION,LENGTH,mass));
		else assertEquals("1",Rope.maxVelocity(MAXTENSION,LENGTH,mass));
	}

}
