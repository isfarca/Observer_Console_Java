package headfirst.observer.wetterobservable;

public class WetterStationWaermeIndex {

	public static void main(String[] args) {
		WetterDaten wetterdaten = new WetterDaten();
		AktuelleBedingungenAnzeige aktuelleBedingungen = new AktuelleBedingungenAnzeige(wetterdaten);
		StatistikAnzeige statistikAnzeige = new StatistikAnzeige(wetterdaten);
		VorhersageAnzeige vorhersageAnzeige = new VorhersageAnzeige(wetterdaten);
		WaermeindexAnzeige w�rmeindexAnzeige = new WaermeindexAnzeige(wetterdaten);

		wetterdaten.setMesswerte(30, 65, 30.4f);
		wetterdaten.setMesswerte(32, 70, 29.2f);
		wetterdaten.setMesswerte(28, 90, 29.2f);
	}
}
