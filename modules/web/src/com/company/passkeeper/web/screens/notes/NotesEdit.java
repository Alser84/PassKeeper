package com.company.passkeeper.web.screens.notes;

import com.haulmont.cuba.gui.screen.*;
import com.company.passkeeper.entity.Notes;

@UiController("passkeeper_Notes.edit")
@UiDescriptor("notes-edit.xml")
@EditedEntityContainer("notesDc")
@LoadDataBeforeShow
public class NotesEdit extends StandardEditor<Notes> {
}