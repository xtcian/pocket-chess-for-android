package kobi.chess;

/*
Copyright 2011 by Kobi Krasnoff


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
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CopyrightActivity extends Activity {
	public static final int ACITIVITY_HELP = 0;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.copyright2);
		final Context mContext = this.getBaseContext();
		
		Button back = (Button) findViewById(R.id.Button_return_to_screen_3);
		back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }

        });
		
		Button gnu = (Button) findViewById(R.id.Button_gpl_screen);
		gnu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	Intent myIntent3 = new Intent(mContext, GNUActivity.class);
    			startActivityForResult(myIntent3, ACITIVITY_HELP);
            }

			

        });
	}
	
}
