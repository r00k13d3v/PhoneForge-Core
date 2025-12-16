package com.phoneforge.core.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProvinceNotFoundException extends RuntimeException {
    public ProvinceNotFoundException(String ineCode) {
        super("No se encontró la provincia con código INE: " + ineCode);
    }
}
