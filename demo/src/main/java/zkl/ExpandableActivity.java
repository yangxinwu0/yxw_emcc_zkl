package lt.lemonlabs.android.samples.zkl;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

import lt.lemonlabs.android.expandablebuttonmenu.ExpandableButtonMenu;
import lt.lemonlabs.android.expandablebuttonmenu.ExpandableMenuOverlay;

public class ExpandableActivity extends ActionBarActivity {



    private ExpandableMenuOverlay menuOverlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expandablemenu_layout);

        menuOverlay = (ExpandableMenuOverlay) findViewById(R.id.button_menu);

        menuOverlay.setOnMenuButtonClickListener(new ExpandableButtonMenu.OnMenuButtonClick() {
            @Override
            public void onClick(ExpandableButtonMenu.MenuButton action) {
                switch (action) {
                    case MID:
                        Toast.makeText(ExpandableActivity.this, "Mid pressed and dismissing...", Toast.LENGTH_SHORT).show();
                        menuOverlay.getButtonMenu().toggle();
                        break;
                    case LEFT:
                        Toast.makeText(ExpandableActivity.this, "Left pressed", Toast.LENGTH_SHORT).show();
                        break;
                    case RIGHT:
                        Toast.makeText(ExpandableActivity.this, "Right pressed", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }

}
