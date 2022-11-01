package kodlama.io.springWork.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.springWork.business.abstracts.ProgrammingLanguageService;
import kodlama.io.springWork.dataAccess.abstracts.ProgrammingLanguageRep;
import kodlama.io.springWork.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{

	private ProgrammingLanguageRep languageRep;
	
	
	public ProgrammingLanguageManager(ProgrammingLanguageRep languageRep) {
		
		this.languageRep = languageRep;
	}


	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return languageRep.getAll();
	}


	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
