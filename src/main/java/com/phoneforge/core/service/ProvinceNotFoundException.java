package com.phoneforge.core.service;

public class ProvinceNotFoundException extends RuntimeException {
    public ProvinceNotFoundException(String ineCode) {
        super("No se encontró la provincia con código INE " + ineCode);
    }
}
