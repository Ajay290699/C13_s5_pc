package com.niit.C13_s5_pc.service;

import com.niit.C13_s5_pc.domain.Customer;
import com.niit.C13_s5_pc.exception.CustomerAlreadyExistException;
import com.niit.C13_s5_pc.exception.CustomerNotFoundException;

import java.util.List;

public interface ICustomerService {

    public Customer addCustomer(Customer customer) throws CustomerAlreadyExistException;
    public List<Customer> getAllCustomer();
    public String deleteCustomer(int id) throws CustomerNotFoundException;
    public List<Customer> getCustomerWhoBougthSamsungPhone(String product);
}