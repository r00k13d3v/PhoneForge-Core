package com.phoneforge.core.web;

import com.phoneforge.core.service.ProvinceService;
import com.phoneforge.core.web.dto.ProvinceDto;
import com.phoneforge.core.web.mapper.ProvinceMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/provinces")
@Tag(name = "Provincias", description = "Operaciones de consulta de provincias y sus prefijos")
public class ProvinceController {

    private final ProvinceService provinceService;
    private final ProvinceMapper provinceMapper;

    public ProvinceController(ProvinceService provinceService, ProvinceMapper provinceMapper) {
        this.provinceService = provinceService;
        this.provinceMapper = provinceMapper;
    }

    @GetMapping
    @Operation(summary = "Listar todas las provincias", description = "Devuelve todas las provincias con su comunidad y prefijos asociados")
    public List<ProvinceDto> findAll() {
        return provinceService.findAll().stream()
                .map(provinceMapper::toDto)
                .toList();
    }

    @GetMapping("/{ineCode}")
    @Operation(summary = "Consultar una provincia por código INE", description = "Incluye la comunidad autónoma y los prefijos disponibles")
    public ProvinceDto findByIneCode(@PathVariable String ineCode) {
        return provinceMapper.toDto(provinceService.findByIneCode(ineCode));
    }
}
