package br.com.fcamara.hackatonapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Estacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double qtdLugares;

    @ManyToOne
    private Escritorio escritorio;

    @OneToMany(mappedBy = "estacao")
    private List<Agendamento> agendamentos;
}
