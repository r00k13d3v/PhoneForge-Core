package com.phoneforge.core.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Schema(description = "Prefijo telefónico asignado a una provincia")
public class PrefixDto {
    @Schema(description = "Prefijo geográfico (9XX/8XX)")
    String value;
}
