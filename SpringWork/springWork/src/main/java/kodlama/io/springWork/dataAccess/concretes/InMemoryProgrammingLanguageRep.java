package kodlama.io.springWork.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.springWork.dataAccess.abstracts.ProgrammingLanguageRep;
import kodlama.io.springWork.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRep implements ProgrammingLanguageRep{

	List<ProgrammingLanguage> languages;
	
	public InMemoryProgrammingLanguageRep() {
		languages= new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1,"Java"));
		languages.add(new ProgrammingLanguage(2,"Python"));
		languages.add(new ProgrammingLanguage(3,"C#"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return languages;
	}

	@Override
	public void add() {
		System.out.println("Eklendi");
		
	}

	@Override
	public void delete() {
		System.out.println("Silindi");
		
	}

	@Override
	public void update() {
		System.out.println("Güncellendi");
		
	}

	
}