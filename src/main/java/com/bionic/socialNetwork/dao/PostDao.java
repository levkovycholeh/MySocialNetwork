package com.bionic.socialNetwork.dao;

import com.bionic.socialNetwork.models.BackOfficeAdmin;
import com.bionic.socialNetwork.models.Post;
import com.bionic.socialNetwork.models.User;

import java.util.List;


public interface PostDao {
    public Post selectById(long userId) throws Exception;
    public void insert(Post post) throws Exception;
    public void delete(Post post) throws Exception;
    public List selectLastWith(User user, int lot) throws Exception;
    public List<Post> selectLastBeckOffWith (List<BackOfficeAdmin> backOfficeAdmins,
                                             int lot) throws Exception;
}
