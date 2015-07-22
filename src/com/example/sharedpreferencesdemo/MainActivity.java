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
        //ʵ����һ��Person1ʵ��������������Ҫ�洢��SharedPreferences�еĶ���
        Person1 p = new Person1("zhangsan",23,175.0f,false,"001");
        Person1 p1 = new Person1("lisi",26,165.0f,true,"007");
        //��p�洢��SharedPreferences�ġ�act������
        SharedPreferencesUtils1.getInstance(this).putObjectToShare("acd",p);
        SharedPreferencesUtils1.getInstance(this).putObjectToShare("acf",p1);;
        //��SharedPreferences�ġ�zhangqi������ȡ��֮ǰ�洢����Personʵ��
        Person1 savedPerson = SharedPreferencesUtils1.getInstance(this).getObjectFromShare("acd",Person1.class);
        Log.e("TTT",""+savedPerson.toString());
        Person1 savedPerson1 = SharedPreferencesUtils1.getInstance(this).getObjectFromShare("acf",Person1.class);
        Log.e("TTT",""+savedPerson1.toString());
        ////////////////////////////////////////////////////////sqilte
        //ʵ�������ǵ�DBHelper
        DBHelper dbHelper = new DBHelper(this);
        //���������������DBHelper�е�onCreate�Ż�ִ��
        dbHelper.getReadableDatabase();
    }
}
