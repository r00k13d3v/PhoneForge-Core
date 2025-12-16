package com.phoneforge.core.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class RandomNumberServiceTest {

    @Autowired
    private RandomNumberService randomNumberService;

    @Test
    void shouldGenerateNumberForMadrid() {
        RandomNumberService.GeneratedNumber generated = randomNumberService.generateForProvince("28");

        assertThat(generated.number()).hasSize(9);
        assertThat(generated.prefix()).isIn(Set.of("910", "911", "810", "811"));
        assertThat(generated.number()).startsWith(generated.prefix());
    }
}
