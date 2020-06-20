package ch.hslu.vsk.logger.api;

/**
 * Logger object sends logging data to central logging Implementation.
 *
 */
public interface Logger {

    /**
     * Sends a Log message with DEBUG level.
     *
     * @param message content of debug message
     */
    void debug(String message);

    /**
     * Sends a Log message with INFO level.
     *
     * @param message content of info message
     */
    void info(String message);

    /**
     * Sends a Log message with WARN level.
     *
     * @param message content of warn message
     */
    void warn(String message);

    /**
     * Sends a Log message with ERROR level.
     *
     * @param message content of error message
     */
    void error(String message);
}
