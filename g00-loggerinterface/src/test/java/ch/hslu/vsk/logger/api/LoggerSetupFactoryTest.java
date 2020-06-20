package ch.hslu.vsk.logger.api;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LoggerSetupFactoryTest {
    /**
     * Test if the returned Class is in fact of Type LoggerSetup.
     *
     * @throws Exception
     */
    @Test
    void testGetLoggerSetup() throws Exception {
        LoggerSetup ls = LoggerSetupFactory.getLoggerSetup("ch.hslu.vsk.logger.api.LoggerSetupDummy");
        assertTrue(ls instanceof LoggerSetup);
    }

    @Test
    void testGetLoggerSetusdp() {
    }

    /**
     * Tests to check all the dummy methods.
     *
     * @throws Exception
     */
    @Test
    void testGetLoggerOnSetup() throws Exception {
        LoggerSetup ls = LoggerSetupFactory.getLoggerSetup("ch.hslu.vsk.logger.api.LoggerSetupDummy");
        Logger ld = ls.getLogger();
        assertTrue(ld instanceof LoggerDummy);
        assertTrue(ls.getLogger("name") instanceof LoggerDummy);
        assertTrue(ls.getLogger("name", LogLevel.ERROR) instanceof LoggerDummy);
        assertNull(ls.getLogLevel());
        assertNull(ls.getServerIp());
        assertNull(ls.getServerPort());
        ls.setLogLevel(LogLevel.DEBUG);
        ls.setServerPort(1337);
        ls.setServerIp(null);
        ld.info("h");
        ld.warn("e");
        ld.error("l");
        ld.debug("l");
    }

    /**
     * Test if the Factory correctly returns a CNF Exception if a nonexistent Class
     * is referenced.
     */
    @Test
    void testGetLoggerSetupClassNotFoundException() {
        assertThrows(ClassNotFoundException.class, () -> LoggerSetupFactory.getLoggerSetup("NonexistentClass"));
    }
}