package alura.loja.teste;

import alura.loja.dao.CategoriaDao;
import alura.loja.dao.ProdutoDao;
import alura.loja.modelo.Categoria;
import alura.loja.modelo.Produto;
import alura.loja.util.JPAUtil;
import lombok.extern.log4j.Log4j;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

@Log4j
public class CadastroDeProduto {
    public static void main(String[] args) {
        cadastrarProduto();
        EntityManager em = JPAUtil.getFactory();
        ProdutoDao produtoDao = new ProdutoDao(em);
        Produto produtoBanco = produtoDao.buscarPorID(1l);
        log.info("=======> Preço:" + produtoBanco.getPreco());

        List<Produto> buscarTodos = produtoDao.buscarTodos();
        buscarTodos.forEach(p -> log.info("=======> buscarTodos: " + p.getNome() + p.getDescricao()));

        List<Produto> buscarNome = produtoDao.buscarPorNome("Xiaomi Redmi");
        buscarNome.forEach(p -> log.info("=======> buscarNome: " + p.getNome()));

        List<Produto> buscarNomeDaCategoria = produtoDao.buscarPorNome("CELULARES");
        buscarNomeDaCategoria.forEach(p -> log.info("=======> buscarNomeDaCategoria: " + p.getNome()));

        BigDecimal precoDoProduto = produtoDao.buscarPrecoDoProdutoComNome("Xiaomi Redmi");
        log.info(precoDoProduto);
    }

    private static void cadastrarProduto() {
        Categoria celulares = new Categoria("CELULARES");
        Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), celulares);

        // jpa é o nome do persistenceUnitName do criado no persistence.xml
        // Transferido para classe JPAUtil: EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = JPAUtil.getFactory();

        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();
        categoriaDao.cadastrar(celulares);
        produtoDao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();
    }
}
