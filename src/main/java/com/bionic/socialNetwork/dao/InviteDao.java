package com.bionic.socialNetwork.dao;

import com.bionic.socialNetwork.models.Invite;


public interface InviteDao {
    public void insert(Invite invite) throws Exception;
    public void delete(Invite invite) throws Exception;
    public Invite selectById(long addUserId) throws Exception;
    public Invite selectByInvite(String invite) throws Exception;
}
