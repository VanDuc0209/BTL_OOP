package virtuoso.randomdata;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.Value;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.query.BindingSet;
import org.eclipse.rdf4j.query.TupleQuery;
import org.eclipse.rdf4j.query.TupleQueryResult;
import org.eclipse.rdf4j.repository.RepositoryConnection;

import virtuoso.connectdb.ConnectionDB;
import virtuoso.createntities.*;
import virtuoso.entity.*;
import virtuoso.filedata.FileData;
import java.util.Calendar;

public class RandomEntities {
	static ConnectionDB connection = new ConnectionDB();
	public IRI person()
	{
		IRI iriPerson = connection.getPERSON();
		CreatePerson cp = new CreatePerson();
		Person person = new Person(cp.getPersonIdentfier(), cp.getPersonLabel(), cp.getPersonDescription(), 
				cp.getTime(), cp.getLink(), cp.getPersonNationality());
		RepositoryConnection con = connection.getConn();
		ValueFactory vf = connection.getMyvf();
		Literal identifier = vf.createLiteral(person.getIdentifier());
		Literal label = vf.createLiteral(person.getLabel());
		Literal des = vf.createLiteral(person.getDescription());
		Literal time = vf.createLiteral(person.getTime());
		Literal link = vf.createLiteral(person.getLink());
		Literal national = vf.createLiteral(person.getNationality());
		con.add(vf.createStatement(iriPerson, connection.getIdentifier(), identifier));
		con.add(vf.createStatement(iriPerson, connection.getLabel(), label));
		con.add(vf.createStatement(iriPerson, connection.getDescription(), des));
		con.add(vf.createStatement(iriPerson, connection.getTime(), time));
		con.add(vf.createStatement(iriPerson, connection.getLink(), link));
		con.add(vf.createStatement(iriPerson, connection.getNationality(), national));
		return iriPerson;
	}
	public IRI country() {
		IRI iriCountry = connection.getCOUNTRY();
		CreateCountry cc = new CreateCountry();
		Country country = new Country(cc.getIdentifier(), cc.getCountryLabel(), cc.getCountryDescription(), cc.getTime(), cc.getLink());
		RepositoryConnection con = connection.getConn();
		ValueFactory vf = connection.getMyvf();
		Literal identifier = vf.createLiteral(country.getIdentifier());
		Literal label = vf.createLiteral(country.getLabel());
		Literal des = vf.createLiteral(country.getDescription());
		Literal time = vf.createLiteral(country.getTime());
		Literal link = vf.createLiteral(country.getLink());
		con.add(vf.createStatement(iriCountry, connection.getIdentifier(), identifier));
		con.add(vf.createStatement(iriCountry, connection.getLabel(), label));
		con.add(vf.createStatement(iriCountry, connection.getDescription(), des));
		con.add(vf.createStatement(iriCountry, connection.getTime(), time));
		con.add(vf.createStatement(iriCountry, connection.getLink(), link));
		return iriCountry;
	}
	
	public IRI location() {
		IRI iriLocation = connection.getLOCATION();
		CreateLocation cl = new CreateLocation();
		Location location = new Location(cl.getIdentifier(), cl.getLocationLabel(), cl.getLocationDescription(), cl.getTime(), cl.getLink());
		RepositoryConnection con = connection.getConn();
		ValueFactory vf = connection.getMyvf();
		Literal identifier = vf.createLiteral(location.getIdentifier());
		Literal label = vf.createLiteral(location.getLabel());
		Literal des = vf.createLiteral(location.getDescription());
		Literal time = vf.createLiteral(location.getTime());
		Literal link = vf.createLiteral(location.getLink());
		con.add(vf.createStatement(iriLocation, connection.getIdentifier(), identifier));
		con.add(vf.createStatement(iriLocation, connection.getLabel(), label));
		con.add(vf.createStatement(iriLocation, connection.getDescription(), des));
		con.add(vf.createStatement(iriLocation, connection.getTime(), time));
		con.add(vf.createStatement(iriLocation, connection.getLink(), link));
		return iriLocation;
	}
	public IRI organization() {
		IRI iriOrganization = connection.getORGANIZATION();
		CreateOrganization co = new CreateOrganization();
		Organization organization = new Organization(co.getIdentifier(), co.getOrganizationLabel(), co.getOrganizationDescription(), co.getTime(), co.getLink(), co.getOrganizationheadquarter());
		RepositoryConnection con = connection.getConn();
		ValueFactory vf = connection.getMyvf();
		Literal identifier = vf.createLiteral(organization.getIdentifier());
		Literal label = vf.createLiteral(organization.getLabel());
		Literal des = vf.createLiteral(organization.getDescription());
		Literal time = vf.createLiteral(organization.getTime());
		Literal link = vf.createLiteral(organization.getLink());
		Literal headquater = vf.createLiteral(organization.getHeadquarter());
		con.add(vf.createStatement(iriOrganization, connection.getIdentifier(), identifier));
		con.add(vf.createStatement(iriOrganization, connection.getLabel(), label));
		con.add(vf.createStatement(iriOrganization, connection.getDescription(), des));
		con.add(vf.createStatement(iriOrganization, connection.getTime(), time));
		con.add(vf.createStatement(iriOrganization, connection.getLink(), link));
		con.add(vf.createStatement(iriOrganization, connection.getHeadquarter(), headquater));
		return iriOrganization;
	}
	public IRI event() {
		IRI iriEvent = connection.getEVENT();
		CreateEvent ce = new CreateEvent();
		Event event = new Event(ce.getIdentifier(), ce.getEventLabel(), ce.getEventDescripion(), ce.getTime(), ce.getLink(), ce.getEventAddress());
		RepositoryConnection con = connection.getConn();
		ValueFactory vf = connection.getMyvf();
		Literal identifier = vf.createLiteral(event.getIdentifier());
		Literal label = vf.createLiteral(event.getLabel());
		Literal des = vf.createLiteral(event.getDescription());
		Literal time = vf.createLiteral(event.getTime());
		Literal link = vf.createLiteral(event.getLink());;
		Literal address= vf.createLiteral(event.getAddress());
		con.add(vf.createStatement(iriEvent, connection.getIdentifier(), identifier));
		con.add(vf.createStatement(iriEvent, connection.getLabel(), label));
		con.add(vf.createStatement(iriEvent, connection.getDescription(), des));
		con.add(vf.createStatement(iriEvent, connection.getTime(), time));
		con.add(vf.createStatement(iriEvent, connection.getLink(), link));
		con.add(vf.createStatement(iriEvent, connection.getAddress(), address));
		return iriEvent;
	}
	
	public static void main(String[] args) {
		FileData FD = new FileData();
		CreateEntities CE = new CreateEntities();
		String time1  = FD.getTIME();
		CE.setTime(time1);
//		for(int  i = 0; i < 10; i++) {
//			System.out.println(CE.getTime());
//		}
		RepositoryConnection con = connection.getConn();
		ValueFactory vf = connection.getMyvf();
//		IRI iriPerson = connection.getPERSON();
		CreatePerson CP = new CreatePerson(FD.getPERSON_LABEL(), FD.getPERSON_DESCRIPTION(), FD.getPERSON_NATIONALITY());
		CreateLocation CL = new CreateLocation(FD.getLOCATION_LABEL(), FD.getLOCATION_DESCRIPTION());
		CreateCountry CC = new CreateCountry(FD.getCOUNTRY_LABEL(), FD.getCOUNTRY_DESCRIPTION());
		CreateOrganization CO = new CreateOrganization(FD.getORGANZATION_LABEL(), FD.getCOUNTRY_DESCRIPTION(), FD.getORGANZATION_HEADQUARTER());
		RandomEntities RE = new RandomEntities();
//		for(int i = 0; i < 5; i++) {
//			System.out.println(CP.getPersonIdentfier());
//			System.out.println(CP.getPersonLabel());
//			System.out.println(CP.getPersonDescription());
//			System.out.println(CP.getTime());
//			System.out.println(CP.getLink());
//			System.out.println(CP.getPersonNationality());
//			
//		}
		
//		Person person = new Person(CP.getPersonIdentfier(), CP.getPersonLabel(), CP.getPersonDescription(), 
	//			CP.getTime(), CP.getLink(), CP.getPersonNationality());
//		String namespace = connection.getPERSON().toString() + "/";
//////		System.out.println(namespace);
//		String strlabel = person.getLabel();
//		
//		String irilabel = null;
//		
////		while(label.indexOf(" ") != -1)
//		irilabel = strlabel.replaceAll(" ", "_");
////		System.out.println(strlabel);
////		System.out.println(irilabel);
//		IRI iriPerson = vf.createIRI(namespace,irilabel);
//		connection.genIRI(namespace);
//		Literal identifier = vf.createLiteral(person.getIdentifier());
//		Literal label = vf.createLiteral(strlabel);
//		Literal des = vf.createLiteral(person.getDescription());
//		Literal time = vf.createLiteral(person.getTime());
//		Literal link = vf.createLiteral(person.getLink());
//		Literal national = vf.createLiteral(person.getNationality());
//		con.add(vf.createStatement(iriPerson, connection.getIdentifier(), identifier));
//		con.add(vf.createStatement(iriPerson, connection.getLabel(), label));
//		con.add(vf.createStatement(iriPerson, connection.getDescription(), des));
//		con.add(vf.createStatement(iriPerson, connection.getTime(), time));
//		con.add(vf.createStatement(iriPerson, connection.getLink(), link));
//		con.add(vf.createStatement(iriPerson, connection.getNationality(), national));

//		long begin = Calendar.getInstance().getTimeInMillis();
//		for(int i = 0 ; i < 1000; i++)
//		{
////			RE.country();
////		//	RE.event();
////			RE.organization();
////			RE.location();
//			RE.person();
//		}
//		long end = Calendar.getInstance().getTimeInMillis();
//		System.out.println("Executed Time: " + (end - begin) + "ms");
		/*String queryString = "PREFIX a:<http://database.com/virtuoso/>\n"
				+ "PREFIX b:<http://database.com/virtuoso/Person/>"
				+ "Select ?o\n"
				+ "Where {\n"
				+ "?s b:nationality ?t.\n"
				+ "filter regex (?t, \"Antigua & Deps\").\n"
				+ "?s b:label ?o"
				+ "}";
		TupleQuery query = con.prepareTupleQuery(queryString);
		try {
			TupleQueryResult result = query.evaluate();
			while(result.hasNext()) {
				BindingSet solution = result.next();
				Value s = solution.getValue("s");
				Value p = solution.getValue("p");
				String o = solution.getValue("o").toString();
				//System.out.println(s);
				//System.out.println(cn);
				
				System.out.println(o);
				System.out.println("---------------------------------------");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		String queryString = "PREFIX :<http://database.com/virtuoso/Organization/>\n"
				+ "select ?o\n"
				+ "where{\n"
				+ "?s :headquarter ?t\n"
				+ "filter regex (?t, \"New York City\")\n"
				+ "?s :label ?o\n"
				+ "}";
		System.out.println("listName Organization has headquarter in: New York City" );
		long begin = Calendar.getInstance().getTimeInMillis();
		TupleQuery query = connection.conn.prepareTupleQuery(queryString);
		long end = Calendar.getInstance().getTimeInMillis();
		try {
			TupleQueryResult result = query.evaluate();
			
			while(result.hasNext()) {
				BindingSet solution = result.next();
				String o = solution.getValue("o").toString();
				System.out.println(o);
				System.out.println("--------------------------------");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Time query: " + (end - begin) + " ms");
	}
	
}
