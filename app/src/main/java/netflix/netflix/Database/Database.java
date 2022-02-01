package netflix.netflix.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteAssetHelper {
    private static final String DB_NAME = "netflix_db10.db";
    private static final int DB_VER = 1;
    public static Context context_;

    public Database(Context context) {
        super(context, DB_NAME, null, DB_VER);
        context_ = context;
    }

    //=====================================All Netflix Data============================================//
    //region Function get all Exercise List
    public List<Netflix_DB_list> get_AllNetflix_List() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"name", "image", "text1", "text2", "text3", "text4", "youtube"};
        //Make sure this is your table name
        String tableName = "Korea_contents";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Netflix_DB_list> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Netflix_DB_list korea_contents_list = new Netflix_DB_list();
                korea_contents_list.setNetflix_name(cursor.getString(cursor.getColumnIndex("name")));
                korea_contents_list.setNetflix_image(cursor.getBlob(cursor.getColumnIndex("image")));
                korea_contents_list.setNetflix_text1(cursor.getString(cursor.getColumnIndex("text1")));
                korea_contents_list.setNetflix_text2(cursor.getString(cursor.getColumnIndex("text2")));
                korea_contents_list.setNetflix_text3(cursor.getString(cursor.getColumnIndex("text3")));
                korea_contents_list.setNetflix_text4(cursor.getString(cursor.getColumnIndex("text4")));
                korea_contents_list.setNetflix_youtube(cursor.getString(cursor.getColumnIndex("youtube")));






                result.add(korea_contents_list);
            } while (cursor.moveToNext());
        }
        return result;
    }

    //=====================================All Netflix Data============================================//
    //region Function get all Exercise List
    public List<Netflix_DB_list> get_Netflix_List1() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"name", "image", "text1", "text2", "text3", "text4", "youtube"};
        //Make sure this is your table name
        String tableName = "Korea_contents";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Netflix_DB_list> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Netflix_DB_list korea_contents_list = new Netflix_DB_list();
                korea_contents_list.setNetflix_name(cursor.getString(cursor.getColumnIndex("name")));
                korea_contents_list.setNetflix_image(cursor.getBlob(cursor.getColumnIndex("image")));
                korea_contents_list.setNetflix_text1(cursor.getString(cursor.getColumnIndex("text1")));
                korea_contents_list.setNetflix_text2(cursor.getString(cursor.getColumnIndex("text2")));
                korea_contents_list.setNetflix_text3(cursor.getString(cursor.getColumnIndex("text3")));
                korea_contents_list.setNetflix_text4(cursor.getString(cursor.getColumnIndex("text4")));
                korea_contents_list.setNetflix_youtube(cursor.getString(cursor.getColumnIndex("youtube")));

                result.add(korea_contents_list);
            } while (cursor.moveToNext());
        }
        return result;
    }

    //=====================================Now_contents Netflix Data============================================//
    //region Function get all Exercise List
    public List<Netflix_DB_list> get_Netflix_List2() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"image"};
        //Make sure this is your table name
        String tableName = "Now_contents";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Netflix_DB_list> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Netflix_DB_list korea_contents_list = new Netflix_DB_list();
                korea_contents_list.setNetflix_image(cursor.getBlob(cursor.getColumnIndex("image")));

                result.add(korea_contents_list);
            } while (cursor.moveToNext());
        }
        return result;
    }

    //=====================================Marvel_contents Netflix Data============================================//
    //region Function get all Exercise List
    public List<Netflix_DB_list> get_Netflix_List3() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"image"};
        //Make sure this is your table name
        String tableName = "Marvel_contents";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Netflix_DB_list> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Netflix_DB_list korea_contents_list = new Netflix_DB_list();
                korea_contents_list.setNetflix_image(cursor.getBlob(cursor.getColumnIndex("image")));

                result.add(korea_contents_list);
            } while (cursor.moveToNext());
        }
        return result;
    }

    //=====================================Staff_contents Netflix Data============================================//
    //region Function get all Exercise List
    public List<Netflix_DB_list> get_Netflix_List4() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"image"};
        //Make sure this is your table name
        String tableName = "Staff_contents";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Netflix_DB_list> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Netflix_DB_list korea_contents_list = new Netflix_DB_list();
                korea_contents_list.setNetflix_image(cursor.getBlob(cursor.getColumnIndex("image")));

                result.add(korea_contents_list);
            } while (cursor.moveToNext());
        }
        return result;
    }

    //=====================================Overseas_contents Netflix Data============================================//
    //region Function get all Exercise List
    public List<Netflix_DB_list> get_Netflix_List5() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"image"};
        //Make sure this is your table name
        String tableName = "Overseas_contents";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Netflix_DB_list> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Netflix_DB_list korea_contents_list = new Netflix_DB_list();
                korea_contents_list.setNetflix_image(cursor.getBlob(cursor.getColumnIndex("image")));

                result.add(korea_contents_list);
            } while (cursor.moveToNext());
        }
        return result;
    }

    //=====================================Watch_contents Netflix Data============================================//
    //region Function get all Exercise List
    public List<Netflix_DB_list> get_Netflix_List6() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"image"};
        //Make sure this is your table name
        String tableName = "Watch_contents";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Netflix_DB_list> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Netflix_DB_list korea_contents_list = new Netflix_DB_list();
                korea_contents_list.setNetflix_image(cursor.getBlob(cursor.getColumnIndex("image")));

                result.add(korea_contents_list);
            } while (cursor.moveToNext());
        }
        return result;
    }

    //=====================================get_Netflix_List_Drama1 Data============================================//
    //region Function get Watch_contents Netflix Data
    public List<Netflix_DB_list> get_Netflix_List_Drama1() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"image", "subtitle", "time", "des", "youtube"};
        //Make sure this is your table name
        String tableName = "Drama1";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Netflix_DB_list> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Netflix_DB_list korea_contents_list = new Netflix_DB_list();
                korea_contents_list.setNetflix_image(cursor.getBlob(cursor.getColumnIndex("image")));
                korea_contents_list.setNetflix_text1(cursor.getString(cursor.getColumnIndex("subtitle")));
                korea_contents_list.setNetflix_text2(cursor.getString(cursor.getColumnIndex("time")));
                korea_contents_list.setNetflix_text3(cursor.getString(cursor.getColumnIndex("des")));
                korea_contents_list.setNetflix_youtube(cursor.getString(cursor.getColumnIndex("youtube")));

                result.add(korea_contents_list);
            } while (cursor.moveToNext());
        }
        return result;
    }

    //=====================================get_Netflix_List_Drama2 Data============================================//
    //region Function get get_Netflix_List_Drama2
    public List<Netflix_DB_list> get_Netflix_List_Drama2() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"image", "subtitle", "time", "des", "youtube"};
        //Make sure this is your table name
        String tableName = "Drama2";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Netflix_DB_list> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Netflix_DB_list korea_contents_list = new Netflix_DB_list();
                korea_contents_list.setNetflix_image(cursor.getBlob(cursor.getColumnIndex("image")));
                korea_contents_list.setNetflix_text1(cursor.getString(cursor.getColumnIndex("subtitle")));
                korea_contents_list.setNetflix_text2(cursor.getString(cursor.getColumnIndex("time")));
                korea_contents_list.setNetflix_text3(cursor.getString(cursor.getColumnIndex("des")));
                korea_contents_list.setNetflix_youtube(cursor.getString(cursor.getColumnIndex("youtube")));

                result.add(korea_contents_list);
            } while (cursor.moveToNext());
        }
        return result;
    }

    //=====================================get_Netflix_List_Game Data============================================//
    //region Function get get_Netflix_List_Game
    public List<Netflix_DB_list> get_Netflix_List_Game() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"image", "name", "text"};
        //Make sure this is your table name
        String tableName = "Game_contents";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Netflix_DB_list> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Netflix_DB_list korea_contents_list = new Netflix_DB_list();
                korea_contents_list.setNetflix_image(cursor.getBlob(cursor.getColumnIndex("image")));
                korea_contents_list.setNetflix_text1(cursor.getString(cursor.getColumnIndex("name")));
                korea_contents_list.setNetflix_text2(cursor.getString(cursor.getColumnIndex("text")));

                result.add(korea_contents_list);
            } while (cursor.moveToNext());
        }
        return result;
    }

    //=====================================get_Netflix_Home2_menu1 Data============================================//
    //region Function get get_Netflix_List_Game
    public List<Netflix_DB_list> get_Netflix_Home2_menu1() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"month","day","image","image2", "openday","name", "des","tag1","tag2","tag3","tag4","tag5","youtube"};
        //Make sure this is your table name
        String tableName = "Home2_menu1";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Netflix_DB_list> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Netflix_DB_list korea_contents_list = new Netflix_DB_list();
                korea_contents_list.setNetflix_text1(cursor.getString(cursor.getColumnIndex("month")));
                korea_contents_list.setNetflix_text2(cursor.getString(cursor.getColumnIndex("day")));
                korea_contents_list.setNetflix_image(cursor.getBlob(cursor.getColumnIndex("image")));
                korea_contents_list.setNetflix_image2(cursor.getBlob(cursor.getColumnIndex("image2")));
                korea_contents_list.setNetflix_text3(cursor.getString(cursor.getColumnIndex("openday")));
                korea_contents_list.setNetflix_text4(cursor.getString(cursor.getColumnIndex("name")));
                korea_contents_list.setNetflix_text5(cursor.getString(cursor.getColumnIndex("des")));
                korea_contents_list.setNetflix_text6(cursor.getString(cursor.getColumnIndex("tag1")));
                korea_contents_list.setNetflix_text7(cursor.getString(cursor.getColumnIndex("tag2")));
                korea_contents_list.setNetflix_text8(cursor.getString(cursor.getColumnIndex("tag3")));
                korea_contents_list.setNetflix_text9(cursor.getString(cursor.getColumnIndex("tag4")));
                korea_contents_list.setNetflix_text10(cursor.getString(cursor.getColumnIndex("tag5")));
                korea_contents_list.setNetflix_youtube(cursor.getString(cursor.getColumnIndex("youtube")));
                result.add(korea_contents_list);
            } while (cursor.moveToNext());
        }
        return result;
    }

    //=====================================get_Netflix_Home2_menu2 Data============================================//
    //region Function get get_Netflix_List_Game
    public List<Netflix_DB_list> get_Netflix_Home2_menu2() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"image","name", "des","tag1","tag2","tag3","tag4","tag5","youtube"};
        //Make sure this is your table name
        String tableName = "Home2_menu2";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Netflix_DB_list> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Netflix_DB_list korea_contents_list = new Netflix_DB_list();
                korea_contents_list.setNetflix_image(cursor.getBlob(cursor.getColumnIndex("image")));
                korea_contents_list.setNetflix_text1(cursor.getString(cursor.getColumnIndex("name")));
                korea_contents_list.setNetflix_text2(cursor.getString(cursor.getColumnIndex("des")));
                korea_contents_list.setNetflix_text3(cursor.getString(cursor.getColumnIndex("tag1")));
                korea_contents_list.setNetflix_text4(cursor.getString(cursor.getColumnIndex("tag2")));
                korea_contents_list.setNetflix_text5(cursor.getString(cursor.getColumnIndex("tag3")));
                korea_contents_list.setNetflix_text6(cursor.getString(cursor.getColumnIndex("tag4")));
                korea_contents_list.setNetflix_text7(cursor.getString(cursor.getColumnIndex("tag5")));
                korea_contents_list.setNetflix_youtube(cursor.getString(cursor.getColumnIndex("youtube")));
                result.add(korea_contents_list);
            } while (cursor.moveToNext());
        }
        return result;
    }

    //=====================================get_Netflix_Home2_menu3 Data============================================//
    //region Function get get_Netflix_List_Game
    public List<Netflix_DB_list> get_Netflix_Home2_menu3() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"number","image","name", "des","tag1","tag2","tag3","tag4","tag5","youtube"};
        //Make sure this is your table name
        String tableName = "Home2_menu3";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Netflix_DB_list> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Netflix_DB_list korea_contents_list = new Netflix_DB_list();
                korea_contents_list.setNetflix_text1(cursor.getString(cursor.getColumnIndex("number")));
                korea_contents_list.setNetflix_image(cursor.getBlob(cursor.getColumnIndex("image")));
                korea_contents_list.setNetflix_text2(cursor.getString(cursor.getColumnIndex("name")));
                korea_contents_list.setNetflix_text3(cursor.getString(cursor.getColumnIndex("des")));
                korea_contents_list.setNetflix_text4(cursor.getString(cursor.getColumnIndex("tag1")));
                korea_contents_list.setNetflix_text5(cursor.getString(cursor.getColumnIndex("tag2")));
                korea_contents_list.setNetflix_text6(cursor.getString(cursor.getColumnIndex("tag3")));
                korea_contents_list.setNetflix_text7(cursor.getString(cursor.getColumnIndex("tag4")));
                korea_contents_list.setNetflix_text8(cursor.getString(cursor.getColumnIndex("tag5")));
                korea_contents_list.setNetflix_youtube(cursor.getString(cursor.getColumnIndex("youtube")));
                result.add(korea_contents_list);
            } while (cursor.moveToNext());
        }
        return result;
    }

    //=====================================get_Netflix_Search Data============================================//
    //region Function get  get_Netflix_Search List
    public List<Netflix_DB_list> get_Netflix_Search() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"name", "image", "youtube"};
        //Make sure this is your table name
        String tableName = "Korea_contents";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Netflix_DB_list> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Netflix_DB_list korea_contents_list = new Netflix_DB_list();
                korea_contents_list.setNetflix_name(cursor.getString(cursor.getColumnIndex("name")));
                korea_contents_list.setNetflix_image(cursor.getBlob(cursor.getColumnIndex("image")));
                korea_contents_list.setNetflix_youtube(cursor.getString(cursor.getColumnIndex("youtube")));
                result.add(korea_contents_list);
            } while (cursor.moveToNext());
        }
        return result;
    }
    //endregion

    //=====================================getSearchName Data============================================//
    //region Function get  getSearchName List
    public List<String> getSearchName() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"name"};
        //Make sure this is your table name
        String tableName = "Korea_contents";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<String> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {

                result.add(cursor.getString(cursor.getColumnIndex("name")));

            } while (cursor.moveToNext());
        }
        return result;
    }
    //endregion
    //=============================================================================================//

    //=====================================Netflix Data Search By Name============================================//
    //region Function get all Exercise List
    public List<Netflix_DB_list> getSearchByName(String name) {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        //Make sure all is column name in your Table
        String[] sqlSelect = {"name", "image", "youtube"};
        //Make sure this is your table name
        String tableName = "Korea_contents";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, "name LIKE?", new String[]{"%"+name+"%"}, null, null, null);
        List<Netflix_DB_list> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Netflix_DB_list korea_contents_list = new Netflix_DB_list();
                korea_contents_list.setNetflix_name(cursor.getString(cursor.getColumnIndex("name")));
                korea_contents_list.setNetflix_image(cursor.getBlob(cursor.getColumnIndex("image")));
                korea_contents_list.setNetflix_youtube(cursor.getString(cursor.getColumnIndex("youtube")));
                result.add(korea_contents_list);
            } while (cursor.moveToNext());
        }
        return result;
    }
}
