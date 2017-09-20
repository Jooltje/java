package lan.network.sandbox.service;

public interface ServiceInterface<T> {
    
    void create(T object) throws ServiceException;
    
    T read(long id) throws ServiceException;
    
    void update(T object) throws ServiceException;
    
    void delete(T object) throws ServiceException;
}
