package com.service.income.service;

import com.service.income.DTO.incomeDTO;
import com.service.income.model.income;

import java.util.List;

public interface incomeService {
    income addIncome(income income, String email);

    List<income> getAllIncome(String name);
}
