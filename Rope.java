package main;

public class Rope {
	public static String maxVelocity(double maxtension, double length, double mass) {
		double v;
		v = Math.sqrt(maxtension*length/mass);
		if(v>=40)return "40";
		else if(v>=15)return "20";
		else if(v>=5)return "10";
		else return "1";
	}
}
