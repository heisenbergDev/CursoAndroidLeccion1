/* Curso de Desarrollo Android.
 * 
 * Lección 1. Hola Mundo: jugando con Activity.
 * 
 * ©AIISCYL.
 */

package es.aiiscyl.cursoandroidleccion1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//// Forzando el cuelgue en un thread principal 
		//// para que Android muestre el diálogo de cierre. 
		//while (true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_settings:
			showMsg(getString(R.string.action_settings_text));
			break;
		case R.id.action_about:
			showMsg(getString(R.string.action_about_text));
			break;
		}
		return super.onOptionsItemSelected(item);
	}

	private void showMsg(String msg) {
		Toast toast = Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.CENTER, toast.getXOffset() / 2, toast.getYOffset() / 2);
		toast.show();
	}	

}
