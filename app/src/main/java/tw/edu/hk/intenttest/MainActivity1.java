package tw.edu.hk.intenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity implements View.OnClickListener{

    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        bt1 = (Button)findViewById(R.id.button1);
        bt1.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity1, menu);
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

    public void Goto3Actitivy(View v){
        Intent it = new Intent();

        it.setClass(this, MainActivity3.class);
        it.putExtra("aaa", "25");
        it.putExtra("bbb", 28);
        startActivity(it);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent();

        it.setClass(this, MainActivity2.class);
        startActivity(it);
    }
}
