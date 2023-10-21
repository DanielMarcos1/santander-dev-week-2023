package me.dio.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identificador gerado automaticamente
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL) // Relacionamento forte entre as entidades
    private Account account;
    
    @OneToOne(cascade = CascadeType.ALL) // Relacionamento forte entre as entidades
    private Card card;

    // Relacionamento forte entre as entidades mas a instância é um singleton que já é gerado, 
    // então ele é gerado e sempre exibido junto com o user
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) 
    private List<Feature> features;

    // Relacionamento forte entre as entidades mas a instância é um singleton que já é gerado, 
    // então ele é gerado e sempre exibido junto com o user
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

}