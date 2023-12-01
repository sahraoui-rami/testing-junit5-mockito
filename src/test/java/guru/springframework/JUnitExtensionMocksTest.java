package guru.springframework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

/**
 * Created by Rami SAHRAOUI on 01/12/2023
 */
@ExtendWith(MockitoExtension.class)
class JUnitExtensionMocksTest {
    @Mock
    Map<String, Object> mapMock;

    @Test
    void testMock() {
        mapMock.put("keyValue", "foo");
    }
}
