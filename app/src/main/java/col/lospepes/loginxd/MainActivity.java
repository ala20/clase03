package col.lospepes.loginxd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvtext;
    Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvtext=findViewById(R.id.tv_text);
        btnregister= findViewById(R.id.btn_register);
        btnregister.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        tvtext.setText("REGISTERED");

    }
}
