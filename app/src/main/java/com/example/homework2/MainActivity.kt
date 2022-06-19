package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var calculate: Button
    private lateinit var inputNum: EditText
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculate = findViewById(R.id.calculateButton)
        inputNum = findViewById(R.id.inputNum)
        resultTextView = findViewById(R.id.resultTextView)

        calculate.setOnClickListener {

            val inputNumber = inputNum.text.toString().toInt()

            if (inputNumber in 1..1000) {

                val nums = listOf<String>("", "ერთი", "ორი", "სამი", "ოთხი", "ხუთი", "ექვსი", "შვიდი", "რვა", "ცხრა", "ათი", "თერთმეტი", "თორმეტი", "ცამეტი",
                    "თოთხმეტი", "თხუთმეტი", "თექვსმეტი", "ჩვიდმეტი", "თვრამეტი", "ცხრამეტი", "ოცი", "ოცდაერთი", "ოცდაორი", "ოცდასამი", "ოცდაოთხი",
                "ოცდახუთი", "ოცდაექვსი", "ოცდაშვიდი", "ოცდარვა", "ოცდაცხრა", "ოცდაათი", "ოცდათერთმეტი", "ოცდათორმეტი", "ოცდაცამეტი", "ოცდათოთხმეტი",
                "ოცდათხუთმეტი", "ოცდათექვსმეტი", "ოცდაჩვიდმეტი", "ოცდათვრამეტი", "ოცდაცხრამეტი", "ორმოცი", "ორმოცდაერთი", "ორმოცდაორი", "ორმოცდასამი",
                "ორმოცდაოთხი", "ორმოცდახუთი", "ორმოცდაექვსი", "ორმოცდაშვიდი", "ორმოცდარვა", "ორმოცდაცხრა", "ორმოცდაათი", "ორმოცდათერთმეტი", "ორმოცდათორმეტი",
                "ორმოცდაცამეტი", "ორმოცდათოთხმეტი", "ორმოცდათხუთმეტი", "ორმოცდათექვსმეტი", "ორმოცდაჩვიდმეტი", "ორმოცდათვრამეტი", "ორმოცდაცხრამეტი", "სამოცი",
                "სამოცდაერთი", "სამოცდაორი", "სამოცდასამი", "სამოცდაოთხი", "სამოცდახუთი", "სამოცდაექვსი", "სამოცდაშვიდი", "სამოცდარვა", "სამოცდაცხრა", "სამოცდაათი",
                "სამოცდათერთმეტი", "სამოცდათორმეტი", "სამოცდაცამეტი", "სამოცდათოთხმეტი", "სამოცდათხუთმეტი", "სამოცდათექვსმეტი", "სამოცდაჩვიდმეტი", "სამოცდათვრამეტი",
                "სამოცდაცხრამეტი", "ოთხმოცი", "ოთხმოცდაერთი", "ოთხმოცდაორი", "ოთხმოცდასამი", "ოთხმოცდაოთხი", "ოთხმოცდახუთი", "ოთხმოცდაექვსი", "ოთხმოცდაშვიდი",
                "ოთხმოცდარვა", "ოთხმოცდაცხრა", "ოთხმოცდაათი", "ოთხმოცდათერთმეტი", "ოთხმოცდათორმეტი", "ოთხმოცდაცამეტი", "ოთხმოცდათოთხმეტი", "ოთხმოცდათხუთმეტი",
                "ოთხმოცდათექვსმეტი", "ოთხმოცდაჩვიდმეტი", "ოთხმოცდათვრამეტი", "ოთხმოცდაცხრამეტი")

                when (inputNumber) {

                    100 -> resultTextView.text = "ასი"
                    200 -> resultTextView.text = "ორასი"
                    300 -> resultTextView.text = "სამასი"
                    400 -> resultTextView.text = "ოთხასი"
                    500 -> resultTextView.text = "ხუთასი"
                    600 -> resultTextView.text = "ექვსასი"
                    700 -> resultTextView.text = "შვიდასი"
                    800 -> resultTextView.text = "რვაასი"
                    900 -> resultTextView.text = "ცხრაასი"
                    1000 -> resultTextView.text = "ათასი"
                    1 -> resultTextView.text = nums[1]
                    2 -> resultTextView.text = nums[2]
                    3 -> resultTextView.text = nums[3]
                    4 -> resultTextView.text = nums[4]
                    5 -> resultTextView.text = nums[5]
                    6 -> resultTextView.text = nums[6]
                    7 -> resultTextView.text = nums[7]
                    8 -> resultTextView.text = nums[8]
                    9 -> resultTextView.text = nums[9]
                    10 -> resultTextView.text = nums[10]
                    11 -> resultTextView.text = nums[11]
                    12 -> resultTextView.text = nums[12]
                    13 -> resultTextView.text = nums[13]
                    14 -> resultTextView.text = nums[14]
                    15 -> resultTextView.text = nums[15]
                    16 -> resultTextView.text = nums[16]
                    17 -> resultTextView.text = nums[17]
                    18 -> resultTextView.text = nums[18]
                    19 -> resultTextView.text = nums[19]
                    20 -> resultTextView.text = nums[20]
                    21 -> resultTextView.text = nums[21]
                    22 -> resultTextView.text = nums[22]
                    23 -> resultTextView.text = nums[23]
                    24 -> resultTextView.text = nums[24]
                    25 -> resultTextView.text = nums[25]
                    26 -> resultTextView.text = nums[26]
                    27 -> resultTextView.text = nums[27]
                    28 -> resultTextView.text = nums[28]
                    29 -> resultTextView.text = nums[29]
                    30 -> resultTextView.text = nums[30]
                    31 -> resultTextView.text = nums[31]
                    32 -> resultTextView.text = nums[32]
                    33 -> resultTextView.text = nums[33]
                    34 -> resultTextView.text = nums[34]
                    35 -> resultTextView.text = nums[35]
                    36 -> resultTextView.text = nums[36]
                    37 -> resultTextView.text = nums[37]
                    38 -> resultTextView.text = nums[38]
                    39 -> resultTextView.text = nums[39]
                    40 -> resultTextView.text = nums[40]
                    41 -> resultTextView.text = nums[41]
                    42 -> resultTextView.text = nums[42]
                    43 -> resultTextView.text = nums[43]
                    44 -> resultTextView.text = nums[44]
                    45 -> resultTextView.text = nums[45]
                    46 -> resultTextView.text = nums[46]
                    47 -> resultTextView.text = nums[47]
                    48 -> resultTextView.text = nums[48]
                    49 -> resultTextView.text = nums[49]
                    50 -> resultTextView.text = nums[50]
                    51 -> resultTextView.text = nums[51]
                    52 -> resultTextView.text = nums[52]
                    53 -> resultTextView.text = nums[53]
                    54 -> resultTextView.text = nums[54]
                    55 -> resultTextView.text = nums[55]
                    56 -> resultTextView.text = nums[56]
                    57 -> resultTextView.text = nums[57]
                    58 -> resultTextView.text = nums[58]
                    59 -> resultTextView.text = nums[59]
                    60 -> resultTextView.text = nums[60]
                    61 -> resultTextView.text = nums[61]
                    62 -> resultTextView.text = nums[62]
                    63 -> resultTextView.text = nums[63]
                    64 -> resultTextView.text = nums[64]
                    65 -> resultTextView.text = nums[65]
                    66 -> resultTextView.text = nums[66]
                    67 -> resultTextView.text = nums[67]
                    68 -> resultTextView.text = nums[68]
                    69 -> resultTextView.text = nums[69]
                    70 -> resultTextView.text = nums[70]
                    71 -> resultTextView.text = nums[71]
                    72 -> resultTextView.text = nums[72]
                    73 -> resultTextView.text = nums[73]
                    74 -> resultTextView.text = nums[74]
                    75 -> resultTextView.text = nums[75]
                    76 -> resultTextView.text = nums[76]
                    77 -> resultTextView.text = nums[77]
                    78 -> resultTextView.text = nums[78]
                    79 -> resultTextView.text = nums[79]
                    80 -> resultTextView.text = nums[80]
                    81 -> resultTextView.text = nums[81]
                    82 -> resultTextView.text = nums[82]
                    83 -> resultTextView.text = nums[83]
                    84 -> resultTextView.text = nums[84]
                    85 -> resultTextView.text = nums[85]
                    86 -> resultTextView.text = nums[86]
                    87 -> resultTextView.text = nums[87]
                    88 -> resultTextView.text = nums[88]
                    89 -> resultTextView.text = nums[89]
                    90 -> resultTextView.text = nums[90]
                    91 -> resultTextView.text = nums[91]
                    92 -> resultTextView.text = nums[92]
                    93 -> resultTextView.text = nums[93]
                    94 -> resultTextView.text = nums[94]
                    95 -> resultTextView.text = nums[95]
                    96 -> resultTextView.text = nums[96]
                    97 -> resultTextView.text = nums[97]
                    98 -> resultTextView.text = nums[98]
                    99 -> resultTextView.text = nums[99]

                }

                if (inputNumber / 100 == 1) {

                    resultTextView.text = "ას" + nums[inputNumber % 100]

                } else if (inputNumber / 100 == 2) {

                    resultTextView.text = "ორას" + nums[inputNumber % 100]

                } else if (inputNumber / 100 == 3) {

                    resultTextView.text = "სამას" + nums[inputNumber % 100]

                } else if (inputNumber / 100 == 4) {

                    resultTextView.text = "ოთხას" + nums[inputNumber % 100]

                } else if (inputNumber / 100 == 5) {

                    resultTextView.text = "ხუთას" + nums[inputNumber % 100]

                } else if (inputNumber / 100 == 6) {

                    resultTextView.text = "ექვსას" + nums[inputNumber % 100]

                } else if (inputNumber / 100 == 7) {

                    resultTextView.text = "შვიდას" + nums[inputNumber % 100]

                } else if (inputNumber / 100 == 8) {

                    resultTextView.text = "რვაას" + nums[inputNumber % 100]

                }else if (inputNumber / 100 == 9) {

                    resultTextView.text = "ცხრაას" + nums[inputNumber % 100]

                }

                // clear input line when user click button
                inputNum.setText("")

            }

        }

    }


}




