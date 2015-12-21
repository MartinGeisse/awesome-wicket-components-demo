/**
 * Copyright (c) 2015 Martin Geisse
 *
 * This file is distributed under the terms of the MIT license.
 */

package name.martingeisse.wicket.demo_app.page;

/**
 * The data object being edited in the "basic usage" example.
 */
public final class BasicUsageData {

	private String username;
	private String password;
	private String passwordAgain;

	/**
	 * Getter method for the username.
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Setter method for the username.
	 * @param username the username to set
	 */
	public void setUsername(final String username) {
		this.username = username;
	}

	/**
	 * Getter method for the password.
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter method for the password.
	 * @param password the password to set
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

	/**
	 * Getter method for the passwordAgain.
	 * @return the passwordAgain
	 */
	public String getPasswordAgain() {
		return passwordAgain;
	}

	/**
	 * Setter method for the passwordAgain.
	 * @param passwordAgain the passwordAgain to set
	 */
	public void setPasswordAgain(final String passwordAgain) {
		this.passwordAgain = passwordAgain;
	}

}
