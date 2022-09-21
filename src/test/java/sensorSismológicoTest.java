import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class sensorSismológicoTest {

private sensorSismológico mathUtils;

    @BeforeEach

    void initEach() {mathUtils = new sensorSismológico();}

    @Nested
    class agregarPruebas{
        @Test
        void cantidadDeDías(){
            //assertEquals(24, mathUtils.entrada(24),
               //     "prueba");//prueba minima
        }
    }
}
