package alura.loja.dao;

import alura.loja.modelo.Categoria;
import alura.loja.modelo.Produto;

import javax.persistence.EntityManager;

public class CategoriaDao {
    EntityManager entityManager;
    public CategoriaDao(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    public void cadastrar(Categoria categoria){
        this.entityManager.persist(categoria);
    }
    public void atualizar(Categoria categoria){
        this.entityManager.merge(categoria);
    }

    public void remover(Categoria categoria){
        categoria = entityManager.merge(categoria);
        this.entityManager.remove(categoria);
    }
}
