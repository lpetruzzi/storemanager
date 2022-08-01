package it.eng.storemanager.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;

public class ExceptionUtils {

    public static ResponseEntity<?> getErrorResponseEntity(RuntimeException exception, HttpStatus httpStatus, String message) {

        ErrorDetail errorDetail = new ErrorDetail();
        errorDetail.setTimeStamp(new Date().getTime());
        errorDetail.setStatus(httpStatus.value());
        errorDetail.setTitle(message);
        errorDetail.setDetail(exception.getMessage());
        errorDetail.setDeveloperMessage(exception.getClass().getName());

        return new ResponseEntity<>(errorDetail, null, httpStatus);

    }

}
