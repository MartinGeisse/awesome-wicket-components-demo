/**
 * Copyright (c) 2015 Martin Geisse
 *
 * This file is distributed under the terms of the MIT license.
 */

package name.martingeisse.wicket.demo_app.page;

import name.martingeisse.wicket.simpleform.SimpleFormPanel;

/**
 * Demo page for {@link SimpleFormPanel}.
 */
public class SimpleFormPage extends AbstractApplicationPage {

	/**
	 * Constructor.
	 */
	public SimpleFormPage() {
		
		// basic usage
		SimpleFormPanel<BasicUsageData> formPanel = new SimpleFormPanel<>("basicUsageForm");
		formPanel.prepareDecorator().withLabel("Choose a username").withModel("username").withRequiredness(true).addTextField();
		formPanel.prepareDecorator().withLabel("Choose a password").withModel("password").withRequiredness(true).addPasswordTextField();
		formPanel.prepareDecorator().withLabel("Please type in your password again").withModel("passwordAgain").withRequiredness(true).addPasswordTextField();
		formPanel.prepareSpecialFormBlock().withText("Register").addSubmitButton();
		add(formPanel);
		
	}

	
}
