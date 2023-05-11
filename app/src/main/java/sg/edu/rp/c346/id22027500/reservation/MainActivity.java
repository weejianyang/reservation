package sg.edu.rp.c346.id22027500.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView nameview;
    EditText nameipt;
    TextView phview;
    EditText phipt;
    TextView paxview;
    EditText paxipt;
    RadioButton smoking;
    RadioButton nosmoking;
    DatePicker dp;
    TimePicker tp;
    Button btnconfirm;
    Button btnreset;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameview = findViewById(R.id.textView2);
        nameipt = findViewById(R.id.editText);
        phview = findViewById(R.id.textView3);
        phipt = findViewById(R.id.editText2);
        paxview = findViewById((R.id.textView4));
        paxipt = findViewById(R.id.editText3);
        smoking = findViewById(R.id.radioButton);
        nosmoking = findViewById(R.id.radioButton2);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnconfirm = findViewById(R.id.button);
        btnreset = findViewById(R.id.button2);

        btnconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameIpt = nameipt.getText().toString();
                String phIpt = phipt.getText().toString();
                String paxIpt = paxipt.getText().toString();
                boolean smoke = smoking.isChecked();
                boolean nosmoke = nosmoking.isChecked();
                int day = dp.getDayOfMonth();
                int month = dp.getMonth();
                int year = dp.getYear();
                int hour = tp.getCurrentHour();
                int minute = tp.getCurrentMinute();

                String stringInputs = "Name: " + nameIpt + "\n" + "Phone number: " + phIpt + "\n" + "Date: " + day + "/" + (month + 1) + "/" + year + "\n" + "Time: " + hour + ":" + minute ;

                Toast.makeText(MainActivity.this, stringInputs, Toast.LENGTH_SHORT).show();
            }
            });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dp.updateDate(2020,6, 01);
                int hour = 19;
                int minute = 30;
                tp.setCurrentHour(19);
                tp.setCurrentMinute(30);
                nameipt.setText("");
                phipt.setText("");
                paxipt.setText("");
                smoking.setChecked(false);
                nosmoking.setChecked(false);




            }
        });
    }
}