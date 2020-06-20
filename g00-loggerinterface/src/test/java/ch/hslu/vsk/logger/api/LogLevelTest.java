package ch.hslu.vsk.logger.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LogLevelTest {

    @Test
    void testLevelValus() {
        assertEquals(0, LogLevel.OFF.getValue());
        assertEquals(10, LogLevel.ERROR.getValue());
        assertEquals(20, LogLevel.WARN.getValue());
        assertEquals(30, LogLevel.INFO.getValue());
        assertEquals(40, LogLevel.DEBUG.getValue());
    }
}
