package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView OnCreate,OnStart,OnResume,OnRestart;
    private Button btnStartActivityTwo;
    private int create,start,resume,restart=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        create++;
        OnCreate=findViewById(R.id.OnCreate);
        OnCreate.setText("OnCreate Calls"+create);
        Log.i("ActivityLifeCycle","OnCreate is called");
        btnStartActivityTwo=findViewById(R.id.btnStartActivityTwo);
        btnStartActivityTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    protected void onStart(){               // OnStart Method
        super.onStart();
        start++;
        OnStart=findViewById(R.id.OnStart);
        OnStart.setText("Onstart() Calls:"+start);
        Log.i("ActivityLifeCycle","OnStart method is called");
    }
    protected void onResume(){          // OnResume method
        super.onResume();
        resume++;
        OnResume=findViewById(R.id.OnResume);
        OnResume.setText("OnResume() Calls:"+resume);
        Log.i("ActivityLifeCycle","OnResume method is called");
    }
    protected void onRestart(){          // OnRestart method
        super.onRestart();
        restart++;
        OnRestart=findViewById(R.id.OnRestart);
        OnRestart.setText("OnRestart() Calls:"+restart);
        Log.i("ActivityLifeCycle","OnRestart method is called");
    }
    protected void onPause(){           // OnPause method
        super.onPause();
        Log.i("ActivityLifeCycle","OnPause is called");
    }
    protected void onStop(){            // OnStop method
        super.onStop();
        Log.i("ActivityLifeCycle","OnStop is called");
    }
    protected void onDestroy(){         // OnDestroy method
        super.onDestroy();
        Log.i("ActivityLifeCycle","OnDestroy is called");
    }
}