package com.sfwl.wuliubao.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.sfwl.wuliubao.dao.Town;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TOWN".
*/
public class TownDao extends AbstractDao<Town, Long> {

    public static final String TABLENAME = "TOWN";

    /**
     * Properties of entity Town.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property TownId = new Property(0, Long.class, "townId", true, "TOWN_ID");
        public final static Property TownName = new Property(1, String.class, "townName", false, "TOWN_NAME");
        public final static Property DisId = new Property(2, Integer.class, "disId", false, "DIS_ID");
        public final static Property TownSort = new Property(3, Integer.class, "townSort", false, "TOWN_SORT");
        public final static Property Longitude = new Property(4, Double.class, "longitude", false, "LONGITUDE");
        public final static Property Latitude = new Property(5, Double.class, "latitude", false, "LATITUDE");
        public final static Property CityId = new Property(6, Integer.class, "cityId", false, "CITY_ID");
        public final static Property ProId = new Property(7, Integer.class, "proId", false, "PRO_ID");
        public final static Property ParentIds = new Property(8, String.class, "parentIds", false, "PARENT_IDS");
        public final static Property ParentNames = new Property(9, String.class, "parentNames", false, "PARENT_NAMES");
    };


    public TownDao(DaoConfig config) {
        super(config);
    }
    
    public TownDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TOWN\" (" + //
                "\"TOWN_ID\" INTEGER PRIMARY KEY ," + // 0: townId
                "\"TOWN_NAME\" TEXT," + // 1: townName
                "\"DIS_ID\" INTEGER," + // 2: disId
                "\"TOWN_SORT\" INTEGER," + // 3: townSort
                "\"LONGITUDE\" REAL," + // 4: longitude
                "\"LATITUDE\" REAL," + // 5: latitude
                "\"CITY_ID\" INTEGER," + // 6: cityId
                "\"PRO_ID\" INTEGER," + // 7: proId
                "\"PARENT_IDS\" TEXT," + // 8: parentIds
                "\"PARENT_NAMES\" TEXT);"); // 9: parentNames
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TOWN\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Town entity) {
        stmt.clearBindings();
 
        Long townId = entity.getTownId();
        if (townId != null) {
            stmt.bindLong(1, townId);
        }
 
        String townName = entity.getTownName();
        if (townName != null) {
            stmt.bindString(2, townName);
        }
 
        Integer disId = entity.getDisId();
        if (disId != null) {
            stmt.bindLong(3, disId);
        }
 
        Integer townSort = entity.getTownSort();
        if (townSort != null) {
            stmt.bindLong(4, townSort);
        }
 
        Double longitude = entity.getLongitude();
        if (longitude != null) {
            stmt.bindDouble(5, longitude);
        }
 
        Double latitude = entity.getLatitude();
        if (latitude != null) {
            stmt.bindDouble(6, latitude);
        }
 
        Integer cityId = entity.getCityId();
        if (cityId != null) {
            stmt.bindLong(7, cityId);
        }
 
        Integer proId = entity.getProId();
        if (proId != null) {
            stmt.bindLong(8, proId);
        }
 
        String parentIds = entity.getParentIds();
        if (parentIds != null) {
            stmt.bindString(9, parentIds);
        }
 
        String parentNames = entity.getParentNames();
        if (parentNames != null) {
            stmt.bindString(10, parentNames);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Town readEntity(Cursor cursor, int offset) {
        Town entity = new Town( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // townId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // townName
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // disId
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // townSort
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // longitude
            cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5), // latitude
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // cityId
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // proId
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // parentIds
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // parentNames
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Town entity, int offset) {
        entity.setTownId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTownName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDisId(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setTownSort(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setLongitude(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setLatitude(cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5));
        entity.setCityId(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setProId(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setParentIds(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setParentNames(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Town entity, long rowId) {
        entity.setTownId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Town entity) {
        if(entity != null) {
            return entity.getTownId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
