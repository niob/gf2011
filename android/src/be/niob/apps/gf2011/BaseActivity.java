package be.niob.apps.gf2011;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.markupartist.android.widget.ActionBar;
import com.markupartist.android.widget.ActionBar.IntentAction;

public abstract class BaseActivity extends Activity {
	
	protected ActionBar actionBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(getLayoutId());
		initActionBar();
		findAndSetupViews();
	}
	
	protected abstract int getLayoutId();
	
	protected void findAndSetupViews() {
		
	}
	
	public void initActionBar() { 
    	actionBar = (ActionBar) findViewById(R.id.actionbar);
    	if (actionBar != null) {
	    	actionBar.setTitle(R.string.app_name);
	    	actionBar.setHomeAction(new IntentAction(this, new Intent(this, HomeActivity.class), R.drawable.ic_title_home));
	    	//actionBar.addAction(new IntentAction(this, new Intent(this, DaysActivity.class), R.drawable.ic_title_today));
	    	actionBar.addAction(new IntentAction(this, new Intent(this, DaysActivity.class), R.drawable.ic_title_search));
	    	//actionBar.addAction(new ToastAction());
    	}
    }
	
}
