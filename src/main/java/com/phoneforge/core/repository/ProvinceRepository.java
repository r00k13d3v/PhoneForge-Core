package com.phoneforge.core.repository;

import com.phoneforge.core.domain.Province;

import java.util.List;
import java.util.Optional;

public interface ProvinceRepository {
    List<Province> findAll();
    Optional<Province> findByIneCode(String ineCode);
}
