package com.company.passkeeper.web.screens.folder;

import com.haulmont.cuba.gui.screen.*;
import com.company.passkeeper.entity.Folder;

@UiController("passkeeper_Folder.browse")
@UiDescriptor("folder-browse.xml")
@LookupComponent("foldersTable")
@LoadDataBeforeShow
public class FolderBrowse extends StandardLookup<Folder> {
}