package org.example.td;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class Runner {
    private static SessionFactory sessionFactory;

    public static void init() {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder()
                        .build();
        sessionFactory =
                new MetadataSources(registry)
                        .addAnnotatedClass(Device.class)
                        .addAnnotatedClass(Smartphone.class)
                        .buildMetadata()
                        .buildSessionFactory();
    }

    public static void write() {
        Smartphone s1 = new Smartphone("1s");
        Smartphone s2 = new Smartphone("2s");
        Device d1 = new Device("1");
        Device d2 = new Device("2");
        s1.sendMessage("Hello World");
        s2.receiveMessage("Hello World");
        sessionFactory.inTransaction(session -> {
            session.persist(d1);
            session.persist(d2);
            session.persist(s1);
            session.persist(s2);
        });
    }

    public static List<Device> read() {
        return sessionFactory.openSession().createQuery("from Device").list();
    }

    public static void main(String[] args) {
        init();
        write();
        List<Device> res = read();
    }
}
