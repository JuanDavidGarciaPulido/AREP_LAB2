package edu.escuelaing.arep.app;

public interface Service<T,R> {
    String getValue(Request request, Response response);
}
