package com.bionic.socialNetwork.dao;

import com.bionic.socialNetwork.models.Group;
import com.bionic.socialNetwork.models.GroupPost;

import java.util.List;


public interface GroupPostDao {
    public GroupPost selectById(long id) throws Exception;
    public void insert(GroupPost group) throws Exception;
    public void update(GroupPost group) throws Exception;
    public void delete(GroupPost group) throws Exception;
    public List selectLastWith(Group group, int lot) throws Exception;
}
