package com.example.project;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


public class QuizHelper6 extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Programming.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public QuizHelper6(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public QuizHelper6(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        Question q1 = new Question(

                "What is the output of the following code snippet?" +
                "#include <stdio.h>\n" +
                "\n" +
                "int main() {\n" +
                "    int x = 5;\n" +
                "    printf(\"%d\", x);\n" +
                "    return 0;\n" +
                "}", "Garbage value", "5", "0", 2);
        addQuestion(q1);
        Question q2 = new Question(
                "Which of the following is the correct syntax for a class declaration in C++?", "class MyClass { };", "struct MyClass { };", "class MyClass : public BaseClass { };", 1);
        addQuestion(q2);
        Question q3 = new Question(
                "What is the output of the following code snippet?" +
                "public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        int x = 5;\n" +
                "        System.out.println(x++);\n" +
                "    }\n" +
                "}", "4", "5", "0", 2);
        addQuestion(q3);
        Question q4 = new Question(
                "What is the output of the following code snippet?" +
                "#include <stdio.h>\n" +
                "\n" +
                "int main() {\n" +
                "    int i;\n" +
                "    for (i = 0; i < 5; i++) {\n" +
                "        printf(\"%d \", i);\n" +
                "    }\n" +
                "    return 0;\n" +
                "}", "0 1 2 3 4", "1 2 3 4 5", "0 1 2 3", 1);
        addQuestion(q4);
        Question q5 = new Question(
                "What is the difference between the == operator and the equals() method in Java when comparing objects?", "  The == operator compares the values of objects, while equals() compares their references.", "  The == operator compares the values of objects, while equals() compares their references.", "The == operator and equals() method are used interchangeably to compare objects.", 2);
        addQuestion(q5);
    }

    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuizContract.QuestionsTable.TABLE_NAME, null, cv);
    }

    @SuppressLint("Range")
    public List<Question> getAllQuestions() {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question("Question 1", "Option 1", "Option 2", "Option 3", "Option 4", 1);
                question.setQuestion(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}