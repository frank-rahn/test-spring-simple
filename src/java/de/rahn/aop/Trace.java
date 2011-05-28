package de.rahn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Eine Tracing Aspect für das AOP.
 * @author Frank W. Rahn
 */
public class Trace {

	/** Der Logger für den Trace. */
	private static final Logger logger = LoggerFactory.getLogger(Trace.class);

	/**
	 * Eine Methode (Advice), die vor der Zielmethode (Join Point) aufgerufen wird.
	 */
	public void traceBefore() {
		logger.trace("TRACE-Logausgabe vor Aufruf der Methode");
	}

	/**
	 * Führe diese Methode (Advice) um die Zielmethode (Join Point) herum aus.
	 * @param joinPoint ein Objekt, welches den Join Point beschreibt und zusätzlich eine {@link ProceedingJoinPoint#proceed()}
	 * -Metode anbietet
	 * @return das gewünschte Ergebnis
	 * @throws Throwable falls ein Fehler auftritt
	 */
	public Object debugAround(ProceedingJoinPoint joinPoint) throws Throwable {
		logger.debug("DEBUG-Logausgabe vor Ausführung der Methode");

		Object result = null;
		try {
			result = joinPoint.proceed();
		} catch (Exception exception) {
			logger.error("ERROR-Logausgabe, weil während der Ausführung ein Fehler aufgetreten ist", exception);

			// Jetzt weiter werfen...
			throw exception;
		}

		logger.debug("DEBUG-Logausgabe nach der Ausführung der Methode mit Ergebnis={}", result);
		return result;
	}

	/**
	 * Eine Methode (Advice), die nach der Zielmethode (Join Point) aufgerufen wird.
	 * @param result das Ergebnis der Zielmethode
	 */
	public void traceAfter(Object result) {
		logger.trace("TRACE-Logausgabe nach Aufruf der Methode mit Ergebnis={}", result);
	}

}