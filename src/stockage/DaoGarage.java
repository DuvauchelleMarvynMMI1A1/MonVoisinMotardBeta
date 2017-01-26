package stockage;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@LocalBean
public class DaoGarage<T> implements Dao<T>, Serializable {
	private static final long serialVersionUID = 1L;
	@PersistenceContext(name="MonVoisinMotard")
	private EntityManager em;

public DaoGarage() {
	//em = Persistence.createEntityManagerFactory("MonVoisinMotard").createEntityManager();
}
	@Override
	public T find(int id) {
		Query req=em.createQuery("Select g FROM Garage g where g.id = :cle");
        req.setParameter("cle", id);
        return (T) req.getSingleResult();
		
	}

	@Override
	public List<T> findAll() {
		 Query req=em.createQuery("select g from Garage g");
         return req.getResultList();
	}
	
	@Override
	public void modifier(T obj) {
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
		}

	@Override
	public void supprimer(T obj) {
		em.remove(obj);
	}

	@Override
	public void inserer(T obj) {
		em.persist(obj);
	}

}