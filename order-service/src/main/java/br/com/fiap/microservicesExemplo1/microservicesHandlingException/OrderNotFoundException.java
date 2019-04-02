package br.com.fiap.microservicesExemplo1.microservicesHandlingException;

import static br.com.fiap.microservicesExemplo1.microservicesHandlingException.Exceptions.generateMessage;
import static br.com.fiap.microservicesExemplo1.microservicesHandlingException.Exceptions.toMap;

public class OrderNotFoundException extends Exception {

    public OrderNotFoundException(Class clazz, String... searchParamsMap) {
        super(generateMessage(clazz.getSimpleName(), toMap(String.class, String.class, searchParamsMap)));
    }
}