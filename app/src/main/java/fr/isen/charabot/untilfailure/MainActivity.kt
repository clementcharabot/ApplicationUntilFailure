package fr.isen.charabot.untilfailure

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import fr.isen.charabot.untilfailure.ui.theme.UntilFailureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UntilFailureTheme {
                launchAccueilActivity()
            }
        }
    }

    private fun launchAccueilActivity() {
        val intent = Intent(this, AccueilActivity::class.java)
        startActivity(intent)
    }
}