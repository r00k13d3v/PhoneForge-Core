package com.phoneforge.core.service;

import com.phoneforge.core.domain.Prefix;
import com.phoneforge.core.domain.Province;
import com.phoneforge.core.repository.PrefixRepository;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.List;

@Service
public class RandomNumberService {

    private final PrefixRepository prefixRepository;
    private final ProvinceService provinceService;
    private final SecureRandom random = new SecureRandom();

    public RandomNumberService(PrefixRepository prefixRepository, ProvinceService provinceService) {
        this.prefixRepository = prefixRepository;
        this.provinceService = provinceService;
    }

    public GeneratedNumber generateForProvince(String ineCode) {
        Province province = provinceService.findByIneCode(ineCode);
        List<Prefix> prefixes = prefixRepository.findByProvince_IneCode(ineCode);

        if (prefixes.isEmpty()) {
            throw new IllegalStateException("No hay prefijos configurados para la provincia " + ineCode);
        }

        Prefix selected = prefixes.get(random.nextInt(prefixes.size()));
        String suffix = String.format("%06d", random.nextInt(1_000_000));

        String fullNumber = selected.getValue() + suffix;
        return new GeneratedNumber(fullNumber, selected.getValue(), province);
    }

    public record GeneratedNumber(String number, String prefix, Province province) {
    }
}
