package developersudhanshu.com.greenyoutube;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivityDisplay extends AppCompatActivity {

    TextView homeContentDisplay;
    Button viewMore;
    boolean viewingAll = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_display);

        homeContentDisplay = findViewById(R.id.tv_home_display);
        viewMore = findViewById(R.id.btn_home_display_view_more);

        viewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewingAll = !viewingAll;
                if(viewingAll){
                    viewMore.setText("View Less");
                    homeContentDisplay.setMaxLines(10000);
                }else{
                    viewMore.setText("View More");
                    homeContentDisplay.setMaxLines(3);

                }
            }
        });

        String randomText = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";
        homeContentDisplay.setText(randomText);
        homeContentDisplay.setEllipsize(TextUtils.TruncateAt.END);
        homeContentDisplay.setMaxLines(3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
