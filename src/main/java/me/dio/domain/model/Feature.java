package me.dio.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "tb_feature") // Ao invés de usar uma Array, estamos usando uma lista (Recomendação do Java).
public class Feature extends BaseItem {
    
}