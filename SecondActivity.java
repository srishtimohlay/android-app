package com.example.myapp;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class secondActivity extends AppCompatActivity {
private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
private TextView mScoreView;
private TextView mQuestionView;
private Button mButtonChoice1;
private Button mButtonChoice2;
private Button mButtonChoice3;
private Button mButtonChoice4;
private Button quit1;
private String mAnswer;
private int mScore = 0;
private int mQuestionNumber = 0;
@Override
public boolean onCreateOptionsMenu(Menu menu) {
MenuInflater inflater=getMenuInflater();
inflater.inflate(R.menu.menu1,menu);
return true;
}
@Override
public boolean onOptionsItemSelected(@NonNull MenuItem item) {

switch (item.getItemId()) {
case R.id.item1: {
Intent i = new Intent(getApplicationContext(), about.class);
startActivity(i);
}
case R.id.item2: {
Intent i = new Intent(getApplicationContext(), about.class);
startActivity(i);
}
case R.id.item3: {
AlertDialog.Builder builder = new
AlertDialog.Builder(secondActivity.this);
builder.setMessage("Do you want to Exit?");
builder.setCancelable(true);
builder.setNegativeButton("Yes", new
DialogInterface.OnClickListener() {
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
AlertDialog alertDialog = builder.create();
alertDialog.show();
}
return true;
}
return super.onOptionsItemSelected(item);
}
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_second);
mScoreView = (TextView) findViewById(R.id.score);
mQuestionView = (TextView) findViewById(R.id.question);
mButtonChoice1 = (Button) findViewById(R.id.choice1);
mButtonChoice2 = (Button) findViewById(R.id.choice2);
mButtonChoice3 = (Button) findViewById(R.id.choice3);
mButtonChoice4= (Button) findViewById(R.id.choice4);
quit1=findViewById(R.id.quit);
updateQuestion();
TextView textView=(TextView)findViewById(R.id.DispName);
Intent intent = getIntent();
String name= intent.getStringExtra("myname");
if (name.equals(""))
{

textView.setText("Hello User");
}
else
{
textView.setText("Hello "+name);
}

quit1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Intent i=new Intent(getApplicationContext(),MainActivity.class);
startActivity(i);
}
});
//Start of Button Listener for Button1
mButtonChoice1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
//My logic for Button goes in here
if (mButtonChoice1.getText() == mAnswer) {
mScore = mScore + 1;
updateScore(mScore);
updateQuestion();
//This line of code is optiona
Toast.makeText(secondActivity.this, "correct",

Toast.LENGTH_SHORT).show();
} else {
Toast.makeText(secondActivity.this, "wrong",
Toast.LENGTH_SHORT).show();
updateQuestion();
}
}
});
//End of Button Listener for Button1
//Start of Button Listener for Button2
mButtonChoice2.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
//My logic for Button goes in here
if (mButtonChoice2.getText() == mAnswer) {
mScore = mScore + 1;
updateScore(mScore);
updateQuestion();
//This line of code is optiona
Toast.makeText(secondActivity.this, "correct",

Toast.LENGTH_SHORT).show();
} else {

Toast.makeText(secondActivity.this, "wrong",
Toast.LENGTH_SHORT).show();
updateQuestion();
}
}
});
//End of Button Listener for Button2
//Start of Button Listener for Button3
mButtonChoice3.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
//My logic for Button goes in here
if (mButtonChoice3.getText() == mAnswer) {
mScore = mScore + 1;
updateScore(mScore);
updateQuestion();
//This line of code is optiona
Toast.makeText(secondActivity.this, "correct",

Toast.LENGTH_SHORT).show();
} else {
Toast.makeText(secondActivity.this, "wrong",
Toast.LENGTH_SHORT).show();
updateQuestion();
}
}
});
mButtonChoice4.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
//My logic for Button goes in here
if (mButtonChoice4.getText() == mAnswer) {
mScore = mScore + 1;
updateScore(mScore);
updateQuestion();
//This line of code is optiona
Toast.makeText(secondActivity.this, "correct",

Toast.LENGTH_SHORT).show();
} else {
Toast.makeText(secondActivity.this, "wrong",
Toast.LENGTH_SHORT).show();
updateQuestion();
}
}
});
//End of Button Listener for Button3

}
private void updateQuestion() {
mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
mQuestionNumber++;
}
private void updateScore(int point) {
mScoreView.setText("" + mScore);
}
}
