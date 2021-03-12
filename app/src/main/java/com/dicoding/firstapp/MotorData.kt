package com.dicoding.firstapp

object MotorData {
    private val motorNames = arrayOf("Yamaha Aerox",
        "Honda Beat",
        "Yamaha Fino",
        "Yamaha Freego",
        "Kawasaki KLX",
        "Kawasaki Ninja",
        "Yamaha Nmax",
        "Honda PCX",
        "Honda Scoopy",
        "Honda SupraX"
    )

    private val motorDetails = arrayOf(
        "Yamaha Aerox 155 VVA dengan mesin 155cc generasi baru yang dilengkapi dengan Variable Valve Actuation (VVA) membuat performa tarikan mesin lebih bertenaga",
        "Varian Beat CBS ditenagai Mesin Bensin 110 cc dengan sistem PGM-FI, bermesin Single Cylinder, 4-Stroke, Air Cooled SOHC Engine",
        "New Fino 125 Blue Core kini tampil dengan gaya baru. Motor 125cc ini hadir dengan ban bertapak lebar tipe tubeless membuat berkendara makin stabil",
        "FreeGo dengan mesin bluecore 125 cc ditambah dengan SMG yang memberikan suara mesin lebih halus ketika dinyalakan dan memberikan pengalaman berkendara irit, bertenaga dan handal",
        "Kawasaki KLX 150 baru, generasi penerus dari KLX 150s, menawarkan pengendara performa off-road sejati disegala medan. Body ramping dengan ketinggian jok yang rendah, posisi riding yang nyaman serta kontrol yang mudah",
        "Kawasaki Ninja 400 belum lama ini resmi diluncurkan di ajang Tokyo Motor Show 2017 dihadirkan dengan membawa gaya baru yang lebih tajam dan sporty",
        "Yamaha Nmax 155 dengan teknologi Blue Core & VVA menjaga mesin 155 cc tetap efisien bahan bakar dan tenaga serta torsi maksimum di setiap putaran mesin",
        "Honda PCX 160 menjanjikan mesin yang lebih bertenaga dari generasi sebelumnya. Honda mengklaim mesin ini mampu meningkatkan efisiensi percampuran udara-bahan bakar dan efisiensi pembuangan gas pembakaran",
        "Scoopy eSP dengan dilengkapi teknologi eSP siap menjadi pilihan utama konsumen yang membutuhkan motor skutik yang fashionable dan nyaman dikendarai. ",
        "Tampilan Supra X 125 FI punya desain sporty. Desain bodi dibuat lebih slim. Fitur teknologi mesin PGM FI dapat mengoptimalkan pemakaian bahan bakar lebih Irit" )



    private val motorImages = intArrayOf(R.drawable.aerox,
        R.drawable.beat,
        R.drawable.fino,
        R.drawable.freego,
        R.drawable.klx,
        R.drawable.ninja,
        R.drawable.nmax,
        R.drawable.pcx,
        R.drawable.scoopy,
        R.drawable.supra)

    val listData: ArrayList<Motor>
        get() {
            val list = arrayListOf<Motor>()
            for (position in motorNames.indices){
                val motor = Motor()
                motor.name = motorNames[position]
                motor.detail = motorDetails[position]
                motor.photo = motorImages[position]
                list.add(motor)
            }
            return list
        }

}