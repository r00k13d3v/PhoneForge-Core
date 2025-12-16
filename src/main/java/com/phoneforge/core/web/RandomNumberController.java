package com.phoneforge.core.web;

import com.phoneforge.core.domain.Province;
import com.phoneforge.core.service.ProvinceNotFoundException;
import com.phoneforge.core.service.RandomNumberService;
import com.phoneforge.core.web.dto.RandomNumberResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RandomNumberController {

    private final RandomNumberService randomNumberService;

    public RandomNumberController(RandomNumberService randomNumberService) {
        this.randomNumberService = randomNumberService;
    }

    @GetMapping("/provinces")
    public List<Province> getProvinces() {
        return randomNumberService.getProvinces();
    }

    @GetMapping("/numbers/random")
    public RandomNumberResponse generateRandomNumber(
            @RequestParam(value = "provinceCode", required = false) String provinceCode) {
        return randomNumberService.generateRandomNumber(provinceCode);
    }

    @ExceptionHandler(ProvinceNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleProvinceNotFound(ProvinceNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("message", ex.getMessage()));
    }
}
