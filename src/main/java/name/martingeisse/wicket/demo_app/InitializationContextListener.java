/**
 * Copyright (c) 2015 Martin Geisse
 *
 * This file is distributed under the terms of the MIT license.
 */

package name.martingeisse.wicket.demo_app;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

/**
 * This class initializes various parts of the system through a single
 * static method.
 */
public class InitializationContextListener implements ServletContextListener {

	// override
	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO set default locale
		DateTimeZone.setDefault(DateTimeZone.UTC);
		Constants.timeZone = DateTimeZone.forID("Europe/Berlin");
		Constants.internalDateFormatter = DateTimeFormat.forPattern("YYYY-MM-dd").withZone(Constants.timeZone);
		Constants.internalDateTimeFormatter = DateTimeFormat.forPattern("YYYY-MM-dd HH:mm:ss").withZone(Constants.timeZone);
		Constants.loggingDateFormatter = DateTimeFormat.forPattern("dd.MM.YYYY").withZone(Constants.timeZone);
		Constants.loggingDateTimeFormatter = DateTimeFormat.forPattern("dd.MM.YYYY HH:mm:ss").withZone(Constants.timeZone);
		Constants.uiDateFormatter = Constants.loggingDateFormatter;
		Constants.uiDateTimeFormatter = Constants.loggingDateTimeFormatter;
	}

	// override
	@Override
	public void contextDestroyed(ServletContextEvent event) {
	}

}
