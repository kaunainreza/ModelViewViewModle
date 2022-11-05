package com.example.modelviewviewmodle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recView= findViewById(R.id.recView);
        recView.setLayoutManager(new LinearLayoutManager(this));
        recView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        Adapter adapter= new Adapter(getStudents());
        recView.setAdapter(adapter);
    }
    public List<Student> getStudents(){

        List<Student>sList = new ArrayList<>();
        sList.add(new Student("md Jamal","JEET"));
        sList.add(new Student("md kamal","NEE"));
        sList.add(new Student("jdhg","UPSC"));
        sList.add(new Student("mjdal","MBBS"));
        sList.add(new Student("md hddh","IIT"));
        sList.add(new Student("kjdu","IT"));
        sList.add(new Student("wdeydj","B.com"));
        sList.add(new Student("edhycgeh","B.tech"));
        sList.add(new Student("md Jamaldjl","ca"));
        sList.add(new Student("fmn","mba"));
        sList.add(new Student("dhsdgfd","Bca"));

        return sList;
    }
}