import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar informações de horas do Firestore
        db.collection("Horas")
            .document("id_do_documento_horas") // Substitua pelo ID correto do documento
            .get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val horas = document.getString("horas")
                    textViewHours.text = "Horas: $horas"
                }
            }
            .addOnFailureListener { exception ->
                // Tratar falha na leitura
            }

        // Recuperar informações de pontos batidos do Firestore
        db.collection("PontosBatidos")
            .document("id_do_documento_pontos") // Substitua pelo ID correto do documento
            .get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val pontos = document.getString("pontos")
                    textViewPoints.text = "Pontos Batidos: $pontos"
                }
            }
            .addOnFailureListener { exception ->
                // Tratar falha na leitura
            }
    }
}
