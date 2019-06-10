package com.blogspot.androidminto.navigation4dev;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends FragmentActivity {

    Button teacherone,teachertwo,studentone,studenttwo,staffone,stafftwo ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        // Set the ViewPagerAdapter into ViewPager
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        teacherone = (Button)findViewById(R.id.teacherOne);
        teachertwo = (Button)findViewById(R.id.teacherTwo);
        studentone = (Button)findViewById(R.id.studentOne);
        studenttwo = (Button)findViewById(R.id.studentTwo);
        staffone = (Button)findViewById(R.id.staffOne);
        stafftwo = (Button)findViewById(R.id.staffTwo);
    }
    public void minto(View view){
        switch (view.getId()){
            case R.id.teacherOne:
                //setContentView(R.layout.teacherone);
                Toast.makeText(getApplicationContext(),"Campus to Sadar", Toast.LENGTH_LONG).show();
                Intent i = new Intent(SecondActivity.this,TeacherCampus.class);
                //i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                break;
            case R.id.teacherTwo:
                //setContentView(R.layout.teachertwo);
                Toast.makeText(getApplicationContext(),"Sadar to Campus", Toast.LENGTH_LONG).show();
                i = new Intent(SecondActivity.this,TeacherSadar.class);
                //i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                break;
            case R.id.studentOne:
                //setContentView(R.layout.studentone);
                Toast.makeText(getApplicationContext(),"Campus to Sadar", Toast.LENGTH_LONG).show();
                i = new Intent(SecondActivity.this,StudentCampus.class);
                //i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                break;
            case R.id.studentTwo:
                //setContentView(R.layout.studenttwo);
                Toast.makeText(getApplicationContext(),"Sadar to Campus", Toast.LENGTH_LONG).show();
                i = new Intent(SecondActivity.this,StudentSadar.class);
                //i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                break;
            case R.id.staffOne:
                //setContentView(R.layout.staffone);
                Toast.makeText(getApplicationContext(),"Campus to Sadar", Toast.LENGTH_LONG).show();
                i = new Intent(SecondActivity.this,StaffCampus.class);
                //i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                break;
            case R.id.staffTwo:
                //setContentView(R.layout.stafftwo);
                Toast.makeText(getApplicationContext(),"Sadar to Campus", Toast.LENGTH_LONG).show();
                i = new Intent(SecondActivity.this,StaffSadar.class);
                //i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                break;
            case R.id.offdayone:
                //setContentView(R.layout.staffone);
                Toast.makeText(getApplicationContext(),"Campus to Sadar", Toast.LENGTH_LONG).show();
                i = new Intent(SecondActivity.this,OffDay.class);
                //i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                break;
            case R.id.offdaytwo:
                //setContentView(R.layout.stafftwo);
                Toast.makeText(getApplicationContext(),"Sadar to Campus", Toast.LENGTH_LONG).show();
                i = new Intent(SecondActivity.this,Offday1.class);
                //i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                break;
            case R.id.roadone:
                //setContentView(R.layout.staffone);
                Toast.makeText(getApplicationContext(),"Road Show", Toast.LENGTH_LONG).show();
                i = new Intent(SecondActivity.this,TeacherRoad.class);
                //i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                break;
            case R.id.roadtwo:
                //setContentView(R.layout.stafftwo);
                Toast.makeText(getApplicationContext(),"Road Show", Toast.LENGTH_LONG).show();
                i = new Intent(SecondActivity.this,StudentRoad.class);
                //i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                break;
            default:
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is presen t.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}