package kodlama.io.springWork.dataAccess.abstracts;

import java.util.List;



import kodlama.io.springWork.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLanguageRep {
	List<ProgrammingLanguage> getAll();
	void add();
	void delete();
	void update();
	
	
	
}