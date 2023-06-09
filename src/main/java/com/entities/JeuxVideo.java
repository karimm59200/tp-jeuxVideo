package com.entities;





import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class JeuxVideo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private String description;

    private LocalDate dateSortie;
    private int notePopularite;

    private String imageUrl;

    public JeuxVideo(String nom, String desc, LocalDate dateSortie, int note, String imageUrl) {
    }
}
