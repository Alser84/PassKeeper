package com.company.passkeeper.web.screens.folder;

import com.company.passkeeper.entity.Notes;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.passkeeper.entity.Folder;

import javax.inject.Inject;

@UiController("passkeeper_Folder.edit")
@UiDescriptor("folder-edit.xml")
@EditedEntityContainer("folderDc")
//@LoadDataBeforeShow

public class FolderEdit extends StandardEditor<Folder> {
    @Inject
    private CollectionLoader<Notes> notesDl;

    @Subscribe
    protected void onBeforeShow(BeforeShowEvent event) {
        notesDl.setParameter("folder",getEditedEntity());
        getScreenData().loadAll();

    }
}