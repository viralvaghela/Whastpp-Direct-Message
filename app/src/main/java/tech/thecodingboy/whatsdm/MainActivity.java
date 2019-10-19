package tech.thecodingboy.whatsdm;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends Activity {

    EditText no,message;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send=(Button)findViewById(R.id.btnSend);
        no=(EditText)findViewById(R.id.edtNo);
        message=(EditText)findViewById(R.id.edtMessage);


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg=message.getText().toString();
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://api.whatsapp.com/send?phone="+no.getText().toString()+"&text="+msg
                        )));
            }
        });

    }
}
