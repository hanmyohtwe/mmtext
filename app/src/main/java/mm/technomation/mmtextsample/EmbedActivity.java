package mm.technomation.mmtextsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import mm.technomation.mmtext.mmtext;

public class EmbedActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_embed);
    /*
    your code
     */

    //use mmtext.prepareActivity() on last line of onCreate()
    mmtext.prepareActivity(this, mmtext.TEXT_UNICODE, true, true);
  }

}
