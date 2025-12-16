package com.phoneforge.core.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Schema(description = "Información de comunidad autónoma")
public class CommunityDto {
    @Schema(description = "Identificador interno de la comunidad")
    Long id;

    @Schema(description = "Nombre de la comunidad autónoma")
    String name;
}
