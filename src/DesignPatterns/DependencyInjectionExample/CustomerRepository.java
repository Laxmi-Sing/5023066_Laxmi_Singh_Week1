package DesignPatterns.DependencyInjectionExample;

public interface CustomerRepository {
    Customer findCustomerById(String id);
}
