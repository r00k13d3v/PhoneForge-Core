package com.phoneforge.core.service;

import com.phoneforge.core.domain.Province;
import com.phoneforge.core.repository.ProvinceRepository;
import com.phoneforge.core.web.dto.RandomNumberResponse;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.List;

@Service
public class RandomNumberService {

    private static final int SPANISH_NUMBER_LENGTH = 9;
    private final ProvinceRepository provinceRepository;
    private final SecureRandom secureRandom = new SecureRandom();

    public RandomNumberService(ProvinceRepository provinceRepository) {
        this.provinceRepository = provinceRepository;
    }

    public List<Province> getProvinces() {
        return provinceRepository.findAll();
    }

    public RandomNumberResponse generateRandomNumber(String provinceCode) {
        Province province = selectProvince(provinceCode);
        String prefix = choosePrefix(province.prefixes());
        String number = prefix + generateSuffix(prefix.length());
        return new RandomNumberResponse(number, prefix, province);
    }

    private Province selectProvince(String provinceCode) {
        if (provinceCode == null || provinceCode.isBlank()) {
            List<Province> provinces = provinceRepository.findAll();
            return provinces.get(secureRandom.nextInt(provinces.size()));
        }

        return provinceRepository.findByIneCode(provinceCode)
                .orElseThrow(() -> new ProvinceNotFoundException(provinceCode));
    }

    private String choosePrefix(List<String> prefixes) {
        return prefixes.get(secureRandom.nextInt(prefixes.size()));
    }

    private String generateSuffix(int prefixLength) {
        int remainingDigits = SPANISH_NUMBER_LENGTH - prefixLength;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < remainingDigits; i++) {
            builder.append(secureRandom.nextInt(10));
        }
        return builder.toString();
    }
}
