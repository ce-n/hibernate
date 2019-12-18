/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibereuro2012;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author visita
 */
public class GameDaoImpl implements GameDao {
    
    private final SessionFactory sessionFactory;
    
    public GameDaoImpl (SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void BuscarEquipoDos(String equipoUno) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Game> query = builder.createQuery(Game.class);
        Root<Game> root = query.from(Game.class);
        query.select(root);
        query.where(builder.equal(root.get("equipo_dos"), equipoUno));
        
//      Gol estado = session.createQuery(query).uniqueResult();
        
        for (Game game : session.createQuery(query).list()) {
            System.out.println(game);
        }

        session.close();
                
    }
    
    public void BuscarFechaPartido(String equipoUno, String equipoDos ) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Game> query = builder.createQuery(Game.class);
        Root<Game> root = query.from(Game.class);
        query.select(root);
        query.multiselect(root.get("equipo_uno"), root.get("equipo_dos"));
        List <Game> equipos = session.createQuery(query).getResultList();
        //query.where(builder.equal(root.get("fecha_partido"), equipoUno));
        
//      Gol estado = session.createQuery(query).uniqueResult();
        
        for (Game game : equipos) {
            System.out.println(game);
        }

        session.close();
    
    
    
    }
    
}
