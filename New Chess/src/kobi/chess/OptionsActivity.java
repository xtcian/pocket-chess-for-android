package kobi.chess;

/*
Copyright 2011 by Kobi Krasnoff

Credits:
This program makes use of the "Chess Training Tools": Copyright  2009 by Dietrich Kappe
This program makes use of the Chesspresso™ library: Copyright  2002 by Bernhard Seybold
Chess pieces graphical design made by Colin M.L. Burnett: Copyright © 2011 by Colin M.L. Burnett

This file is part of Pocket Chess.

Pocket Chess is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Pocket Chess is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Pocket Chess.  If not, see <http://www.gnu.org/licenses/>.
*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class OptionsActivity extends Activity {
	String level = "";
	String myColor = "";
	String color_white;
	String color_black;
	
	private OnClickListener radio_listener = new OnClickListener() {
	    public void onClick(View v) {
	    	
	    	
	    	
	        	
	    }
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.options);
		
		

	}
	
	public class MyOnItemSelectedListener implements OnItemSelectedListener {

		public void onItemSelected(AdapterView<?> parent, View view, int pos,
				long id) {
			String res = parent.getItemAtPosition(pos).toString();
			level = String.valueOf(res.charAt(res.length() - 1));
			
		}

		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
}
