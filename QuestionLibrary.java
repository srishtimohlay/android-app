package com.example.myapp;
public class QuestionLibrary {
private String mQuestions [] = {
"Which method can be defined only once in a program?",
"Which of these is not a bitwise operator?",
"Which keyword is used by method to refer to the object that invoked
it?",
"Which of these keywords is used to define interfaces in Java?",
"Which of these access specifiers can be used for an interface?",
"Which of the following is correct way of importing an entire package
‘pkg’?",
"What is the return type of Constructors?",
"Which of the following package stores all the standard java classes?",

"Which of these method of class String is used to compare two String
objects for their equality?",
"An expression involving byte, int, & literal numbers is promoted to
which of these?"
};
private String mChoices [][] = {
{"finalize method","main method","static method","private method"},
{"&","&=","|=","<="},
{"import","this","catch","abstract"},
{"Interface","interface","intf","Intf"},
{"public","protected","private","All of the mentioned"},
{"Import pkg.","import pkg.*","Import pkg.*","import pkg."},
{"int","float","void","None of the mentioned"},
{"lang","java","util","java.packages"},
{"equals()","Equals()","isequal()","Isequal()"},
{"int","long","byte","float"}
};

private String mCorrectAnswers[] = {"main
method","<=","this","interface","public","import pkg.*","None of the mentioned",
"java","equals()","int"};

public String getQuestion(int a) {
String question = mQuestions[a];
return question;
}
public String getChoice1(int a) {
String choice0 = mChoices[a][0];
return choice0;
}
public String getChoice2(int a) {
String choice1 = mChoices[a][1];
return choice1;
}
public String getChoice3(int a) {
String choice2 = mChoices[a][2];
return choice2;
}
public String getChoice4(int a) {
String choice3 = mChoices[a][3];
return choice3;
}

public String getCorrectAnswer(int a) {
String answer = mCorrectAnswers[a];
return answer;
}
}
