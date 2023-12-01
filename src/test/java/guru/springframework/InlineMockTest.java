package guru.springframework;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by Rami SAHRAOUI on 01/12/2023
 */
class InlineMockTest {
    @Test
    void testInlineMock() {
        Map mapMock = mock(Map.class);

        assertEquals(0, mapMock.size());
    }
}
