package col.lospepes.loginxd;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Usuario on 13/01/2018.
 */

public class BotonesButter extends AppCompatActivity {

    @BindView(R.id.iv_and)
    ImageView ivAnd;
    @BindView(R.id.et_mail)
    EditText etMail;
    @BindView(R.id.et_pass)
    EditText etPass;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_fb)
    Button btnFb;
    @BindView(R.id.tv_text)
    TextView tvText;
    @BindView(R.id.btn_register)
    Button btnRegister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_login, R.id.btn_fb, R.id.btn_register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                //Toast.makeText(this, "login", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(this,activity2.class);
                intent.putExtra("nombre", "ANDRE");

                startActivity(intent);



                break;
            case R.id.btn_fb:Toast.makeText(this, "facebook", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_register: Toast.makeText(this, "registrado", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
