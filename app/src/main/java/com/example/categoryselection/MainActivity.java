package com.example.categoryselection;
/* Keshav Kumar, Knaharwar@gmail.com, 8929737718,NIT Raipur */
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onChekBoxChecked(View view) {
        CheckBox checkBox=findViewById(view.getId());
        if (view.getId()==R.id.Movie)
            if(checkBox.isChecked()) {
                checkBox.setTextColor(Color.rgb(255,149,0));

               // checkBox.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbutton));
                Toast.makeText(this, "movie is selected", Toast.LENGTH_SHORT).show();
            }else  checkBox.setTextColor(Color.rgb(100,100,100));
    }
}
