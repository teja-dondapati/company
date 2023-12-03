package com.software.company.repository;

import com.software.company.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
    // You can add custom query methods if needed
}
