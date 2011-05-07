package de.rahn.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.rahn.services.calculator.Calculator;

/**
 * Die Anwendung zum Aufrufen des Taschenrechners.
 * @author Frank W. Rahn
 */
@Component
public class Application implements Runnable {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	@Autowired(required = true)
	private Calculator calculator;

	/**
	 * {@inheritDoc}
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// Aufruf des Taschenrechners
		double result = calculator.add(1.0, 2, 3);
		logger.info("Ergebnis 1 = {}", result);

		result = calculator.add((double[]) null);
		logger.info("Ergebnis 2 = {}", result);
	}

}