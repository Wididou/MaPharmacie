package com.example.android.projet.local_storage

import androidx.room.*
import com.example.android.projet.entities.Utilisateur

@Dao
interface UtilisateurDAO {
    @Query("select * from utilisateur where NSS=:nss")
    fun getUtilisateur(nss:Int?):Utilisateur
    @Query("select * from utilisateur where isSynchronized=:valeur ")
    fun getUserToSynchronize(valeur : Int): List<Utilisateur>

    @Query("select * from utilisateur where numero_tel=:mobile and mot_de_passe=:mdp")
    fun findExistingUser(mobile: Int, mdp : String): Utilisateur

    @Query("select * from utilisateur where NSS=:nss and mot_de_passe=:mdp")
    fun checkOldPassword(nss:Int, mdp : String):Utilisateur

    @Insert
    fun addUtilisateur(user: Utilisateur)
    @Update
    fun updateUtilisateur(user: Utilisateur)
    @Delete
    fun deleteUtilisateur(user: Utilisateur)

    @Query("delete from utilisateur ")
    fun deleteAll()


}
