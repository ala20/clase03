package col.lospepes.loginxd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Usuario on 13/01/2018.
 */

public class Botonesactivity extends AppCompatActivity {

    TextView tvtext;
    Button btnregister, btnfb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvtext=findViewById(R.id.tv_text);
        btnregister= findViewById(R.id.btn_register);
        btnfb=findViewById(R.id.btn_fb);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtext.setText("Ingreso con facebook");
            }
        });


    }


}
