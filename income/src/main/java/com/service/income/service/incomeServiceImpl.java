package com.service.income.service;

import com.service.income.DTO.incomeDTO;
import com.service.income.model.income;
import com.service.income.repository.incomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class incomeServiceImpl implements incomeService{

    @Autowired
    private incomeRepository incomerepository;


    @Override
    public income addIncome(income inco, String email) {
        income in = new income();
        in.setAmount(inco.getAmount());
        in.setSource(inco.getSource());
        in.setDescription(inco.getDescription());
        in.setDateReceived(inco.getDateReceived());
        in.setUserEmail(email);
        incomerepository.save(in);
        return in;
    }
}
