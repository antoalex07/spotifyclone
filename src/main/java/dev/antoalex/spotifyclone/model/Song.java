
package dev.antoalex.spotifyclone.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "song")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ObjectId id;

    @NotBlank
    private String title;
    private Integer duration;
    private LocalDate releaseDate;
    private String filePath;
    private Integer playCount;
    private Integer likesCount;
    private Double popularityScore;
    private String language;

    @NotNull
    private Boolean explicitContent;

    @ManyToMany
    private Set<Genre> genres = new HashSet<>();

    @ManyToMany
    private Set<Artist> artists = new HashSet<>();
    
    @ManyToOne
    private Album album;
    
    @Lob
    private String lyrics;

}
