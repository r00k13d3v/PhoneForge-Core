package com.phoneforge.core.service;

import com.phoneforge.core.config.ProvinceSeedConfiguration;
import com.phoneforge.core.repository.InMemoryProvinceRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomNumberServiceTest {

    private final RandomNumberService service =
            new RandomNumberService(new InMemoryProvinceRepository(new ProvinceSeedConfiguration().provinceSeed()));

    @Test
    void generatesNineDigitNumberWithProvincePrefix() {
        var result = service.generateRandomNumber("15");

        assertThat(result.number()).hasSize(9);
        assertThat(result.number()).startsWithAny("981", "881");
        assertThat(result.province().ineCode()).isEqualTo("15");
    }
}
