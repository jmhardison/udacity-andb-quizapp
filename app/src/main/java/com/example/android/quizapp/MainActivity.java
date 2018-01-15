package com.example.android.quizapp;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //GLOBALS
    int scoreOfTest = 0;
    int numberOfQuestions = 10;
    TypedArray arrayOfQuestionIDs;
    TypedArray allAnswersArrayIDs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);

        arrayOfQuestionIDs = getResources().obtainTypedArray(R.array.ll_questions);
        allAnswersArrayIDs = getResources().obtainTypedArray(R.array.listofallanswerarrays);

    }


    public void scoreButtonPressed(View view){
        //disable score button
        disableScoreButton();

        //score the answers
        scoreQuestions();

        //send some toast
        String toastText = getString(R.string.toast_score_message, scoreOfTest, numberOfQuestions);
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }

    public void resetButtonPressed(View view){
        //reset colors
        resetQuestionColor();

        //reset selected answers
        resetAllAnswers();

        //reset scoring
        scoreOfTest = 0;

        //enable score button
        enableScoreButton();


    }

    private void disableScoreButton(){
        Button scoreBtn = (Button)findViewById(R.id.btn_score);
        scoreBtn.setEnabled(false);
    }

    private void enableScoreButton(){
        Button scoreBtn = (Button)findViewById(R.id.btn_score);
        scoreBtn.setEnabled(true);
    }

    private void scoreQuestions(){

        for (int questionNumber = 1; questionNumber <= numberOfQuestions; questionNumber++) {
            //question 1
            if (questionNumber == 1) {
                // get resources
                boolean button1 = ((RadioButton) findViewById(R.id.rb_questions_1_answer1)).isChecked();
                boolean button2 = ((RadioButton) findViewById(R.id.rb_questions_1_answer2)).isChecked();
                boolean button3 = ((RadioButton) findViewById(R.id.rb_questions_1_answer3)).isChecked();
                boolean button4 = ((RadioButton) findViewById(R.id.rb_questions_1_answer4)).isChecked();

                //button1 is correct. 'container'
                if (button1 && !button2 && !button3 && !button4) {
                    scoreOfTest++;
                    setQuestionCorrectColor(R.id.ll_question_1);
                }
                else
                {
                    setQuestionWrongColor(R.id.ll_question_1);
                }
            }
            //question 2
            if (questionNumber == 2) {
                // get resources
                boolean button1 = ((RadioButton) findViewById(R.id.rb_questions_2_answer1)).isChecked();
                boolean button2 = ((RadioButton) findViewById(R.id.rb_questions_2_answer2)).isChecked();
                boolean button3 = ((RadioButton) findViewById(R.id.rb_questions_2_answer3)).isChecked();
                boolean button4 = ((RadioButton) findViewById(R.id.rb_questions_2_answer4)).isChecked();

                //button3 is correct. 'docker exec'
                if (!button1 && !button2 && button3 && !button4) {
                    scoreOfTest++;
                    setQuestionCorrectColor(R.id.ll_question_2);
                }
                else
                {
                    setQuestionWrongColor(R.id.ll_question_2);
                }
            }
            //question 3
            if (questionNumber == 3) {
                // get resource
                String answerText = ((EditText) findViewById(R.id.et_questions_3_answer)).getText().toString().toLowerCase();
                String correctText = getString(R.string.question3_correct_answer).toLowerCase();
                if(answerText.equals(correctText)){
                    scoreOfTest++;
                    setQuestionCorrectColor(R.id.ll_question_3);
                }
                else
                {
                    setQuestionWrongColor(R.id.ll_question_3);
                }
            }
            //question 4
            if (questionNumber == 4) {
                // get resources
                boolean button1 = ((RadioButton) findViewById(R.id.rb_questions_4_answer1)).isChecked();
                boolean button2 = ((RadioButton) findViewById(R.id.rb_questions_4_answer2)).isChecked();

                //button1 is correct. 'true'
                if (button1 && !button2) {
                    scoreOfTest++;
                    setQuestionCorrectColor(R.id.ll_question_4);
                }
                else
                {
                    setQuestionWrongColor(R.id.ll_question_4);
                }
            }
            //question 5
            if (questionNumber == 5) {
                // get resources
                boolean button1 = ((RadioButton) findViewById(R.id.rb_questions_5_answer1)).isChecked();
                boolean button2 = ((RadioButton) findViewById(R.id.rb_questions_5_answer2)).isChecked();
                boolean button3 = ((RadioButton) findViewById(R.id.rb_questions_5_answer3)).isChecked();
                boolean button4 = ((RadioButton) findViewById(R.id.rb_questions_5_answer4)).isChecked();

                //button1 is correct. 'moby'
                if (button1 && !button2 && !button3 && !button4) {
                    scoreOfTest++;
                    setQuestionCorrectColor(R.id.ll_question_5);
                }
                else
                {
                    setQuestionWrongColor(R.id.ll_question_5);
                }
            }
            //question 6
            if (questionNumber == 6) {
                // get resources
                boolean button1 = ((RadioButton) findViewById(R.id.rb_questions_6_answer1)).isChecked();
                boolean button2 = ((RadioButton) findViewById(R.id.rb_questions_6_answer2)).isChecked();
                boolean button3 = ((RadioButton) findViewById(R.id.rb_questions_6_answer3)).isChecked();
                boolean button4 = ((RadioButton) findViewById(R.id.rb_questions_6_answer4)).isChecked();

                //button3 is correct. 'backend secret storage'
                if (!button1 && !button2 && button3 && !button4) {
                    scoreOfTest++;
                    setQuestionCorrectColor(R.id.ll_question_6);
                }
                else
                {
                    setQuestionWrongColor(R.id.ll_question_6);
                }
            }
            //question 7
            if (questionNumber == 7) {
                // get resources
                boolean button1 = ((RadioButton) findViewById(R.id.rb_questions_7_answer1)).isChecked();
                boolean button2 = ((RadioButton) findViewById(R.id.rb_questions_7_answer2)).isChecked();

                //button1 is correct. 'true'
                if (button1 && !button2) {
                    scoreOfTest++;
                    setQuestionCorrectColor(R.id.ll_question_7);
                }
                else
                {
                    setQuestionWrongColor(R.id.ll_question_7);
                }
            }
            //question 8
            if (questionNumber == 8) {
                // get resources
                boolean button1 = ((RadioButton) findViewById(R.id.rb_questions_8_answer1)).isChecked();
                boolean button2 = ((RadioButton) findViewById(R.id.rb_questions_8_answer2)).isChecked();

                //button2 is correct. 'false'
                if (!button1 && button2) {
                    scoreOfTest++;
                    setQuestionCorrectColor(R.id.ll_question_8);
                }
                else
                {
                    setQuestionWrongColor(R.id.ll_question_8);
                }
            }
            //question 9
            if (questionNumber == 9) {
                // get resources
                boolean button1 = ((RadioButton) findViewById(R.id.rb_questions_9_answer1)).isChecked();
                boolean button2 = ((RadioButton) findViewById(R.id.rb_questions_9_answer2)).isChecked();
                boolean button3 = ((RadioButton) findViewById(R.id.rb_questions_9_answer3)).isChecked();
                boolean button4 = ((RadioButton) findViewById(R.id.rb_questions_9_answer4)).isChecked();

                //button4 is correct. 'LCoW'
                if (!button1 && !button2 && !button3 && button4) {
                    scoreOfTest++;
                    setQuestionCorrectColor(R.id.ll_question_9);
                }
                else
                {
                    setQuestionWrongColor(R.id.ll_question_9);
                }
            }
            //question 10
            if (questionNumber == 10) {
                // get resources
                boolean button1 = ((CheckBox) findViewById(R.id.cb_questions_10_answer1)).isChecked();
                boolean button2 = ((CheckBox) findViewById(R.id.cb_questions_10_answer2)).isChecked();
                boolean button3 = ((CheckBox) findViewById(R.id.cb_questions_10_answer3)).isChecked();
                boolean button4 = ((CheckBox) findViewById(R.id.cb_questions_10_answer4)).isChecked();

                //button1, 2 and 3 are correct. 'Windows, Linux, IBM-Z'
                if (button1 && button2 && button3 && !button4) {
                    scoreOfTest++;
                    setQuestionCorrectColor(R.id.ll_question_10);
                }
                else
                {
                    setQuestionWrongColor(R.id.ll_question_10);
                }
            }
        }

    }


    /**
     * resets all question backgrounds to blue
     */
    public void resetQuestionColor(){
        for(int i =0; i<numberOfQuestions; i++){

            int idOfQuestion = arrayOfQuestionIDs.getResourceId(i,0);
            if(idOfQuestion > 0) {
                //get LinearLayout question view.
                LinearLayout layoutToReset = (LinearLayout) findViewById(idOfQuestion);
                //change color back to normal rounded theme
                layoutToReset.setBackgroundResource(R.drawable.rounded_question);
            }
            else{
                //skip run should not be 0
                Log.e("resetQuestionColor", "idOfQuestion encountered a 0.");
            }
        }
    }

    /**
     * Sets specified question to wrong answer color.
     * @param questionID
     */
    public void setQuestionWrongColor(int questionID){
        //get LinearLayout question view.
        LinearLayout layoutToReset = (LinearLayout)findViewById(questionID);
        //change color back to normal rounded theme
        layoutToReset.setBackgroundResource(R.drawable.rounded_question_wronganswer);
    }

    /**
     * Sets specified question to correct answer color.
     * @param questionID
     */
    public void setQuestionCorrectColor(int questionID){
        //get LinearLayout question view.
        LinearLayout layoutToReset = (LinearLayout)findViewById(questionID);
        //change color back to normal rounded theme
        layoutToReset.setBackgroundResource(R.drawable.rounded_question_correctanswer);
    }


    /**
     * Loops through all questions, and then that questions answers, and based on type resets to unchecked, unselected, or default text.
     */
    public void resetAllAnswers(){
        //outer for is or num questions
        for(int i = 0; i<=numberOfQuestions; i++){
            int idOfQuestion = arrayOfQuestionIDs.getResourceId(i,0);

            //as long as ID is greater than 0, proceed as we have value from resources.
            if(idOfQuestion > 0) {
                //get id of answer array and then check if greater than 0
                int idOfAnswerArray = allAnswersArrayIDs.getResourceId(i,0);

                //as long as ID of answer array is greater than 0, proceed.
                if(idOfAnswerArray > 0) {
                    TypedArray answersForQuestion = getResources().obtainTypedArray(idOfAnswerArray);

                    for (int i2 = 0; i2 < answersForQuestion.length(); i2++) {
                        //get resource id for answer
                        int specificAnswerID = answersForQuestion.getResourceId(i2, 0);

                        //if specificAnswerID is greater than 0, proceed.
                        if(specificAnswerID > 0) {
                            //grab view by specificAnswerID as type View.
                            View holdAnswerView = findViewById(specificAnswerID);

                            //based on the type view is reported as, set it's default state while casting.
                            if (holdAnswerView instanceof RadioButton) {
                                ((RadioButton) holdAnswerView).setChecked(false);
                            } else if (holdAnswerView instanceof CheckBox) {
                                ((CheckBox) holdAnswerView).setChecked(false);
                            } else if (holdAnswerView instanceof EditText) {
                                ((EditText) holdAnswerView).setText(R.string.questions_generic_edittextplaceholder);
                            }
                        }
                        else{
                            //do nothing as it should not be 0
                            Log.e("resetAllAnswers", "specificAnswerID encountered a 0.");
                        }
                    }
                }
                else {
                    // again, should not be 0 so skip run.
                    Log.e("resetAllAnswers", "idOfAnswerArray encountered a 0.");
                }

            }
            else{
                //skip run should not be 0
                Log.e("resetAllAnswers", "idOfQuestion encountered a 0.");
            }
        }
    }

}
