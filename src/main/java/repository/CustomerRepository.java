package repository;

import model.Customer;

import java.util.List;

public interface CustomerRepository<T> {
    List<T> findAll();

    Customer findById(Long id);

    void save(T model);

    void remove(Long id);
}
