package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * FAULTY "Singleton": public constructor, getInstance() returns a NEW instance each time,
 * not thread-safe, reload allowed anytime, mutable global state, reflection+serialization-friendly.
 */
public class AppSettings implements Serializable {
    private final Properties props = new Properties();

    private AppSettings() { } // should not be public for true singleton

    private static volatile AppSettings instance;

    public static AppSettings getInstance() {
//        return new AppSettings(); // returns a fresh instance (bug)
        if (instance == null) {
            synchronized (AppSettings.class){
                if(instance == null){
                    instance = new AppSettings();
                }
            }
        }
    }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }

    protected Object readResolve() throws  ObjectStreamException {
        return instance;
    }
}
