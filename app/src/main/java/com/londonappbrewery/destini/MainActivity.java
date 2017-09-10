package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    Button btnAns1;
    Button btnAns2;
    TextView txtStory;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        btnAns1 = (Button) findViewById(R.id.buttonTop);
        btnAns2 = (Button) findViewById(R.id.buttonBottom);
        txtStory = (TextView) findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        btnAns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    txtStory.setText(R.string.T3_Story);
                    btnAns1.setText(R.string.T3_Ans1);
                    btnAns2.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3) {
                    txtStory.setText(R.string.T6_End);
                    btnAns1.setVisibility(View.GONE);
                    btnAns2.setVisibility(View.GONE);
                }
            }
        });
        btnAns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    txtStory.setText(R.string.T2_Story);
                    btnAns1.setText(R.string.T2_Ans1);
                    btnAns2.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    txtStory.setText(R.string.T4_End);
                    btnAns1.setVisibility(View.GONE);
                    btnAns2.setVisibility(View.GONE);
                }
                else if (mStoryIndex == 3) {
                    txtStory.setText(R.string.T5_End);
                    btnAns1.setVisibility(View.GONE);
                    btnAns2.setVisibility(View.GONE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

    }
}