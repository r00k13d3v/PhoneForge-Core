package com.phoneforge.core.web.mapper;

import com.phoneforge.core.domain.Prefix;
import com.phoneforge.core.domain.Province;
import com.phoneforge.core.web.dto.CommunityDto;
import com.phoneforge.core.web.dto.PrefixDto;
import com.phoneforge.core.web.dto.ProvinceDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProvinceMapper {

    public ProvinceDto toDto(Province province) {
        CommunityDto communityDto = CommunityDto.builder()
                .id(province.getCommunity().getId())
                .name(province.getCommunity().getName())
                .build();

        List<PrefixDto> prefixDtos = province.getPrefixes().stream()
                .map(this::toDto)
                .toList();

        return ProvinceDto.builder()
                .ineCode(province.getIneCode())
                .name(province.getName())
                .community(communityDto)
                .prefixes(prefixDtos)
                .build();
    }

    public PrefixDto toDto(Prefix prefix) {
        return PrefixDto.builder()
                .value(prefix.getValue())
                .build();
    }
}
