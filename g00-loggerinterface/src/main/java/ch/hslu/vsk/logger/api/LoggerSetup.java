package ch.hslu.vsk.logger.api;

import java.net.Inet4Address;

/**
 * LoggerSetup returns a Logger Object to log logs to the log server.
 *
 * @param <T> the generic type
 */
public interface LoggerSetup<T extends Logger> {

    /**
     * Create a Logger instance with a default name.
     *
     * @return an instance of Logger
     */
    T getLogger();

    /**
     * Create a Logger instance with a given name for example "ClassName.class".
     *
     * @param name specifies a name for the Logger
     * @return an instance of Logger with a fixed name
     */
    T getLogger(String name);

    /**
     * Create a Logger instance with a given name for example "ClassName.class" and
     * a fixed level.
     *
     * @param name  specifies a name for the Logger
     * @param level sets a fixed log level
     * @return an instance of Logger with a fixed name and log level
     */
    T getLogger(String name, LogLevel level);

    /**
     * Sets the server ip address.
     *
     * @param address the IP-Adress for the logger Server
     */
    void setServerIp(Inet4Address address);

    /**
     * Sets the server port.
     *
     * @param port the port number for the logger Server
     */
    void setServerPort(Integer port);

    /**
     * Sets the desired log level.
     *
     * @param level the desired log level
     */
    void setLogLevel(LogLevel level);

    /**
     * Returns the configured log level.
     *
     * @return the desired logLevel
     */
    LogLevel getLogLevel();

    /**
     * Returns the configured server port.
     *
     * @return the configured server port
     */
    Integer getServerPort();

    /**
     * Returns the configured server IPAddress.
     *
     * @return the configured server IPAddress
     */
    Inet4Address getServerIp();
}
