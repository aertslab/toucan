
/*This file is part of TOUCAN
 *
 * Copyright (C) 2001,2002,2003,2004 Stein Aerts, University of Leuven, Belgium.
 * Contact: <stein.aerts@esat.kuleuven.ac.be>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/
package toucan.util;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.*;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import java.io.*;

/**
 * Title: XMLParser
 * Description:
 * Copyright:    Copyright (c) 2004
 * Company: University of Leuven, Department of Electrical Engineering ESAT-SCD, Belgium
 * @author Stein Aerts <stein.aerts@esat.kuleuven.ac.be>
 * @version 2.0
 */


public class XMLParser
{
    public XMLParser()
    {
    }

    public static Document parseString(String strXML) throws Exception
    {


	    Document doc;
	    DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();

	    ByteArrayInputStream xmlStream = new ByteArrayInputStream(strXML.getBytes());
	    doc = docBuilder.parse(xmlStream);

	    // normalize text representation
	    //doc.getDocumentElement().normalize();

	    return doc;
      }

}
