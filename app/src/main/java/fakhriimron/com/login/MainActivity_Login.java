package fakhriimron.com.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity_Login extends AppCompatActivity {
    private Button bt1;
    private EditText et1, et2, et3, et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__login);

        bt1 = (Button) findViewById(R.id.tv_pass);
        et1 = (EditText) findViewById(R.id.et_username);
        et2 = (EditText) findViewById(R.id.b_Pass);
        et3 = (EditText) findViewById(R.id.ET_first_name);
        et4 = (EditText) findViewById(R.id.ET_last_name);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String et_1 = et1.getText().toString();
                String et_2 = et2.getText().toString();
                String et_3 = et3.getText().toString();
                String et_4 = et4.getText().toString();
                if (et_1.isEmpty()) {
                    et1.setError("first name harus diisi");
                    et1.requestFocus();
                    Toast.makeText(getApplicationContext(), "first name harap diisi", Toast.LENGTH_SHORT).show();
                } else if (et_2.isEmpty()) {
                    et2.setError("last name harus diisi");
                    et2.requestFocus();
                    Toast.makeText(getApplicationContext(), "last name harap diisi", Toast.LENGTH_SHORT).show();
                } else if ((et_3.isEmpty())) {
                    et3.setError("username harus diisi");
                    et3.requestFocus();
                    Toast.makeText(getApplicationContext(), "Username belum diisi", Toast.LENGTH_SHORT).show();
                } else if (et_4.isEmpty()) {
                    et4.setError("password harus diisi");
                    et4.requestFocus();
                    Toast.makeText(getApplicationContext(), "Password belum diisi", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Sukses", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
