package alura.loja.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name="produtos")
@Getter
@Setter
public class Produto {
    /*Mapeamento de uma Entidade (Entity)*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Diz para JPA que o Bando de Dados será responsável por gerar o "id"
    private Long id;
    private String nome;
   // @Column(name = "desc") - Anotação caso o nome da coluna seja diferente
    private String descricao;
    private BigDecimal preco;

    public Produto() {
    }

    private LocalDate dataCadastro = LocalDate.now();
    //@Enumerated(EnumType.STRING) // Diz para JPA que é para gravar o nome do tipo do Enum Categoria
    @ManyToOne //Relacionamento entre entidade, Muitos para Um: Produto tem uma única Categoria
    private Categoria categoria;

    public Produto(String nome, String descricao, BigDecimal preco, Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }
}
