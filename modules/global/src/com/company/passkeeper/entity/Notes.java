package com.company.passkeeper.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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