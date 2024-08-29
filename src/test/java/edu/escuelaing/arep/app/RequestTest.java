package edu.escuelaing.arep.app;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RequestTest {

    @Test
    public void testEmptyQueryString() {
        Request req = new Request("");
        assertNull(req.getValues("name"));
    }

    @Test
    public void testNullQueryString() {
        Request req = new Request(null);
        assertNull(req.getValues("name"));
    }

    @Test
    public void testGetValues() {
        Request request = new Request("name=JuanDavid&age=23");
        assertEquals("JuanDavid", request.getValues("name"));
        assertEquals("23", request.getValues("age"));
    }


    @Test
    public void testGetValuesWithMalformedQuery() {
        Request request = new Request("name=JuanDavid&age");
        assertEquals("JuanDavid", request.getValues("name"));
        assertNull(request.getValues("age"));
    }
}
