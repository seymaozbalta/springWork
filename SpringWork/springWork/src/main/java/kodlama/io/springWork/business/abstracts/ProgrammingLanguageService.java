package kodlama.io.springWork.business.abstracts;

import java.util.List;

import kodlama.io.springWork.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
//iş kuralları
	List<ProgrammingLanguage> getAll();
	void add();
	void delete();
	void update();
}