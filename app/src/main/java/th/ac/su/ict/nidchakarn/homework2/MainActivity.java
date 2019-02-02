package th.ac.su.ict.nidchakarn.homework2;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView edtInput;
    private Button buttoninput1;
    private Button buttoninput;
    private Button buttoninput2;
    private Button buttoninput3;
    private Button buttoninput4;
    private Button buttoninput5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtInput = findViewById(R.id.v1);
        buttoninput = findViewById(R.id.b1);
        buttoninput1 = findViewById(R.id.b2);
        buttoninput2 = findViewById(R.id.b3);
        buttoninput3 = findViewById(R.id.b4);
        buttoninput4 = findViewById(R.id.b5);
        buttoninput5 = findViewById(R.id.b6);

        buttoninput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setBackgroundColor(Color.rgb(233,225,222));
                edtInput.setText("233-225-222");

            }
        });
        buttoninput1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setBackgroundColor(Color.rgb(231,204,203));
                edtInput.setText("231-204-203");

            }
        });
        buttoninput2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setBackgroundColor(Color.rgb(119,131,154));
                edtInput.setText("119-131-154");

            }
        });
        buttoninput3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setBackgroundColor(Color.rgb(156,169,189));
                edtInput.setText("156-169-189");

            }
        });
        buttoninput4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setBackgroundColor(Color.rgb(196,204,212));
                edtInput.setText("196-294-212");

            }
        });
        buttoninput5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setBackgroundColor(Color.rgb(222,226,229));
                edtInput.setText("222-226-229");

            }
        });



    }
    }






