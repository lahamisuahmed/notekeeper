package com.devlahm.notekeeper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class NoteReminderReciever extends BroadcastReceiver {

    public static final String EXTRA_NOTE_TITLE = "com.devlahm.notekeeper.NOTE_TITLE";
    public static final String EXTRA_NOTE_TEXT = "com.devlahm.notekeeper.NOTE_TEXT";
    public static final String EXTRA_NOTE_ID = "com.devlahm.notekeeper.NOTE_ID";

    @Override
    public void onReceive(Context context, Intent intent) {
        String noteTitle = intent.getStringExtra(EXTRA_NOTE_TITLE);
        String noteText = intent.getStringExtra(EXTRA_NOTE_TEXT);
        int noteId = intent.getIntExtra(EXTRA_NOTE_ID, 0);

        NoteReminderNotificaiton.notify(context, noteTitle, noteText,noteId);
    }
}
