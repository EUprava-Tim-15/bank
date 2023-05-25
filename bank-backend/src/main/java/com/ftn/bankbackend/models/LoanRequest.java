package com.ftn.bankbackend.models;

import com.ftn.bankbackend.models.Enums.LoanRequestStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@ToString
// End of lombok
@Entity
public class LoanRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private Account account;
    private Double amount;
    private LoanRequestStatus status;
    private LocalDateTime dateTime;
    private String bankClerk;

}
