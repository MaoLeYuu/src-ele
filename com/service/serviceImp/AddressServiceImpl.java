package com.service.serviceImp;

import com.dao.AddressDao;
import com.pojo.Address;
import com.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDao addressDao;
    @Override
    public Integer insertAddress(Address address) {
        return addressDao.insert(address);
    }

    @Override
    public Integer deleteAddress(int addressId) {
        return addressDao.delete(addressId);
    }

    @Override
    public Integer updateAddress(Address address) {
        return addressDao.update(address);
    }

    @Override
    public List<Address> selectAddressByUserId(int userId) {
        return addressDao.getAddressByUserId(userId);
    }

    @Override
    public Address getAddressById(int addressId) {
        return addressDao.getAddressById(addressId);
    }
}
