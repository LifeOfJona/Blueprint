package com.example.blueprint;

import android.net.Uri;
import android.os.Handler;

public class PolyApi {

        private static String API_KEY ="AIzaSyBwzM0_CojrQaVVCEPMSqwMGGCjITGhzAk";

        private static String TAG = "PolySample";

        private static String HOST = "poly.googleapis.com";

    /**
     * Gets the asset with the given ID.
     * @param assetId The ID of the asset to get.
     * @param handler The handler on which to call the listener.
     * @param CompletionListener The listener to call when the asset request is completed.
     */
    public static void GetAsset(String assetId, Handler handler,
                                AsyncHttpRequest.CompletionListener completionListener) {


        // Build the URL to the asset. It should be something like:
        //   https://poly.googleapis.com/v1/assets/ASSET_ID_HERE?key=YOUR_API_KEY_HERE
        String url = new Uri.Builder()
                .scheme("https")
                .authority(HOST)
                .appendPath("v1")
                .appendPath("assets")
                .appendPath(assetId)
                .appendQueryParameter("key", API_KEY)
                .build().toString();

        // Send an asynchronous request.
        AsyncHttpRequest request = new AsyncHttpRequest(url, handler, completionListener);
        request.send();
    }
}
