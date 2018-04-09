package detectordocumento.mercantildobrasil.com.br.samplearchroom;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new DAOASync(this).execute();
    }

    public class DAOASync extends AsyncTask<String,Integer,Integer>{

        Context context;

        public DAOASync(Context c){
            context = c;
        }

        @Override
        protected Integer doInBackground(String... strings) {


            RepoDataBase.getInstance(context).getRepoDao().insert(new Repo(1, "ANDRE", "HTTP://Simply.com.br"));

            List<Repo> repoList = RepoDataBase.getInstance(context).getRepoDao().getAllRepo();

            return 0;
        }
    }
}
