package com.service.income.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "income")
public class income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String source; // e.g. Salary, Bonus, Freelance

    private Double amount;

    private LocalDate dateReceived;

    private String description; // optional notes

    private String userId; // link to the user who owns this income
}

