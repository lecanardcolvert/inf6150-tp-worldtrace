package ca.uqam.inf6150.ete2021.gr010.flight.manualtest;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DBConnectivity {

    private static final String HIBERNATE_CONFIG_FILE_PATH   = "hibernate.cfg.xml";
    private static final String ANNOTATED_BEANS_PACKAGE_NAME = "ca.uqam.inf6150.ete2021.gr010.flight";

    public static SessionFactory getSessionFactory() {
        StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();

        StandardServiceRegistry serviceRegistry = serviceRegistryBuilder
                .configure(HIBERNATE_CONFIG_FILE_PATH)
                .build();

        MetadataSources metadataSources = new MetadataSources(serviceRegistry);
        metadataSources.addPackage(getAnnotatedBeansPackage());
    }

    private static Package getAnnotatedBeansPackage() {
        return ClassLoader.getSystemClassLoader().getDefinedPackage(ANNOTATED_BEANS_PACKAGE_NAME);
    }
}
