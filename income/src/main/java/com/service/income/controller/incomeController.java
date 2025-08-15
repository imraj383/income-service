package com.service.income.controller;

import com.service.income.DTO.incomeDTO;
import com.service.income.model.income;
import com.service.income.service.incomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/income")
public class incomeController {

    @Autowired
    private incomeService incomeService;

    @PostMapping("/add")
    public ResponseEntity<income> addIncome(@RequestBody income income, Principal principal){
        income i = incomeService.addIncome(income, principal.getName());
        return ResponseEntity.ok(i);
    }

}
