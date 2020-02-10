package com.company.passkeeper.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "PASSKEEPER_FOLDER")
@Entity(name = "passkeeper_Folder")
public class Folder extends StandardEntity {
    private static final long serialVersionUID = -1L;

   @NotNull
    @Column(name = "NAME", nullable = false, length = 150)
    protected java.lang.String name;

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

}