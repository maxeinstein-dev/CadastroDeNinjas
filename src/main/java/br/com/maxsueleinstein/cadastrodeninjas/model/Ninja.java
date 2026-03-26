package br.com.maxsueleinstein.cadastrodeninjas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ninjas")
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String email;
}