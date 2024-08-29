package edu.escuelaing.arep.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @BeforeEach
    public void setup() {
        // Limpiar los servicios antes de cada prueba
        App.getServices().clear();
    }

    @Test
    public void testGet() {
        App.get("/test", (req, res) -> "test response");
        assertEquals(1, App.getServices().size());
        assertTrue(App.getServices().containsKey("/App/test"));
    }

    @Test
    public void testStaticFiles() {
        App.staticfiles("src/test/webroot");
        assertEquals("src/test/webroot", App.getStaticFilesLocation());
    }

}

