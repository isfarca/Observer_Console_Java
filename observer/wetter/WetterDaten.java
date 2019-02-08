package headfirst.observer.wetter;

import java.util.*;

public class WetterDaten implements Subjekt {
	private ArrayList beobachter;
	private float temperatur;
	private float feuchtigkeit;
	private float luftdruck;
	
	public WetterDaten() {
		beobachter = new ArrayList();
	}
	
	public void registriereBeobachter(Beobachter b) {
		beobachter.add(b);
	}
	
	public void entferneBeobachter(Beobachter b) {
		int i = beobachter.indexOf(b);
		if (i >= 0) {
			beobachter.remove(i);
		}
	}
	
	public void benachrichtigeBeobachter() {
		for (int i = 0; i < beobachter.size(); i++) {
			Beobachter observer = (Beobachter)beobachter.get(i);
			observer.aktualisieren(temperatur, feuchtigkeit, luftdruck);
		}
	}
	
	public void messwerteGešndert() {
		benachrichtigeBeobachter();
	}
	
	public void setMesswerte(float temp, float feucht, float druck) {
		this.temperatur = temp;
		this.feuchtigkeit = feucht;
		this.luftdruck = druck;
		messwerteGešndert();
	}
	
	// andere WetterDaten-Methoden
	
	public float getTemperatur() {
		return temperatur;
	}
	
	public float getFeuchtigkeit() {
		return feuchtigkeit;
	}
	
	public float getLuftdruck() {
		return luftdruck;
	}
}
