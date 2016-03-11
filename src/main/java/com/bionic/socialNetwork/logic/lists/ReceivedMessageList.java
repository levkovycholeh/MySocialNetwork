package com.bionic.socialNetwork.logic.lists;

import com.bionic.socialNetwork.dao.PrivateMessageDao;
import com.bionic.socialNetwork.dao.impl.PrivateMessageDaoImpl;
import com.bionic.socialNetwork.dao.impl.UserDaoImpl;
import com.bionic.socialNetwork.models.PrivateMessage;
import com.bionic.socialNetwork.models.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.Collection;


public class ReceivedMessageList {
    private Collection<PrivateMessage> receivedMessages;

    @JsonIgnore
    private boolean resolved;

    @JsonIgnore
    private static final Logger LOGGER =
            LogManager.getLogger(ReceivedMessageList.class.getName());

    public ReceivedMessageList(long id, int page) {
        PrivateMessageDao privateMessageDao = new PrivateMessageDaoImpl();
        try {
            User user = new UserDaoImpl().selectById(id);
            receivedMessages =
                    privateMessageDao.selectReceivedNextWith(user, page);
        }
        catch (NullPointerException e) {
            resolved = false;
        }
        catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }

    public Collection<PrivateMessage> getPrivateMessages() {
        return receivedMessages;
    }

    public boolean isResolved() {
        return resolved;
    }
}


