package com.company.passkeeper.web.screens.notes;

import com.haulmont.cuba.gui.screen.*;
import com.company.passkeeper.entity.Notes;

@UiController("passkeeper_Notes.browse")
@UiDescriptor("notes-browse.xml")
@LookupComponent("notesesTable")
@LoadDataBeforeShow
public class NotesBrowse extends StandardLookup<Notes> {
}