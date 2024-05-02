package marqdisc.mrqs.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Table(name = "tb_bloco")
public class Bloco {

    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant inicio;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant fim;


    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;


}
