/**
 * Copyright (c) 2015 Martin Geisse
 *
 * This file is distributed under the terms of the MIT license.
 */

package name.martingeisse.wicket.demo_app.page;

import name.martingeisse.wicket.hotkey.HotkeyBehavior;

/**
 *
 */
public class HotkeyPage extends AbstractApplicationPage {

	private final StringBuilder xes = new StringBuilder();

	/**
	 * Constructor.
	 */
	public HotkeyPage() {
		add(new HotkeyBehavior());
	}

	/**
	 * Getter method for the xes.
	 * @return the xes
	 */
	public String getXes() {
		return xes.toString();
	}

}
