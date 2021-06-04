package com.example.myapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;
import java.util.Objects;
public class MainActivity extends AppCompatActivity {
EditText user,password;
Button b1;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
user=findViewById(R.id.edit1);
password=findViewById(R.id.edit2);
b1=findViewById(R.id.btn1);
b1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
if(Objects.equals(user.getText().toString(),"User")&&
Objects.equals(password.getText().toString(),"1234"))
{
Toast.makeText(MainActivity.this,
"You have aunthenticated successfully",

Toast.LENGTH_LONG).show();

}
else
{
Toast.makeText(MainActivity.this,
"Incorrect Infromation",Toast.LENGTH_LONG).show();
}
Intent i =new Intent(getApplicationContext(),second.class);
startActivity(i);
}
});
}
}
