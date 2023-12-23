package ma.emsi.service;

import java.util.List;

import ma.emsi.model.Utilisateur;

public interface UtilisateurService {
	Utilisateur add(Utilisateur e);

	List<Utilisateur> getAll();

	Utilisateur getById(int id);

	void update(Utilisateur e);

	void delete(int id);
}
