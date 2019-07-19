package com.bbva.pagorecibo.exception.handlers;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.bbva.pagorecibo.exception.LoginException;
import com.bbva.pagorecibo.payload.BasicResponse;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<BasicResponse> handleInputConstraintViolationException(ConstraintViolationException e) {
		Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new BasicResponse(violations.iterator().next().getMessage()));
	}

	@ExceptionHandler(value = {LoginException.class})
	public ResponseEntity<BasicResponse> handleUserExceptions(Exception e){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new BasicResponse(e.getMessage())) ;
	}

}