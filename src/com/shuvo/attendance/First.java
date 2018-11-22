package com.shakil.attendance;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class First extends Activity implements View.OnClickListener {
	
	public Button but1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    	but1=(Button)findViewById(R.id.button1);
    	but1.setOnClickListener(this);
    }
    
    private void buttonClick()
    {
    	startActivity(new Intent("android.intent.action.Second"));
    }
    public void onClick(View v)
    {
    	switch(v.getId())
    	{
    		case R.id.button1:
    			buttonClick();
    			break;
    	}
    }   


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.first, menu);
        return true;
    }
    
}
