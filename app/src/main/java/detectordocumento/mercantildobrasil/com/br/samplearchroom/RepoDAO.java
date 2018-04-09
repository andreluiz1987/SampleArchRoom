package detectordocumento.mercantildobrasil.com.br.samplearchroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by andre.coelho on 09/04/2018.
 */

@Dao
public interface RepoDAO {

    @Query("SELECT * FROM Repo")
    List<Repo> getAllRepo();


    @Query("SELECT * FROM repo WHERE id=:id")
    Repo getRepo(int id);

    @Insert
    void insert(Repo... repos);

    @Update
    void update(Repo... repos);

    @Delete
    void delete(Repo... repos);
}
