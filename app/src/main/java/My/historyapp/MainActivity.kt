package My.historyapp
//SHANAE,RAMSUNDER
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {

   //declare
   private lateinit var searchButton: Button
   private lateinit var clearButton: Button
   private lateinit var ageInput: EditText
   private lateinit var resultTextView: TextView

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        //initialise
        searchButton=findViewById(R.id.searchButton)
        clearButton=findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView=findViewById(R.id.resultTextView)

       searchButton.setOnClickListener{
       //create a variable of age to get value from user
       val age = ageInput.text.toString().toIntOrNull()

       //if age is not null and age is in range between 20 and 100
         if (age !=null&& age in 20..100) {

             //when age is 95 display Nelson Mandela else when is .. and so on
             val name = when (age) {
             95->"Nelson Mandela " +
                         "he was the country's first black head of state." +
                         " he was an anti-apartheid activist,politician and statesman." +
                         " he was sentenced to life in prison-Robbin island,was freed after 27 years."

            87->"Mother Teresa " +
                " she was an Albanian-Indian Catholic nun." +
                "the founder of Missionaries of charity." +
                "she devoted her life to helping those most in need."

             79->"Mahatma Gandhi " +
                 " he was an indian lawyer,anti-colonial nationalist and political ethicist."+
                 "who employed nonviolent resistance to lead a successful campaign. " +
                  "he inspired movements for civil rights and freedom across the world."

             76->"Albert Einstein " +
                 "he was a German-born theoretical physicist." +
                 "he was one of the most influential scientists of all time." +
                 "he received the Nobel Prize for Physics."

             74->"Muhammed Ali"  +
                 "he was an American professional boxer and activist." +
                 "regarded as one of the most significant sports figures of the 20th century." +
                 "he held the ring magazine heavyweight title from 1964 to 1970."

                 69-> "Saddam Hussein " +
                       "President of Iraq." +
                       "he was an Iraqi politician and revolutionary." +
                       "Served as a prime minister of Iraq from 1979-2003."

                 56-> "Adolf Hitler " +
                      "he was born in Braun-au am inn,Austria." +
                      "he was an Austrian-born German politician who was dictator of Nazi Germany." +
                      "he rose to power as the leader of the Nazi Party,becoming the chancellor."

                 41->"Shaka Zulu " +
                     "he was the king of the zulu kingdom from 1816 to 1828." +
                     "he was one of the most influential monarchs of the zulus." +
                     "he ordered wide-reaching reforms that reorganized the military."

                 40->"Malcolm X" +
                     "he was an American Muslim minister and human rights activist." +
                     "he was a prominent figure during the civil rights movement." +
                     "he was a vocal advocate for Black empowerment."

                 39->"Martin Luther King Jr " +
                         " He was an American Christian minister,activist,and political philosopher" +
                         " he was most prominent leaders in the civil rights movement."+
                         "he advanced civil rights of people of color in the United States."

                 else -> null

             }
             val message = if (name != null) "Your age matches $name"
             else "No historical figure found with age entered."
             resultTextView.text = message
         }else{
            resultTextView.text = "Invalid input. Please enter valid age between 20 and 100"
         }

       }
      clearButton.setOnClickListener {
          ageInput.text.clear()
          resultTextView.text = ""
      }

    }
}
//Reference List:
//Nelson Mandela-https://en.m.wikipedia.org
//Mother Teresa-https://en.m.wikipedia.org
//Mahatma Gandhi-https://www.britannica.com
//Albert Einstein-https://www.biography.com
//Muhammed Ali-https://www.biograhy.com
//Saddam Hussein-https://en.m.wikipedia.org
//Adolf Hitler-https://www.britannica.com
//Shaka Zulu-https://en.m.wikipedia.org
//Malcolm X-http://pbs.org
//Martin Luther King Jr-https://en.m.wikipedia.org