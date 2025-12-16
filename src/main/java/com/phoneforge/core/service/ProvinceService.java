package com.phoneforge.core.service;

import com.phoneforge.core.domain.Province;
import com.phoneforge.core.repository.ProvinceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService {

    private final ProvinceRepository provinceRepository;

    public ProvinceService(ProvinceRepository provinceRepository) {
        this.provinceRepository = provinceRepository;
    }

    public List<Province> findAll() {
        return provinceRepository.findAll();
    }

    public Province findByIneCode(String ineCode) {
        return provinceRepository.findByIneCode(ineCode)
                .orElseThrow(() -> new ProvinceNotFoundException(ineCode));
    }
}
