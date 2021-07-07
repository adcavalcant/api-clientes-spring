package io.github.adcavalcant.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter@Setter
@Data
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false, length = 150)
    private String descricao;

    @ManyToOne //N..1 (Muitos Serviços para Um Cliente)
    @JoinColumn (name = "id_cliente")//Define chave estrangeira
    private Cliente cliente;

    @Column
    private BigDecimal valor;

}
