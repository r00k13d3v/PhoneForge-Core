package com.phoneforge.core.web;

import com.phoneforge.core.service.RandomNumberService;
import com.phoneforge.core.web.dto.RandomNumberResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/provinces")
@Tag(name = "Números aleatorios", description = "Generación de números telefónicos por provincia")
public class RandomNumberController {

    private final RandomNumberService randomNumberService;

    public RandomNumberController(RandomNumberService randomNumberService) {
        this.randomNumberService = randomNumberService;
    }

    @GetMapping("/{ineCode}/random")
    @Operation(summary = "Generar un número aleatorio para una provincia", description = "Usa los prefijos 9XX/8XX asociados al código INE proporcionado")
    public RandomNumberResponse generate(@PathVariable String ineCode) {
        RandomNumberService.GeneratedNumber generated = randomNumberService.generateForProvince(ineCode);
        return RandomNumberResponse.builder()
                .number(generated.number())
                .prefix(generated.prefix())
                .build();
    }
}
