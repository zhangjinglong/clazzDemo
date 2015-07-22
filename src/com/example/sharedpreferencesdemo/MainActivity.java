package com.example.sharedpreferencesdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.sqlite.DBHelper;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化一个Person1实例，这是我们想要存储到SharedPreferences中的对象
        Person1 p = new Person1("zhangsan",23,175.0f,false,"001");
        Person1 p1 = new Person1("lisi",26,165.0f,true,"007");
        //将p存储到SharedPreferences的“act”名下
        SharedPreferencesUtils1.getInstance(this).putObjectToShare("acd",p);
        SharedPreferencesUtils1.getInstance(this).putObjectToShare("acf",p1);;
        //从SharedPreferences的“zhangqi”名下取出之前存储过的Person实例
        Person1 savedPerson = SharedPreferencesUtils1.getInstance(this).getObjectFromShare("acd",Person1.class);
        Log.e("TTT",""+savedPerson.toString());
        Person1 savedPerson1 = SharedPreferencesUtils1.getInstance(this).getObjectFromShare("acf",Person1.class);
        Log.e("TTT",""+savedPerson1.toString());
        ////////////////////////////////////////////////////////sqilte
        //实例化我们的DBHelper
        DBHelper dbHelper = new DBHelper(this);
        //调用了这个方法后，DBHelper中的onCreate才会执行
        dbHelper.getReadableDatabase();
    }
}
