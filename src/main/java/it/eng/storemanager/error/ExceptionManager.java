package it.eng.storemanager.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
//Con questa annotation posso creare metodi che vengono applicati a tutti i metodi marchiati con @RequestMapping
public class ExceptionManager {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleRuntimeException(RuntimeException exception, HttpServletRequest request) {

        return ExceptionUtils.getErrorResponseEntity(exception, HttpStatus.INTERNAL_SERVER_ERROR, "Exception");

    }
}
