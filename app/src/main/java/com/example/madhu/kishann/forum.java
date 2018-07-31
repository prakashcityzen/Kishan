package com.example.madhu.kishann;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class forum extends AppCompatActivity {

    EditText name,problem;
    TextView text;
    private static final String DB_URL="jdbc:mysql://localhost:3306/forum";
    //private static final String DB_URL="jdbc:mysql:http://localhost/phpmyadmin/db_structure.php?server=1&db=forum&token=0189640ec5a4e9e506b080be639f08f1";
    private static final String USER="root";
    private static final String PASS="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
        text=(TextView)findViewById(R.id.textttttt);
        name=(EditText)findViewById(R.id.forum_name);
        problem=(EditText)findViewById(R.id.forum_problem);
    }

    public void post_problem(View view){
        Send objsend= new Send();
        objsend.execute("");
        }

     private class Send extends AsyncTask<String, String, String>{
        String text_name=name.getText().toString();
        String text_problem=problem.getText().toString();
        String msg="";

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            text.setText("before exe");
        }

        @Override
        protected String doInBackground(String... params) {

            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn= DriverManager.getConnection(DB_URL, USER, PASS);
//                msg="khoi k khoi k";

                if(conn==null){
                    msg="nooooo";
                }
                else{
                    String query="INSERT INTO forum (name) VALUES('"+text_name+"');";

//                    String query ="INSERT INTO `forum` (`name`, `problem`, `reply`) VALUES ('kiran', '', '')";
                    Statement stmt=conn.createStatement();
                    stmt.executeUpdate(query);
                    msg="yessss";
                }
                conn.close();

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                msg="class not found";
            } catch (SQLException e) {
                e.printStackTrace();
                msg="excep";
            }



            return msg;
        }

        @Override
        protected void onPostExecute(String msg) {
            super.onPostExecute(msg);
            text.setText(msg);
        }
    }
}
