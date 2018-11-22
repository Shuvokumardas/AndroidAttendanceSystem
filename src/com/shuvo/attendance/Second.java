package com.shakil.attendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter.ViewBinder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends Activity implements View.OnClickListener{

	private RadioGroup rg1,rg2,rg3,rg4,rg5,rg6,rg7,rg8;
	private Button b1;
	int a=0;
	int p=0;
	int s=0;
	int l=0;
	
	int sum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        rg1=(RadioGroup)findViewById(R.id.radioGroup1);
        rg2=(RadioGroup)findViewById(R.id.radioGroup2);
        rg3=(RadioGroup)findViewById(R.id.radioGroup3);
        rg4=(RadioGroup)findViewById(R.id.radioGroup4);
        rg5=(RadioGroup)findViewById(R.id.radioGroup5);
        rg6=(RadioGroup)findViewById(R.id.radioGroup6);
        rg7=(RadioGroup)findViewById(R.id.radioGroup7);
        rg8=(RadioGroup)findViewById(R.id.radioGroup8);
      
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(this);
        int c1=rg1.getCheckedRadioButtonId();
		int c2=rg2.getCheckedRadioButtonId();
		int c3=rg3.getCheckedRadioButtonId();
		int c4=rg4.getCheckedRadioButtonId();
		int c5=rg5.getCheckedRadioButtonId();
		int c6=rg6.getCheckedRadioButtonId();
		int c7=rg7.getCheckedRadioButtonId();
		int c8=rg8.getCheckedRadioButtonId();
		switch (c1) {
		case R.id.radioButton1:
			a++;
			break;
		case R.id.radioButton2:
			p++;
			break;
		case R.id.radioButton3:
			s++;
			break;
		case R.id.radioButton4:
			l++;
			break;
		default:
			break;
		}
		
		switch (c2) {
		case R.id.radioButton5:
			a++;
			break;
		case R.id.radioButton6:
			p++;
			break;
		case R.id.radioButton7:
			s++;
			break;
		case R.id.radioButton8:
			l++;
			break;
		default:
			break;
		}
		
		switch (c3) {
		case R.id.radioButton9:
			a++;
			break;
		case R.id.radioButton10:
			p++;
			break;
		case R.id.radioButton11:
			s++;
			break;
		case R.id.radioButton12:
			l++;
			break;
		default:
			break;
		}
		
		switch (c4) {
		case R.id.radioButton13:
			a++;
			break;
		case R.id.radioButton14:
			p++;
			break;
		case R.id.radioButton15:
			s++;
			break;
		case R.id.radioButton16:
			l++;
			break;
		default:
			break;
		}
		switch (c5) {
		case R.id.radioButton17:
			a++;
			break;
		case R.id.radioButton18:
			p++;
			break;
		case R.id.radioButton19:
			s++;
			break;
		case R.id.radioButton20:
			l++;
			break;
		default:
			break;
		}
		switch (c6) {
		case R.id.radioButton21:
			a++;
			break;
		case R.id.radioButton22:
			p++;
			break;
		case R.id.radioButton23:
			s++;
			break;
		case R.id.radioButton24:
			l++;
			break;
		default:
			break;
		}
		switch (c7) {
		case R.id.radioButton25:
			a++;
			break;
		case R.id.radioButton26:
			p++;
			break;
		case R.id.radioButton27:
			s++;
			break;
		case R.id.radioButton28:
			l++;
			break;
		default:
			break;
		}
		switch (c8) {
		case R.id.radioButton29:
			a++;
			break;
		case R.id.radioButton30:
			p++;
			break;
		case R.id.radioButton31:
			s++;
			break;
		case R.id.radioButton32:
			l++;
			break;
		default:
			break;
		}
		      
    }

	public void buttonClick() {
		
		
		
		
		
		
		
		
		
	}

	@Override
	public void onClick(View v) {
		switch(v.getId())
    	{
    		case R.id.button1:
    			Double v1=Double.valueOf(a);
    			Double v2=Double.valueOf(p);
    			Double v3=Double.valueOf(s);
    			Double v4=Double.valueOf(l);
    			Intent myintent=new Intent(this,Pop.class);
    			
    			myintent.putExtra("k1", v1);
    			myintent.putExtra("k2", v2);
    			myintent.putExtra("k3", v3);
    			myintent.putExtra("k4", v4);
    			
    			startActivity(myintent);
    			break;
    	}
		
	}
}
