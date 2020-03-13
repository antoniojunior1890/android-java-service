package com.example.servicebroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBroadcast extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.i("Script", "onReceive()");
//		intent = new Intent("SERVICO_TEST");

//		StringBuilder sb = new StringBuilder();
//		sb.append("Action: " + intent.getAction() + "\n");
//		sb.append("URI: " + intent.toUri(Intent.URI_INTENT_SCHEME).toString() + "\n");
//		String log = sb.toString();
//		Log.d("Script", log);
//		Toast.makeText(context, log, Toast.LENGTH_LONG).show();

//		intent = new Intent(context, MyService.class);
//		context.startService(intent);

		context.startService(new Intent(context, MyService.class));
	}

}
