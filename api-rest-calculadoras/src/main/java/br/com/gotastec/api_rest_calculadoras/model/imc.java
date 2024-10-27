package br.com.gotastec.api_rest_calculadoras.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

public class imc {
    private Integer id;
    private Integer codFuncionario;
    private String nomeFuncionario;
    private Integer idade;
    private String sexo;
    private BigDecimal peso;
    private BigDecimal altura;
    private BigDecimal resultadoImc;
    private String descricaoResultadoImc;
    private LocalDateTime deResultadoImc = LocalDateTime.now();
    private Integer idOperador;
    private Date dtAlteracao;
    private Date dtExclusao;
}



