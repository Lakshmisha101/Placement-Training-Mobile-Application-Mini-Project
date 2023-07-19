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


public class QuizHelper1 extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "DataInterpretation.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public QuizHelper1(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public QuizHelper1(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
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
        Question q1 = new Question("In a class of 30 students, the teacher recorded the scores of a recent test. The average score was 75. If 5 students scored 90 or above, 10 students scored between 80 and 89, and the rest scored below 80, how many students scored below 80?", "10", "12", "15", 3);
        addQuestion(q1);
        Question q2 = new Question(" A bookstore conducted a survey to determine the preferred genres of its customers. Out of 200 participants, 80% preferred fiction, 15% preferred non-fiction, and the remaining participants preferred mystery novels. How many participants preferred mystery novels?", "20", "25", "30", 1);
        addQuestion(q2);
        Question q3 = new Question("A bakery sells three types of cakes: chocolate, vanilla, and strawberry. On a particular day, the bakery sold a total of 150 cakes. The chocolate cake sales accounted for 40% of the total sales, while the vanilla cake sales accounted for 30% of the total sales. What percentage of cakes were strawberry flavored?", "10%", "30%", "20%", 2);
        addQuestion(q3);
        Question q4 = new Question("A survey was conducted among 500 people to determine their preferred mode of transportation. The results showed that 40% preferred cars, 30% preferred public transportation, and the remaining participants preferred bicycles. How many people preferred bicycles?", "70", "90", "100", 3);
        addQuestion(q4);
        Question q5 = new Question("A shop offers a discount of 20% on all items. If a customer purchases an item originally priced at $80, how much money will they save?", " $8", " $12", "$16", 3);
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