package com.phoneforge.core.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.List;

@Value
@Builder
@Schema(description = "Provincia española con sus prefijos disponibles")
public class ProvinceDto {
    @Schema(description = "Código INE de la provincia")
    String ineCode;

    @Schema(description = "Nombre de la provincia")
    String name;

    @Schema(description = "Comunidad autónoma a la que pertenece la provincia")
    CommunityDto community;

    @Singular
    @Schema(description = "Prefijos geográficos asociados a la provincia")
    List<PrefixDto> prefixes;
}
