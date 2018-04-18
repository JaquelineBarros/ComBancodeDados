package com.example.alunos.combancodedados;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Alunos on 18/04/2018.
 */

public class DataBaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "Empregados.sqLiteDatabase";
    public static final String TABLE_NAME = "Empregados_table";

    public static final String COL_1 = "ID";
    public static final String COL_2 = "NOME";
    public static final String COL_3 = "SOBRENOME";
    public static final String COL_4 = "PROFISSAO";

    public DataBaseHelper(Context context) {
        super(context,DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(" CREATE TABLE " + TABLE_NAME +
                                 "( ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME TEXT, SOBRENOME TEXT, PROFISSAO TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    }
    public boolean insertData(String nome, String sobrenome, String profissao){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, nome);
        contentValues.put(COL_3, sobrenome);
        contentValues.put(COL_4, profissao);
        long result = sqLiteDatabase.insert(TABLE_NAME, null, contentValues);
        sqLiteDatabase.close();

        if(result == -1){
            return  false;
        }else{
            return true;
        }

    }

}
