/**
 * Copyright (c) 2010 Martin Geisse
 *
 * This file is distributed under the terms of the MIT license.
 */

package name.martingeisse.wicket.demo_app.page;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;

/**
 * 
 */
public class NavigationPage extends AbstractApplicationPage {

	/**
	 * Constructor.
	 */
	public NavigationPage() {
		add(new BookmarkablePageLink<>("simpleFormsLink", SimpleFormPage.class));
		add(new BookmarkablePageLink<>("contextMenuLink", ContextMenuPage.class));
		add(new BookmarkablePageLink<>("hotkeyLink", HotkeyPage.class));
	}
	
}
