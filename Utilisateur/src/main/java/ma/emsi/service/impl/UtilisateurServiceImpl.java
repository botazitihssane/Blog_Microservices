package ma.emsi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.model.Utilisateur;
import ma.emsi.repository.UtilisateurRepository;
import ma.emsi.service.UtilisateurService;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	private UtilisateurRepository utilisateurRepoository;

	@Override
	public Utilisateur add(Utilisateur e) {
		return utilisateurRepoository.save(e);
	}

	@Override
	public List<Utilisateur> getAll() {
		return utilisateurRepoository.findAll();
	}

	@Override
	public Utilisateur getById(int id) {
		return utilisateurRepoository.findUtilisateurById(id);
	}

	@Override
	public void update(Utilisateur e) {
		Utilisateur u = getById(e.getId());
		if (u != null) {
			u.setEmail(e.getEmail());
			u.setPassword(e.getPassword());
			u.setUsername(e.getUsername());
			utilisateurRepoository.save(u);
		}
	}

	@Override
	public void delete(int id) {
		utilisateurRepoository.deleteById(id);
	}
}