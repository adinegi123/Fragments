package com.example.myapplicationfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_signin,btn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_signin=findViewById(R.id.sign_in);
        btn_signup=findViewById(R.id.sign_up);
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.holder,new Sign_infragment()).addToBackStack(null).commit();
            }
        });
      btn_signup.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              FragmentManager fm=getSupportFragmentManager();
              getSupportFragmentManager().beginTransaction().replace(R.id.holder,new Signup_fragment()).addToBackStack(null).commit();

          }
      });
    }

}
