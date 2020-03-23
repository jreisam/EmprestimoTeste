package com.jreis.teste.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jreis.teste.domain.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cliente extends BaseEntity {

    private String  nome;
    private String endereco;
    private Float rendimento_mensal;
    private Character risco;
    private boolean possui_emprego;
    private Float valor_tot_patrimonio;
    private Float valor_tot_dividas;
    private Float valor_emprestimo_solicitado;
    private Integer num_parcelas;
    private Float valor_emprestimo_final;

}