package jena.examples.rdf;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.*;

public class HelloRDFWorld {

        /**
         * @param args
         */
        public static void main(String[] args) {
                // TODO Auto-generated method stub
        	/*Model model = ModelFactory.createDefaultModel();
        	String ns = new String("http://somewhere/class#");
        	Resource Alice = model.createResource(ns + "Alice");
        	Property teaches = model.createProperty("teaches");
        	com.hp.hpl.jena.rdf.model.Literal o;
        	Property position = model.createProperty("position");
        	Property name = model.createProperty("name");
        	//Alice.addProperty(teaches,"C1");
        	
        	Alice.addProperty(position,"professor");
        	Alice.addProperty(name,"Alice");
        	
        
        	model.write(System.out,"RDF/XML");
           */
        	Model m = ModelFactory.createDefaultModel();
        	//Model m = ModelFactory.createDefaultModel();
            
        	String nsB = "http://course/else#";
        	String nsA = "http://somewhere/lecturer#";
        	Resource Math = m.createResource(nsB + "Math");
        	Resource WebEngineering = m.createResource(nsB + "WebEngineering");
        	Resource InformationScience = m.createResource(nsB + "InformationScience");
        	Resource LibraryManagement = m.createResource(nsB + "LibraryManagement");

        	
        	Resource John = m.createResource( nsA + "John" );
        	Resource Arthur = m.createResource( nsA + "Arthur" );
        	Resource Peter = m.createResource(nsA + "Peter");
        	Resource Alice = m.createResource(nsA + "Alice");

        	
        	
        	Property courseName = m.createProperty(nsB + "courseName");
         	Property studentType = m.createProperty( nsB + "studentType");
        	Property Time = m.createProperty( nsB + "Time");

        	m.add( Math, courseName, "Math" ).add( Math, studentType, "Undergraduate" ).add(Math,Time,"Monday");
        	
        	m.add( WebEngineering, courseName, "Web Engineering" ).add( WebEngineering, studentType, "Graduate" ).add(WebEngineering,Time,"Wednesday");


        	m.add( LibraryManagement, courseName, "Library Management" ).add( LibraryManagement, studentType, "Graduate" ).add(LibraryManagement,Time,"Monday");

        	m.add(InformationScience, courseName, "Information Science" ).add( InformationScience, studentType, "Graduate" ).add(InformationScience,Time,"Friday");

        	//m.write(System.out);
        	
        	 Property teaches = m.createProperty( nsA + "teaches" );
        	 Property name = m.createProperty( nsA + "name" );
        	 Property position = m.createProperty(nsA + "position");
        	 //Resource x = m.createResource( nsB + "C1" );
        	 
        	 m.add( John, teaches, Math ).add( John, name, "John" ).add( John, position, "Full Professor" );
        	 
        	 m.add( Arthur, teaches, WebEngineering ).add( Arthur, name, "Arthur" ).add( Arthur, position, "Assistant Professor" );

        	 m.add( Peter, teaches, InformationScience ).add( Peter, name, "Peter" ).add( Peter, position, "Associate Professor" );

        	 m.add( Alice, teaches, LibraryManagement ).add( Alice, name, "Alice" ).add( Alice, position, "Assistant Professor" );

        	 //System.out.println( "# -- no special prefixes defined" );
        	 //m.write( System.out );
        	
        	 //Resource Peter = m.createResource( nsA + "Peter" );     	
        	 //Resource x1 = m.createResource( nsB + "C2" );
        	 
        	 //m.add( Peter, teaches, x1 ).add( Peter, name, "Peter" ).add( Peter, position, "Assistant professor" );
        	
        	 //Resource John = m.createResource(nsA + "John");
        	 //Resource x2 = m.createResource( nsB + "C3" );
        	 
        	 //m.add( John , teaches, x2 ).add( John , name,"John").add(John , position, "Asst prof");
        	 
        	 m.write(System.out);
        	 
        	 
        	 
        	
        	} 

}
