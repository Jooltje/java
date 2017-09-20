package lan.network.sandbox.service;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Default
@ApplicationScoped
public class Setup {

    @Produces
    public EntityManager createEntityManger() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
        return factory.createEntityManager();
    }
}
