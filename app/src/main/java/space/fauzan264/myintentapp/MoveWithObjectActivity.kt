package space.fauzan264.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithObjectActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        val tvObject: TextView = findViewById(R.id.tv_object_received)

        val person = intent.getParcelableExtra(EXTRA_PERSON) as Person?
        val text = """
            Name : ${person?.name.toString()},
            Email : ${person?.email},
            Age : ${person?.age},
            Location : ${person?.city}
        """.trimIndent()
        tvObject.text = text
    }
}