package dev.antoalex.spotifyclone.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "artists")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artist { 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ObjectId id;
    
    private String name;
    private String bio;
    private Set<Genre> genres = new HashSet<>();
    private LocalDate formationDate;
    private String country;

    @OneToMany(mappedBy = "artist")
    private List<Album> albums = new ArrayList<>();

    @OneToMany(mappedBy = "artist")
    private List<Song> songs = new ArrayList<>();

    private String socialMediaLinks;
    private String website;
    private String image;
    private Integer followersCount;
    private Boolean activeStatus;
    
}
