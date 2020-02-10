package com.company.passkeeper.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NamePattern("%s|nameNote")
@Table(name = "PASSKEEPER_NOTES")
@Entity(name = "passkeeper_Notes")
public class Notes extends StandardEntity {
    private static final long serialVersionUID = -899201134219573004L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FOLDER_ID")
    protected Folder folder;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String nameNote;

    @Column(name = "ADDRESS_URL")
    protected String addressUrl;

    @Column(name = "LOGIN")
    protected String login;

    @Column(name = "PASSWORD")
    protected String password;

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE")
    protected Date creationDate;

    @Column(name = "MISC")
    protected String misc;

    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAddressUrl() {
        return addressUrl;
    }

    public void setAddressUrl(String addressUrl) {
        this.addressUrl = addressUrl;
    }

    public String getNameNote() {
        return nameNote;
    }

    public void setNameNote(String nameNote) {
        this.nameNote = nameNote;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}