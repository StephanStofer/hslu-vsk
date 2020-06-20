package ch.hslu.vsk.logger.api;

/**
 * Definition of all valid log levels.
 */
public enum LogLevel {

    /** No logging at all. */
    OFF(0),

    /** Critical Problems. */
    ERROR(10),

    /** Non critical Problems. */
    WARN(20),

    /** Informational. */
    INFO(30),

    /** Insight of what's going on. */
    DEBUG(40);

    private final int value;

    /**
     * Instantiates a new LogLevel.
     *
     * @param value the desired value for the log level
     */
    LogLevel(final int value) {
        this.value = value;
    }

    /**
     * Gets the curent LogLevel value.
     *
     * @return the logLevel value
     */
    public int getValue() {
        return value;
    }
}
