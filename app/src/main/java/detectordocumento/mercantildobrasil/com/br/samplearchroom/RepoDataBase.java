package detectordocumento.mercantildobrasil.com.br.samplearchroom;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by andre.coelho on 09/04/2018.
 */

@Database(entities = {Repo.class}, version = 1)
public abstract class RepoDataBase extends RoomDatabase {

    private static final String DB_NAME = "repoDatabase.db";
    private static volatile RepoDataBase instance;

    static synchronized RepoDataBase getInstance(Context context) {
        if (instance == null) {
            instance = create(context);
        }
        return instance;
    }

    private static RepoDataBase create(final Context context) {
        return Room.databaseBuilder(
                context,
                RepoDataBase.class,
                DB_NAME).build();
    }

    public abstract RepoDAO getRepoDao();
}
