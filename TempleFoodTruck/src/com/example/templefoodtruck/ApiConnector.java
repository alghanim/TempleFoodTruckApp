package com.example.templefoodtruck;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

public class ApiConnector {

	public JSONArray getAllTrucks()
	{
		String url = "http://cis-linux2.temple.edu/~tuf15070/foodtruck.php";
		
		HttpEntity httpEntity = null;
		JSONArray jsonArray = null;
		
		
		return jsonArray;	
	}
}
