package jp.techacademy.motoharu.watanabe.taskapp;


/**
 * Created by motoharuwatanabe on 16/08/26.
 */

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;


public class TaskApp extends Application{
    @Override
    public void onCreate(){
        super.onCreate();
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this).build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }
}
