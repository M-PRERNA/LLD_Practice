package com.learn.spring.lld;
import java.util.HashMap;
import java.util.Map;

public class UserPrototypeRegistryImpl implements UserPrototypeRegistry{
    private final Map<UserType, User> registry;

    public UserPrototypeRegistryImpl() {
        registry = new HashMap<>();
    }

    @Override
    public void addPrototype(User user){
        registry.put(user.getType(), user);
    }

    @Override
    public User getPrototype(UserType type){
        User user = registry.get(type);
        if(user == null){
            throw new IllegalArgumentException("No prototype registered for: " + type);
        }

        return user;
    }

    @Override
    public User clone(UserType type){
        return getPrototype(type).cloneObject();

    }

}
