package com.formation.dao;

import com.formation.model.Livre;

import java.util.List;

public interface LivreDAO {
    List<Livre> getAllLivres();
    void insert(Livre livre);

}
