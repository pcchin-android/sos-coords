package com.pcchin.soscoords.contactlist;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities= {ContactListEntity.class}, version=1, exportSchema=false)
public abstract class ContactListDatabase extends RoomDatabase {
    public abstract ContactListDao daoAccess();
}
