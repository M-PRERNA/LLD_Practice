package com.learn.spring.lld;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {
    private static FileBasedConfigurationManagerImpl instance = null;

    private FileBasedConfigurationManagerImpl() {

    }
    @Override
    public String getConfiguration(String key) {
        return instance.properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        String value = properties.getProperty(key);
        if(value == null){
            return null;
        }
        if(type == String.class){
            return type.cast(value);
        }
        return convert(value, type);
    }

    @Override
    public void setConfiguration(String key, String value) {
        properties.put(key, value);

    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        properties.put(key, (T)value);
    }

    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);
    }

    @Override
    public void clear() {
        properties.clear();

    }

    public static FileBasedConfigurationManager getInstance() {
        if(instance == null){
            instance = new FileBasedConfigurationManagerImpl();
        }
        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }

}
