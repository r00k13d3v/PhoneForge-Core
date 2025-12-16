package com.phoneforge.core.repository;

import com.phoneforge.core.domain.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProvinceRepository extends JpaRepository<Province, Long> {
    Optional<Province> findByIneCode(String ineCode);
}
