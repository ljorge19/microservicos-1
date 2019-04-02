package br.com.fiap.microservicesExemplo1.microservicesHandlingException;

import com.fasterxml.jackson.annotation.JsonFormat;
import jdk.nashorn.internal.objects.annotations.Getter;

import java.time.LocalDateTime;

public class ExceptionResponse {


    public ExceptionResponse(String message, String description) {
    }

    public class ExceptionReponse {
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")

        private String message;
        private String details;
        public ExceptionReponse(String message, String details) {
            super();

            this.message = message;
            this.details = details;
        }
    }
}
