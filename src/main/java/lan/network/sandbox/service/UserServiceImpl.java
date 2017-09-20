package lan.network.sandbox.service;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import lan.network.sandbox.entity.User;

@Default
@ApplicationScoped
public class UserServiceImpl extends ServiceBase<User> implements UserService{
    
    @Inject
    public UserServiceImpl(EntityManager manager) {
        super(manager);
    }

    @Override
    public Class<User> getClazz() {
        return User.class;
    }
    
}
