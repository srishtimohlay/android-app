package com.example.myapp;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
Button startbtn;
EditText nametext;
@Override
public boolean onCreateOptionsMenu(Menu menu) {
MenuInflater inflater=getMenuInflater();
inflater.inflate(R.menu.menu1,menu);
return true;
}
@Override
public boolean onOptionsItemSelected(@NonNull MenuItem item) {
switch (item.getItemId())
{
case R.id.item1:
{
Intent i=new Intent(getApplicationContext(),about.class);
startActivity(i);
}
case R.id.item2:
{
Intent i=new Intent(getApplicationContext(),about.class);
startActivity(i);
}
case R.id.item3:
{
AlertDialog.Builder builder=new

AlertDialog.Builder(MainActivity.this);
builder.setMessage("Do you want to Exit?");
builder.setCancelable(true);
builder.setNegativeButton("Yes", new DialogInterface.OnClickListener()
{
@Override

public void onClick(DialogInterface dialog, int which) {

finish();
}
});
builder.setPositiveButton("No", new DialogInterface.OnClickListener()
{
@Override

public void onClick(DialogInterface dialog, int which) {

dialog.cancel();
}
});
AlertDialog alertDialog=builder.create();
alertDialog.show();
}
return true;
}

return super.onOptionsItemSelected(item);
}
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
startbtn=findViewById(R.id.start);
nametext=findViewById(R.id.edit1);
startbtn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
String name=nametext.getText().toString();
Intent intent=new
Intent(getApplicationContext(),secondActivity.class);
intent.putExtra("myname",name);
startActivity(intent);
}
});
}
}
