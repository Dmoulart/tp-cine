/*
 * package fr.eni.tpcine.converters;
 * 
 * import org.springframework.core.convert.converter.Converter; import
 * org.springframework.stereotype.Component;
 * 
 * import fr.eni.tpcine.bo.Personne; import
 * fr.eni.tpcine.services.PersonneServiceInterface;
 * 
 * @Component public class IdToPersonneConverter implements Converter<String,
 * Personne> {
 * 
 * private PersonneServiceInterface personneService;
 * 
 * public IdToPersonneConverter(PersonneServiceInterface personneService) {
 * this.personneService = personneService; }
 * 
 * @Override public Personne convert(String id) { return
 * this.personneService.find(Integer.parseInt(id)); } }
 */