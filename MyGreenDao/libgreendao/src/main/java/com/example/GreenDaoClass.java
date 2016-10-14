package com.example;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class GreenDaoClass {
    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(1, "com.sfwl.wuliubao.dao");
        addLocationSchema(schema);
        addUserSchema(schema);
        addTownSchema(schema);
        new DaoGenerator().generateAll(schema, "E:\\adt-bundle-windows-x86\\AndroidStudioProjects\\MyGreenDao\\app\\src\\main\\java-gen");
    }

    private static void addTownSchema(Schema schema) {
        Entity town = schema.addEntity("Town");
        town.addLongProperty("townId").primaryKey();
        town.addStringProperty("townName");
        town.addIntProperty("disId");
        town.addIntProperty("townSort");
        town.addDoubleProperty("longitude");
        town.addDoubleProperty("latitude");
        town.addIntProperty("cityId");
        town.addIntProperty("proId");
        town.addStringProperty("parentIds");
        town.addStringProperty("parentNames");
    }

    private static void addLocationSchema(Schema schema) {
        Entity loc = schema.addEntity("Location");
        loc.addIdProperty().primaryKey().autoincrement();
        loc.addIntProperty("userId");
        loc.addDoubleProperty("locLon");
        loc.addDoubleProperty("locLat");
        loc.addStringProperty("locRegion");
        loc.addDateProperty("locTime");
        loc.addDateProperty("sysTime");
        loc.addBooleanProperty("sync");
    }

    private static void addUserSchema(Schema schema){
        Entity users = schema.addEntity("Users");
        users.addIdProperty().primaryKey().autoincrement();
        users.addIntProperty("userId");
        users.addStringProperty("userNo");
        users.addIntProperty("typeId");
        users.addIntProperty("userStatu");
        users.addStringProperty("userName");
        users.addStringProperty("userNick");
        users.addStringProperty("userSex");
        users.addStringProperty("birthDate");
        users.addDoubleProperty("amount");
        users.addDoubleProperty("integral");
        users.addStringProperty("userType");
        users.addStringProperty("userIcon");
        users.addIntProperty("level");
        users.addIntProperty("groupId");
        users.addIntProperty("classId");
        users.addStringProperty("region");
        users.addStringProperty("addres");
        users.addStringProperty("phoneNo");
        users.addStringProperty("mobileNo");
        users.addStringProperty("eMail");
        users.addStringProperty("loginTime");
        users.addStringProperty("loginIMEI");
        users.addStringProperty("loginPhone");
        users.addStringProperty("wxId");
        users.addStringProperty("aliPayId");
        users.addStringProperty("departMent");
        users.addStringProperty("signLabel");
        users.addStringProperty("lastLoginDate");
        users.addStringProperty("aliPushDeviceId");
        users.addStringProperty("locLon");
        users.addStringProperty("locLat");
        users.addStringProperty("locRegion");
        users.addStringProperty("locTime");
        users.addStringProperty("note1");
        users.addStringProperty("note2");
        users.addStringProperty("note3");
        users.addStringProperty("note4");
        users.addStringProperty("note5");
        users.addStringProperty("note6");
        users.addStringProperty("note7");
        users.addStringProperty("note8");
        users.addStringProperty("note9");
    }
}
