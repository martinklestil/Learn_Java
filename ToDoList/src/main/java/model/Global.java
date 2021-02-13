package model;

import java.awt.Color;

/**
 * @author Martin Klestil
 *
 */
public final class Global {
	
	private static String version = "1.0";
	private static String versionDate = "13.02.2021";
	
	//Colors
	private static Color maincolor = Color.decode("#276678");
	private static Color maincolorLight = Color.decode("#1687a7");
	private static Color secondcolor = Color.decode("#ffc478");
	private static Color secondcolorLight = Color.decode("#ffee93");
	private static Color white = Color.decode("#ffffff");
	private static Color black = Color.decode("#000000");
	private static String defaultFont = "Helvetica";
	private static String defaultFontSize = "16";


	public String getVersion() {
		return version;
	}

	public String getVersionDate() {
		return versionDate;
	}

	public static Color getMaincolor() {
		return maincolor;
	}

	public static Color getMaincolorLight() {
		return maincolorLight;
	}

	public static Color getSecondcolor() {
		return secondcolor;
	}

	public static Color getSecondcolorLight() {
		return secondcolorLight;
	}

	public static Color getWhite() {
		return white;
	}

	public static Color getBlack() {
		return black;
	}

	public static String getDefaultFont() {
		return defaultFont;
	}

	public static String getDefaultFontSize() {
		return defaultFontSize;
	}
	

}
