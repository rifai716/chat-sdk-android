package com.braunster.chatsdk.dao;

import com.braunster.chatsdk.firebase.BPath;

import java.util.Date;
import java.util.Map;

import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS
// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table BLINKED_CONTACT.
 */
public class BLinkedContact extends Entity<BLinkedContact>  {

    private Long id;
    private String entityID;
    private String authentication_id;
    private String Owner;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient BLinkedContactDao myDao;

    private BUser Contact;
    private String Contact__resolvedKey;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public BLinkedContact() {
    }

    public BLinkedContact(Long id) {
        this.id = id;
    }

    public BLinkedContact(Long id, String entityID, String authentication_id, String Owner) {
        this.id = id;
        this.entityID = entityID;
        this.authentication_id = authentication_id;
        this.Owner = Owner;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getBLinkedContactDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public String getAuthentication_id() {
        return authentication_id;
    }

    public void setAuthentication_id(String authentication_id) {
        this.authentication_id = authentication_id;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /** To-one relationship, resolved on first access. */
    public BUser getContact() {
        String __key = this.Owner;
        if (Contact__resolvedKey == null || Contact__resolvedKey != __key) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BUserDao targetDao = daoSession.getBUserDao();
            BUser ContactNew = targetDao.load(__key);
            synchronized (this) {
                Contact = ContactNew;
            	Contact__resolvedKey = __key;
            }
        }
        return Contact;
    }

    public void setContact(BUser Contact) {
        synchronized (this) {
            this.Contact = Contact;
            Owner = Contact == null ? null : Contact.getEntityID();
            Contact__resolvedKey = Owner;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here

    @Override
    public void updateFrom(BLinkedContact bLinkedContact) {

    }

    @Override
    public BPath getPath() {
        return null;
    }

    @Override
    public Type getEntityType() {
        return null;
    }

    @Override
    public void updateFromMap(Map<String, Object> map) {

    }

    @Override
    public Map<String, Object> asMap() {
        return null;
    }

    @Override
    public Object getPriority() {
        return null;
    }

    @Override
    public Date lastUpdated() {
        return null;
    }

    @Override
    public void setEntityId(String entityID) {
        this.entityID = entityID;
    }
    // KEEP METHODS END

}