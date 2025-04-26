package edu.miu.cs.cs489.lesson6.citylibraryapp.service;

import java.util.List;

import edu.miu.cs.cs489.lesson6.citylibraryapp.model.Address;

public interface AddressService {

    Address addNewAddress(Address newAddress);

    List<Address> findAllAddresses();

}
