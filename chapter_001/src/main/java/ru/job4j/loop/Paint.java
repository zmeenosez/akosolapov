package ru.job4j.loop;

/**
 * Программа построения пирамиды в псевдографике.
 * @author Aleksey Kosolapov.
 * @version 0.1.
 * @since 20.04.17.
 */

 public class Paint {
	 /**
	  * String piramid метод построения пирамиды в псевдографике.
	  * @param h number.
	  * @return piramid.
	  */
	  public String piramid(int h) {
	  StringBuilder builder = new StringBuilder();
		int widthPiramid = h - 1 + h;
		for (int height = 1; height <= h; height++) {
			int strSpace = h - height;
			int strSymbol = widthPiramid - strSpace;
			for (int width = 1; width <= widthPiramid; width++) {
				if ((strSpace < width) & (width <= strSymbol)) {
					builder.append("^");
				} else {
					builder.append(" ");
				}
			}
			if (height != h) {
				builder.append(System.getProperty("line.separator"));
			}
		}
		return builder.toString();
	}
}