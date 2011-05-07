package de.rahn.services.calculator;

/**
 * Ein einfach Taschenrechner.
 * @author Frank W. Rahn
 */
public interface Calculator {

	/**
	 * Addiere die rationalen Zahlen.
	 * @param summand die Summanden
	 * @return die Summe
	 */
	double add(double... summand);

	/**
	 * Addiere die natürlichen Zahlen.
	 * @param summand die Summanden
	 * @return die Summe
	 */
	int add(int... summand);

}