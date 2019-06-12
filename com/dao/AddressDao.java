package com.dao;

import com.pojo.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressDao {
    Integer insert(@Param("address") Address address);
    Integer delete(@Param("addressId") int addressId);
    Integer update(@Param("address") Address address);
    List<Address> getAddressByUserId(@Param("userId") int userId);
}
