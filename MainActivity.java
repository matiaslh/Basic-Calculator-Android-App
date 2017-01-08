package ca.matiaslevyhara.basicCalculator;

import ca.matiaslevyhara.basicCalculator.R;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void OnClick(View v){
		double temp=0;
		String tempStr;
		TextView display = (TextView)findViewById(R.id.display);
		EditText number1 = (EditText)findViewById(R.id.num1);
		EditText number2 = (EditText)findViewById(R.id.num2);
		String num11 = number1.getText().toString();
		String num22 = number2.getText().toString();
		
		if (!num11.isEmpty() && !num22.isEmpty()){
			double num1 = Double.parseDouble(num11);
			double num2 = Double.parseDouble(num22);
			
			if (v.getId()==R.id.mult){
				temp=num1*num2;
			}
			if (v.getId()==R.id.div){
				if (num2==0||(num1==0 && num2==0)){
					
				}else{
					temp=num1/num2;
				}
			}
			if (v.getId()==R.id.add){
				temp=num1+num2;
			}
			if (v.getId()==R.id.sub){
				temp=num1-num2;
			}
			tempStr=String.valueOf(temp);
			display.setText(tempStr);
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
