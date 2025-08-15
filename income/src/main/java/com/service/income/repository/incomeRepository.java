package com.service.income.repository;

import com.service.income.model.income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface incomeRepository extends JpaRepository<income, Long> {
}
