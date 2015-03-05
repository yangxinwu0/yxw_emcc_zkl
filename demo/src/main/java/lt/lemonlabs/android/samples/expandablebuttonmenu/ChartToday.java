package lt.lemonlabs.android.samples.expandablebuttonmenu;

import android.app.Activity;
import android.os.Bundle;

import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;

/**
 * Created by Administrator on 2015/3/4.
 */
public class ChartToday extends Activity{
    RoundCornerProgressBar progress_myDream,progress_myNecessary,progress_myWaste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zkl_chart);
        progress_myDream= (RoundCornerProgressBar) findViewById(R.id.progress_myDream);
        progress_myNecessary=(RoundCornerProgressBar) findViewById(R.id.progress_myNecessary);
        progress_myWaste= (RoundCornerProgressBar) findViewById(R.id.progress_myWaste);

        progress_myDream.setBackgroundColor(getResources().getColor(R.color.custom_progress_my_background));
        progress_myNecessary.setBackgroundColor(getResources().getColor(R.color.custom_progress_my_background));
        progress_myWaste.setBackgroundColor(getResources().getColor(R.color.custom_progress_my_background));

        progress_myDream.setProgress(10);
        progress_myNecessary.setProgress(8);
        progress_myWaste.setProgress(5);

        progress_myDream.setProgressColor(getResources().getColor(R.color.custom_progress_myDream));
        progress_myNecessary.setProgressColor(getResources().getColor(R.color.custom_progress_myNecessary));
        progress_myWaste.setProgressColor(getResources().getColor(R.color.custom_progress_myWaste));
    }
}
