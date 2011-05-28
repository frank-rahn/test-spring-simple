package de.rahn.services.calculator.standard;

import de.rahn.services.calculator.Calculator;

/**
 * Eine Implementierung des einfach Taschenrechners.
 * @author Frank W. Rahn
 */
public class SimpleCalculator implements Calculator {

	/**
	 * {@inheritDoc}
	 * @see de.rahn.services.calculator.Calculator#add(int[])
	 */
	@Override
	public int add(int... summand) {
		if (summand == null) {
			throw new IllegalArgumentException("Die Summanden sind null");
		}

		int result = 0;

		for (int sum : summand) {
			result += sum;
		}

		return result;
	}

	/**
	 * {@inheritDoc}
	 * @see de.rahn.services.calculator.Calculator#add(double[])
	 */
	@Override
	public double add(double... summand) {
		if (summand == null) {
			throw new IllegalArgumentException("Die Summanden sind null");
		}

		double result = 0;

		for (double sum : summand) {
			result += sum;
		}

		return result;
	}

}