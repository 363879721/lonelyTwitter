package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {
    //we can convert the field to a local variable. we don't need to declare it since only this class uses it.
    //private TextView detailView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        TextView detailView = (TextView) findViewById(R.id.textView);
        String s = getIntent().getStringExtra("data");
        detailView.setText(s);
    }
}
