package com.example.burgerrating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        ratingBar=findViewById(R.id.ratingBar);
    }
    public void submit(View view){
        float rating=ratingBar.getRating();
        if(rating<=1)
            textView.setText("Rating:" + rating + "\nPOOR: Lot's of effort needed");
        else if(rating>1 && rating<=2)
            textView.setText("Rating:" + rating + "\nWe are constantly try to improve");
        else if(rating>2 && rating<=3)
            textView.setText("Rating:" + rating + "\n Much work to be done");


        else if(rating>3 && rating<=4)
            textView.setText("Rating:" + rating + "\nFocus on certain area required");
        else if(rating>4 && rating<=4.5)
            textView.setText("Rating:" + rating + "\n Good");
        else if(rating>4.5 && rating<=5)
            textView.setText("Rating:" + rating + "\n Mission accomplished");




    }
}
