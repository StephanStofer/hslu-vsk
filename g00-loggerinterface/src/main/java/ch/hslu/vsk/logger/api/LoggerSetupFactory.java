package ch.hslu.vsk.logger.api;

import java.lang.reflect.InvocationTargetException;

/**
 * A factory class for creating LoggerSetup Instances.
 */
public final class LoggerSetupFactory {

    private LoggerSetupFactory() {
    }

    /**
     * Creates a new Instance of your LoggerSetup Implementation.
     *
     * @param fullQualifiedClassName of the LoggerSetu pImplementation
     * @return an Instance of LoggerSetup
     *
     * @author IF-Team VSK-FS20
     * @throws ClassNotFoundException    if FQDN does not point to a
     *                                   LoggerImplementation
     * @throws SecurityException         if the constructor does not allow to be
     *                                   called
     * @throws NoSuchMethodException     if Loaded Object does not have a default
     *                                   Constructor
     * @throws InvocationTargetException if the Instance could not be created
     * @throws IllegalArgumentException  if the constructor was not called properly
     * @throws IllegalAccessException    if you are doing something weird!
     * @throws InstantiationException    if the Object could not be initialized
     */
    public static LoggerSetup getLoggerSetup(final String fullQualifiedClassName)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
            InvocationTargetException, NoSuchMethodException, SecurityException {

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        Class<? extends LoggerSetup> loggerSetup = (Class<? extends LoggerSetup>) classLoader
                .loadClass(fullQualifiedClassName);

        return loggerSetup.getConstructor().newInstance();
    }
}
