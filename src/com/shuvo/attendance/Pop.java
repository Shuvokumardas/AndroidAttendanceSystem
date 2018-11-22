package com.shakil.attendance;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class Pop extends Activity {
	
	//public TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		//Dialog dialog = new Dialog(null);
		//tv=(TextView)dialog.findViewById(R.id.tv1);
		
		setContentView(R.layout.popupwindow);
		
	    DisplayMetrics dm=new DisplayMetrics();
	    getWindowManager().getDefaultDisplay().getMetrics(dm);
	    
	    int width=dm.widthPixels;
	    int height=dm.heightPixels;
	    
	    getWindow().setLayout((int)(width*.8),(int) (height*.6));
	    
	    
	    
	    Intent myLocalintent=getIntent();
	    
	    double val1=myLocalintent.getDoubleExtra("k1", -1);
	    double val2=myLocalintent.getDoubleExtra("k2", -1);
	    double val3=myLocalintent.getDoubleExtra("k3", -1);
	    double val4=myLocalintent.getDoubleExtra("k4", -1);
	    
	    double total=val1+val2+val3+val4;
	    
	    Context context = null;
		new AlertDialog.Builder(context)
	    	.setMessage("Total="+total).show();
	    
	   //tv.setText(getString("Total="+total+"\n"+"A="+val1+"\n"+"P="+val2+"\n"+"S="+val3+"\n"+"L="+val4));
		
	}


	

}
