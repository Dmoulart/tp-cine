//package fr.eni.tpcine.converters;
//
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.stereotype.Component;
//
//import fr.eni.tpcine.bo.Genre;
//import fr.eni.tpcine.bo.Personne;
//import fr.eni.tpcine.services.GenreServiceInterface;
//import fr.eni.tpcine.services.PersonneServiceInterface;
//
//@Component
//public class IdToGenreConverter implements Converter<String, Genre> {
//	
//	private GenreServiceInterface genreService;
//	
//	public IdToGenreConverter(GenreServiceInterface genreService) {
//		this.genreService = genreService;
//	}
//	
//    @Override
//    public Genre convert(String id) {
//    	return this.genreService.find(Integer.parseInt(id));
//    }
//}