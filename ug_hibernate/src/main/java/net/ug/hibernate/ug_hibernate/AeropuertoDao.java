package net.ug.hibernate.ug_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AeropuertoDao {
	
protected SessionFactory sessionFactory;
	
	public void setup(){
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()  //lee los settings del archivo hibernate.cfg.xml
				.build();
		try{
			sessionFactory = new MetadataSources(registry)
					.buildMetadata().buildSessionFactory();			
		} catch (Exception e){
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
	}
	
	

	public void crear(Aeropuerto  producto){
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(producto);
		s.getTransaction().commit();
		s.close();
	}
	
	
	
	public Aeropuerto read(long productoId){
		Session s =  sessionFactory.openSession();
		Aeropuerto aeropuerto = s.get(Aeropuerto.class,productoId);
		s.close();
		return aeropuerto;
		
	}
	
	
	
	public void update(Aeropuerto producto){
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(producto);
		s.getTransaction().commit();
		s.close();
	}
	
	
	
	public void delete(int productoID){
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Aeropuerto producto =read(productoID);
		s.delete(producto);
		s.getTransaction().commit();
		s.close();
	}
	
	
	
	
	
	
	
}
