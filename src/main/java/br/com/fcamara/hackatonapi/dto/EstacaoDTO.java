package br.com.fcamara.hackatonapi.dto;

import br.com.fcamara.hackatonapi.model.Estacao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EstacaoDTO {

    private Long id;
    private Double qtdLugares;
    private Long escritorioId;

    public EstacaoDTO(Estacao estacao) {
        this.id = estacao.getId();
        this.qtdLugares = estacao.getQtdLugares();
        this.escritorioId = estacao.getEscritorio().getId();
    }

    public static List<EstacaoDTO> convertList(List<Estacao> estacoes) {
        return estacoes.stream().map(EstacaoDTO::new).collect(Collectors.toList());
    }
}
