package AlaaSaied.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll_Button =(Button) findViewById(R.id.roll_Button);
        final ImageView leftDice =  (ImageView) findViewById(R.id.dice_leftImage);
        final ImageView rightDice = (ImageView) findViewById(R.id.dice_rightImage);

        final int[] diceArray = {
          R.drawable.dice1,
          R.drawable.dice2,
          R.drawable.dice3,
          R.drawable.dice4,
          R.drawable.dice5,
          R.drawable.dice6
        };
        roll_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "I am Here!");

                Random randomNumberGenerator = new Random();

                int number1 = randomNumberGenerator.nextInt(6);
                int number2 = randomNumberGenerator.nextInt(6);
//                Log.d("Dicee", "The num is " + number);

                leftDice.setImageResource(diceArray[number1]);
                rightDice.setImageResource(diceArray[number2]);

            }
        });
    }
}
