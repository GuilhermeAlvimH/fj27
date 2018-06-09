package br.com.cadocodigo.loja.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.cadocodigo.loja.models.Product;

@Repository
public class ProductDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	@RequestMapping(value = "/products", method=RequestMethod.POST)
	public void save(Product product){
		manager.persist(product);
	}
	
	
	@RequestMapping(value = "/products", method=RequestMethod.GET)
	public List<Product> list(){
			return manager.createQuery("select distinct(p) from Product p join fetch p.prices", Product.class).getResultList();
		}

}
