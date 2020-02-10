create table PASSKEEPER_NOTES (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FOLDER_ID varchar(36),
    NAME varchar(255) not null,
    ADDRESS_URL varchar(255),
    LOGIN varchar(255),
    PASSWORD varchar(255),
    CREATION_DATE date,
    MISC varchar(255),
    --
    primary key (ID)
);