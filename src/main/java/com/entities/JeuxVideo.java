package com.entities;





import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class JeuxVideo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;

   @Column(length = 1000)
    private String description;

    private LocalDate dateSortie;
    private int notePopularite;

    private String imageUrl;



    public JeuxVideo() {
    }

    public JeuxVideo(String nom, String desc, LocalDate dateSortie, int note) {
        this.nom = nom;
        this.description = desc;
        this.dateSortie = dateSortie;
        this.notePopularite = note;
    }

public JeuxVideo(String nom, String desc, LocalDate dateSortie, int note, String imageUrl) {
        this.nom = nom;
        this.description = desc;
        this.dateSortie = dateSortie;
        this.notePopularite = note;
        this.imageUrl = imageUrl;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }

    public int getNotePopularite() {
        return notePopularite;
    }

    public void setNotePopularite(int notePopularite) {
        this.notePopularite = notePopularite;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "JeuxVideo{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", dateSortie=" + dateSortie +
                ", notePopularite=" + notePopularite +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
