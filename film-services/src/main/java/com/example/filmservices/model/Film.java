package com.example.filmservices.model;

import jakarta.persistence.*;
import lombok.Data;
// entity veri tabanı varlığını belirtir
@Entity
@Table(name = "film")
@Data
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isim;
    private String tur;
    private String yonetmen;
    private Double puan;

}
