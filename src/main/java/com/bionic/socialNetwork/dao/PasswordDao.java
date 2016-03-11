package com.bionic.socialNetwork.dao;

import com.bionic.socialNetwork.models.Password;


public interface PasswordDao {
    public Password selectById(long id) throws Exception;
    public void update(Password password) throws Exception;
}
