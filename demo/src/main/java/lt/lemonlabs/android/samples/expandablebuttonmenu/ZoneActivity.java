package lt.lemonlabs.android.samples.expandablebuttonmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


/**
 * @author Adil Soomro
 *
 */
public class ZoneActivity extends Activity {
	TextView titleName;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zone_actvity);        
        titleName=(TextView) findViewById(R.id.title);
        titleName.setText("精英圈");
    }

}
