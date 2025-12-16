package com.phoneforge.core.repository;

import com.phoneforge.core.domain.Province;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryProvinceRepository implements ProvinceRepository {

    private final List<Province> provinces;

    public InMemoryProvinceRepository(List<Province> provinces) {
        this.provinces = provinces;
    }

    @Override
    public List<Province> findAll() {
        return provinces;
    }

    @Override
    public Optional<Province> findByIneCode(String ineCode) {
        return provinces.stream()
                .filter(province -> province.ineCode().equals(ineCode))
                .findFirst();
    }
}
