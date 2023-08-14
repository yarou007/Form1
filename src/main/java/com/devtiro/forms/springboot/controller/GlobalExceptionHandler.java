package com.devtiro.forms.springboot.controller;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public String BindException(final MethodArgumentNotValidException methodArgumentNotValidException) {
		return "redirect:error.html";
	}
}
