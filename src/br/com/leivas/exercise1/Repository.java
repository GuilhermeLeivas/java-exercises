package br.com.leivas.exercise1;

import java.util.List;
import java.util.Optional;

public interface Repository<E> {

    E save(E entity);

    List<E> findAll();

    Optional<E> findById(int id);

    Optional<E> findByArg(String arg, String value);

}
