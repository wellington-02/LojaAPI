package br.ufpb.lojaapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String dataDaVenda;

    @ManyToMany
    private List<Produto> produto;

    @ManyToOne
    private Usuario cpfCliente;
}
