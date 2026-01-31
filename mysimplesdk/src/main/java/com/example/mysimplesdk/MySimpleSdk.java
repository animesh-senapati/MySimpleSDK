package com.example.mysimplesdk;

import android.content.Context;
import android.widget.Toast;

public class MySimpleSdk {

    private static Context context;

    // Initialize SDK
    public static void init(Context ctx) {
        context = ctx.getApplicationContext();
    }

    // Public SDK method
    public static void showToast(String message) {
        if (context == null) {
            throw new IllegalStateException("MySimpleSdk is not initialized. Call init() first.");
        }
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
