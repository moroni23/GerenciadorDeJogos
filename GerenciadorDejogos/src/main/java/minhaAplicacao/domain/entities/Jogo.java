package minhaAplicacao.domain.entities;
import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

@Entity
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Usuario_id", nullable = false)
    private String nome;

    @Column(name = "horas_jogadas")
    private String horas_jogadas;

    @Column(name = "Status")
    private String Status;
}
