package lan.network.sandbox.service;

import javax.persistence.EntityManager;

public abstract class ServiceBase<T> implements ServiceInterface<T>{

    private final EntityManager manager;

    public ServiceBase(EntityManager manager) {
        this.manager = manager;
    }
    
    @Override
    public void create(T object) throws ServiceException {
        manager.persist(object);
    }

    @Override
    public T read(long id) throws ServiceException {
        return manager.find(getClazz(), id);
    }

    @Override
    public void update(T object) throws ServiceException {
        manager.merge(object);
    }

    @Override
    public void delete(T object) throws ServiceException {
        manager.remove(object);
    }
    
    public abstract Class<T> getClazz();
    
}
