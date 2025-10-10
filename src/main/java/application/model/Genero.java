package application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "generos")
@NoArgsConstructor
public class Genero {
    @Id
    private long id;
    @Column(nullable = false, unique = true)
    private String nome;
}
