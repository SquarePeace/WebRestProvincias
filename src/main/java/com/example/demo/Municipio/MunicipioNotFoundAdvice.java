package com.example.demo.Municipio;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class MunicipioNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(MunicipioNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String MunicipioNotFoundHandler(MunicipioNotFoundException ex) {
    return ex.getMessage();
  }
}
