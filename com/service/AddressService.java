package com.service;

import com.pojo.Address;

import java.util.List;

public interface AddressService {
    Integer insertAddress(Address address);
    Integer deleteAddress(int addressId);
    Integer updateAddress(Address address);
    List<Address> selectAddressByUserId(int userId);
}
