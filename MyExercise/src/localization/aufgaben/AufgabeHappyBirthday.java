package localization.aufgaben;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class AufgabeHappyBirthday {

	public static void main(String[] args) {
		
		

		// Locale.setDefault(Locale.FRANCE);

		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd. MMMM yyyy");

		ResourceBundle labels = ResourceBundle.getBundle("aufgaben.happybirthday");

		String language = labels.getString("settings.language");

		formatter = formatter.withLocale(getLocale(language));
		String todayAsString = formatter.format(today);
		System.out.println(labels.getString("label.today.is") + " " + todayAsString + ".");

		formatter = DateTimeFormatter.ofPattern("EEEE", getLocale(language));
		String dayOfWeekAsString = formatter.format(today);
		System.out.println(labels.getString("label.dayofweek") + " " + dayOfWeekAsString + ".");
	}

	static Locale getLocale(String lang) {
		return new Locale(lang);
	}

}
