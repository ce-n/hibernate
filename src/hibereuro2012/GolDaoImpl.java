/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibereuro2012;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author meschoyez
 */
public class GolDaoImpl implements GolDao {

    private final SessionFactory sessionFactory;
    
    public GolDaoImpl (SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void ListarGoles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void BuscarPorPais(String pais) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Gol> query = builder.createQuery(Gol.class);
        Root<Gol> root = query.from(Gol.class);
        query.select(root);
        query.where(builder.equal(root.get("equipo"), pais));
        
//        Gol estado = session.createQuery(query).uniqueResult();
        
        for (Gol gol : session.createQuery(query).list()) {
            System.out.println(gol);
        }

        session.close();
                
    }

}
