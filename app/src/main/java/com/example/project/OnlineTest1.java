package com.example.project;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OnlineTest1 extends AppCompatActivity {
    private TextView timerText;
    private TextView questionText;
    private RadioGroup optionsRadioGroup;
    private Button nextButton;
    private Button prevButton;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis = 300000; // 5 minutes
    private int currentQuestionIndex = 0;
    private List<Question> questions;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_test1);

        timerText = findViewById(R.id.timer_text);
        questionText = findViewById(R.id.question_text);
        optionsRadioGroup = findViewById(R.id.options_radio_group);
        nextButton = findViewById(R.id.next_button);
        prevButton = findViewById(R.id.prev_button);

        setupQuestions();
        showNextQuestion();

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (optionsRadioGroup.getCheckedRadioButtonId() != -1) {
                    checkAnswer();
                } else {
                    Toast.makeText(OnlineTest1.this, "Please select an answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPreviousQuestion();
            }
        });

        startTimer();
    }

    private void setupQuestions() {
        questions = new ArrayList<>();
        // Add your questions and their options here
        // Example:
        Question question1 = new Question("Question:1\n" +
                "A car travels a distance of 500 km at a constant speed. If the speed of the car is increased by 20 km/h, the same distance can be covered in 4 hours less. Find the original speed of the car.", " 40 km/h", "60 km/h", "80 km/h", "100 km/h", " 60 km/h");
        questions.add(question1);

        Question question2 = new Question("Question:2\n" +
                "#include <stdio.h>\n" +
                "\n" +
                "int main() {\n" +
                "   int i = 5;\n" +
                "   int j = i++;\n" +
                "   printf(\"%d %d\", i, j);\n" +
                "   return 0;\n" +
                "}" +
                "What is the output of the following C code?", "55", "66", "65", "56", "65");
        questions.add(question2);

        Question question3 = new Question("Question:3\n" +
                "#include <stdio.h>\n" +
                "\n" +
                "int main() {\n" +
                "   int i = 5;\n" +
                "   int j = i++;\n" +
                "   printf(\"%d %d\", i, j);\n" +
                "   return 0;\n" +
                "}" +
                "What is the output of the following C code?", "55", "66", "65", "56", "65");
        questions.add(question3);

        Question question4 = new Question("Question:4\n" +
                "Which of the following is the primary key in a database table?\n", " Unique identifier for each row in the table", "A column with unique values in the table", "A column that stores integers only", "A column that stores strings only", "A column with unique values in the table");
        questions.add(question4);


        Question question5 = new Question("Question:5\n" +
                "Which of the following is NOT a valid data type in Python?", "int", "float", "string", " boolean", " boolean");
        questions.add(question5);


        Question question6 = new Question("Question:6\n" +
                "If a car travels at a speed of 60 km/h for 4 hours, how far will it have traveled?", "120 km", "180 km", "240 km", "300 km", "240 km");
        questions.add(question6);



        Question question7 = new Question("Question:7\n" +
                "What is the output of the following Java code snippet?public class Main {\n" +
                "   public static void main(String[] args) {\n" +
                "      int x = 10;\n" +
                "      int y = x++ + ++x;\n" +
                "      System.out.println(y);\n" +
                "   }\n" +
                "}" +
                "", "20", "21", "22", "23", "23");
        questions.add(question7);


        Question question8 = new Question("Question:8\n" +
                "Choose the word that is most similar in meaning to the given word:\n" +
                "Diligent", "Lazy", "Hardworking", "Careless", "Indifferent", "Hardworking");
        questions.add(question8);

        Question question9 = new Question("Question:9\n" +
                "Which SQL keyword is used to retrieve data from a database table?", "INSERT", " UPDATE", "SELECT", "DELETE", "SELECT");
        questions.add(question9);

        Question question10 = new Question("Question:10\n" +
                "Which of the following is true about static variables in Java?", "Static variables are initialized when an instance of the class is created.", " Static variables can be accessed only within the same class.", "Static variables are stored on the stack.", "Static variables are shared among all instances of the class.", "Static variables are shared among all instances of the class.");
        questions.add(question10);


        Question question11= new Question("Question:11\n" +
                "Choose the word that best completes the sentence:\n" +
                "She is an ___________ singer, known for her powerful and soulful voice.", "adept", "aspiring", " accomplished", "ambiguous", " accomplished");
        questions.add(question11);


        Question question12 = new Question("Question:12\n" +
                "If a box contains 24 red balls and 16 blue balls, what is the probability of drawing a red ball at random from the box?", "0.40", "0.60", "0.64", "0.80", "0.60");
        questions.add(question12);

        Question question13 = new Question("Question:13\n" +
                "What is the purpose of the \"super\" keyword in Java?", "It is used to access the superclass's constructor.", "It is used to call a method defined in the superclass.", "It is used to override a method in the superclass.", " It is used to define a new instance of the superclass.", "It is used to call a method defined in the superclass");
        questions.add(question13);

        Question question14 = new Question("Question:14\n" +
                "Choose the word that is most nearly opposite in meaning to the given word:" +
                "Vulnerable", "Invincible", "Resilient", "Secure", "Defiant", "Invincible");
        questions.add(question14);

        Question question15 = new Question("Question:15\n" +
                "Which of the following statements about the \"switch\" statement in C++ is true?", " The \"switch\" statement can only be used with integer types.", "The \"switch\" statement can be used with floating-point numbers.", "The \"switch\" statement cannot have a default case.", " The \"switch\" statement evaluates multiple conditions.", "The \"switch\" statement can only be used with integer types.");
        questions.add(question15);


        // Add more questions as needed
    }

    private void showNextQuestion() {
        if (currentQuestionIndex < questions.size()) {
            Question currentQuestion = questions.get(currentQuestionIndex);
            questionText.setText(currentQuestion.getQuestion());
            optionsRadioGroup.clearCheck();

            RadioButton option1 = findViewById(R.id.option1);
            RadioButton option2 = findViewById(R.id.option2);
            RadioButton option3 = findViewById(R.id.option3);
            RadioButton option4 = findViewById(R.id.option4);

            option1.setText(currentQuestion.getOption1());
            option2.setText(currentQuestion.getOption2());
            option3.setText(currentQuestion.getOption3());
            option4.setText(currentQuestion.getOption4());

            currentQuestionIndex++;

            // Enable or disable previous button based on the current question index
            prevButton.setEnabled(currentQuestionIndex > 1);
        } else {
            finishQuiz();
        }
    }

    private void showPreviousQuestion() {
        if (currentQuestionIndex > 1) {
            currentQuestionIndex -= 2; // Go back to the previous question
            showNextQuestion();
        }
    }

    private void checkAnswer() {
        int selectedOptionId = optionsRadioGroup.getCheckedRadioButtonId();
        RadioButton selectedOption = findViewById(selectedOptionId);
        String selectedAnswer = selectedOption.getText().toString().trim();

        Question currentQuestion = questions.get(currentQuestionIndex - 1);
        String correctAnswer = currentQuestion.getCorrectAnswer();

        if (selectedAnswer.equals(correctAnswer)) {
            // User selected the correct answer
            score++;
            Toast.makeText(this, "Marked!", Toast.LENGTH_SHORT).show();
        } else {
            // User selected the wrong answer
            Toast.makeText(this, "Marked!", Toast.LENGTH_SHORT).show();
        }

        showNextQuestion();
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateTimerText();
            }

            @Override
            public void onFinish() {
                finishQuiz();
            }
        };

        countDownTimer.start();
    }

    private void updateTimerText() {
        long minutes = TimeUnit.MILLISECONDS.toMinutes(timeLeftInMillis);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(timeLeftInMillis) - TimeUnit.MINUTES.toSeconds(minutes);
        String timeFormatted = String.format("%02d:%02d", minutes, seconds);
        timerText.setText(timeFormatted);
    }

    private void finishQuiz() {
        countDownTimer.cancel();
        Toast.makeText(this, "Test Finished!", Toast.LENGTH_SHORT).show();

        // Calculate the user's score percentage
        int totalQuestions = questions.size();
        int scorePercentage = (score * 100) / totalQuestions;

        // Display the result
        String resultText = "Score: " + score + "/" + totalQuestions + "\nPercentage: " + scorePercentage + "%";
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Test Result")
                .setMessage(resultText)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Close the activity or navigate to another screen
                        finish();
                    }
                })
                .setCancelable(false)
                .show();
    }



    public class Question {
        private String question;
        private String option1;
        private String option2;
        private String option3;
        private String option4;
        private String correctAnswer;

        public Question(String question, String option1, String option2, String option3, String option4,String correctAnswer) {
            this.question = question;
            this.option1 = option1;
            this.option2 = option2;
            this.option3 = option3;
            this.option4 = option4;
            this.correctAnswer = correctAnswer;
        }

        public String getQuestion() {
            return question;
        }

        public String getOption1() {
            return option1;
        }

        public String getOption2() {
            return option2;
        }

        public String getOption3() {
            return option3;
        }

        public String getOption4() {
            return option4;
        }

        public String getCorrectAnswer() {
            return correctAnswer;
        }
    }

}
