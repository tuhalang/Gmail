package com.tuhalang.gmail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    List<GmailModel> contacts;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         random = new Random();

        // get random value for name and description
        char[] chars1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] chars2 = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        StringBuilder sb6 = new StringBuilder();
        StringBuilder sb7 = new StringBuilder();
        StringBuilder sb8 = new StringBuilder();
        StringBuilder sb9 = new StringBuilder();
        StringBuilder sb10 = new StringBuilder();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder s3 = new StringBuilder();
        StringBuilder s4 = new StringBuilder();
        StringBuilder s5 = new StringBuilder();
        StringBuilder s6 = new StringBuilder();
        StringBuilder s7 = new StringBuilder();
        StringBuilder s8 = new StringBuilder();
        StringBuilder s9 = new StringBuilder();
        StringBuilder s10 = new StringBuilder();
        for (int i = 0; i < 6; i++)
        {
            sb1.append(chars1[random.nextInt(chars1.length)]);
            sb2.append(chars1[random.nextInt(chars1.length)]);
            sb3.append(chars1[random.nextInt(chars1.length)]);
            sb4.append(chars1[random.nextInt(chars1.length)]);
            sb5.append(chars1[random.nextInt(chars1.length)]);
            sb6.append(chars1[random.nextInt(chars1.length)]);
            sb7.append(chars1[random.nextInt(chars1.length)]);
            sb8.append(chars1[random.nextInt(chars1.length)]);
            sb9.append(chars1[random.nextInt(chars1.length)]);
            sb10.append(chars1[random.nextInt(chars1.length)]);
        }

        for (int i = 0; i < 10; i++)
        {
            s1.append(chars2[random.nextInt(chars2.length)]);
            s2.append(chars2[random.nextInt(chars2.length)]);
            s3.append(chars2[random.nextInt(chars2.length)]);
            s4.append(chars2[random.nextInt(chars2.length)]);
            s5.append(chars2[random.nextInt(chars2.length)]);
            s6.append(chars2[random.nextInt(chars2.length)]);
            s7.append(chars2[random.nextInt(chars2.length)]);
            s8.append(chars2[random.nextInt(chars2.length)]);
            s9.append(chars2[random.nextInt(chars2.length)]);
            s10.append(chars2[random.nextInt(chars2.length)]);
        }

        contacts = new ArrayList<>();
        contacts.add(new GmailModel(sb1.toString(), s1.toString()));
        contacts.add(new GmailModel(sb2.toString(), s2.toString()));
        contacts.add(new GmailModel(sb3.toString(), s3.toString()));
        contacts.add(new GmailModel(sb4.toString(), s4.toString()));
        contacts.add(new GmailModel(sb5.toString(), s5.toString()));
        contacts.add(new GmailModel(sb6.toString(), s6.toString()));
        contacts.add(new GmailModel(sb7.toString(), s7.toString()));
        contacts.add(new GmailModel(sb8.toString(), s8.toString()));
        contacts.add(new GmailModel(sb9.toString(), s9.toString()));
        contacts.add(new GmailModel(sb10.toString(), s10.toString()));


        GmailAdapter adapter = new GmailAdapter(contacts);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
