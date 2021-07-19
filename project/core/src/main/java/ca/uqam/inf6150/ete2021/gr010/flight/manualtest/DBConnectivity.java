package ca.uqam.inf6150.ete2021.gr010.flight.manualtest;

import lombok.NonNull;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DBConnectivity {

    @NonNull
    private static final String HIBERNATE_CONFIG_FILE_PATH = "hibernate.cfg.xml";

    @NonNull
    private static final String ANNOTATED_BEANS_PACKAGE_NAME = "ca.uqam.inf6150.ete2021.gr010.flight";

    private static SessionFactory sessionFactorySingleton = null;

    public static SessionFactory getOrBuildSessionFactory() {
        if (sessionFactorySingleton == null) {
            sessionFactorySingleton = buildSessionFactory();
        }

        return sessionFactorySingleton;
    }

    private static SessionFactory buildSessionFactory() {
        StandardServiceRegistry serviceRegistry = buildServiceRegistry();
        Metadata                metadata        = buildMetadata(serviceRegistry);

        return metadata.buildSessionFactory();
    }

    private static Metadata buildMetadata(final StandardServiceRegistry serviceRegistry) {
        MetadataSources metadataSources = new MetadataSources(serviceRegistry);
        metadataSources.addPackage(ANNOTATED_BEANS_PACKAGE_NAME);

        return metadataSources.buildMetadata();
    }

    private static StandardServiceRegistry buildServiceRegistry() {
        StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();

        return serviceRegistryBuilder
                .configure(HIBERNATE_CONFIG_FILE_PATH)
                .build();
    }
}
