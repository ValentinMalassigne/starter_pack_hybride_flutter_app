package com.example.starter_pack_hybride_flutter_app

import android.content.Intent
import androidx.annotation.NonNull
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel

class MainActivity: FlutterActivity() {
    private lateinit var channel: MethodChannel

    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine){
        super.configureFlutterEngine(flutterEngine)

        channel=MethodChannel(flutterEngine.dartExecutor.binaryMessenger,"com.android.application/androidActivity")

        channel.setMethodCallHandler {call, result ->
            if (call.method == "openAndroidActivity") {
                //receive data from flutter
                val arguments = call.arguments() as Map<String,String>
                val name = arguments["name"]

                //using a print here wont show anything in the debug console
                print(name)

                //start android Activity
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)

                //return data to flutter
                val res = "Android received the name : "+name
                result.success(res)
            }
        }
    }
}
