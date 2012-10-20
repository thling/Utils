/**
 * uix - User Interface eXtension
 */
package com.thling.utils;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author		Sam Ling <sam@thling.com>
 * @version		1.0
 * @since		Sep 08, 2012
 */
public class UiX {
	/**
	 * Displays the container in the middle of the screen.
	 * If there are multiple displays, the primary screen will be referenced.
	 * 
	 * @param container
	 *            The container to be centralized on screen.
	 */
	public final static void centralizeOnScreen(Container container) {
		int height = container.getHeight();
		int width = container.getWidth();

		Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
		int scnHeight = screenDimension.height;
		int scnWidth = screenDimension.width;

		container.setLocation(scnWidth / 2 - width / 2, scnHeight / 2 - height / 2);
	}

	/**
	 * Gets the dimension of the primary monitor.
	 * 
	 * @return The screen size of the primary monitor.
	 */
	public final static Dimension getScreenSize() {
		return Toolkit.getDefaultToolkit().getScreenSize();
	}
}
