package com.example.rifat.busticket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class ShowAll extends AppCompatActivity {

    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        String data = getIntent().getExtras().getString("key");
        if (data.equals("1")){
            tv1.setText("বাস রুট ও বাস ভাড়া : ");
            tv2.setText("গাবতলি -> মিরপুর-১ -> মিরপুর-১০ -> কালশী -> বনানী -> গুলশান-২ -> গুলশান-১ -> বাড্ডা -> লিংক রোড  ");


        } else if(data.equals("2")){

            tv1.setText("বাস রুট ও বাস ভাড়া : ");
            tv2.setText("গাবতলি -> মিরপুর-১ -> মিরপুর-১০ -> কালশী -> বিশ্বরোড -> এয়ারপোর্ট -> উত্তরা -> আবদুল্লাহপুর ");

        } else if(data.equals("3")){

            tv1.setText("বাস রুট ও বাস ভাড়া : ");
            tv2.setText("গাবতলি -> মিরপুর-১ -> মিরপুর-১০ -> কালশী -> বিশ্বরোড -> এয়ারপোর্ট -> উত্তরা -> আবদুল্লাহপুর ");

        }else if(data.equals("4")){

            tv1.setText("বাস রুট ও বাস ভাড়া : ");
            tv2.setText("গাবতলি -> মিরপুর-১ -> মিরপুর-১০ -> কালশী -> বিশ্বরোড -> এয়ারপোর্ট -> উত্তরা -> আবদুল্লাহপুর ");

        }else if(data.equals("5")){

            tv1.setText("বাস রুট ও বাস ভাড়া : ");
            tv2.setText("গাবতলি -> মিরপুর-১ -> মিরপুর-১০ -> কালশী -> বিশ্বরোড -> এয়ারপোর্ট -> উত্তরা -> আবদুল্লাহপুর -> টঙ্ঘী -> গাজীপুর ");

        }else if(data.equals("6")){

            tv1.setText("বাস রুট ও বাস ভাড়া : ");
            tv2.setText("গাবতলি -> মিরপুর-১ -> মিরপুর-১০ -> কালশী -> বিশ্বরোড -> এয়ারপোর্ট -> উত্তরা -> আবদুল্লাহপুর -> টঙ্ঘী -> গাজীপুর ");

        }else if(data.equals("7")){

            tv1.setText("বাস রুট ও বাস ভাড়া : ");
            tv2.setText("গাবতলি -> মিরপুর-১ -> মিরপুর-১০ -> কালশী -> যমুনা ফিউচার পার্ক -> নতুন বাজার -> বাড্ডা ");

        }else if(data.equals("8")){

            tv1.setText("বাস রুট ও বাস ভাড়া : ");
            tv2.setText(" মিরপুর-১০ -> ক্যান্টমেন্ট -> বনানী -> নতুন বাজার ");

        }else if(data.equals("9")){

            tv1.setText("বাস রুট ও বাস ভাড়া : ");
            tv2.setText("শিয়া মসজিদ -> শ্যামলী -> আগারগাও -> মিরপুর-১০ -> কালশী -> বিশ্বরোড -> এয়ারপোর্ট -> উত্তরা -> আবদুল্লাহ ");

        }
        else if(data.equals("10")){

            tv1.setText("বাস রুট ও বাস ভাড়া : ");
            tv2.setText("যাত্রাবাড়ী -> সায়দাবাদ -> মুগদা -> খিলগাঁও -> মালিবাগ -> মগবাজার -> কাওরানবাজার -> ফার্মগেট -> আসাদ গেট -> শ্যামলী -> গাবতলী -> সাভার ");

        }


    }
}
