package br.senac.tads.dsw.exemplosspringmvc.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Dados {

    private String name;
    private String email;
    private int numero;


}
