/*
 * ISABEL: A group collaboration tool for the Internet
 * Copyright (C) 2009 Agora System S.A.
 * 
 * This file is part of Isabel.
 * 
 * Isabel is free software: you can redistribute it and/or modify
 * it under the terms of the Affero GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Isabel is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Affero GNU General Public License for more details.
 * 
 * You should have received a copy of the Affero GNU General Public License
 * along with Isabel.  If not, see <http://www.gnu.org/licenses/>.
 */
package xedl.lib.XEDLsplitter;

import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.ParserConfigurationException;
 
import org.xml.sax.SAXException;  
import org.w3c.dom.Document;


// For write operation
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.dom.DOMSource;  
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult; 

import java.io.*;

public class JavaParser{
    // Global value so it can be ref'd by the tree-adapter
    static Document document;
	 

    public static void main (String argv []){
        //Setting TransformerFactory to use. Possible values are:
        //org.apache.xalan.xsltc.runtime.TransformerFactoryImpl
        //com.icl.saxon.TransformerFactoryImpl
        //org.apache.xalan.processor. TransformerFactoryImpl
        System.setProperty("javax.xml.transformer.TransformerFactory", "org.apache.xalan.xsltc.runtime.TransformerFactoryImpl");
        if (!((argv.length == 3) || (argv.length == 4))) {
            System.err.println ("Usage: java JavaParser <stylesheet> <filename_in> <filename_out> [<parameter>]");
            System.exit (1);
        }

        DocumentBuilderFactory factory =
            DocumentBuilderFactory.newInstance();
        //factory.setNamespaceAware(true);
        //factory.setValidating(true);   
 
        try {
		  
            File stylesheet = new File(argv[0]);
				File datafile = new File(argv[1]);
				String parameter= "";
				if (argv.length == 4) {
					parameter = argv[3];
				}
 
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(datafile);
 
            // Use a Transformer for output
            TransformerFactory tFactory = TransformerFactory.newInstance();
				StreamSource stylesource = new StreamSource(stylesheet);
            Transformer transformer = tFactory.newTransformer(stylesource);
            
 
            DOMSource source = new DOMSource(document);
            PrintWriter out=new PrintWriter(new FileOutputStream(argv[2]));
            //StreamResult result = new StreamResult(System.out);
            StreamResult result = new StreamResult(out);

            //Adding parameter
            transformer.setParameter("SITEID",parameter);


            transformer.transform(source, result);
                        
            out.close();            
            
        } catch (TransformerConfigurationException tce) {
           // Error generated by the parser
           System.out.println ("\n** Transformer Factory error");
           System.out.println("   " + tce.getMessage() );

           // Use the contained exception, if any
           Throwable x = tce;
           if (tce.getException() != null)
               x = tce.getException();
           x.printStackTrace();
      
        } catch (TransformerException te) {
           // Error generated by the parser
           System.out.println ("\n** Transformation error");
           System.out.println("   " + te.getMessage() );

           // Use the contained exception, if any
           Throwable x = te;
           if (te.getException() != null)
               x = te.getException();
           x.printStackTrace();
           
         } catch (SAXException sxe) {
           // Error generated by this application
           // (or a parser-initialization error)
           Exception  x = sxe;
           if (sxe.getException() != null)
               x = sxe.getException();
           x.printStackTrace();

        } catch (ParserConfigurationException pce) {
            // Parser with specified options can't be built
            pce.printStackTrace();

        } catch (IOException ioe) {
           // I/O error
           ioe.printStackTrace();
        }
    } // main  

}