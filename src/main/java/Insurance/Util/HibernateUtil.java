package Insurance.Util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
private static SessionFactory sessionFactory;
	
	static {
		if(sessionFactory == null) {
			ServiceRegistry reg = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources source = new MetadataSources(reg);
			Metadata meta = source.getMetadataBuilder().build();
			sessionFactory = meta.getSessionFactoryBuilder().build();
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
