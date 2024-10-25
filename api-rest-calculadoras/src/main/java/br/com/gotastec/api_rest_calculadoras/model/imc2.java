package br.com.gotastec.api_rest_calculadoras.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@Entity
@Table(name="TB_IMC")

public class imc2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_IMC")
    private Integer id;

    @Column(name = "CD_FUNC")
    private Integer cdFuncionario;

    @Column(name = "NM_FUNC")
    private String nomeFuncionario;

    @Column(name = "IDADE_FUNC")
    private Integer idadeFuncionario;

    @Column(name = "SEXO_FUNC")
    private String sexoFuncionario;

    @Column(name = "PESO_FUNC")
    private BigDecimal pesoFuncionario;

    @Column(name = "ALTURA_FUNC")
    private BigDecimal alturaFuncionario;

    @Column(name = "RESULT_IMC")
    private BigDecimal resultadoImc;

    @Column(name = "DESQ_RSLTO_IMC")
    private String descricaoResultadoImc;

    @Column(name = "DT_RSLTO_IMC")
    private LocalDateTime dtResultadoImc = LocalDateTime.now();

    @Column(name = "DT_ALTERACAO")
    private Date dtAlteracao;

    @Column(name = "ID_OPERADOR")
    private Integer idOperador;

    @Column(name = "DT_EXCLUSAO")
    private Date dtExclusao;

}
