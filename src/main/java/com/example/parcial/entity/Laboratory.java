package com.example.parcial.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Laboratory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private String location;

    @ManyToMany(cascade = CascadeType.ALL)
    private Long managerId;

    @Builder.Default
    private String role = "ROLE_STUDENT";
}


