package com.bionic.socialNetwork.dao;

import com.bionic.socialNetwork.models.Administrator;
import com.bionic.socialNetwork.models.User;

import java.util.List;


public interface AdministratorDao {
    public void insert(Administrator administrator) throws Exception;

    public void delete(Administrator administrator) throws Exception;

    public List<Administrator> selectAll() throws Exception;

    public Administrator selectById(long id) throws Exception;
}
