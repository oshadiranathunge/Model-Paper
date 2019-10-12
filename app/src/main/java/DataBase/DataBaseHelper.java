package DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "paper.db";
    public static final String TABLE_NAME1 = "user_Table";
    public static final String COL_1 = "NAME";
    public static final String COL_2 = "passsword";
    public static final String COL_3 = "type";
    public static final String COL_4 = "ID";

    public static final String TABLE_NAME2 = "msg_Table";
    public static final String COL_5 = "user";
    public static final String COL_6 = "subject";
    public static final String COL_7 = "message";


    public DataBaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " +TABLE_NAME1+ "(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,passsword VARCHAR,type TEXT  )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_NAME1);
        onCreate(db);

    }
    public boolean insertUser(String NAME, String password){
            SQLiteDatabase db =this.getWritableDatabase();
            ContentValues cv  = new ContentValues();

            cv.put(COL_1, NAME);
            cv.put(COL_2, password);
            cv.put(COL_3,type);
            cv.put(COL_4,ID);

            long result = db.insert("paper", null,cv );
            if (result ==1)
                return false;
            else
                return  true;

    }
    public boolean updateUser(String NAME,String password,String type, String ID){
        ContentValues cv  = new ContentValues();

        cv.put(COL_1, NAME);
        cv.put(COL_2, password);
        cv.put(COL_3,type);
        cv.put(COL_4,ID);

        return true;
    }
    public Integer deleteData(String ID){
        SQLiteDatabase db = this. getWritableDatabase();
        return db.delete(TABLE_NAME1, "ID=?", new String[]{ID});

    }
}
