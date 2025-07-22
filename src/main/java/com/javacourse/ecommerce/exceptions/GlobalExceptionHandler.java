package com.javacourse.ecommerce.exceptions;

import com.javacourse.ecommerce.dto.StandardError;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ModelNotFoundException.class)
    public ResponseEntity<StandardError> modelNotFound(ModelNotFoundException e, HttpServletRequest request) {
        StandardError standardError = new StandardError(
                Instant.now(), HttpStatus.NOT_FOUND.value(),
                "Model not found",
                e.getMessage(),
                request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standardError);
    }
}
