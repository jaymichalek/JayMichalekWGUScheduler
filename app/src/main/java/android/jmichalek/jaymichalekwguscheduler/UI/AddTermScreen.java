package android.jmichalek.jaymichalekwguscheduler.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.jmichalek.jaymichalekwguscheduler.R;
import android.os.Bundle;
import android.view.MenuItem;

public class AddTermScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_term_screen);

        // Allows user to switch back to previous screen & retain information.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    /* This method enables user to switch back to previous screen.*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //TODO Add action bar, back button that retains previous info, design screen

}