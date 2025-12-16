package com.phoneforge.core.repository;

import com.phoneforge.core.domain.Prefix;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrefixRepository extends JpaRepository<Prefix, Long> {
    List<Prefix> findByProvince_IneCode(String ineCode);
}
