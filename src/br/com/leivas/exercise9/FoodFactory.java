package br.com.leivas.exercise9;

import br.com.leivas.common.Factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FoodFactory implements Factory<String, Food> {

    @Override
    public Food produce(String input) {
        try {
            String packageName = "br.com.leivas.exercise9.";
            String fullQualifiedName = packageName + input;
            final Class<?> classRef = Class.forName(fullQualifiedName);
            final Constructor<?> constructor = classRef.getConstructor();
            return (Food) constructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            Logger.getLogger(this.getClass().getSimpleName()).log(Level.SEVERE, "Failed to produce the request input: " + input);
        }
        return null;
    }
}
