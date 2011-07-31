package de.rahn.services.calculator.standard;

import static org.springframework.util.Assert.notNull;

import de.rahn.services.calculator.Calculator;

/**
 * Eine Implementierung des einfach Taschenrechners.
 * @author Frank W. Rahn
 */
public class SimpleCalculator implements Calculator {

	/**
	 * {@inheritDoc}
	 * @see Calculator#add(int[])
	 */
	@Override
	public int add(int... summands) {
		notNull(summands, "Die Summanden sind null");

		int result = 0;

		for (int sum : summands) {
			result += sum;
		}

		return result;
	}

	/**
	 * {@inheritDoc}
	 * @see Calculator#add(double[])
	 */
	@Override
	public double add(double... summands) {
		notNull(summands, "Die Summanden sind null");

		double result = 0;

		for (double sum : summands) {
			result += sum;
		}

		return result;
	}

}