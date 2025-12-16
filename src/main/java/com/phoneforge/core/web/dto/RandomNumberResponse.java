package com.phoneforge.core.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Schema(description = "Resultado de generación de número aleatorio por provincia")
public class RandomNumberResponse {
    @Schema(description = "Número telefónico generado")
    String number;

    @Schema(description = "Prefijo utilizado para la generación")
    String prefix;
}
