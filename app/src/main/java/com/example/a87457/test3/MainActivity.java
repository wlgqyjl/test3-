package com.example.a87457.test3;


        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.content.Intent;
        import android.net.Uri;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

        import java.net.URL;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText e1;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent i=new Intent();
                // i.setAction(Intent.ACTION_VIEW);
                // Uri ur1=Uri.parse(String.valueOf(e1));
                //i.setData(ur1);
                //startActivity(i);
                // String q= String.valueOf(e1);
                e1=(EditText)findViewById(R.id.url);
                final String ur1 =e1.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(ur1));
                startActivity(intent);
            }
        });
    }
}

