package ch.hslu.vsk.logger.api;

import java.net.Inet4Address;

/**
 * Dummy implementation of Logger. There is almost no functionality here.
 *
 * @author Maurizio Hostettler
 *
 */
public class LoggerSetupDummy implements LoggerSetup {
    /**
     * {@inheritDoc}
     */
    @Override
    public Logger getLogger() {
        return new LoggerDummy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Logger getLogger(final String name) {
        return new LoggerDummy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Logger getLogger(final String name, final LogLevel level) {
        return new LoggerDummy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setServerIp(final Inet4Address address) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setServerPort(final Integer port) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setLogLevel(final LogLevel level) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogLevel getLogLevel() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getServerPort() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Inet4Address getServerIp() {
        return null;
    }
}