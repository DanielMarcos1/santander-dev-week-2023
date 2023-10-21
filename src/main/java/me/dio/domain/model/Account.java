package me.dio.domain.model;

import java.math.BigDecimal; // Ao invés de usar números, o Java recomenda usar BigDecimal

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identificador gerado automaticamente
    private Long id;

    @Column(unique = true) // Nome da coluna é único
    private String number;

    private String agency;

    @Column(precision = 13, scale = 2) // Precisão do tipo (E.g. 0000000000000.00)
    private BigDecimal balance;

    @Column(name = "additional_limit", precision = 13, scale = 2) // Precisão do tipo (E.g. 0000000000000.00)
    private BigDecimal limit; // additional_limit garante que não haja conflito com limit.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

}